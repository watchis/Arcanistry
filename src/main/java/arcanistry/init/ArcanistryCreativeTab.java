package arcanistry.init;

import arcanistry.items.BasicItems;
import arcanistry.main.Arcanistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArcanistryCreativeTab extends CreativeTabs {

    public ArcanistryCreativeTab() {
        super(Arcanistry.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BasicItems.CREATIVE_TAB_ICON);
    }
}
