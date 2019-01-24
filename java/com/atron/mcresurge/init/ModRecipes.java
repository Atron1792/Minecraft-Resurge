package com.atron.mcresurge.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Furnace Recipes

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(BlockInit.RUBY_ORE, new ItemStack(ItemInit.RUBY, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.AMETHYST_ORE, new ItemStack(ItemInit.AMETHYST, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.SAPPHIRE_ORE, new ItemStack(ItemInit.SAPPHIRE, 1), 1.5f);
	}
}
