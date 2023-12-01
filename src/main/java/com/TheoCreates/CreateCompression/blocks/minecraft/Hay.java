package com.TheoCreates.CreateCompression.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Hay extends Block {
    public Hay() {
        super(Properties.of(Material.WOOL)
            .sound(SoundType.WOOL)
            .requiresCorrectToolForDrops()
            .strength(7.0f, 20.0f));
    }
}
