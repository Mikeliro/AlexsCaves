package com.github.alexmodguy.alexscaves.server.misc;

import com.github.alexmodguy.alexscaves.AlexsCaves;
import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.item.ACItemRegistry;
import com.github.alexmodguy.alexscaves.server.item.CaveInfoItem;
import com.github.alexmodguy.alexscaves.server.item.CaveMapItem;
import com.github.alexmodguy.alexscaves.server.item.CustomTabBehavior;
import com.github.alexmodguy.alexscaves.server.level.biome.ACBiomeRegistry;
import com.github.alexmodguy.alexscaves.server.potion.ACEffectRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ACCreativeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> DEF_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlexsCaves.MODID);

    public static final RegistryObject<CreativeModeTab> MAGNETIC_CAVES = DEF_REG.register("magnetic_caves", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alexscaves.magnetic_caves"))
            .icon(() -> new ItemStack(ACBlockRegistry.SCARLET_MAGNET.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .displayItems((enabledFeatures, output) -> {
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_TABLET.get(), ACBiomeRegistry.MAGNETIC_CAVES));
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_CODEX.get(), ACBiomeRegistry.MAGNETIC_CAVES));
                add(output, ACBlockRegistry.SPELUNKERY_TABLE.get());
                add(output, ACItemRegistry.CAVE_BOOK.get());
                output.accept(CaveMapItem.createMap(ACBiomeRegistry.MAGNETIC_CAVES));
                ACItemRegistry.getSpawnEggsForTab(ACBiomeRegistry.MAGNETIC_CAVES).forEach((spawnEgg -> add(output, spawnEgg.get())));
                add(output, ACItemRegistry.RAW_SCARLET_NEODYMIUM.get());
                add(output, ACItemRegistry.SCARLET_NEODYMIUM_INGOT.get());
                add(output, ACItemRegistry.RAW_AZURE_NEODYMIUM.get());
                add(output, ACItemRegistry.AZURE_NEODYMIUM_INGOT.get());
                add(output, ACItemRegistry.TELECORE.get());
                add(output, ACItemRegistry.NOTOR_COMPONENT.get());
                add(output, ACItemRegistry.HOLOCODER.get());
                add(output, ACItemRegistry.FERROUSLIME_BALL.get());
                add(output, ACItemRegistry.HEAVYWEIGHT.get());
                add(output, ACItemRegistry.QUARRY_SMASHER.get());
                add(output, ACItemRegistry.SEEKING_ARROW.get());
                add(output, ACItemRegistry.GALENA_GAUNTLET.get());
                add(output, ACItemRegistry.RESISTOR_SHIELD.get());
                add(output, ACItemRegistry.POLARITY_ARMOR_TRIM_SMITHING_TEMPLATE.get());
                add(output, ACBlockRegistry.GALENA.get());
                add(output, ACBlockRegistry.GALENA_STAIRS.get());
                add(output, ACBlockRegistry.GALENA_SLAB.get());
                add(output, ACBlockRegistry.GALENA_BRICKS.get());
                add(output, ACBlockRegistry.GALENA_WALL.get());
                add(output, ACBlockRegistry.GALENA_BRICKS.get());
                add(output, ACBlockRegistry.GALENA_BRICK_STAIRS.get());
                add(output, ACBlockRegistry.GALENA_BRICK_SLAB.get());
                add(output, ACBlockRegistry.GALENA_BRICK_WALL.get());
                add(output, ACBlockRegistry.GALENA_IRON_ORE.get());
                add(output, ACBlockRegistry.ENERGIZED_GALENA_NEUTRAL.get());
                add(output, ACBlockRegistry.ENERGIZED_GALENA_SCARLET.get());
                add(output, ACBlockRegistry.ENERGIZED_GALENA_AZURE.get());
                add(output, ACBlockRegistry.GALENA_SPIRE.get());
                add(output, ACBlockRegistry.PACKED_GALENA.get());
                add(output, ACBlockRegistry.GALENA_PILLAR.get());
                add(output, ACBlockRegistry.TESLA_BULB.get());
                add(output, ACBlockRegistry.METAL_SWARF.get());
                add(output, ACBlockRegistry.SCRAP_METAL.get());
                add(output, ACBlockRegistry.SCRAP_METAL_PLATE.get());
                add(output, ACBlockRegistry.METAL_REBAR.get());
                add(output, ACBlockRegistry.METAL_SCAFFOLDING.get());
                add(output, ACBlockRegistry.METAL_BARREL.get());
                add(output, ACBlockRegistry.SCARLET_NEODYMIUM_NODE.get());
                add(output, ACBlockRegistry.SCARLET_NEODYMIUM_PILLAR.get());
                add(output, ACBlockRegistry.BLOCK_OF_SCARLET_NEODYMIUM.get());
                add(output, ACBlockRegistry.SCARLET_MAGNET.get());
                add(output, ACBlockRegistry.AZURE_NEODYMIUM_NODE.get());
                add(output, ACBlockRegistry.AZURE_NEODYMIUM_PILLAR.get());
                add(output, ACBlockRegistry.BLOCK_OF_AZURE_NEODYMIUM.get());
                add(output, ACBlockRegistry.AZURE_MAGNET.get());
                add(output, ACBlockRegistry.HEART_OF_IRON.get());
                add(output, ACBlockRegistry.MAGNETIC_ACTIVATOR.get());
                add(output, ACBlockRegistry.HOLOGRAM_PROJECTOR.get());
                add(output, ACBlockRegistry.MAGNETIC_LIGHT.get());
                add(output, ACBlockRegistry.MAGNETIC_LEVITATION_RAIL.get());
                add(output, ACBlockRegistry.QUARRY.get());
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.MAGNETIZING_POTION.get()));
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.LONG_MAGNETIZING_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.MAGNETIZING_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.LONG_MAGNETIZING_POTION.get()));
            })
            .build());

    public static final RegistryObject<CreativeModeTab> PRIMORDIAL_CAVES = DEF_REG.register("primordial_caves", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alexscaves.primordial_caves"))
            .icon(() -> new ItemStack(ACBlockRegistry.FLYTRAP.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .withTabsBefore(MAGNETIC_CAVES.getKey())
            .displayItems((enabledFeatures, output) -> {
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_TABLET.get(), ACBiomeRegistry.PRIMORDIAL_CAVES));
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_CODEX.get(), ACBiomeRegistry.PRIMORDIAL_CAVES));
                add(output, ACBlockRegistry.SPELUNKERY_TABLE.get());
                add(output, ACItemRegistry.CAVE_BOOK.get());
                output.accept(CaveMapItem.createMap(ACBiomeRegistry.PRIMORDIAL_CAVES));
                ACItemRegistry.getSpawnEggsForTab(ACBiomeRegistry.PRIMORDIAL_CAVES).forEach((spawnEgg -> add(output, spawnEgg.get())));
                add(output, ACItemRegistry.TRILOCARIS_BUCKET.get());
                add(output, ACItemRegistry.TRILOCARIS_TAIL.get());
                add(output, ACItemRegistry.COOKED_TRILOCARIS_TAIL.get());
                add(output, ACItemRegistry.PINE_NUTS.get());
                add(output, ACItemRegistry.AMBER_CURIOSITY.get());
                add(output, ACItemRegistry.DINOSAUR_NUGGET.get());
                add(output, ACItemRegistry.SERENE_SALAD.get());
                add(output, ACItemRegistry.SEETHING_STEW.get());
                add(output, ACItemRegistry.PRIMORDIAL_SOUP.get());
                add(output, ACItemRegistry.TOUGH_HIDE.get());
                add(output, ACItemRegistry.HEAVY_BONE.get());
                add(output, ACItemRegistry.PRIMITIVE_CLUB.get());
                add(output, ACItemRegistry.LIMESTONE_SPEAR.get());
                add(output, ACItemRegistry.PRIMORDIAL_HELMET.get());
                add(output, ACItemRegistry.PRIMORDIAL_TUNIC.get());
                add(output, ACItemRegistry.PRIMORDIAL_PANTS.get());
                add(output, ACItemRegistry.DINOSAUR_POTTERY_SHERD.get());
                add(output, ACItemRegistry.FOOTPRINT_POTTERY_SHERD.get());
                add(output, ACBlockRegistry.AMBER.get());
                add(output, ACBlockRegistry.AMBERSOL.get());
                add(output, ACBlockRegistry.AMBER_MONOLITH.get());
                add(output, ACBlockRegistry.LIMESTONE.get());
                add(output, ACBlockRegistry.LIMESTONE_STAIRS.get());
                add(output, ACBlockRegistry.LIMESTONE_SLAB.get());
                add(output, ACBlockRegistry.LIMESTONE_WALL.get());
                add(output, ACBlockRegistry.LIMESTONE_PILLAR.get());
                add(output, ACBlockRegistry.LIMESTONE_CHISELED.get());
                add(output, ACBlockRegistry.SMOOTH_LIMESTONE.get());
                add(output, ACBlockRegistry.SMOOTH_LIMESTONE_STAIRS.get());
                add(output, ACBlockRegistry.SMOOTH_LIMESTONE_SLAB.get());
                add(output, ACBlockRegistry.SMOOTH_LIMESTONE_WALL.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_AMBERSOL.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_DARK.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_FOOTPRINT.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_FOOTPRINTS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_TREE_STARS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_PEWEN.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_TRILOCARIS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_GROTTOCERATOPS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_GROTTOCERATOPS_FRIEND.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_DINO_NUGGETS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_VALLUMRAPTOR_CHEST.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_VALLUMRAPTOR_FRIEND.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_RELICHEIRUS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_RELICHEIRUS_SLASH.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_ENDERMAN.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_PORTAL.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_SUBTERRANODON.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_SUBTERRANODON_RIDE.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_TREMORSAURUS.get());
                add(output, ACBlockRegistry.CAVE_PAINTING_TREMORSAURUS_FRIEND.get());
                add(output, ACBlockRegistry.SUBTERRANODON_EGG.get());
                add(output, ACBlockRegistry.VALLUMRAPTOR_EGG.get());
                add(output, ACBlockRegistry.GROTTOCERATOPS_EGG.get());
                add(output, ACBlockRegistry.TREMORSAURUS_EGG.get());
                add(output, ACBlockRegistry.RELICHEIRUS_EGG.get());
                add(output, ACBlockRegistry.DINOSAUR_CHOP.get());
                add(output, ACBlockRegistry.COOKED_DINOSAUR_CHOP.get());
                add(output, ACBlockRegistry.CARMINE_FROGLIGHT.get());
                add(output, ACBlockRegistry.PEWEN_LOG.get());
                add(output, ACBlockRegistry.PEWEN_BRANCH.get());
                add(output, ACBlockRegistry.PEWEN_SAPLING.get());
                add(output, ACBlockRegistry.PEWEN_PINES.get());
                add(output, ACBlockRegistry.PEWEN_WOOD.get());
                add(output, ACBlockRegistry.STRIPPED_PEWEN_LOG.get());
                add(output, ACBlockRegistry.STRIPPED_PEWEN_WOOD.get());
                add(output, ACBlockRegistry.PEWEN_PLANKS.get());
                add(output, ACBlockRegistry.PEWEN_PLANKS_STAIRS.get());
                add(output, ACBlockRegistry.PEWEN_PLANKS_SLAB.get());
                add(output, ACBlockRegistry.PEWEN_PLANKS_FENCE.get());
                add(output, ACItemRegistry.PEWEN_SIGN.get());
                add(output, ACItemRegistry.PEWEN_HANGING_SIGN.get());
                add(output, ACBlockRegistry.PEWEN_PRESSURE_PLATE.get());
                add(output, ACItemRegistry.PEWEN_DOOR.get());
                add(output, ACBlockRegistry.PEWEN_TRAPDOOR.get());
                add(output, ACBlockRegistry.PEWEN_BUTTON.get());
                add(output, ACBlockRegistry.PEWEN_FENCE_GATE.get());
                add(output, ACItemRegistry.PEWEN_BOAT.get());
                add(output, ACItemRegistry.PEWEN_CHEST_BOAT.get());
                add(output, ACBlockRegistry.FIDDLEHEAD.get());
                add(output, ACBlockRegistry.CURLY_FERN.get());
                add(output, ACBlockRegistry.FLYTRAP.get());
                add(output, ACBlockRegistry.CYCAD.get());
                add(output, ACBlockRegistry.ARCHAIC_VINE.get());
                add(output, ACBlockRegistry.ANCIENT_LEAVES.get());
                add(output, ACBlockRegistry.ANCIENT_SAPLING.get());
                add(output, ACBlockRegistry.TREE_STAR.get());
                add(output, ACBlockRegistry.FERN_THATCH.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> TOXIC_CAVES = DEF_REG.register("toxic_caves", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alexscaves.toxic_caves"))
            .icon(() -> new ItemStack(ACBlockRegistry.WASTE_DRUM.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .withTabsBefore(PRIMORDIAL_CAVES.getKey())
            .displayItems((enabledFeatures, output) -> {
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_TABLET.get(), ACBiomeRegistry.TOXIC_CAVES));
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_CODEX.get(), ACBiomeRegistry.TOXIC_CAVES));
                add(output, ACBlockRegistry.SPELUNKERY_TABLE.get());
                add(output, ACItemRegistry.CAVE_BOOK.get());
                output.accept(CaveMapItem.createMap(ACBiomeRegistry.TOXIC_CAVES));
                ACItemRegistry.getSpawnEggsForTab(ACBiomeRegistry.TOXIC_CAVES).forEach((spawnEgg -> add(output, spawnEgg.get())));
                add(output, ACItemRegistry.ACID_BUCKET.get());
                add(output, ACItemRegistry.RADGILL_BUCKET.get());
                add(output, ACItemRegistry.RADGILL.get());
                add(output, ACItemRegistry.COOKED_RADGILL.get());
                add(output, ACItemRegistry.URANIUM_SHARD.get());
                add(output, ACItemRegistry.URANIUM.get());
                add(output, ACItemRegistry.SULFUR_DUST.get());
                add(output, ACItemRegistry.RADON_BOTTLE.get());
                add(output, ACItemRegistry.CINDER_BRICK.get());
                add(output, ACItemRegistry.SPELUNKIE.get());
                add(output, ACItemRegistry.SLAM.get());
                add(output, ACItemRegistry.GREEN_SOYLENT.get());
                add(output, ACItemRegistry.TOXIC_PASTE.get());
                add(output, ACItemRegistry.POLYMER_PLATE.get());
                add(output, ACItemRegistry.HAZMAT_MASK.get());
                add(output, ACItemRegistry.HAZMAT_CHESTPLATE.get());
                add(output, ACItemRegistry.HAZMAT_LEGGINGS.get());
                add(output, ACItemRegistry.HAZMAT_BOOTS.get());
                add(output, ACItemRegistry.FISSILE_CORE.get());
                add(output, ACItemRegistry.CHARRED_REMNANT.get());
                add(output, ACItemRegistry.REMOTE_DETONATOR.get());
                add(output, ACItemRegistry.RAYGUN.get());
                add(output, ACBlockRegistry.RADROCK.get());
                add(output, ACBlockRegistry.RADROCK_STAIRS.get());
                add(output, ACBlockRegistry.RADROCK_SLAB.get());
                add(output, ACBlockRegistry.RADROCK_WALL.get());
                add(output, ACBlockRegistry.RADROCK_BRICKS.get());
                add(output, ACBlockRegistry.RADROCK_BRICK_STAIRS.get());
                add(output, ACBlockRegistry.RADROCK_BRICK_SLAB.get());
                add(output, ACBlockRegistry.RADROCK_BRICK_WALL.get());
                add(output, ACBlockRegistry.RADROCK_CHISELED.get());
                add(output, ACBlockRegistry.RADROCK_URANIUM_ORE.get());
                add(output, ACBlockRegistry.ACIDIC_RADROCK.get());
                add(output, ACBlockRegistry.GEOTHERMAL_VENT.get());
                add(output, ACBlockRegistry.GEOTHERMAL_VENT_MEDIUM.get());
                add(output, ACBlockRegistry.GEOTHERMAL_VENT_THIN.get());
                add(output, ACBlockRegistry.METAL_SWARF.get());
                add(output, ACBlockRegistry.SCRAP_METAL.get());
                add(output, ACBlockRegistry.RUSTY_SCRAP_METAL.get());
                add(output, ACBlockRegistry.SCRAP_METAL_PLATE.get());
                add(output, ACBlockRegistry.RUSTY_SCRAP_METAL_PLATE.get());
                add(output, ACBlockRegistry.METAL_REBAR.get());
                add(output, ACBlockRegistry.RUSTY_REBAR.get());
                add(output, ACBlockRegistry.METAL_SCAFFOLDING.get());
                add(output, ACBlockRegistry.RUSTY_SCAFFOLDING.get());
                add(output, ACBlockRegistry.METAL_BARREL.get());
                add(output, ACBlockRegistry.RUSTY_BARREL.get());
                add(output, ACBlockRegistry.WASTE_DRUM.get());
                add(output, ACBlockRegistry.UNDERWEED.get());
                add(output, ACBlockRegistry.URANIUM_ROD.get());
                add(output, ACBlockRegistry.BLOCK_OF_URANIUM.get());
                add(output, ACBlockRegistry.NUCLEAR_BOMB.get());
                add(output, ACBlockRegistry.UNREFINED_WASTE.get());
                add(output, ACBlockRegistry.NUCLEAR_FURNACE_COMPONENT.get());
                add(output, ACBlockRegistry.SULFUR.get());
                add(output, ACBlockRegistry.SULFUR_BUD_SMALL.get());
                add(output, ACBlockRegistry.SULFUR_BUD_MEDIUM.get());
                add(output, ACBlockRegistry.SULFUR_BUD_LARGE.get());
                add(output, ACBlockRegistry.SULFUR_CLUSTER.get());
                add(output, ACBlockRegistry.CINDER_BLOCK.get());
                add(output, ACBlockRegistry.CINDER_BLOCK_STAIRS.get());
                add(output, ACBlockRegistry.CINDER_BLOCK_SLAB.get());
                add(output, ACBlockRegistry.CINDER_BLOCK_WALL.get());
                add(output, ACBlockRegistry.HAZMAT_BLOCK.get());
                add(output, ACBlockRegistry.SIREN_LIGHT.get());
                add(output, ACBlockRegistry.NUCLEAR_SIREN.get());
                add(output, ACBlockRegistry.WHITE_RADON_LAMP.get());
                add(output, ACBlockRegistry.ORANGE_RADON_LAMP.get());
                add(output, ACBlockRegistry.MAGENTA_RADON_LAMP.get());
                add(output, ACBlockRegistry.LIGHT_BLUE_RADON_LAMP.get());
                add(output, ACBlockRegistry.YELLOW_RADON_LAMP.get());
                add(output, ACBlockRegistry.LIME_RADON_LAMP.get());
                add(output, ACBlockRegistry.PINK_RADON_LAMP.get());
                add(output, ACBlockRegistry.GRAY_RADON_LAMP.get());
                add(output, ACBlockRegistry.LIGHT_GRAY_RADON_LAMP.get());
                add(output, ACBlockRegistry.CYAN_RADON_LAMP.get());
                add(output, ACBlockRegistry.PURPLE_RADON_LAMP.get());
                add(output, ACBlockRegistry.BLUE_RADON_LAMP.get());
                add(output, ACBlockRegistry.BROWN_RADON_LAMP.get());
                add(output, ACBlockRegistry.GREEN_RADON_LAMP.get());
                add(output, ACBlockRegistry.RED_RADON_LAMP.get());
                add(output, ACBlockRegistry.BLACK_RADON_LAMP.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> ABYSSAL_CHASM = DEF_REG.register("abyssal_chasm", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alexscaves.abyssal_chasm"))
            .icon(() -> new ItemStack(ACItemRegistry.SUBMARINE.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .withTabsBefore(TOXIC_CAVES.getKey())
            .displayItems((enabledFeatures, output) -> {
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_TABLET.get(), ACBiomeRegistry.ABYSSAL_CHASM));
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_CODEX.get(), ACBiomeRegistry.ABYSSAL_CHASM));
                add(output, ACBlockRegistry.SPELUNKERY_TABLE.get());
                add(output, ACItemRegistry.CAVE_BOOK.get());
                output.accept(CaveMapItem.createMap(ACBiomeRegistry.ABYSSAL_CHASM));
                ACItemRegistry.getSpawnEggsForTab(ACBiomeRegistry.ABYSSAL_CHASM).forEach((spawnEgg -> add(output, spawnEgg.get())));
                add(output, ACItemRegistry.LANTERNFISH_BUCKET.get());
                add(output, ACItemRegistry.LANTERNFISH.get());
                add(output, ACItemRegistry.COOKED_LANTERNFISH.get());
                add(output, ACItemRegistry.TRIPODFISH_BUCKET.get());
                add(output, ACItemRegistry.TRIPODFISH.get());
                add(output, ACItemRegistry.COOKED_TRIPODFISH.get());
                add(output, ACItemRegistry.SEA_PIG_BUCKET.get());
                add(output, ACItemRegistry.SEA_PIG.get());
                add(output, ACItemRegistry.MARINE_SNOW.get());
                add(output, ACItemRegistry.GOSSAMER_WORM_BUCKET.get());
                add(output, ACItemRegistry.BIOLUMINESSCENCE.get());
                add(output, ACItemRegistry.PEARL.get());
                add(output, ACItemRegistry.COOKED_MUSSEL.get());
                add(output, ACItemRegistry.DEEP_SEA_SUSHI_ROLL.get());
                add(output, ACItemRegistry.SEA_GLASS_SHARDS.get());
                add(output, ACItemRegistry.SUBMARINE.get());
                add(output, ACItemRegistry.DIVING_HELMET.get());
                add(output, ACItemRegistry.DIVING_CHESTPLATE.get());
                add(output, ACItemRegistry.DIVING_LEGGINGS.get());
                add(output, ACItemRegistry.DIVING_BOOTS.get());
                add(output, ACItemRegistry.FLOATER.get());
                add(output, ACItemRegistry.GAZING_PEARL.get());
                add(output, ACItemRegistry.INK_BOMB.get());
                add(output, ACItemRegistry.GLOW_INK_BOMB.get());
                add(output, ACItemRegistry.ORTHOLANCE.get());
                add(output, ACItemRegistry.MAGIC_CONCH.get());
                add(output, ACItemRegistry.SEA_STAFF.get());
                add(output, ACItemRegistry.DEPTH_CHARGE.get());
                add(output, ACItemRegistry.GUARDIAN_POTTERY_SHERD.get());
                add(output, ACItemRegistry.HERO_POTTERY_SHERD.get());
                add(output, ACBlockRegistry.ABYSSMARINE.get());
                add(output, ACBlockRegistry.ABYSSMARINE_STAIRS.get());
                add(output, ACBlockRegistry.ABYSSMARINE_SLAB.get());
                add(output, ACBlockRegistry.ABYSSMARINE_WALL.get());
                add(output, ACBlockRegistry.ABYSSAL_ALTAR.get());
                add(output, ACBlockRegistry.ABYSSMARINE_BRICKS.get());
                add(output, ACBlockRegistry.ABYSSMARINE_BRICK_STAIRS.get());
                add(output, ACBlockRegistry.ABYSSMARINE_BRICK_SLAB.get());
                add(output, ACBlockRegistry.ABYSSMARINE_BRICK_WALL.get());
                add(output, ACBlockRegistry.ABYSSMARINE_PILLAR.get());
                add(output, ACBlockRegistry.ABYSSMARINE_TILES.get());
                add(output, ACBlockRegistry.MUCK.get());
                add(output, ACBlockRegistry.GEOTHERMAL_VENT.get());
                add(output, ACBlockRegistry.GEOTHERMAL_VENT_MEDIUM.get());
                add(output, ACBlockRegistry.GEOTHERMAL_VENT_THIN.get());
                add(output, ACBlockRegistry.TUBE_WORM.get());
                add(output, ACBlockRegistry.SMOOTH_BONE.get());
                add(output, ACBlockRegistry.SMOOTH_BONE_STAIRS.get());
                add(output, ACBlockRegistry.SMOOTH_BONE_SLAB.get());
                add(output, ACBlockRegistry.SMOOTH_BONE_WALL.get());
                add(output, ACBlockRegistry.HOLLOW_BONE.get());
                add(output, ACBlockRegistry.THIN_BONE.get());
                add(output, ACBlockRegistry.BONE_NODULE.get());
                add(output, ACBlockRegistry.BONE_RIBS.get());
                add(output, ACBlockRegistry.BALEEN_BONE.get());
                add(output, ACBlockRegistry.BONE_WORMS.get());
                add(output, ACBlockRegistry.PING_PONG_SPONGE.get());
                add(output, ACBlockRegistry.DUSK_ANEMONE.get());
                add(output, ACBlockRegistry.TWILIGHT_ANEMONE.get());
                add(output, ACBlockRegistry.MIDNIGHT_ANEMONE.get());
                add(output, ACBlockRegistry.MUSSEL.get());
                add(output, ACBlockRegistry.BLOCK_OF_PEARL.get());
                add(output, ACItemRegistry.BIOLUMINESCENT_TORCH.get());
                add(output, ACBlockRegistry.DRAIN.get());
                add(output, ACBlockRegistry.DEPTH_GLASS.get());
                add(output, ACBlockRegistry.COPPER_VALVE.get());
                add(output, ACBlockRegistry.ENIGMATIC_ENGINE.get());
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.DEEPSIGHT_POTION.get()));
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.LONG_DEEPSIGHT_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.DEEPSIGHT_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.LONG_DEEPSIGHT_POTION.get()));
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.GLOWING_POTION.get()));
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.LONG_GLOWING_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.GLOWING_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.LONG_GLOWING_POTION.get()));
            })
            .build());

    public static final RegistryObject<CreativeModeTab> FORLORN_HOLLOWS = DEF_REG.register("forlorn_hollows", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alexscaves.forlorn_hollows"))
            .icon(() -> new ItemStack(ACBlockRegistry.PEERING_COPROLITH.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .withTabsBefore(ABYSSAL_CHASM.getKey())
            .displayItems((enabledFeatures, output) -> {
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_TABLET.get(), ACBiomeRegistry.FORLORN_HOLLOWS));
                output.accept(CaveInfoItem.create(ACItemRegistry.CAVE_CODEX.get(), ACBiomeRegistry.FORLORN_HOLLOWS));
                add(output, ACBlockRegistry.SPELUNKERY_TABLE.get());
                add(output, ACItemRegistry.CAVE_BOOK.get());
                output.accept(CaveMapItem.createMap(ACBiomeRegistry.FORLORN_HOLLOWS));
                ACItemRegistry.getSpawnEggsForTab(ACBiomeRegistry.FORLORN_HOLLOWS).forEach((spawnEgg -> add(output, spawnEgg.get())));
                add(output, ACItemRegistry.GUANO.get());
                add(output, ACItemRegistry.MOTH_DUST.get());
                add(output, ACItemRegistry.FERTILIZER.get());
                add(output, ACItemRegistry.DARK_TATTERS.get());
                add(output, ACItemRegistry.OCCULT_GEM.get());
                add(output, ACItemRegistry.TOTEM_OF_POSSESSION.get());
                add(output, ACItemRegistry.DESOLATE_DAGGER.get());
                add(output, ACItemRegistry.CORRODENT_TEETH.get());
                add(output, ACItemRegistry.BURROWING_ARROW.get());
                add(output, ACItemRegistry.VESPER_WING.get());
                add(output, ACItemRegistry.VESPER_STEW.get());
                add(output, ACItemRegistry.PURE_DARKNESS.get());
                add(output, ACItemRegistry.SHADOW_SILK.get());
                add(output, ACItemRegistry.HOOD_OF_DARKNESS.get());
                add(output, ACItemRegistry.CLOAK_OF_DARKNESS.get());
                add(output, ACItemRegistry.DARKENED_APPLE.get());
                add(output, ACItemRegistry.DREADBOW.get());
                add(output, ACBlockRegistry.GUANO_BLOCK.get());
                add(output, ACBlockRegistry.GUANO_LAYER.get());
                add(output, ACBlockRegistry.GUANOSTONE.get());
                add(output, ACBlockRegistry.GUANOSTONE_STAIRS.get());
                add(output, ACBlockRegistry.GUANOSTONE_SLAB.get());
                add(output, ACBlockRegistry.GUANOSTONE_WALL.get());
                add(output, ACBlockRegistry.GUANOSTONE_BRICKS.get());
                add(output, ACBlockRegistry.GUANOSTONE_BRICK_STAIRS.get());
                add(output, ACBlockRegistry.GUANOSTONE_BRICK_SLAB.get());
                add(output, ACBlockRegistry.GUANOSTONE_BRICK_WALL.get());
                add(output, ACBlockRegistry.GUANOSTONE_CHISELED.get());
                add(output, ACBlockRegistry.GUANOSTONE_TILES.get());
                add(output, ACBlockRegistry.GUANOSTONE_REDSTONE_ORE.get());
                add(output, ACBlockRegistry.COPROLITH.get());
                add(output, ACBlockRegistry.COPROLITH_STAIRS.get());
                add(output, ACBlockRegistry.COPROLITH_SLAB.get());
                add(output, ACBlockRegistry.COPROLITH_WALL.get());
                add(output, ACBlockRegistry.SMOOTH_COPROLITH.get());
                add(output, ACBlockRegistry.SMOOTH_COPROLITH_STAIRS.get());
                add(output, ACBlockRegistry.SMOOTH_COPROLITH_SLAB.get());
                add(output, ACBlockRegistry.SMOOTH_COPROLITH_WALL.get());
                add(output, ACBlockRegistry.COPROLITH_COAL_ORE.get());
                add(output, ACBlockRegistry.POROUS_COPROLITH.get());
                add(output, ACBlockRegistry.PEERING_COPROLITH.get());
                add(output, ACBlockRegistry.FORSAKEN_IDOL.get());
                add(output, ACBlockRegistry.THORNWOOD_LOG.get());
                add(output, ACBlockRegistry.THORNWOOD_BRANCH.get());
                add(output, ACBlockRegistry.THORNWOOD_SAPLING.get());
                add(output, ACBlockRegistry.THORNWOOD_WOOD.get());
                add(output, ACBlockRegistry.STRIPPED_THORNWOOD_LOG.get());
                add(output, ACBlockRegistry.STRIPPED_THORNWOOD_WOOD.get());
                add(output, ACBlockRegistry.THORNWOOD_PLANKS.get());
                add(output, ACBlockRegistry.THORNWOOD_PLANKS_STAIRS.get());
                add(output, ACBlockRegistry.THORNWOOD_PLANKS_SLAB.get());
                add(output, ACBlockRegistry.THORNWOOD_PLANKS_FENCE.get());
                add(output, ACItemRegistry.THORNWOOD_SIGN.get());
                add(output, ACItemRegistry.THORNWOOD_HANGING_SIGN.get());
                add(output, ACBlockRegistry.THORNWOOD_PRESSURE_PLATE.get());
                add(output, ACItemRegistry.THORNWOOD_DOOR.get());
                add(output, ACBlockRegistry.THORNWOOD_TRAPDOOR.get());
                add(output, ACBlockRegistry.THORNWOOD_BUTTON.get());
                add(output, ACBlockRegistry.THORNWOOD_FENCE_GATE.get());
                add(output, ACItemRegistry.THORNWOOD_BOAT.get());
                add(output, ACItemRegistry.THORNWOOD_CHEST_BOAT.get());
                add(output, ACBlockRegistry.UNDERWEED.get());
                add(output, ACBlockRegistry.MOTH_BALL.get());
                add(output, ACBlockRegistry.BEHOLDER.get());
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.HASTE_POTION.get()));
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.LONG_HASTE_POTION.get()));
                output.accept(ACEffectRegistry.createPotion(ACEffectRegistry.STRONG_HASTE_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.HASTE_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.LONG_HASTE_POTION.get()));
                output.accept(ACEffectRegistry.createSplashPotion(ACEffectRegistry.STRONG_HASTE_POTION.get()));
            })
            .build());

    private static void add(CreativeModeTab.Output tab, ItemLike itemLike) {
        if (itemLike instanceof CustomTabBehavior customTabBehavior) {
            customTabBehavior.fillItemCategory(tab);
        } else {
            tab.accept(itemLike);
        }
    }
}
