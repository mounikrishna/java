package com.object;

/*
 * ------INITIALIZATION OF OBJECTS THROUGH REF VARIABLES------ public class
 * Rectangle { int length; int width; public static void main(String[] args) {
 * // TODO Auto-generated method stub Rectangle area = new Rectangle();
 * area.length = 12; area.width = 13;
 * System.out.println("area of rectangle: = "+ area.length*area.width); } }
 */

//------INITIALIZATION OF OBJECTS THROUGH METHODS------
public class Rectangle {
int length;
int width;
public void insert(int len, int wid) {
	length = len;
	width = wid;
}
void display() {
	System.out.println("area of rectangle: = "+ length*width);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rectangle area =  new Rectangle();
	Rectangle area1 =  new Rectangle();
	area1.insert(10,56);
	area.insert(5,5);
	area.display();
	area1.display();
}

}

