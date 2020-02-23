
public class Camera {
	
	private int width;
	private int height;

	private double fovHorizontal;
	private double fovVertical;
	
	private double widthOverTanEtc;
	private double heightOverTanEtc;
	
	
	public Camera(double fov, int width, int height) {
		this.width = width;
		this.height = height;
		
		fovHorizontal = fov;
		fovVertical= 2 * (Math.tanh(Math.tan(fov / 2) / (width / height)));
		
		widthOverTanEtc = width / (2 * Math.tan(fovHorizontal / 2));
		heightOverTanEtc = height / (2 * Math.tan(fovVertical / 2));
	}
	
	public PixelLocation locateOnScreen(Vertex v) {
//		if (v.getRealZ() > 0) {
			int x = (int) (widthOverTanEtc * (v.getRealX() / v.getRealZ())) + (width / 2);
			int y = -(int) (heightOverTanEtc * (v.getRealY() / v.getRealZ())) + (height / 2);
			return new PixelLocation(x, y);
//		}
//		return null;
	}
}
