package com.patterns.creational.factory;

public class FactoryPatternDemo {
	//Comment regarding this, my first work using Factory method
	//based on example from https://www.tutorialspoint.com/design_pattern/factory_pattern.htm#
	//I do not know if it is acceptable, but I do not like using hardcoded values in code
	//In the original example, the shapeFacotry getShape method received a string and uses
	//a string operation to make the comparison:
	//"CIRCLE", shapeType.equalsIgnoreCase("CIRCLE")
	//Using an ENUM has the added benefit that when the code is to be modified to support a new
	//shape, adding the shape to the ENUM creates a warning in the Factory class 
	//The enum constant TRIANGLE needs a corresponding case label in this enum switch on Shapes
	//Furthermore, if the warning is ignored, the exception at the end when no match is made 
	//acts as a clue that the new shape ( Triangle in this case ) requires more work to be
	//implemented by the factory. AKA, the factory needs to be modified to create triangles properly
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

	    //get an object of Circle and call its draw method.
	    Shape shape1 = shapeFactory.getShape(Shapes.CIRCLE);

	    //call draw method of Circle
	    shape1.draw();

	    //get an object of Rectangle and call its draw method.
	    Shape shape2 = shapeFactory.getShape(Shapes.RECTANGLE);

	    //call draw method of Rectangle
	    shape2.draw();

	    //get an object of Square and call its draw method.
	    Shape shape3 = shapeFactory.getShape(Shapes.SQUARE);

	    //call draw method of square
	    shape3.draw();
	    
	    //Code below is expected to generate an exception as TRIANGLE was not added
	    //to the shapeFactory class
	    try {
	    	Shape shape4 = shapeFactory.getShape(Shapes.TRIANGLE);
	    	shape4.draw();
	    } catch(Exception e) {
	    	System.out.println("The exception was thrown and caught, as expected.");
	    }
	}

}
