package totemic_commons.pokefenn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import totemic_commons.pokefenn.Totemic;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.lib.Textures;

/**
 * Created with IntelliJ IDEA.
 * User: ${Pokefenn}
 * Date: 13/11/13
 * Time: 08:07
 */
public class BlockBigBadTotemBase extends Block {


    public BlockBigBadTotemBase(int id){

        super(id, Material.wood);
        this.setUnlocalizedName(Strings.BIG_BAD_TOTEM_BASE_NAME);
        this.setHardness(1F);
        this.setCreativeTab(Totemic.tabsTotem);



    }


    @SideOnly(Side.CLIENT)
    private Icon allSidesIcon;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register){
        allSidesIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.BIG_BAD_TOTEM_BASE_ICON_ALL);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public net.minecraft.util.Icon getIcon(int side, int meta) {
        return allSidesIcon;


    }



}
