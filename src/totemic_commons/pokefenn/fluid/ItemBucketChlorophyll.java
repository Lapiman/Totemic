package totemic_commons.pokefenn.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.fluids.ItemFluidContainer;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.lib.Textures;

public class ItemBucketChlorophyll extends ItemFluidContainer {
	
	
	public ItemBucketChlorophyll(int id){
		
		super(id - 256);
		this.setUnlocalizedName(Strings.BUCKET_CHLOROPHYLL_NAME);
		
	}


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {

        itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.BUCKET_CHLOROPHYLL_ICON);


    }

}
