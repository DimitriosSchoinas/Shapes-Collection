package shapes;

// Exercício: comentar interface Shape
public interface Shape {
	String getID();
	String getType();
	int getCenterX();
	int getCenterY();
	void move(int x, int y);
	double area();
}
