package mattparks.mods.starcraft.venus.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mattparks.mods.starcraft.venus.GCVenus;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVurnBerryOnAStick extends Item
{
    public ItemVurnBerryOnAStick(int par1)
    {
        super(par1);
        this.setCreativeTab(GCVenus.starcraftVenusTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(25);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
     * hands.
     */
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.isRiding() && par3EntityPlayer.ridingEntity instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)par3EntityPlayer.ridingEntity;

            if (entitypig.getAIControlledByPlayer().isControlledByPlayer() && par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() >= 7)
            {
                entitypig.getAIControlledByPlayer().boostSpeed();
                par1ItemStack.damageItem(7, par3EntityPlayer);

                if (par1ItemStack.stackSize == 0)
                {
                    ItemStack itemstack1 = new ItemStack(Item.fishingRod);
                    itemstack1.setTagCompound(par1ItemStack.stackTagCompound);
                    return itemstack1;
                }
            }
        }

        return par1ItemStack;
    }
}
