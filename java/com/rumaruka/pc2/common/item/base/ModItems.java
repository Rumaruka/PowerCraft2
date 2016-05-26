package com.rumaruka.pc2.common.item.base;

import com.rumaruka.pc2.common.lib.LibMisc;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItems {
	
	
	
	
	public static void init(){
		
	}
	public static void InGameRegister(){
		
	}
	public static void renderItems(){
		
	}
	public static void Renders(Item i){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, new ModelResourceLocation(
				LibMisc.MOD_ID + ":" + i.getUnlocalizedName().substring(5), "inventory"));
	
}
}
