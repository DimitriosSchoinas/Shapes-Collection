package shapes;


public interface ShapesCollection {
	
	/**
	 * verify if the array that has the shapes is empty or not
	 * @return if the array that has the shapes is empty or not
	 */
	boolean isEmpty();
	/**
	 * verify  if the shape already exists in the array
	 * @param ID identification of the shape
	 * @return if the shape already exists in the array
	 */
	boolean hasShape(String ID);
	/**
	 * adds a circle in the array
	 * @param ID identification of the circle
	 * @param x value of abcissa of the center
	 * @param y value of ordinate of the center
	 * @param radius of the circle
	 */
	void addCircle(String ID, int x, int y, int radius);
	/**
	 * adds a Rectangle in the array
	 * @param ID identification of the Rectangle
	 * @param x value of abcissa of the center
	 * @param y value of ordinate of the center
	 * @param height value of height of the rectangle
	 * @param width value of width of the rectangle
	 */
	void addRectangle(String ID, int x, int y, int height, int width);
	/**
	 * changes the coordenates of the center
	 * @param ID identification of the shape
	 * @param x value of abcissa of the center
	 * @param y value of ordinate of the center
	 */
	void move(String ID, int x, int y);
	/**
	 * returns the shape with the smallest area
	 * @return returns the shape with the smallest area
	 */
	Shape smallestArea();
	/**
	 * iterates all the shapes
	 * @return iterates all the shapes
	 */
	Iterator allShapesIterator();
}
