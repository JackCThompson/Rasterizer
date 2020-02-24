import java.util.List;

public class Stage {

	private List<Vertex> verteces;
	private List<Polygon> polygons;
	
	public void add(Polygon p) {
		for (Vertex v : p.getVerteces()) {
			if (!verteces.contains(v)) {
				verteces.add(v);
			}
		}
		polygons.add(p);
	}
	
	public void add(Model m) {
		verteces.addAll(m.getVerteces());
		polygons.addAll(m.getPolygons());
	}
	
	public Stage centerOn(Entity e) {
		Stage stage = new Stage();
		
		
		
		return stage;
	}
	
}
