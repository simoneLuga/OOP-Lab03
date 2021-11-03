package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon{
	
	private int h;
	private int b;
	private int l1;
	private int l2;

	public Triangle(int h, int b) {
		//equilaterot
		super();
		this.h = h;
		this.b = b;
		this.l1 = b;
		this.l2 = b;
	}

	public Triangle(int h, int b, int l1) {
		//isoscile
		super();
		this.h = h;
		this.b = b;
		this.l1 = l1;
		this.l2 = l1;
	}

	public Triangle(int h, int b, int l1, int l2) {
		//scaleno
		super();
		this.h = h;
		this.b = b;
		this.l1 = l1;
		this.l2 = l2;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return b+l1+l2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (b*h)/2;
	}

	@Override
	public int GetEdgeCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	public int getH() {
		return h;
	}

	public int getB() {
		return b;
	}

	public int getL1() {
		return l1;
	}

	public int getL2() {
		return l2;
	}

	@Override
	public String toString() {
		return "Triangle [h=" + h + ", b=" + b + ", l1=" + l1 + ", l2=" + l2 + "]";
	}

}
