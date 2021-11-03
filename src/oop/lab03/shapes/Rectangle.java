package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Rectangle implements Polygon{
	
	private int h;
	private int b;

	public Rectangle(int h, int b) {
		super();
		this.h = h;
		this.b = b;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return b+h+b+h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return b*h;
	}

	@Override
	public int GetEdgeCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	public int getH() {
		return h;
	}

	public int getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Rectangle [h=" + h + ", b=" + b + "]";
	}

}
