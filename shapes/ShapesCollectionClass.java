package shapes;

public class ShapesCollectionClass implements ShapesCollection {
	
	private static final int INI_VALUE = 1;
	
	private int numberOfShapes;
	private Shape[] shapesArray;
	
	public ShapesCollectionClass() {
		this.numberOfShapes = 0;
		shapesArray = new AbstractShapesClass[INI_VALUE];
	}

	@Override
	public boolean isEmpty() {
		
		return (numberOfShapes == 0);
	}

	@Override
	public boolean hasShape(String ID) {
		
		boolean result = false;
		
		if(searchIndex(ID) != -1) {
			result = true;
		}
		return result;
	}

	@Override
	public void addCircle(String ID, int x, int y, int radius) {
		
		if(shapesArray.length == numberOfShapes) {
			grow();
		}
		shapesArray[numberOfShapes++] = new CircleClass(ID, x, y , radius);

	}

	@Override
	public void addRectangle(String ID, int x, int y, int height, int width) {
		
		if(shapesArray.length == numberOfShapes) {
			grow();
		}
		shapesArray[numberOfShapes++] = new RectangleClass(ID, x, y , height, width);
	}

	@Override
	public void move(String ID, int x, int y) {
		
		shapesArray[searchIndex(ID)].move(x, y);

	}

	@Override
	public Shape smallestArea() {
		
		Shape smallestArea = shapesArray[numberOfShapes - 1];
		
		for(int i = numberOfShapes - 1; i > -1 ; i--) {
			if(shapesArray[i].area() < smallestArea.area()) {
				smallestArea = shapesArray[i];
			}
		}
		return smallestArea;
	}

	@Override
	public Iterator allShapesIterator() {
		
		return new IteratorClass (shapesArray);
	}
	private void grow() {
		Shape tmp[] = new AbstractShapesClass[shapesArray.length + 1];
		for(int i = 0; i < numberOfShapes; i++ ) {
			tmp[i] = shapesArray[i];
		}
		shapesArray = tmp;
	}
	private int searchIndex(String id) {
		
		boolean found = false;
		int result = -1;
		int currentValue = 0;
		
		while(found == false && currentValue < numberOfShapes) {
			if(id.equals(shapesArray[currentValue].getID()) ) {
				found = true;
				result = currentValue;
			}else {
				currentValue++;
			}
		}
	
		return result;
		
	}

}
