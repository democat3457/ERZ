package elucent.roots.entity;

import net.minecraft.util.math.BlockPos;

public interface ISprite {
	public float getHappiness();
	public void setHappiness(float value);
	public void setTargetPosition(BlockPos pos);
	public BlockPos getTargetPosition();
}
