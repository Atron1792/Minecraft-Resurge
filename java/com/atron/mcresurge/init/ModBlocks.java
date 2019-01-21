package com.atron.mcresurge.init;

import java.util.ArrayList;
import java.util.List;

import com.atron.mcresurge.blocks.AmethystBlock;
import com.atron.mcresurge.blocks.AmethystOre;
import com.atron.mcresurge.blocks.BlockBase;
import com.atron.mcresurge.blocks.RubyBlock;
import com.atron.mcresurge.blocks.RubyOre;
import com.atron.mcresurge.blocks.SapphireBlock;
import com.atron.mcresurge.blocks.SapphireOre;
import com.atron.mcresurge.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block AMETHYST_BLOCK = new AmethystBlock("amethyst_block", Material.IRON);
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.IRON);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	
}
