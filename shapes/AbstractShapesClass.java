
package shapes;

abstract class AbstractShapesClass implements Shape {
	
	private String ID;
	private int centerX;
	private int centerY;
	private String type;
	
	protected AbstractShapesClass (String id, int centerX, int centerY, String type) {
		this.ID = id;
		this.centerX = centerX;
		this.centerY = centerY;
		this.type = type;
	}

	@Override
	public String getID() {
		return this.ID;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public int getCenterX() {
		return this.centerX;
	}

	@Override
	public int getCenterY() {
		return this.centerY;
	}

	@Override
	public void move(int x, int y) {
		
		this.centerX = x;
		this.centerY = y;

	}

	

}
