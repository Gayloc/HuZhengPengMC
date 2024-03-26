package org.gayloc.huzhengpeng;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HuZhengPeng implements ModInitializer {
    public static final Block HZP_BLOCK=new Block(FabricBlockSettings.create().strength(4.0f));
    public static final BlockItem HZP_BLOCK_ITEM=new BlockItem(HZP_BLOCK,new FabricItemSettings());
    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK,new Identifier("huzhengpeng","hzp_block"),HZP_BLOCK);
        Registry.register(Registries.ITEM,new Identifier("huzhengpeng","hzp_block"),HZP_BLOCK_ITEM);
    }
}
