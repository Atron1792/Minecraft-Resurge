package com.atron.mcresurge.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Furnace Recipes

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.AMETHYST_ORE, new ItemStack(ModItems.AMETHYST, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE, 1), 1.5f);
	}
}
