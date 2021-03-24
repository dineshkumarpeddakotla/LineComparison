package line;
import java.util.Scanner;
class Line{
//Constructor Intialized
int x;
int y;
    Line(int x,int y){
        this.x=x;
        this.y=y;
    }
public static void main(String[] args){
System.out.println("Welcome to Line");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Co ordinates of Point1");
//calling Constructor
//Creating an object of the class and passing values from user 
Line Point1 = new Line(sc.nextInt(),sc.nextInt());
System.out.println("Enter the Co ordinates of Point2");
Line Point2 = new Line(sc.nextInt(),sc.nextInt());
System.out.println("Enter the Co ordinates of Point3");
Line Point3 = new Line(sc.nextInt(),sc.nextInt());
System.out.println("Enter the Co ordinates of Point4");
Line Point4 = new Line(sc.nextInt(),sc.nextInt());
//invoking instance method
double length1= Point1.length(Point2);
 double length2 = Point3.length(Point4);
System.out.println("Length of line one = " +length1);
System.out.println("Length of line two = " +length2);
String s1=String.valueOf(length1);
String s2=String.valueOf(length2);
System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
}
public double length(Line Point ){
        double length =Math.floor(Math.sqrt(Math.pow(Point.x-x,2)+Math.pow(Point.y-y,2)));
        return length;
    }

}
