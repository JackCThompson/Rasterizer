public class Vertex {

	private double realX;
	private double realY;
	private double realZ;
	
	private Point pointOnScreen;
	private boolean visible;

	public Vertex(double x, double y, double z) {
		this.realX = x;
		this.realY = y;
		this.realZ = z;
	}
	
	public void locateOnScreen(Camera camera) {
		pointOnScreen = camera.locateOnScreen(this);
		visible = pointOnScreen != null;
	}
	
	public double getRealX() {
		return realX;
	}
	
	public double getRealY() {
		return realY;
	}
	
	public double getRealZ() {
		return realZ;
	}
}
