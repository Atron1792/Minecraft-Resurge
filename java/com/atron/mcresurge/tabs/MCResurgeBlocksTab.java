package com.atron.mcresurge.tabs;

import com.atron.mcresurge.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCResurgeBlocksTab extends CreativeTabs
{
	public MCResurgeBlocksTab(String label) { super("mcresurgeblockstab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.RUBY);}
}
