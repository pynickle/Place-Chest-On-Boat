package com.euphony.place_chest_on_boat;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(PlaceChestOnBoat.MODID)
public class PlaceChestOnBoat {
    public static final String MODID = "place_chest_on_boat";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PlaceChestOnBoat(IEventBus modEventBus, ModContainer modContainer) {
    }
}
