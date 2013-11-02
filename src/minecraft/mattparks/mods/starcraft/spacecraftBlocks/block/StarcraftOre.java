package mattparks.mods.starcraft.spacecraftBlocks.block;

import micdoodle8.mods.galacticraft.api.block.IDetectableResource;
import micdoodle8.mods.galacticraft.api.block.IPlantableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StarcraftOre extends Block implements IDetectableResource, IPlantableBlock
{
    public StarcraftOre(int id, Material material)
    {
            super( id, material.rock);
    }

    @Override
    public boolean isValueable(int metadata)
    {
        switch (metadata)
        {
        default:
            return true;
        }
    }
    
    @Override
    public int requiredLiquidBlocksNearby()
    {
        return 5; //Set How LiquidBlocks Is Needed Nearby To Plant in.
    }
    
    @Override
    public boolean isPlantable(int metadata)
    {
        if (metadata >= 5 && metadata <= 13)
        {
            return true;
        }

        return false;
    }
}
