package totemic_commons.pokefenn.item.totem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import totemic_commons.pokefenn.item.ItemTotemic;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.lib.Textures;

import java.util.List;

public class ItemTotemBat extends ItemTotemic {
	
	
	public ItemTotemBat(int id){
		
		super(id);
		this.setUnlocalizedName(Strings.TOTEM_BAT_NAME);
		
		
		
	}

	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.TOTEM_BAT_ICON);       
    	
    	
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Placing this in a Totem base will cause batty effects...");
    }
	
}
