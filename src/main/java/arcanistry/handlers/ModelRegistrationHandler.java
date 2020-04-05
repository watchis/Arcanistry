package arcanistry.handlers;

import arcanistry.blocks.BasicBlocks;
import arcanistry.items.BasicItems;
import arcanistry.main.Arcanistry;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = Arcanistry.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(BasicItems.item, 0);
        registerModel(Item.getItemFromBlock(BasicBlocks.block), 0);
    }

    private static void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
