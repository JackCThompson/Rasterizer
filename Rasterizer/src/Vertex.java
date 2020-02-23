import java.awt.Color;
import java.awt.Graphics;

public class Vertex {

	private double realX;
	private double realY;
	private double realZ;
	
	private PixelLocation pointOnScreen;
	private boolean visible;

	public Vertex(double x, double y, double z) {
		this.realX = x;
		this.realY = y;
		this.realZ = z;
	}
	
	public PixelLocation locateOnScreen(Camera c) {
		pointOnScreen = c.locateOnScreen(this);
//		visible = pointOnScreen != null;
		return pointOnScreen;
	}
	
	public void Render (Camera c, Graphics g) {
		locateOnScreen(c);
		g.setColor(Color.RED);
		g.fillRect(pointOnScreen.getX(), pointOnScreen.getY(), 4, 4);
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
