package oop.lab03.shapes;

import java.lang.Math;
import oop.lab03.shapes.interfaces.Shape;

public class Circle implements Shape {
	
	private final int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double perimeter() {
		return (Math.PI*r*2);
	}

	@Override
	public double area() {
		return (Math.PI*r*r);
	}

	public int getR() {
		return r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
}
