package net.aurelj.dungeons_arise;

import net.aurelj.dungeons_arise.structures.WDAGenericStructures;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WDAStructures {

    public static final DeferredRegister<StructureType<?>> STRUCTURES =
            DeferredRegister.create(
                    Registries.STRUCTURE_TYPE,
                    DungeonsAriseMain.MODID
            );

    public static final Supplier<StructureType<WDAGenericStructures>> GENERIC_STRUCTURES =
            STRUCTURES.register(
                    "generic_structures",
                    () -> () -> WDAGenericStructures.CODEC
            );
}