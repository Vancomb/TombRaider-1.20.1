package net.vancomb.tombraider.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.vancomb.tombraider.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class SurvivorPickaxeItem extends PickaxeItem {
    public SurvivorPickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);


       // ItemStack defaultStack = new ItemStack(this);
        // defaultStack.enchant(Enchantments.SHARPNESS,2);
    }

    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        // This method should not be necessary if the item isn't craftable, but keeping it in case you decide to make it craftable later.
        // If you decide to keep it non-craftable, remove this method.
        stack.enchant(Enchantments.SHARPNESS, 1);

    }

    @Override
    public boolean isFoil(ItemStack stack) {
        // Override this method to prevent the enchantment glare
        return false;
    }

    //TOOLTIP
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tombraider.survivor_pickaxe.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}



