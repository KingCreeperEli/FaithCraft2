package FaithCraft2.Common.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import FaithCraft2.Common.common.FaithCraft2;

public class GoldenDogwoodStick extends Item{
	
	public GoldenDogwoodStick(int i){
		this.setCreativeTab(FaithCraft2.FaithCraft2Tab);
	}
	
	@Override
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
}