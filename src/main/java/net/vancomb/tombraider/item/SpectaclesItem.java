package net.vancomb.tombraider.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.Item;

public class HeadEquippableItem extends Item implements Equipable{

    public HeadEquippableItem(Properties pProperties)
    {
        super(pProperties);
    }

    //as you can probably infer, this allows for you to equip
    @Override
    public EquipmentSlot getEquipmentSlot()
    {
        return null;
    }
}
