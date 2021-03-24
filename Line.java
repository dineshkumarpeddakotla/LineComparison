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
Line Point1 = new Line(sc.nextInt(),sc.nextInt());
System.out.println("Enter the Co ordinates of Point2");
Line Point2 =new Line(sc.nextInt(),sc.nextInt());
double length= Point1.length(Point2);
}
  public double length(Line Point ){
double length =Math.floor(Math.sqrt(Math.pow(Point.x-x,2)+Math.pow(Point.y-y,2)));
System.out.println("Length of line = " +length);
return length;
}
}
