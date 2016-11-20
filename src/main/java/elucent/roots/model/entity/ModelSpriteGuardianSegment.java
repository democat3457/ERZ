package elucent.roots.model.entity;

import elucent.roots.Util;
import elucent.roots.entity.EntitySprite;
import elucent.roots.entity.EntitySpriteGuardian;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModelSpriteGuardianSegment extends ModelBase
{
  //fields
	ModelRenderer head1;
    ModelRenderer stonehead1;
    ModelRenderer stonehead2;
    ModelRenderer crest1;
    ModelRenderer crest2;
    ModelRenderer crest3;
    ModelRenderer crest4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer crest5;
    ModelRenderer crest6;
    ModelRenderer crest7;
    ModelRenderer crest8;
  
  public ModelSpriteGuardianSegment()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      head1 = new ModelRenderer(this, 64, 0);
      head1.addBox(-6F, -6F, -6F, 12, 12, 12);
      head1.setRotationPoint(0F, 0F, 0F);
      head1.setTextureSize(128, 128);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      stonehead1 = new ModelRenderer(this, 16, 32);
      stonehead1.addBox(-3F, -3F, -3F, 6, 6, 6);
      stonehead1.setRotationPoint(0F, 0F, -1F);
      stonehead1.setTextureSize(128, 128);
      stonehead1.mirror = true;
      setRotation(stonehead1, 0F, 0F, 0F);
      stonehead2 = new ModelRenderer(this, 16, 32);
      stonehead2.addBox(-2F, -2F, -2F, 4, 4, 4);
      stonehead2.setRotationPoint(0F, 0F, 6F);
      stonehead2.setTextureSize(128, 128);
      stonehead2.mirror = true;
      setRotation(stonehead2, 0F, 0F, 0F);
      crest1 = new ModelRenderer(this, 32, 0);
      crest1.addBox(-2F, 0F, -2F, 4, 8, 4);
      crest1.setRotationPoint(3F, -4F, -1F);
      crest1.setTextureSize(128, 128);
      crest1.mirror = true;
      setRotation(crest1, 2.617994F, 0F, 0.5235988F);
      crest2 = new ModelRenderer(this, 48, 0);
      crest2.addBox(-2F, 0F, -2F, 4, 6, 4);
      crest2.setRotationPoint(4F, -1F, -2F);
      crest2.setTextureSize(128, 128);
      crest2.mirror = true;
      setRotation(crest2, 2.617994F, 0F, 1.308997F);
      crest3 = new ModelRenderer(this, 32, 0);
      crest3.addBox(-2F, 0F, -2F, 4, 8, 4);
      crest3.setRotationPoint(-3F, -4F, -1F);
      crest3.setTextureSize(128, 128);
      crest3.mirror = true;
      setRotation(crest3, 2.617994F, 0F, -0.5235988F);
      crest4 = new ModelRenderer(this, 48, 0);
      crest4.addBox(-2F, 0F, -2F, 4, 6, 4);
      crest4.setRotationPoint(-4F, -1F, -2F);
      crest4.setTextureSize(128, 128);
      crest4.mirror = true;
      setRotation(crest4, 2.617994F, 0F, -1.308997F);
      leg1 = new ModelRenderer(this, 32, 0);
      leg1.addBox(-2F, 0F, -2F, 4, 8, 4);
      leg1.setRotationPoint(-4F, 4F, -1F);
      leg1.setTextureSize(128, 128);
      leg1.mirror = true;
      setRotation(leg1, 2.879793F, 0F, -2.617994F);
      leg2 = new ModelRenderer(this, 32, 0);
      leg2.addBox(-2F, 0F, -2F, 4, 8, 4);
      leg2.setRotationPoint(4F, 4F, -1F);
      leg2.setTextureSize(128, 128);
      leg2.mirror = true;
      setRotation(leg2, 2.879793F, 0F, 2.617994F);
      head2 = new ModelRenderer(this, 0, 64);
      head2.addBox(-5F, -5F, -5F, 10, 10, 10);
      head2.setRotationPoint(0F, 0F, 11F);
      head2.setTextureSize(128, 128);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 32, 0);
      leg3.addBox(-2F, 0F, -2F, 4, 8, 4);
      leg3.setRotationPoint(2.5F, 3F, 8F);
      leg3.setTextureSize(128, 128);
      leg3.mirror = true;
      setRotation(leg3, 2.617994F, 0F, 2.617994F);
      leg4 = new ModelRenderer(this, 32, 0);
      leg4.addBox(-2F, 0F, -2F, 4, 8, 4);
      leg4.setRotationPoint(-2.5F, 3F, 8F);
      leg4.setTextureSize(128, 128);
      leg4.mirror = true;
      setRotation(leg4, 2.617994F, 0F, -2.617994F);
      crest5 = new ModelRenderer(this, 48, 0);
      crest5.addBox(-2F, 0F, -2F, 4, 6, 4);
      crest5.setRotationPoint(-3F, 0F, 9F);
      crest5.setTextureSize(128, 128);
      crest5.mirror = true;
      setRotation(crest5, 2.617994F, 0F, -1.308997F);
      crest6 = new ModelRenderer(this, 48, 0);
      crest6.addBox(-2F, 0F, -2F, 4, 6, 4);
      crest6.setRotationPoint(3F, 0F, 9F);
      crest6.setTextureSize(128, 128);
      crest6.mirror = true;
      setRotation(crest6, 2.617994F, 0F, 1.308997F);
      crest7 = new ModelRenderer(this, 32, 0);
      crest7.addBox(-2F, 0F, -2F, 4, 8, 4);
      crest7.setRotationPoint(2F, -3F, 9F);
      crest7.setTextureSize(128, 128);
      crest7.mirror = true;
      setRotation(crest7, 2.617994F, 0F, 0.5235988F);
      crest8 = new ModelRenderer(this, 32, 0);
      crest8.addBox(-2F, 0F, -2F, 4, 8, 4);
      crest8.setRotationPoint(-2F, -3F, 9F);
      crest8.setTextureSize(128, 128);
      crest8.mirror = true;
      setRotation(crest8, 2.617994F, 0F, -0.5235988F);
      head3 = new ModelRenderer(this, 0, 16);
      head3.addBox(-3F, -3F, -3F, 6, 6, 6);
      head3.setRotationPoint(0F, 0F, 19F);
      head3.setTextureSize(128, 128);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
  }
  
  public Vec3d getPosFromIndex(EntitySpriteGuardian guardian, int index, float partialTicks){
	  return guardian.pastPositions.get(index);
  }   
  
  public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, int index)
  {
	float scale = scaleFactor;
    super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
	GlStateManager.pushAttrib();
    EntitySpriteGuardian guardian = (EntitySpriteGuardian)entity;
	float fade = guardian.getFade(ageInTicks-(int)ageInTicks);
    Vec3d pos1 = getPosFromIndex(guardian,index,ageInTicks-(int)ageInTicks);
    Vec3d pos2 = getPosFromIndex(guardian,index+1,ageInTicks-(int)ageInTicks);
    float yaw = Util.yawDegreesBetweenPoints(pos2.xCoord, pos1.yCoord, pos1.zCoord, pos1.xCoord, pos2.yCoord, pos2.zCoord);
    float pitch = Util.pitchDegreesBetweenPoints(pos2.xCoord, pos1.yCoord, pos1.zCoord, pos1.xCoord, pos2.yCoord, pos2.zCoord);
    GlStateManager.pushMatrix();
    GlStateManager.translate(-entity.posX+pos1.xCoord, entity.posY-pos1.yCoord, entity.posZ-pos1.zCoord);
    GlStateManager.rotate(yaw+180, 0, 1, 0);
    GlStateManager.rotate(pitch, 1, 0, 0);
    GlStateManager.color(1, 1, 1, 1.0f*fade);
    stonehead1.render(scale);
    stonehead2.render(scale);
    GlStateManager.enableAlpha();
    GlStateManager.enableBlend();
    GlStateManager.disableLighting();
    GlStateManager.color(1, 1, 1, 0.75f*fade);
    head1.render(scale);
    head2.render(scale);
    head3.render(scale);
    leg1.render(scale);
    leg2.render(scale);
    leg3.render(scale);
    leg4.render(scale);
    crest1.render(scale);
    crest2.render(scale);
    crest3.render(scale);
    crest4.render(scale);
    crest5.render(scale);
    crest6.render(scale);
    crest7.render(scale);
    crest8.render(scale);
    GlStateManager.enableLighting();
    GlStateManager.disableAlpha();
    GlStateManager.disableBlend();
    GlStateManager.popMatrix();
	GlStateManager.popAttrib();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}