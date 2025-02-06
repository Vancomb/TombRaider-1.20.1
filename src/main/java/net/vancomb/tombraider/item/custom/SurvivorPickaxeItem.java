package net.vancomb.tombraider.item.custom;
import net.minecraft.world.item.*;


public class SurvivorPickaxeItem extends PickaxeItem {


    public SurvivorPickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);

    }
}


 /*

    //ITEM TOOLTIP
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tombraider.survivor_pickaxe.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);

    }

    @Override
    public boolean isFoil(ItemStack stack) {
        // Override this method to prevent the enchantment glare
        return false;
    }

     @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        // This method should not be necessary if the item isn't craftable, but keeping it in case you decide to make it craftable later.
        // If you decide to keep it non-craftable, remove this method.
        stack.enchant(Enchantments.SHARPNESS, 1);


Not working
    @Override
    public ItemStack getDefaultInstance() {
        ItemStack stack = new ItemStack(this);
        stack.enchant(Enchantments.BLOCK_EFFICIENCY,3);
        stack.enchant(Enchantments.SHARPNESS,3);
        stack.enchant(Enchantments.MENDING,1);
        return stack;

 */

