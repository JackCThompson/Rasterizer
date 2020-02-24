
public abstract class Entity {

	protected double x;
	protected double y;
	protected double z;
	
	protected double pitch;
	protected double yaw;
	protected double roll;
	
	public Entity() {
		x = 0;
		y = 0;
		z = 0;
		
		pitch = 0;
		yaw = 0;
		roll = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public double getPitch() {
		return pitch;
	}

	public double getYaw() {
		return yaw;
	}

	public double getRoll() {
		return roll;
	}
	
	
}
