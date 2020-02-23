import java.awt.Color;
import java.awt.Graphics;

public class Polygon{
	
	Vertex[] vertex;
	
	int[] xPoints;
	int[] yPoints;
	
	public Polygon(Vertex[] v) {
		vertex = v;
		
		xPoints = new int[v.length];
		yPoints = new int[v.length];
	}
	
	private void locateOnScreen(Camera c) {
		for (int i = 0; i < vertex.length; i ++) {
			PixelLocation p = vertex[i].locateOnScreen(c);
			xPoints[i] = p.getX();
			yPoints[i] = p.getY();
		}
	}
	
	public void render(Camera c, Graphics g) {
		locateOnScreen(c);
		
		g.setColor(Color.RED);
		g.fillPolygon(xPoints, yPoints, vertex.length);
	}
}