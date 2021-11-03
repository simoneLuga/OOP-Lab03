package oop.lab03.shapes.interfaces;
import oop.lab03.shapes.*;

public class WorkWithShapes {
	
	private WorkWithShapes() {
		
	}
	
	public static void main (final String[] args) {
		Shape c = new Circle(5);
		Shape s = new Square(5);
		Shape r = new Rectangle(5, 10);
		Shape t1 = new Triangle(7, 10);//equilatero
		Shape t2 = new Triangle(7, 10, 4);//isoscile
		Shape t3 = new Triangle(7, 10, 6, 5);//scaleno
		
		System.out.println(c+" Area:"+c.area()+" Perimeter:"+c.perimeter());
		System.out.println(s+" Area:"+s.area()+" Perimeter:"+s.perimeter());
		System.out.println(r+" Area:"+r.area()+" Perimeter:"+r.perimeter());
		
		System.out.println(t1+" Area:"+t1.area()+" Perimeter:"+t1.perimeter());
		System.out.println(t2+" Area:"+t2.area()+" Perimeter:"+t2.perimeter());
		System.out.println(t3+" Area:"+t3.area()+" Perimeter:"+t3.perimeter());
		
	}

}
