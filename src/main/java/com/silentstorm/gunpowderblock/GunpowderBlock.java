package com.silentstorm.gunpowderblock;

import java.util.List;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class GunpowderBlock implements ModInitializer {
    public static final Block GUNPOWDER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(0));
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("gunpowderblock", "gunpowder_block"), GUNPOWDER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gunpowderblock", "gunpowder_block"), new BlockItem(GUNPOWDER_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
	}
	public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
	    tooltip.add( new TranslatableText("block.gunpowderblock.gunpowder_block.tooltip") );
	}
}