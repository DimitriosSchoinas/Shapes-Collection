import shapes.*;
import java.util.Scanner;

public class Main {

	private static final String EXIT = "EXIT";
	private static final String RECTANGLE = "RECTANGLE";
	private static final String LIST = "LIST";
	private static final String MOVE = "MOVE";
	private static final String MINAREA = "MINAREA";
	private static final String CIRCLE = "CIRCLE";
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ShapesCollection sistema = new ShapesCollectionClass();
		
		String command;
		
		do {
			command = in.next();
			executeOption(command, sistema, in);
		}while( !command.equals("EXIT"));
		in.close();
		
	}
	
	/**
	 * it executes a command based in your command
	 * @param option option that you type to choose from
	 */
	public static void executeOption(String option, ShapesCollection sistema, Scanner in) {
		
		switch(option) {
		case CIRCLE:
			executeCircleCommand(in, sistema);
			break;
		case RECTANGLE:
			executeRectangleCommand(in, sistema);
			break;
		case LIST:
			executeListCommand(in, sistema);
			break;
		case MOVE:
			executeMoveCommand(in, sistema);
			break;
		case MINAREA:
			executeMinareaCommand(in, sistema);
			break;
		case EXIT:
			executeExitCommand();
			break;
		
		}
	}
	/**
	 * adds a circle to the shapes array
	 * @param in scanner
	 * @param sistema shapes collection
	 */
	public static void executeCircleCommand(Scanner in, ShapesCollection sistema) {
		
		String ID = in.next();
		int centerX = in.nextInt();
		int centerY = in.nextInt();
		int ray = in.nextInt();
		
		
		
		if(sistema.hasShape(ID)) {
			System.out.println("Identifier already exists.\n");
		}else {
			sistema.addCircle(ID, centerX, centerY, ray);
			System.out.println("A new circle was added.\n");
		}
	}
	/**
	 *  adds a rectangle to the shapes array
	 * @param in scanner
	 * @param sistema shapes collection
	 */
	public static void executeRectangleCommand(Scanner in, ShapesCollection sistema) {
		
		String ID = in.next();
		int centerX = in.nextInt();
		int centerY = in.nextInt();
		int hight = in.nextInt();
		int weight = in.nextInt();
		
		
		if(sistema.hasShape(ID)) {
			System.out.println("Identifier already exists.\n");
		}else {
			sistema.addRectangle(ID, centerX, centerY, hight, weight);
			System.out.println("A new rectangle was added.\n");
		}
		
	}
	/**
	 * makes a list of the shapes array
	 * @param in scanner 
	 * @param sistema shapes array system
	 */
	public static void executeListCommand(Scanner in, ShapesCollection sistema) {
		
		if(sistema.isEmpty()) {
			System.out.println("Empty collection.\n");
		}else {
			System.out.println("All shapes in the collection:");
			Iterator iterator = sistema.allShapesIterator();
		
			while(iterator.hasNext()) {
				Shape tmp = iterator.next();
				System.out.println(tmp.getID() + " (" + tmp.getCenterX() + ", " + tmp.getCenterY() + ") " + tmp.getType());
			}
			System.out.println();
		}
	}
	/**
	 * moves the center of the shape
	 * @param in scanner
	 * @param sistema shapes array system
	 */
	public static void executeMoveCommand(Scanner in, ShapesCollection sistema) {
		
		String ID = in.next();
		int centerX = in.nextInt();
		int centerY = in.nextInt();
		
		if(sistema.hasShape(ID) == false) {
			System.out.println("Identifier does not exist.\n");
		}else {
			sistema.move(ID, centerX, centerY);
			System.out.println("Shape was moved.\n");
		}
	}
	/**
	 * finds the shape with the lowest area
	 * @param in scanner
	 * @param sistema shape array system
	 */
	public static void executeMinareaCommand(Scanner in, ShapesCollection sistema) {
		
		if(sistema.isEmpty()) {
			System.out.println("Empty collection.\n");
		}else {
			Shape shape = sistema.smallestArea();
			System.out.println(shape.getID() + " (" + shape.getCenterX() + ", " + shape.getCenterY() + ") " + shape.getType());
				System.out.println();
		}
		
	}
	/**
	 * exits the program
	 */
	public static void executeExitCommand() {
		System.out.println("Exiting...\n");
	}
	

}
