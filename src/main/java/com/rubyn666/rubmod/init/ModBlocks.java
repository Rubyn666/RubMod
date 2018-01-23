package com.rubyn666.rubmod.init;

import java.util.ArrayList;
import java.util.List;

import com.rubyn666.rubmod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_DIMENSIONAL = new BlockBase("ore_dimensional", Material.IRON);
}
