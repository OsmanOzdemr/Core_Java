package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        double length = 7.5;
        double width = 4.5;
        double area = length * width;
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        double perimeter = 2 * (length + width);
        System.out.println("perimeter = " + perimeter);
    }
}
/*
Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */