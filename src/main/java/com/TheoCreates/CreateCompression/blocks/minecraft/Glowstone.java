package com.TheoCreates.CreateCompression.blocks.minecraft;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Glowstone extends Block {
    public Glowstone() {
        super(Properties.of(Material.GLASS)
            .lightLevel((b) -> 15)
            .sound(SoundType.GLASS)
            .requiresCorrectToolForDrops()
            .strength(7.0f, 20.0f));
    }
}
