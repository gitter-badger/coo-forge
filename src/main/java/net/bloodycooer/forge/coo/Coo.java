/* Copyright (C) 2021 BloodyCooer
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package net.bloodycooer.forge.coo;

import net.bloodycooer.forge.coo.api.LogApi;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = "coo", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Coo {
    @SubscribeEvent
    static void onCommonSetup(FMLCommonSetupEvent event) {
        LogApi.logger.debug("测试日志");
    }
}
