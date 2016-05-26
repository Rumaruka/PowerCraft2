package com.rumaruka.pc2.common;

import com.rumaruka.pc2.common.block.base.ModBlocks;
import com.rumaruka.pc2.common.item.base.ModItems;
import com.rumaruka.pc2.common.lib.LibMisc;
import com.rumaruka.pc2.common.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = LibMisc.MOD_ID, name = LibMisc.MOD_NAME, version = LibMisc.MOD_VERSION)
public class pc2 {
	
	
	@Mod.Instance(LibMisc.MOD_ID)
	public static pc2 instance;
	
	@SidedProxy(clientSide = LibMisc.PROXY_CLIENT, serverSide = LibMisc.PROXY_COMMON)
	public static CommonProxy proxy;
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		
		//Blocks
		ModBlocks.init();
		ModBlocks.InGameRegister();
		//TileEntity
		
		//Items
		ModItems.init();
		ModItems.InGameRegister();
		
		//VanillaCrafting
		
		//VanillaFurnaceSmelter
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {
		proxy.rendersObject();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
	}

	@EventHandler
	public void serverStartingEvent(FMLServerStartingEvent e) {
		//e.registerServerCommand(new ());
	}
	

}

