package shapes;

public class RectangleClass extends AbstractShapesClass {

	private static final String RECTANGLE = "RECTANGLE";
	
	private int hight;
	private int weight;
	
	public RectangleClass(String id, int centerX, int centerY, int hight, int weight) {
		
		super(id, centerX, centerY, RECTANGLE);
		this.hight = hight;
		this.weight = weight;
	}
	@Override
	public double area() {
		
		double area;
		
		area = hight*weight;
		
		return area;
		
	}

}
