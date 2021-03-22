package line;
import java.util.Scanner;
class Line{
public static void main(String[] args){
System.out.println("Welcome to Line");
System.out.println("Welcome to Line");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the x1 value");
int x1 =sc.nextInt();
System.out.println("Enter the y1 value");
int y1 =sc.nextInt();
System.out.println("Enter the x2 value");
int x2 =sc.nextInt();
System.out.println("Enter the y2 value");
int y2 =sc.nextInt();
System.out.println("Enter the x3 value");
int x3 =sc.nextInt();
System.out.println("Enter the y3 value");
int y3 =sc.nextInt();
System.out.println("Enter the x4 value");
int x4 =sc.nextInt();
System.out.println("Enter the y4 value");
int y4 =sc.nextInt();

double length1 =Math.floor(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
double length2 =Math.floor(Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));
System.out.println("Length of line one = " +length1);
System.out.println("Length of line two = " +length2);
String s1=String.valueOf(length1);
String s2=String.valueOf(length2);
System.out.println(s1.equals(s2));
}
}
