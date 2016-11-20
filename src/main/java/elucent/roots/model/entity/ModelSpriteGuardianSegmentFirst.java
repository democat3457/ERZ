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

public class ModelSpriteGuardianSegmentFirst extends ModelBase
{
  //fields
    ModelRenderer head1;
    ModelRenderer stonehead1;
    ModelRenderer stonehead2;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
    ModelRenderer head6;
    ModelRenderer head7;
    ModelRenderer head8;
    ModelRenderer head9;
    ModelRenderer head10;
    ModelRenderer head11;
    ModelRenderer head12;
    ModelRenderer head13;
    ModelRenderer head14;
    ModelRenderer crest1;
    ModelRenderer crest2;
    ModelRenderer crest3;
    ModelRenderer crest4;
    ModelRenderer crest5;
    ModelRenderer crest6;
    ModelRenderer crest7;
    ModelRenderer crest8;
    ModelRenderer ring1;
    ModelRenderer ring2;
    ModelRenderer ring3;
    ModelRenderer ring4;
    ModelRenderer ring5;
    ModelRenderer ring6;
    ModelRenderer ring7;
    ModelRenderer ring8;
    ModelRenderer ring9;
    ModelRenderer ring10;
    ModelRenderer ring11;
    ModelRenderer ring12;
    ModelRenderer ring13;
    ModelRenderer ring14;
    ModelRenderer ring15;
    ModelRenderer ring16;
    ModelRenderer ring17;
    ModelRenderer ring18;
    ModelRenderer ring19;
    ModelRenderer ring20;
    ModelRenderer ring21;
    ModelRenderer ring22;
    ModelRenderer ring23;
    ModelRenderer ring24;
    ModelRenderer ring25;
    ModelRenderer ring26;
    ModelRenderer ring27;
    ModelRenderer ring28;
    ModelRenderer ring29;
    ModelRenderer ring30;
    ModelRenderer ring31;
    ModelRenderer ring32;
    ModelRenderer ring33;
    ModelRenderer ring34;
    ModelRenderer ring35;
    ModelRenderer ring36;
    ModelRenderer ring37;
    ModelRenderer ring38;
    ModelRenderer ring39;
    ModelRenderer ring40;
    ModelRenderer ring41;
    ModelRenderer ring42;
  
    public ModelSpriteGuardianSegmentFirst()
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
        head2 = new ModelRenderer(this, 0, 64);
        head2.addBox(-5F, -5F, -5F, 10, 10, 10);
        head2.setRotationPoint(0F, 0F, 11F);
        head2.setTextureSize(128, 128);
        head2.mirror = true;
        setRotation(head2, 0F, 0F, 0F);
        head3 = new ModelRenderer(this, 0, 16);
        head3.addBox(-3F, -3F, -3F, 6, 6, 6);
        head3.setRotationPoint(0F, 0F, 19F);
        head3.setTextureSize(128, 128);
        head3.mirror = true;
        setRotation(head3, 0F, 0F, 0F);
        head4 = new ModelRenderer(this, 0, 64);
        head4.addBox(-5F, 0F, -5F, 10, 10, 10);
        head4.setRotationPoint(1F, -2F, -1F);
        head4.setTextureSize(128, 128);
        head4.mirror = true;
        setRotation(head4, 1.963495F, 0.7853982F, -0.5235988F);
        head5 = new ModelRenderer(this, 0, 64);
        head5.addBox(-5F, 0F, -5F, 10, 10, 10);
        head5.setRotationPoint(1F, 2F, -1F);
        head5.setTextureSize(128, 128);
        head5.mirror = true;
        setRotation(head5, 1.178097F, 0.3926991F, -0.5235988F);
        head6 = new ModelRenderer(this, 0, 64);
        head6.addBox(-5F, 0F, -5F, 10, 10, 10);
        head6.setRotationPoint(-1F, -2F, -1F);
        head6.setTextureSize(128, 128);
        head6.mirror = true;
        setRotation(head6, 1.963495F, -0.7853982F, 0.5235988F);
        head7 = new ModelRenderer(this, 0, 64);
        head7.addBox(-5F, 0F, -5F, 10, 10, 10);
        head7.setRotationPoint(-1F, 2F, -1F);
        head7.setTextureSize(128, 128);
        head7.mirror = true;
        setRotation(head7, 1.178097F, -0.3926991F, 0.5235988F);
        head8 = new ModelRenderer(this, 0, 16);
        head8.addBox(-3F, -3F, -3F, 6, 6, 6);
        head8.setRotationPoint(0F, -6F, -3F);
        head8.setTextureSize(128, 128);
        head8.mirror = true;
        setRotation(head8, 0.7853982F, 0F, 0F);
        head9 = new ModelRenderer(this, 0, 16);
        head9.addBox(-3F, -3F, -3F, 6, 6, 6);
        head9.setRotationPoint(0F, 6F, -3F);
        head9.setTextureSize(128, 128);
        head9.mirror = true;
        setRotation(head9, -0.7853982F, 0F, 0F);
        head10 = new ModelRenderer(this, 0, 0);
        head10.addBox(-4F, 0F, -4F, 8, 8, 8);
        head10.setRotationPoint(-1F, -2F, 7F);
        head10.setTextureSize(128, 128);
        head10.mirror = true;
        setRotation(head10, 1.963495F, -0.7853982F, 0.5235988F);
        head11 = new ModelRenderer(this, 0, 0);
        head11.addBox(-4F, 0F, -4F, 8, 8, 8);
        head11.setRotationPoint(1F, -2F, 7F);
        head11.setTextureSize(128, 128);
        head11.mirror = true;
        setRotation(head11, 1.963495F, 0.7853982F, -0.5235988F);
        head12 = new ModelRenderer(this, 0, 0);
        head12.addBox(-4F, 0F, -4F, 8, 8, 8);
        head12.setRotationPoint(1F, 2.386667F, 6F);
        head12.setTextureSize(128, 128);
        head12.mirror = true;
        setRotation(head12, 1.178097F, 0.3926991F, -0.5235988F);
        head13 = new ModelRenderer(this, 0, 0);
        head13.addBox(-4F, 0F, -4F, 8, 8, 8);
        head13.setRotationPoint(-1F, 2.386667F, 6F);
        head13.setTextureSize(128, 128);
        head13.mirror = true;
        setRotation(head13, 1.178097F, -0.3926991F, 0.5235988F);
        head14 = new ModelRenderer(this, 0, 16);
        head14.addBox(-3F, -3F, -3F, 6, 6, 6);
        head14.setRotationPoint(0F, -7F, 2F);
        head14.setTextureSize(128, 128);
        head14.mirror = true;
        setRotation(head14, 0.7853982F, 0F, 0F);
        crest1 = new ModelRenderer(this, 32, 0);
        crest1.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest1.setRotationPoint(6F, -7F, 6F);
        crest1.setTextureSize(128, 128);
        crest1.mirror = true;
        setRotation(crest1, 2.617994F, 0F, 0.7853982F);
        crest2 = new ModelRenderer(this, 32, 0);
        crest2.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest2.setRotationPoint(-6F, -7F, 6F);
        crest2.setTextureSize(128, 128);
        crest2.mirror = true;
        setRotation(crest2, 2.617994F, 0F, -0.7853982F);
        crest3 = new ModelRenderer(this, 32, 0);
        crest3.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest3.setRotationPoint(7F, -2F, 7F);
        crest3.setTextureSize(128, 128);
        crest3.mirror = true;
        setRotation(crest3, 2.617994F, 0F, 1.308997F);
        crest4 = new ModelRenderer(this, 32, 0);
        crest4.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest4.setRotationPoint(-7F, -2F, 7F);
        crest4.setTextureSize(128, 128);
        crest4.mirror = true;
        setRotation(crest4, 2.617994F, 0F, -1.308997F);
        crest5 = new ModelRenderer(this, 32, 0);
        crest5.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest5.setRotationPoint(-2F, -9F, 4F);
        crest5.setTextureSize(128, 128);
        crest5.mirror = true;
        setRotation(crest5, 2.879793F, 0F, -0.2617994F);
        crest6 = new ModelRenderer(this, 32, 0);
        crest6.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest6.setRotationPoint(2F, -9F, 4F);
        crest6.setTextureSize(128, 128);
        crest6.mirror = true;
        setRotation(crest6, 2.879793F, 0F, 0.2617994F);
        crest7 = new ModelRenderer(this, 32, 0);
        crest7.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest7.setRotationPoint(-5.88F, 2F, 9F);
        crest7.setTextureSize(128, 128);
        crest7.mirror = true;
        setRotation(crest7, 2.356194F, 0F, -1.832596F);
        crest8 = new ModelRenderer(this, 32, 0);
        crest8.addBox(-2F, 0F, -2F, 4, 8, 4);
        crest8.setRotationPoint(6F, 2F, 9F);
        crest8.setTextureSize(128, 128);
        crest8.mirror = true;
        setRotation(crest8, 2.356194F, 0F, 1.832596F);
        ring1 = new ModelRenderer(this, 48, 32);
        ring1.addBox(-1F, -21F, -1F, 2, 2, 2);
        ring1.setRotationPoint(0F, 0F, 19F);
        ring1.setTextureSize(128, 128);
        ring1.mirror = true;
        setRotation(ring1, 0F, 0F, 0F);
        ring2 = new ModelRenderer(this, 16, 32);
        ring2.addBox(-3F, -19F, -3F, 6, 6, 6);
        ring2.setRotationPoint(0F, 0F, 19F);
        ring2.setTextureSize(128, 128);
        ring2.mirror = true;
        setRotation(ring2, 0F, 0F, 1.047198F);
        ring3 = new ModelRenderer(this, 16, 32);
        ring3.addBox(-3F, -19F, -3F, 6, 6, 6);
        ring3.setRotationPoint(0F, 0F, 19F);
        ring3.setTextureSize(128, 128);
        ring3.mirror = true;
        setRotation(ring3, 0F, 0F, 2.094395F);
        ring4 = new ModelRenderer(this, 16, 32);
        ring4.addBox(-3F, -19F, -3F, 6, 6, 6);
        ring4.setRotationPoint(0F, 0F, 19F);
        ring4.setTextureSize(128, 128);
        ring4.mirror = true;
        setRotation(ring4, 0F, 0F, 3.141593F);
        ring5 = new ModelRenderer(this, 16, 32);
        ring5.addBox(-3F, -19F, -3F, 6, 6, 6);
        ring5.setRotationPoint(0F, 0F, 19F);
        ring5.setTextureSize(128, 128);
        ring5.mirror = true;
        setRotation(ring5, 0F, 0F, 4.18879F);
        ring6 = new ModelRenderer(this, 16, 32);
        ring6.addBox(-3F, -19F, -3F, 6, 6, 6);
        ring6.setRotationPoint(0F, 0F, 19F);
        ring6.setTextureSize(128, 128);
        ring6.mirror = true;
        setRotation(ring6, 0F, 0F, 5.235988F);
        ring7 = new ModelRenderer(this, 16, 32);
        ring7.addBox(-3F, -19F, -3F, 6, 6, 6);
        ring7.setRotationPoint(0F, 0F, 19F);
        ring7.setTextureSize(128, 128);
        ring7.mirror = true;
        setRotation(ring7, 0F, 0F, 0F);
        ring8 = new ModelRenderer(this, 48, 32);
        ring8.addBox(-1F, -21F, -1F, 2, 2, 2);
        ring8.setRotationPoint(0F, 0F, 19F);
        ring8.setTextureSize(128, 128);
        ring8.mirror = true;
        setRotation(ring8, 0F, 0F, 2.094395F);
        ring9 = new ModelRenderer(this, 48, 32);
        ring9.addBox(-1F, -21F, -1F, 2, 2, 2);
        ring9.setRotationPoint(0F, 0F, 19F);
        ring9.setTextureSize(128, 128);
        ring9.mirror = true;
        setRotation(ring9, 0F, 0F, 3.141593F);
        ring10 = new ModelRenderer(this, 48, 32);
        ring10.addBox(-1F, -21F, -1F, 2, 2, 2);
        ring10.setRotationPoint(0F, 0F, 19F);
        ring10.setTextureSize(128, 128);
        ring10.mirror = true;
        setRotation(ring10, 0F, 0F, 4.18879F);
        ring11 = new ModelRenderer(this, 48, 32);
        ring11.addBox(-1F, -21F, -1F, 2, 2, 2);
        ring11.setRotationPoint(0F, 0F, 19F);
        ring11.setTextureSize(128, 128);
        ring11.mirror = true;
        setRotation(ring11, 0F, 0F, 1.047198F);
        ring12 = new ModelRenderer(this, 48, 32);
        ring12.addBox(-1F, -21F, -1F, 2, 2, 2);
        ring12.setRotationPoint(0F, 0F, 19F);
        ring12.setTextureSize(128, 128);
        ring12.mirror = true;
        setRotation(ring12, 0F, 0F, 5.235988F);
        ring13 = new ModelRenderer(this, 0, 32);
        ring13.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring13.setRotationPoint(0F, 0F, 19F);
        ring13.setTextureSize(128, 128);
        ring13.mirror = true;
        setRotation(ring13, 0F, 0F, 0.2617994F);
        ring14 = new ModelRenderer(this, 0, 32);
        ring14.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring14.setRotationPoint(0F, 0F, 19F);
        ring14.setTextureSize(128, 128);
        ring14.mirror = true;
        setRotation(ring14, 0F, 0F, 0.7853982F);
        ring15 = new ModelRenderer(this, 0, 32);
        ring15.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring15.setRotationPoint(0F, 0F, 19F);
        ring15.setTextureSize(128, 128);
        ring15.mirror = true;
        setRotation(ring15, 0F, 0F, 1.308997F);
        ring16 = new ModelRenderer(this, 0, 32);
        ring16.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring16.setRotationPoint(0F, 0F, 19F);
        ring16.setTextureSize(128, 128);
        ring16.mirror = true;
        setRotation(ring16, 0F, 0F, 1.832596F);
        ring17 = new ModelRenderer(this, 0, 32);
        ring17.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring17.setRotationPoint(0F, 0F, 19F);
        ring17.setTextureSize(128, 128);
        ring17.mirror = true;
        setRotation(ring17, 0F, 0F, 2.356194F);
        ring18 = new ModelRenderer(this, 0, 32);
        ring18.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring18.setRotationPoint(0F, 0F, 19F);
        ring18.setTextureSize(128, 128);
        ring18.mirror = true;
        setRotation(ring18, 0F, 0F, 2.879793F);
        ring19 = new ModelRenderer(this, 0, 32);
        ring19.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring19.setRotationPoint(0F, 0F, 19F);
        ring19.setTextureSize(128, 128);
        ring19.mirror = true;
        setRotation(ring19, 0F, 0F, 3.403392F);
        ring20 = new ModelRenderer(this, 0, 32);
        ring20.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring20.setRotationPoint(0F, 0F, 19F);
        ring20.setTextureSize(128, 128);
        ring20.mirror = true;
        setRotation(ring20, 0F, 0F, 3.926991F);
        ring21 = new ModelRenderer(this, 0, 32);
        ring21.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring21.setRotationPoint(0F, 0F, 19F);
        ring21.setTextureSize(128, 128);
        ring21.mirror = true;
        setRotation(ring21, 0F, 0F, 4.45059F);
        ring22 = new ModelRenderer(this, 0, 32);
        ring22.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring22.setRotationPoint(0F, 0F, 19F);
        ring22.setTextureSize(128, 128);
        ring22.mirror = true;
        setRotation(ring22, 0F, 0F, 4.974188F);
        ring23 = new ModelRenderer(this, 0, 32);
        ring23.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring23.setRotationPoint(0F, 0F, 19F);
        ring23.setTextureSize(128, 128);
        ring23.mirror = true;
        setRotation(ring23, 0F, 0F, 5.497787F);
        ring24 = new ModelRenderer(this, 0, 32);
        ring24.addBox(-2F, -18F, -2F, 4, 4, 4);
        ring24.setRotationPoint(0F, 0F, 19F);
        ring24.setTextureSize(128, 128);
        ring24.mirror = true;
        setRotation(ring24, 0F, 0F, 6.021386F);
        ring25 = new ModelRenderer(this, 48, 32);
        ring25.addBox(-1F, -17F, 3F, 2, 2, 2);
        ring25.setRotationPoint(0F, 0F, 19F);
        ring25.setTextureSize(128, 128);
        ring25.mirror = true;
        setRotation(ring25, 0F, 0F, 0F);
        ring26 = new ModelRenderer(this, 48, 32);
        ring26.addBox(-1F, -17F, 3F, 2, 2, 2);
        ring26.setRotationPoint(0F, 0F, 19F);
        ring26.setTextureSize(128, 128);
        ring26.mirror = true;
        setRotation(ring26, 0F, 0F, 1.047198F);
        ring27 = new ModelRenderer(this, 48, 32);
        ring27.addBox(-1F, -17F, 3F, 2, 2, 2);
        ring27.setRotationPoint(0F, 0F, 19F);
        ring27.setTextureSize(128, 128);
        ring27.mirror = true;
        setRotation(ring27, 0F, 0F, 2.094395F);
        ring28 = new ModelRenderer(this, 48, 32);
        ring28.addBox(-1F, -17F, 3F, 2, 2, 2);
        ring28.setRotationPoint(0F, 0F, 19F);
        ring28.setTextureSize(128, 128);
        ring28.mirror = true;
        setRotation(ring28, 0F, 0F, 3.141593F);
        ring29 = new ModelRenderer(this, 48, 32);
        ring29.addBox(-1F, -17F, 3F, 2, 2, 2);
        ring29.setRotationPoint(0F, 0F, 19F);
        ring29.setTextureSize(128, 128);
        ring29.mirror = true;
        setRotation(ring29, 0F, 0F, 4.18879F);
        ring30 = new ModelRenderer(this, 48, 32);
        ring30.addBox(-1F, -17F, 3F, 2, 2, 2);
        ring30.setRotationPoint(0F, 0F, 19F);
        ring30.setTextureSize(128, 128);
        ring30.mirror = true;
        setRotation(ring30, 0F, 0F, 5.235988F);
        ring31 = new ModelRenderer(this, 48, 32);
        ring31.addBox(-1F, -17F, -5F, 2, 2, 2);
        ring31.setRotationPoint(0F, 0F, 19F);
        ring31.setTextureSize(128, 128);
        ring31.mirror = true;
        setRotation(ring31, 0F, 0F, 0F);
        ring32 = new ModelRenderer(this, 48, 32);
        ring32.addBox(-1F, -17F, -5F, 2, 2, 2);
        ring32.setRotationPoint(0F, 0F, 19F);
        ring32.setTextureSize(128, 128);
        ring32.mirror = true;
        setRotation(ring32, 0F, 0F, 1.047198F);
        ring33 = new ModelRenderer(this, 48, 32);
        ring33.addBox(-1F, -17F, -5F, 2, 2, 2);
        ring33.setRotationPoint(0F, 0F, 19F);
        ring33.setTextureSize(128, 128);
        ring33.mirror = true;
        setRotation(ring33, 0F, 0F, 2.094395F);
        ring34 = new ModelRenderer(this, 48, 32);
        ring34.addBox(-1F, -17F, -5F, 2, 2, 2);
        ring34.setRotationPoint(0F, 0F, 19F);
        ring34.setTextureSize(128, 128);
        ring34.mirror = true;
        setRotation(ring34, 0F, 0F, 3.141593F);
        ring35 = new ModelRenderer(this, 48, 32);
        ring35.addBox(-1F, -17F, -5F, 2, 2, 2);
        ring35.setRotationPoint(0F, 0F, 19F);
        ring35.setTextureSize(128, 128);
        ring35.mirror = true;
        setRotation(ring35, 0F, 0F, 4.18879F);
        ring36 = new ModelRenderer(this, 48, 32);
        ring36.addBox(-1F, -17F, -5F, 2, 2, 2);
        ring36.setRotationPoint(0F, 0F, 19F);
        ring36.setTextureSize(128, 128);
        ring36.mirror = true;
        setRotation(ring36, 0F, 0F, 5.235988F);
        ring37 = new ModelRenderer(this, 48, 48);
        ring37.addBox(-4F, -17F, -1F, 8, 2, 2);
        ring37.setRotationPoint(0F, 0F, 19F);
        ring37.setTextureSize(128, 128);
        ring37.mirror = true;
        setRotation(ring37, 0F, 0F, 0.5235988F);
        ring38 = new ModelRenderer(this, 48, 48);
        ring38.addBox(-4F, -17F, -1F, 8, 2, 2);
        ring38.setRotationPoint(0F, 0F, 19F);
        ring38.setTextureSize(128, 128);
        ring38.mirror = true;
        setRotation(ring38, 0F, 0F, 1.570796F);
        ring39 = new ModelRenderer(this, 48, 48);
        ring39.addBox(-4F, -17F, -1F, 8, 2, 2);
        ring39.setRotationPoint(0F, 0F, 19F);
        ring39.setTextureSize(128, 128);
        ring39.mirror = true;
        setRotation(ring39, 0F, 0F, 3.665191F);
        ring40 = new ModelRenderer(this, 48, 48);
        ring40.addBox(-4F, -17F, -1F, 8, 2, 2);
        ring40.setRotationPoint(0F, 0F, 19F);
        ring40.setTextureSize(128, 128);
        ring40.mirror = true;
        setRotation(ring40, 0F, 0F, 2.617994F);
        ring41 = new ModelRenderer(this, 48, 48);
        ring41.addBox(-4F, -17F, -1F, 8, 2, 2);
        ring41.setRotationPoint(0F, 0F, 19F);
        ring41.setTextureSize(128, 128);
        ring41.mirror = true;
        setRotation(ring41, 0F, 0F, 4.712389F);
        ring42 = new ModelRenderer(this, 48, 48);
        ring42.addBox(-4F, -17F, -1F, 8, 2, 2);
        ring42.setRotationPoint(0F, 0F, 19F);
        ring42.setTextureSize(128, 128);
        ring42.mirror = true;
        setRotation(ring42, 0F, 0F, 5.759586F);
    }
  
    public Vec3d getPosFromIndex(EntitySpriteGuardian guardian, int index, float partialTicks){
    	return guardian.pastPositions.get(index);
    }   
  
  public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, int index)
  {
	GlStateManager.pushAttrib();
	float scale = scaleFactor;
    super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
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
    GlStateManager.rotate(-ageInTicks * 15.0f, 0, 0, 1);
    ring1.render(scale);
    ring2.render(scale);
    ring3.render(scale);
    ring4.render(scale);
    ring5.render(scale);
    ring6.render(scale);
    ring7.render(scale);
    ring8.render(scale);
    ring9.render(scale);
    ring10.render(scale);
    ring11.render(scale);
    ring12.render(scale);
    ring13.render(scale);
    ring14.render(scale);
    ring15.render(scale);
    ring16.render(scale);
    ring17.render(scale);
    ring18.render(scale);
    ring19.render(scale);
    ring20.render(scale);
    ring21.render(scale);
    ring22.render(scale);
    ring23.render(scale);
    ring24.render(scale);
    ring25.render(scale);
    ring26.render(scale);
    ring27.render(scale);
    ring28.render(scale);
    ring29.render(scale);
    ring30.render(scale);
    ring31.render(scale);
    ring32.render(scale);
    ring33.render(scale);
    ring34.render(scale);
    ring35.render(scale);
    ring36.render(scale);
    ring37.render(scale);
    ring38.render(scale);
    ring39.render(scale);
    ring40.render(scale);
    ring41.render(scale);
    ring42.render(scale);
    GlStateManager.rotate(ageInTicks * 15.0f, 0, 0, 1);
    GlStateManager.enableAlpha();
    GlStateManager.enableBlend();
    GlStateManager.disableLighting();
    GlStateManager.color(1, 1, 1, 0.75f*fade);
    head1.render(scale);
    head2.render(scale);
    head3.render(scale);
    head4.render(scale);
    head5.render(scale);
    head6.render(scale);
    head7.render(scale);
    head8.render(scale);
    head9.render(scale);
    head10.render(scale);
    head11.render(scale);
    head12.render(scale);
    head13.render(scale);
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