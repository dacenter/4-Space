package mattparks.mods.starcraft.core.blocks;

import mattparks.mods.starcraft.core.StarcraftMercury;
import micdoodle8.mods.galacticraft.core.blocks.GCCoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class StarcraftCaravanModule extends Block
{        
    public StarcraftCaravanModule(int par1, String name)
    {
        super(par1, Material.rock);
        this.setUnlocalizedName(name);
//        this.setTextureName(StarcraftMercury.ASSET_PREFIX + name);
        this.setHardness(2.0F);
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {        

            this.breakBlocks(par1World, par2, par3 + 2, par4 - 1, false);
            
            this.breakBlocks(par1World, par2, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 +1, par3, par4, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4 - 1, false);
            
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 2, false);
            
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 3, false);
            
            this.breakBlocks(par1World, par2 - 1, par3, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 2, par3, par4 + 4, false);
            

            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 1, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 1, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 1, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3 + 1, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 1, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 1, par4 - 1, false);
            this.breakBlocks(par1World, par2, par3 + 1, par4 - 1, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 2, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 2, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 2, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 2, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3 + 2, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 2, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 3, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 2, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 3, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3 + 3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 3, par4 + 4, false);
            
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 2, par3 + 3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 3, par4 - 2, false);
            this.breakBlocks(par1World, par2, par3 + 3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 3, par4 - 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 2, par3 + 3, par4 + 4, false);
            
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 3, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 2, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 + 1, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 - 1, false);
            this.breakBlocks(par1World, par2, par3 + 4, par4 - 2, false);
            
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 4, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 3, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 2, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 + 1, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 - 1, false);
            this.breakBlocks(par1World, par2, par3 + 5, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 4, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 3, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 2, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 + 1, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 - 1, false);
            this.breakBlocks(par1World, par2 - 1, par3 + 4, par4 - 2, false);
            
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 3, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 2, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 + 1, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 - 1, false);
            this.breakBlocks(par1World, par2 + 1, par3 + 4, par4 - 2, false);

            this.breakBlocks(par1World, par2 - 1, par3 + 1, par4 - 1, false);
    }
    
    private void breakBlocks(World par1World, int x, int y, int z, boolean item)
    {
            if(par1World.blockExists(x, y, z))
            {
                    if(par1World.getBlockId(x, y, z) == StarcraftMercury.caravanModulePart.blockID 
                                    || par1World.getBlockId(x, y, z) == GCCoreBlocks.glowstoneTorch.blockID
                                    || par1World.getBlockId(x, y, z) == Block.furnaceBurning.blockID 
                                    || par1World.getBlockId(x, y, z) == Block.furnaceIdle.blockID 
                                    || par1World.getBlockId(x, y, z) == Block.chest.blockID
                    	            || par1World.getBlockId(x, y, z) == Block.workbench.blockID)
                    {
                            par1World.destroyBlock(x, y, z, item);
                    }
            }
    }
    
    private void breakBlocksOther(World par1World, int x, int y, int z, boolean item)
    {
            if(par1World.blockExists(x, y, z))
            {
                    
                    par1World.destroyBlock(x, y, z, item);
                    
            }
    }
    
    @Override
    public int getMobilityFlag()
    {
        return 2;
    }
    
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4 + 3, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 3, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4 + 3, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4 + 2, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 2, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4 + 2, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4 + 1, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4 + 1, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 1, par4, false);
            this.breakBlocksOther(par1World, par2, par3 + 1, par4, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 1, par4, false);
            
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 + 3, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 3, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 3, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 + 2, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 2, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 2, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 + 1, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 1, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 2, par4 - 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 + 1, false);
            
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 + 3, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 + 3, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 3, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 + 2, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 + 2, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 2, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 + 1, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 1, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4, false);
            this.breakBlocksOther(par1World, par2, par3 + 3, par4, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4, false);
            
            this.breakBlocksOther(par1World, par2 - 1, par3 + 3, par4 - 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 + 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4, false);
            
            
            this.breakBlocksOther(par1World, par2, par3 + 1, par4 + 4, false);
            this.breakBlocksOther(par1World, par2, par3 + 2, par4 + 4, false);
            
            this.breakBlocksOther(par1World, par2 + 1, par3 + 2, par4 - 1, false);
            this.breakBlocksOther(par1World, par2 + 1, par3 + 3, par4 - 1, false);
            
            this.breakBlocksOther(par1World, par2, par3 + 3, par4 - 1, false);
            
            this.setBlocks(par1World, par2, par3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 +1, par3, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            

            this.setBlocks(par1World, par2 - 1, par3 + 1, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 1, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 1, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 1, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 1, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 1, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 1, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 1, par4 - 1, false, Block.workbench.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 1, par4 - 1, false, Block.chest.blockID);
            this.setBlocks(par1World, par2, par3 + 1, par4 - 1, false, Block.furnaceIdle.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 2, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 2, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 2, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 2, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 2, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 2, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 2, par4 - 1, false, GCCoreBlocks.glowstoneTorch.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 2, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 2, par3 + 3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 2, par3 + 3, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2, par3 + 4, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 4, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2, par3 + 5, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2, par3 + 5, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 - 1, par3 + 4, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 3, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 2, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 + 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 - 1, true, StarcraftMercury.caravanModulePart.blockID);
            this.setBlocks(par1World, par2 + 1, par3 + 4, par4 - 2, true, StarcraftMercury.caravanModulePart.blockID);
            
            
        return true;
    }
    
    private void setBlocks(World par1World, int x, int y, int z, boolean item, int blockid)
    {
            if(par1World.blockExists(x, y, z))
            {
                    if(par1World.getBlockId(x, y, z) != blockid)
                    {
                            par1World.destroyBlock(x, y, z, item);
                    }
                    
                    par1World.setBlock(x, y, z, blockid);
            }
    }
    
}