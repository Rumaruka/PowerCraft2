package com.rumaruka.pc2.common.block.base;

import com.rumaruka.pc2.common.block.BlockTeleporter;
import com.rumaruka.pc2.common.lib.LibMisc;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block teleporter;
	
	public static void init(){
		teleporter = new BlockTeleporter().setUnlocalizedName("teleporter");
	}
	public static void InGameRegister(){
		GameRegistry.registerBlock(teleporter, teleporter.getUnlocalizedName().substring(5));
	}
	public static void registerBlocks(){
		registerRender(teleporter);
		
	}
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LibMisc.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
