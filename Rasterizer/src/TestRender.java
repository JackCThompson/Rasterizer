import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class TestRender {

	public static void main(String[] args) {
		int width = 1000;
		int height = 1000;
		
		JFrame frame = new JFrame("Rasterize Test");
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		Canvas canvas = new Canvas();
		canvas.setSize(width, height);
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		
		canvas.createBufferStrategy(3);

		while (true) {
			BufferStrategy bs = canvas.getBufferStrategy();
			Graphics g = (Graphics2D) bs.getDrawGraphics();

			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);

			g.setColor(Color.RED);

			Vertex v1 = new Vertex(10, 10, 50);
			Vertex v2 = new Vertex(20, 10, 50);
			Vertex v3 = new Vertex(10, 20, 50);
			
			Vertex[] v = {v1, v2, v3};
			
			Polygon p1 = new Polygon(v);
			
			Camera c = new Camera(90, width, height);
			
			p1.render(c, g);

			bs.show();
			g.dispose();
		}
	}
}
