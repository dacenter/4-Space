package mattparks.mods.starcraft.core.blocks;

import micdoodle8.mods.galacticraft.api.block.ITerraformableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class StarcraftGasBottom extends Block implements ITerraformableBlock
{
	public StarcraftGasBottom(int par1, String name)
    {
        super(par1, Material.rock);
        this.setUnlocalizedName(name);
//        this.setTextureName(StarcraftCore.ASSET_PREFIX + name);
        this.setHardness(2.0F);
    }

	@Override
	public boolean isTerraformable(World world, int x, int y, int z) {
		return false;
	}	
	
}
