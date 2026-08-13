package net.kronk.k_humble_beginnings.item;

import net.kronk.k_humble_beginnings.HumbleBeginnings;
import net.kronk.k_humble_beginnings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            HumbleBeginnings.MOD_ID
        );

    public static final RegistryObject<CreativeModeTab> HB_TAB =
        CREATIVE_MODE_TABS.register("hb_tab", () ->
            CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.PILLOW.get()))
                .title(Component.translatable("creativetab.hb_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.EXAMPLE_ITEM.get());
                    pOutput.accept(ModBlocks.EXAMPLE_BLOCK.get());

                    pOutput.accept(ModItems.PILLOW.get());
                    pOutput.accept(ModItems.SEWING_KIT.get());
                    pOutput.accept(ModItems.FLUFF.get());
                    pOutput.accept(ModItems.CLOTH.get());
                    pOutput.accept(ModItems.CLOTH_KNIT.get());
                    pOutput.accept(ModItems.STRING_KNIT.get());
                    pOutput.accept(ModItems.KNITTING_STICKS.get());
                    pOutput.accept(ModItems.FLINT_SHEARS.get());
                    pOutput.accept(ModItems.PLANT_FIBER.get());
                    pOutput.accept(ModItems.FIBER_STRING.get());
                    pOutput.accept(ModItems.FIBER_MESH.get());
                    pOutput.accept(ModItems.FLINT_SHARD.get());
                    pOutput.accept(ModItems.FLINT_KNIFE.get());
                    pOutput.accept(ModItems.FLINT_AXE.get());
                    pOutput.accept(ModItems.FLINT_PICKAXE.get());
                    pOutput.accept(ModItems.FLINT_SHOVEL.get());
                    pOutput.accept(ModItems.SIEVE.get());

                    pOutput.accept(ModItems.RAW_HIDE.get());
                    pOutput.accept(ModItems.RAW_COW_HIDE.get());
                    pOutput.accept(ModItems.RAW_PIG_HIDE.get());
                    pOutput.accept(ModItems.RAW_EQUINE_HIDE.get());
                    pOutput.accept(ModItems.RAW_LLAMA_HIDE.get());
                    pOutput.accept(ModItems.RAW_FOX_PELT.get());
                    pOutput.accept(ModItems.RAW_WOLF_PELT.get());
                    pOutput.accept(ModItems.RAW_PANDA_PELT.get());
                    pOutput.accept(ModItems.RAW_POLAR_BEAR_PELT.get());
                    pOutput.accept(ModItems.LEATHER_ROPE.get());

                    pOutput.accept(ModItems.WHITE_SHEET.get());
                    pOutput.accept(ModItems.LIGHT_GRAY_SHEET.get());
                    pOutput.accept(ModItems.GRAY_SHEET.get());
                    pOutput.accept(ModItems.BLACK_SHEET.get());
                    pOutput.accept(ModItems.BROWN_SHEET.get());
                    pOutput.accept(ModItems.RED_SHEET.get());
                    pOutput.accept(ModItems.ORANGE_SHEET.get());
                    pOutput.accept(ModItems.YELLOW_SHEET.get());
                    pOutput.accept(ModItems.LIME_SHEET.get());
                    pOutput.accept(ModItems.GREEN_SHEET.get());
                    pOutput.accept(ModItems.CYAN_SHEET.get());
                    pOutput.accept(ModItems.LIGHT_BLUE_SHEET.get());
                    pOutput.accept(ModItems.BLUE_SHEET.get());
                    pOutput.accept(ModItems.PURPLE_SHEET.get());
                    pOutput.accept(ModItems.MAGENTA_SHEET.get());
                    pOutput.accept(ModItems.PINK_SHEET.get());
                })
                .build()
        );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
