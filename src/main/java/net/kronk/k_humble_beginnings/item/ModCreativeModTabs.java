package net.kronk.k_humble_beginnings.item;

import net.kronk.k_humble_beginnings.HumbleBeginnings;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HumbleBeginnings.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HB_TAB = CREATIVE_MODE_TABS.register("hb_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PILLOW.get()))
                    .title(Component.translatable("creativetab.hb_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EXAMPLE_ITEM.get());
                        pOutput.accept(ModItems.PILLOW.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
