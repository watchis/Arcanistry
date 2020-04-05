package arcanistry.main;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Arcanistry.MODID, name = Arcanistry.NAME, version = Arcanistry.VERSION)
public class Arcanistry {
	
	public static final String MODID = "arcanistry";
    public static final String NAME = "Arcanistry";
    public static final String VERSION = "0.0.0";
    
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info(Arcanistry.MODID + " IS HERE MAAAN!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
