package com.kmarz.mymod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MyMod.MODID, name = MyMod.NAME, version = MyMod.VERSION)
public class MyMod {
    public static final String MODID = "mymod";
    public static final String NAME = "My First Mod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Hello from MyMod!");
    }
}
