package com.batmanatorul.MinecraftCaveUpdate.armor;

import com.batmanatorul.MinecraftCaveUpdate.MinecraftCaveUpdate;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MiningHelmet implements IArmorMaterial {

    MINING(MinecraftCaveUpdate.MOD_ID + ":mining", 10, new int[] {0, 0, 0, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0,() -> {
        return null;
    });



    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damagereductionamountarray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockback;
    private final LazyValue<Ingredient> repairMaterial;

    MiningHelmet(String name, int maxDamageFactor, int[] damagereductionamountarray, int enchantability, SoundEvent soundEvent, float toughness, float knockback,
                         Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damagereductionamountarray = damagereductionamountarray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockback = knockback;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }





    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damagereductionamountarray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
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
    }


}
