package com.patterns.creational.factory;

public class ShapeFactory {
	//Definition: Define an interface or an abstract class and let the 
	//subclasses decide which object to instantiate.
	
	//use getShape method to get object of type shape 
	public Shape getShape(Shapes shapeType){
	   switch (shapeType) {
	   	case CIRCLE:
	   		return new Circle();
	   	case SQUARE:
	   		return new Square();
	   	case RECTANGLE:
	   		return new Rectangle();
	   	default:
	   		throw new IllegalStateException("Factory did not return valid object");
	   }
	   
	}
}