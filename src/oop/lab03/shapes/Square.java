package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Square implements Polygon{
	
	private int lungEdge;

	public Square(int lungEdge) {
		this.lungEdge = lungEdge;
	}
	
	@Override
	public double perimeter() {
		return lungEdge*4;
	}

	@Override
	public double area() {
		return lungEdge*lungEdge;
	}

	@Override
	public int GetEdgeCount() {
		return 4;
	}

	@Override
	public String toString() {
		return "Square [lungEdge=" + lungEdge + "]";
	}

}
