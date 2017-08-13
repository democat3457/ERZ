package teamroots.emberroot.entity.spritegreater;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import teamroots.emberroot.Const;

public class RenderSpriteProjectile extends RenderLiving<EntitySpriteProjectile> {
  public RenderSpriteProjectile(RenderManager renderManager, ModelBase modelBase, float shadowSize) {
    super(renderManager, modelBase, shadowSize);
  }
  @Override
  public boolean canRenderName(EntitySpriteProjectile entity) {
    return false;
  }
  @Override
  protected ResourceLocation getEntityTexture(EntitySpriteProjectile entity) {
//    System.out.println("EH" + Const.MODID + "textures/entity/sparkle.png");
    //TODO: hmm somehow this still renders broken texture. but the file exists AND its used other places. revisit later!?!?!
    return new ResourceLocation(Const.MODID, "textures/entity/sparkle.png");
  }
  public static class Factory implements IRenderFactory<EntitySpriteProjectile> {
    @Override
    public RenderSpriteProjectile createRenderFor(RenderManager manager) {
      return new RenderSpriteProjectile(manager, ModelNull.instance, 0.5f);
    }
  }
}
