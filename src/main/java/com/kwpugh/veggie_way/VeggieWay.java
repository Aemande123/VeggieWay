package com.kwpugh.veggie_way;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kwpugh.veggie_way.group.GroupVeggieWay;
import com.kwpugh.veggie_way.lists.BlockList;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("veggie_way")
public class VeggieWay
{
	public static final String modid = "veggie_way";
	public static final Logger logger = LogManager.getLogger(modid);	
	public static final ItemGroup veggie_way = new GroupVeggieWay();

    public VeggieWay()
    {    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        logger.info("VeggieWay common setup");
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
		RenderType cutoutMipped = RenderType.func_228641_d_();	
		RenderTypeLookup.setRenderLayer(BlockList.plant_quinoa, cutoutMipped);
		
    	logger.info("VeggieWay got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        InterModComms.sendTo("veggie_way", "helloworld", () -> { logger.info("Hello world from VeggieWay"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
    	logger.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
    	logger.info("VeggieWay Server starting");
    }
}
