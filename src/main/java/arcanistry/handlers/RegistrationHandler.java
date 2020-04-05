package arcanistry.handlers;

import arcanistry.blocks.BasicBlocks;
import arcanistry.main.Arcanistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Arcanistry.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(Arcanistry.MODID, "item")
                        .setCreativeTab(Arcanistry.CREATIVE_TAB)
                        .setUnlocalizedName("arcanistry.item"),
                new Item().setRegistryName(Arcanistry.MODID, "flowerbatten")
                        .setCreativeTab(Arcanistry.CREATIVE_TAB)
                        .setUnlocalizedName("arcanistry.flowerbatten"),
                new Item().setRegistryName(Arcanistry.MODID, "cloth")
                        .setCreativeTab(Arcanistry.CREATIVE_TAB)
                        .setUnlocalizedName("arcanistry.cloth"),
                new Item().setRegistryName(Arcanistry.MODID, "CREATIVE_TAB_ICON")
                        .setUnlocalizedName("arcanistry.creativetabicon")
        };

        final Item[] itemBlocks = {
                new ItemBlock(BasicBlocks.block).setRegistryName(BasicBlocks.block.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new Block(Material.ROCK).setRegistryName(Arcanistry.MODID, "block")
                    .setCreativeTab(Arcanistry.CREATIVE_TAB)
                    .setUnlocalizedName("arcanistry.block")
        };

        event.getRegistry().registerAll(blocks);
    }
}
