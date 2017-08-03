package teamroots.emberroot;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.GameType;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import teamroots.emberroot.capability.PlayerDataProvider;
import teamroots.emberroot.entity.EntityFairy;
import teamroots.emberroot.network.PacketHandler;
import teamroots.emberroot.network.message.MessagePlayerDataUpdate;
import teamroots.emberroot.proxy.ClientProxy;
import teamroots.emberroot.util.IRenderEntityLater;
import teamroots.emberroot.util.Misc;

public class EventManager {
	public static long ticks = 0;
	EntityLivingBase playerMorph = null;
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTextureStitch(TextureStitchEvent event){
		ResourceLocation particleGlow = new ResourceLocation(Const.MODID,"entity/particle_glow");
		event.getMap().registerSprite(particleGlow);
		ResourceLocation particleSmoke = new ResourceLocation(Const.MODID,"entity/particle_smoke");
		event.getMap().registerSprite(particleSmoke);
		ResourceLocation particleFiery = new ResourceLocation(Const.MODID,"entity/particle_fiery");
		event.getMap().registerSprite(particleFiery);
		ResourceLocation particlePetal = new ResourceLocation(Const.MODID,"entity/particle_petal");
		event.getMap().registerSprite(particlePetal);
		ResourceLocation particleThorn = new ResourceLocation(Const.MODID,"entity/particle_thorn");
		event.getMap().registerSprite(particleThorn);
		ResourceLocation particleStar = new ResourceLocation(Const.MODID,"entity/particle_star");
		event.getMap().registerSprite(particleStar);
		ResourceLocation particleRune1 = new ResourceLocation(Const.MODID,"entity/particle_rune_1");
		event.getMap().registerSprite(particleRune1);
		ResourceLocation particleRune2 = new ResourceLocation(Const.MODID,"entity/particle_rune_2");
		event.getMap().registerSprite(particleRune2);
		ResourceLocation particleRune3 = new ResourceLocation(Const.MODID,"entity/particle_rune_3");
		event.getMap().registerSprite(particleRune3);
		ResourceLocation particleRune4 = new ResourceLocation(Const.MODID,"entity/particle_rune_4");
		event.getMap().registerSprite(particleRune4);
	}
	
	@SubscribeEvent
	public void onTeleport(EnderTeleportEvent event){
		
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onTick(TickEvent.ClientTickEvent event){
		if (event.side == Side.CLIENT){
			ClientProxy.particleRenderer.updateParticles();
			ticks ++;
		}
	}
	
	@SubscribeEvent
	public void onEntityDrops(LivingDropsEvent event){
		if (event.getEntityLiving() instanceof EntityWitherSkeleton){
			boolean addSkull = true;
			for (EntityItem e: event.getDrops()){
				if (e.getItem().getItem() == Items.SKULL){
					addSkull = false;
				}
			}
			if (addSkull && Misc.random.nextInt(10) == 0){
				event.getDrops().add(new EntityItem(event.getEntity().world,event.getEntity().posX,event.getEntity().posY,event.getEntity().posZ,new ItemStack(Items.SKULL,1,1)));
			}
		}
	}
	
 
	@SideOnly(Side.CLIENT)
    public static void renderEntityStatic(Entity entityIn, float partialTicks, boolean b, Render render){
        if (entityIn.ticksExisted == 0)
        {
            entityIn.lastTickPosX = entityIn.posX;
            entityIn.lastTickPosY = entityIn.posY;
            entityIn.lastTickPosZ = entityIn.posZ;
        }

//        double d0 = entityIn.lastTickPosX + (entityIn.posX - entityIn.lastTickPosX) * (double)partialTicks;
//        double d1 = entityIn.lastTickPosY + (entityIn.posY - entityIn.lastTickPosY) * (double)partialTicks;
//        double d2 = entityIn.lastTickPosZ + (entityIn.posZ - entityIn.lastTickPosZ) * (double)partialTicks;
        float f = entityIn.prevRotationYaw + (entityIn.rotationYaw - entityIn.prevRotationYaw) * partialTicks;
        int i = entityIn.getBrightnessForRender();

        if (entityIn.isBurning())
        {
            i = 15728880;
        }

        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        ((IRenderEntityLater)render).renderLater(entityIn, -TileEntityRendererDispatcher.staticPlayerX, -TileEntityRendererDispatcher.staticPlayerY, -TileEntityRendererDispatcher.staticPlayerZ, f, partialTicks);
    }
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onRenderAfterWorld(RenderWorldLastEvent event){
		//OpenGlHelper.glUseProgram(ShaderUtil.lightProgram);
		GlStateManager.pushMatrix();
		for (Entity e : Minecraft.getMinecraft().world.getLoadedEntityList()){
			Render render = Minecraft.getMinecraft().getRenderManager().getEntityRenderObject(e);
	        if (render instanceof IRenderEntityLater){
				renderEntityStatic(e,Minecraft.getMinecraft().getRenderPartialTicks(),true,render);
			}
		}
		GlStateManager.popMatrix();
		if (Roots.proxy instanceof ClientProxy && Minecraft.getMinecraft().player != null){
			ClientProxy.particleRenderer.renderParticles(Minecraft.getMinecraft().player, event.getPartialTicks());
		}
		//OpenGlHelper.glUseProgram(0);
	}
	
	/*@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onPlayerRender(RenderPlayerEvent.Pre event){
		if (event.getEntityPlayer() != null){
			EntityPlayer player = event.getEntityPlayer();
			if (Minecraft.getMinecraft().inGameHasFocus || player.getUniqueID().compareTo(Minecraft.getMinecraft().player.getUniqueID()) != 0){
				event.setCanceled(true);
				if (playerMorph == null){
					EntityZombie wolf = new EntityZombie(player.world);
					wolf.setPositionAndRotation(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
					//wolf.getDataManager().set(wolf.hasHorns, true);
					playerMorph = wolf;
				}
				playerMorph.limbSwing = player.limbSwing;
				playerMorph.swingProgress = player.swingProgress;
				playerMorph.prevSwingProgress = player.prevSwingProgress;
				playerMorph.limbSwingAmount = player.limbSwingAmount;
				playerMorph.prevLimbSwingAmount = player.prevLimbSwingAmount;
				playerMorph.motionX = player.motionX;
				playerMorph.motionY = player.motionY;
				playerMorph.motionZ = player.motionZ;
				playerMorph.rotationYaw = player.rotationYaw;
				playerMorph.prevRotationYaw = player.prevRotationYaw;
				playerMorph.rotationYawHead = player.rotationYawHead;
				playerMorph.prevRotationYawHead = player.prevRotationYawHead;
				playerMorph.rotationPitch = player.rotationPitch;
				playerMorph.prevRotationPitch = player.prevRotationPitch;
				playerMorph.isSwingInProgress = player.isSwingInProgress;
				playerMorph.renderYawOffset = player.renderYawOffset;
				playerMorph.prevRenderYawOffset = player.prevRenderYawOffset;
				playerMorph.hurtTime = player.hurtTime;
				playerMorph.deathTime = player.deathTime;
				playerMorph.randomYawVelocity = player.randomYawVelocity;
				playerMorph.cameraPitch = player.cameraPitch;
				playerMorph.prevCameraPitch = player.prevCameraPitch;
				playerMorph.setPositionAndRotation(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
				playerMorph.ticksExisted = player.ticksExisted;
				Render<Entity> render = null;
				render = Minecraft.getMinecraft().getRenderManager().<Entity>getEntityRenderObject(playerMorph);
				GlStateManager.pushMatrix();
				render.doRender(playerMorph, 0, 0, 0, 0, Minecraft.getMinecraft().getRenderPartialTicks());
				GlStateManager.popMatrix();
			}
		}
	}*/
	
	@SubscribeEvent
	public void onWitchKingReturn(PlayerLoggedInEvent event){
		if (event.player.getGameProfile().getName().equalsIgnoreCase("Emoniph")){
			for (int i = 0; i < event.player.world.playerEntities.size(); i ++){
				event.player.world.playerEntities.get(i).sendMessage(new TextComponentString("The Witch King has returned!"));
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onDamage(LivingHurtEvent event){
 
		if (event.getEntity() instanceof EntityPlayer){
			if (!event.getEntity().world.isRemote && ((EntityPlayer)event.getEntity()).getGameProfile().getName().compareToIgnoreCase("ellpeck") == 0 && Misc.random.nextInt(100) == 0){
				EntityFairy fairy = new EntityFairy(event.getEntity().getEntityWorld());
				fairy.setPosition(event.getEntity().posX, event.getEntity().posY+1.0, event.getEntity().posZ);
				fairy.onInitialSpawn(event.getEntity().world.getDifficultyForLocation(fairy.getPosition()), null);
				event.getEntity().world.spawnEntity(fairy);
			}
		}
		if (event.getEntityLiving().getEntityData().hasKey(Const.EFFECT_TAG)){
			NBTTagCompound tag = event.getEntityLiving().getEntityData().getCompoundTag(Const.EFFECT_TAG);
	 
		}
		if (event.getEntityLiving() instanceof EntityPlayer && !event.getEntityLiving().getEntityWorld().isRemote){
			EntityPlayer p = ((EntityPlayer)event.getEntityLiving());
//			List<EntityPetalShell> shells = p.getEntityWorld().getEntitiesWithinAABB(EntityPetalShell.class, new AxisAlignedBB(p.posX-0.5,p.posY,p.posZ-0.5,p.posX+0.5,p.posY+2.0,p.posZ+0.5));
//			if (shells.size() > 0){
//				for (EntityPetalShell s : shells){
//					if (s.playerId.compareTo(p.getUniqueID()) == 0){
//						if (s.getDataManager().get(s.charge) > 0){
//							event.setAmount(0);
//							event.setCanceled(true);
//							s.getDataManager().set(s.charge, s.getDataManager().get(s.charge)-1);
//							s.getDataManager().setDirty(s.charge);
//						//	PacketHandler.INSTANCE.sendToAll(new MessagePetalShellBurstFX(p.posX,p.posY+1.0f,p.posZ));
//							if (s.getDataManager().get(s.charge) <= 0){
//								p.world.removeEntity(s);
//							}
//						}
//					}
//				}
//			}
		}
		if (event.getEntity().getEntityData().hasKey(Const.MIND_WARD_TAG)){
			if (event.getSource().getTrueSource() instanceof EntityLivingBase){
				if (event.getSource().getTrueSource().getUniqueID().compareTo(event.getEntity().getUniqueID()) != 0){
					event.getEntity().getEntityData().removeTag(Const.MIND_WARD_TAG);
				}
			}
		}
		if (event.getSource().getTrueSource() instanceof EntityLivingBase){
			if (event.getSource().getTrueSource().getEntityData().hasKey(Const.MIND_WARD_TAG)){
				EntityLivingBase e = (EntityLivingBase)event.getSource().getTrueSource();
				e.attackEntityFrom(DamageSource.WITHER, event.getAmount()*2.0f);
				event.setAmount(0);
			//	PacketHandler.INSTANCE.sendToAll(new MessageMindWardRingFX(e.posX,e.posY+1.0,e.posZ));
			}
		}
	}
	
	@SubscribeEvent
	public void copyCapabilities(PlayerEvent.Clone event){
		if (event.isWasDeath()){
			if (event.getOriginal().hasCapability(PlayerDataProvider.playerDataCapability, null)){
				event.getEntityPlayer().getCapability(PlayerDataProvider.playerDataCapability, null).setData(event.getOriginal().getCapability(PlayerDataProvider.playerDataCapability, null).getData());
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityTarget(LivingSetAttackTargetEvent event){
		if (event.getEntityLiving().getEntityData().hasKey(Const.MIND_WARD_TAG)){
			if (event.getEntityLiving() instanceof EntityMob){
				if (((EntityMob)event.getEntityLiving()).getAttackTarget() != null){
					((EntityMob)event.getEntityLiving()).setAttackTarget(null);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityTick(LivingUpdateEvent event){
		 if (event.getEntity() instanceof EntityPlayer){
			if (event.getEntity().hasCapability(PlayerDataProvider.playerDataCapability, null)){
				if (!event.getEntity().world.isRemote && event.getEntity().getCapability(PlayerDataProvider.playerDataCapability, null).isDirty()){
					PacketHandler.INSTANCE.sendToAll(new MessagePlayerDataUpdate(event.getEntity().getUniqueID(),event.getEntity().getCapability(PlayerDataProvider.playerDataCapability, null).getData()));
					event.getEntity().getCapability(PlayerDataProvider.playerDataCapability, null).clean();
				}
			}
		}
 
		if (event.getEntity().getEntityData().hasKey(Const.MIND_WARD_TAG) && !event.getEntity().getEntityWorld().isRemote){
			event.getEntity().getEntityData().setInteger(Const.MIND_WARD_TAG, event.getEntity().getEntityData().getInteger(Const.MIND_WARD_TAG)-1);
			if (event.getEntity().getEntityData().getInteger(Const.MIND_WARD_TAG) <= 0){
				event.getEntity().getEntityData().removeTag(Const.MIND_WARD_TAG);
			}
		//	PacketHandler.INSTANCE.sendToAll(new MessageMindWardFX(event.getEntity().posX,event.getEntity().posY+event.getEntity().getEyeHeight()+0.75f,event.getEntity().posZ));
		}
		if (event.getEntity().getEntityData().hasKey(Const.LIGHT_DRIFTER_TAG) && !event.getEntity().getEntityWorld().isRemote){
			event.getEntity().getEntityData().setInteger(Const.LIGHT_DRIFTER_TAG, event.getEntity().getEntityData().getInteger(Const.LIGHT_DRIFTER_TAG)-1);
			if (event.getEntity().getEntityData().getInteger(Const.LIGHT_DRIFTER_TAG) <= 0){
				EntityPlayer p = ((EntityPlayer)event.getEntity());
				p.posX = event.getEntity().getEntityData().getDouble(Const.LIGHT_DRIFTER_X);
				p.posY = event.getEntity().getEntityData().getDouble(Const.LIGHT_DRIFTER_Y);
				p.posZ = event.getEntity().getEntityData().getDouble(Const.LIGHT_DRIFTER_Z);
			//	PacketHandler.INSTANCE.sendToAll(new MessageLightDrifterSync(event.getEntity().getUniqueID(),p.posX,p.posY,p.posZ,false,event.getEntity().getEntityData().getInteger(Const.LIGHT_DRIFTER_MODE)));
				p.capabilities.allowFlying = false;
				p.capabilities.disableDamage = false;
				p.noClip = false;
				p.capabilities.isFlying = false;
				p.setGameType(GameType.getByID(event.getEntity().getEntityData().getInteger(Const.LIGHT_DRIFTER_MODE)));
				p.setPositionAndUpdate(p.posX, p.posY, p.posZ);
				//PacketHandler.INSTANCE.sendToAll(new MessageLightDrifterFX(event.getEntity().posX,event.getEntity().posY+1.0f,event.getEntity().posZ));
				event.getEntity().getEntityData().removeTag(Const.LIGHT_DRIFTER_TAG);
				event.getEntity().getEntityData().removeTag(Const.LIGHT_DRIFTER_X);
				event.getEntity().getEntityData().removeTag(Const.LIGHT_DRIFTER_Y);
				event.getEntity().getEntityData().removeTag(Const.LIGHT_DRIFTER_Z);
				event.getEntity().getEntityData().removeTag(Const.LIGHT_DRIFTER_MODE);
			}
		}
	}
	
	@SubscribeEvent
	public void onLivingAttack(LivingAttackEvent event){
		//event.setCanceled(true);
	}
	
 
	public void renderEntityLater(Entity entityIn, float partialTicks, boolean p_188388_3_){
    }
}
