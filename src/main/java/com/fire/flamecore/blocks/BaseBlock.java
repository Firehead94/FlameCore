package com.fire.flamecore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.fire.flamecore.ModSettings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder(ModSettings.MOD_ID)
public class BaseBlock extends Block 
{
	public final String DEFAULT = "DEFAULT NAME";

	public BaseBlock()
	{
		super(Material.rock);
		this.setBlockName(DEFAULT);
		this.setBlockTextureName(super.getUnlocalizedName());
	}
	
	public BaseBlock(Material mat) 
	{
		super(mat);
		this.setBlockName(DEFAULT);
		this.setBlockTextureName(super.getUnlocalizedName());
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", ModSettings.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalName)
	{
		return unlocalName.substring(unlocalName.indexOf(".") + 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()))); 
	}

}
