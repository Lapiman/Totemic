package totemic_commons.pokefenn.rendering;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class StaffRender implements IItemRenderer {

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
