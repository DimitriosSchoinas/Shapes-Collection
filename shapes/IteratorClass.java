package shapes;

public class IteratorClass implements Iterator {

	private int nextIndex;
	private Shape[] shapesArray;
	
	public IteratorClass(Shape[] shapesArray ) {
		
		this.nextIndex = 0;
		this.shapesArray = shapesArray;
	}
	
	@Override
	public void init() {
		nextIndex = 0;

	}

	@Override
	public boolean hasNext() {
	
		return nextIndex < shapesArray.length;
	}

	@Override
	public Shape next() {
		
		return shapesArray[nextIndex++];
	}

}
