package shapes;

public class CircleClass extends AbstractShapesClass  {
	
	private static final String CIRCLE = "CIRCLE";
	
	
	private int ray;
	
	public CircleClass(String ID, int centerX, int centerY,  int ray) {
		
		super(ID,centerX,centerY, CIRCLE);
		this.ray = ray;
		
	}
	@Override
	public double area() {
		
		double area;
		
		
			area = 3.1416*Math.sqrt(ray);
			
			return area;
		
	}

	
	

	

	

}
