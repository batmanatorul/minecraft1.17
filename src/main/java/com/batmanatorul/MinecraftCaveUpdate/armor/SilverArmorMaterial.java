package com.batmanatorul.MinecraftCaveUpdate.armor;

import com.batmanatorul.MinecraftCaveUpdate.MinecraftCaveUpdate;
import com.batmanatorul.MinecraftCaveUpdate.util.register;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum SilverArmorMaterial implements IArmorMaterial {

    SILVER(MinecraftCaveUpdate.MOD_ID + ":silver", 10, new int[] {1, 4, 4, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0, () -> {
        return Ingredient.fromItems(register.SILVER_INGOT.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockback;
    private final LazyValue<Ingredient> repairMaterial;

    SilverArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float knockback,
                        float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockback = knockback;
        this.repairMaterial = new LazyValue<>(repairMaterial);



}

    @Override
    public int getDurability(EquipmentSlotType slotin) {
        return MAX_DAMAGE_ARRAY[slotin.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotin) {
        return this.damageReductionAmountArray[slotin.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockback;
    }}
