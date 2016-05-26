package com.rumaruka.pc2.client.proxy;

import com.rumaruka.pc2.common.block.base.ModBlocks;
import com.rumaruka.pc2.common.item.base.ModItems;
import com.rumaruka.pc2.common.proxy.CommonProxy;

public class ClientProxy extends CommonProxy{

	@Override
	public void rendersObject() {
		ModBlocks.registerBlocks();
		ModItems.renderItems();
	}
	
}
