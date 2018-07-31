package chlod.mcforge.extraordinarygems.main;

import org.apache.logging.log4j.Logger;

import chlod.mcforge.extraordinarygems.handlers.RegistryHandler;
import chlod.mcforge.extraordinarygems.proxy.CommonProxy;
import chlod.mcforge.extraordinarygems.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.EG_MODID, name = Reference.EG_NAME, version = Reference.EG_VERSION)
public class ExtraordinaryGems {
	
	@Instance
	public static ExtraordinaryGems instance;
	public static Logger logger;
	
	@SidedProxy(clientSide = Reference.EG_CLASS_CLIENTPROXY, serverSide = Reference.EG_CLASS_SERVERPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInitializationEvent(FMLPreInitializationEvent event) {
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public void initializationEvent(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInitializationEvent(FMLPostInitializationEvent event) {
		
	}

}
