package mattparks.mods.starcraft.mercury.items;

import mattparks.mods.starcraft.mercury.GCMercury;
import micdoodle8.mods.galacticraft.core.client.ClientProxyCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCCoreItemJetpack extends ItemArmor
{
    public boolean attachedMask;
    private final EnumArmorMaterial material;

    public SCCoreItemJetpack(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, boolean breathable)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.material = par2EnumArmorMaterial;
        this.attachedMask = breathable;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        if (this.material == GCMercuryItems.ARMORJETPACK)
        {
            if (stack.getItem().itemID == GCMercuryItems.jetpack.itemID)
            {
                return "textures/model/armor/jetpack.png";
            }
        }

        return null;
    }

    @Override
    public CreativeTabs getCreativeTab()
    {
        return GCMercury.starcraftMercuryTab;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return ClientProxyCore.galacticraftItem;
    }

    @Override
	public void onArmorTickUpdate(World world, EntityPlayer player,
			ItemStack itemstack) {
		if (itemstack.itemID == GCMercuryItems.jetpack.itemID) {
			player.capabilities.allowFlying = true;
		}
	}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(this.getUnlocalizedName().replace("item.", "starcraftmercury:"));
    }
    
	@Override
    public Item setUnlocalizedName(String par1Str)
    {
        super.setTextureName(par1Str);
        super.setUnlocalizedName(par1Str);
        return this;
    }
	
//  @Override
//  public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) 
//  {
//          if (entity instanceof EntityPlayer)
//          {
//                  final EntityPlayer player = (EntityPlayer) entity;
//                  
//                  if (StarcraftTick.tick % 100 == 0)
//                  {
//                          if (!player.capabilities.isCreativeMode)
//                          {
//                              player.inventory.consumeInventoryItem(Item.coal.itemID);
//                          }
//                  }
//          }
//  }
}