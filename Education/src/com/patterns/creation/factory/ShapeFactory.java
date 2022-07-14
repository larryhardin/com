package com.patterns.creation.factory;

import java.awt.dnd.InvalidDnDOperationException;

public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(Shapes shapeType){
	      switch (shapeType) {
	      	case CIRCLE:
	      		return new Circle();
	      	case SQUARE:
	      		return new Square();
	      	case RECTANGLE:
	      		return new Square();
	      }
	      throw new IllegalStateException("Factory did not return valid object");
	   }
	}