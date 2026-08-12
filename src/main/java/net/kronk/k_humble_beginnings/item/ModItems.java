package net.kronk.k_humble_beginnings.item;

import net.kronk.k_humble_beginnings.HumbleBeginnings;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS,
        HumbleBeginnings.MOD_ID
    );

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register(
        "example_item",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> WHITE_SHEET = ITEMS.register(
        "white_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BLUE_SHEET = ITEMS.register(
        "blue_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> RED_SHEET = ITEMS.register(
        "red_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> YELLOW_SHEET = ITEMS.register(
        "yellow_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BLACK_SHEET = ITEMS.register(
        "black_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> ORANGE_SHEET = ITEMS.register(
        "orange_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> GREEN_SHEET = ITEMS.register(
        "green_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> PURPLE_SHEET = ITEMS.register(
        "purple_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> BROWN_SHEET = ITEMS.register(
        "brown_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> GRAY_SHEET = ITEMS.register(
        "gray_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> MAGENTA_SHEET = ITEMS.register(
        "magenta_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> CYAN_SHEET = ITEMS.register(
        "cyan_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> LIGHT_BLUE_SHEET = ITEMS.register(
        "light_blue_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> PINK_SHEET = ITEMS.register(
        "pink_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> LIME_SHEET = ITEMS.register(
        "lime_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> LIGHT_GRAY_SHEET = ITEMS.register(
        "light_gray_sheet",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> FLINT_SHEARS = ITEMS.register(
        "flint_shears",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> KNITTING_STICKS = ITEMS.register(
        "knitting_sticks",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> STRING_KNIT = ITEMS.register(
        "string_knit",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> CLOTH_KNIT = ITEMS.register(
        "cloth_knit",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> CLOTH = ITEMS.register(
        "cloth",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> FLUFF = ITEMS.register(
        "fluff",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SEWING_KIT = ITEMS.register(
        "sewing_kit",
        () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> PILLOW = ITEMS.register(
        "pillow",
        () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
