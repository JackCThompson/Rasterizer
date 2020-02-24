import java.util.List;

public class Model {

	private List<Vertex> verteces;
	private List<Polygon> polygons;
	
	public Model(List<Vertex> v, List<Polygon> p) {
		polygons = p;
		verteces = v;
	}
	
	public List<Vertex> getVerteces(){
		return verteces;
	}
	
	public List<Polygon> getPolygons(){
		return polygons;
	}
}
