package Task_2;

/*
 * Teacher - Alexander Ts 
 * Student - Snigarenko Vlad
 * 07.02.2018
 *
 * http://2mb.ru/matematika/geometriya/ploshhad-treugolnika-po-trem-storonam/#ixzz56SmISXc0	
 *
 */

public class Main {

	public static void main(String[] args) {

		// Test class Triangle
		
		Triangle TriangleOwn = new Triangle(3, 4, 5);
		System.out.println(TriangleOwn);

		System.out.println();
		
		Triangle TriangleTwo = new Triangle(4, 5, 6);
		System.out.println(TriangleTwo);
		TriangleTwo.setB(TriangleOwn.getB());
		System.out.println(TriangleTwo);

		System.out.println();
		
		Triangle TriangleThree = new Triangle();
		TriangleThree.setA(10);
		TriangleThree.setB(12);
		TriangleThree.setC(18);

		System.out.println(TriangleThree);
		System.out.println("Area = " + TriangleThree.getArea());
		
	}

}
