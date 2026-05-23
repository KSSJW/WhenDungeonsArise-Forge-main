package net.aurelj.dungeons_arise;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(DungeonsAriseMain.MODID)
public class DungeonsAriseMain {

    public static final String MODID = "dungeons_arise";

    public DungeonsAriseMain(IEventBus modEventBus) {

        WDAStructures.STRUCTURES.register(modEventBus);
    }
}