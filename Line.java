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
double length =Math.floor(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)*1.0));
System.out.println("Length of line = " +length);
}
}
