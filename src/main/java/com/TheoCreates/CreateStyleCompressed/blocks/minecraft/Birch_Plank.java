package com.TheoCreates.CreateStyleCompressed.blocks.minecraft;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Birch_Plank extends Block {
    public Birch_Plank() {
        super(Properties.of(Material.WOOD)
            .sound(SoundType.WOOD)
            .requiresCorrectToolForDrops()
            .strength(7.0f, 20.0f));
    }
}
