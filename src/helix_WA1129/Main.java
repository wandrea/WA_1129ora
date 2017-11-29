package helix_WA1129;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2 = new Rectangle (10.2, 10, "kék");

        System.out.println("length: " + rectangle2.getLength());
        System.out.println("width: " + rectangle2.getWidth());
        System.out.println("color: " + rectangle2.getColor());

       rectangle1.setLength(2.3);
       rectangle1.setWidth(10);
       rectangle1.setColor("zöld");


       rectangle1.print();




	/*int number=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("next number:");
	number = scanner.nextInt();
	System.out.println ("number-"+ number);*/

	/*Random random=new Random();
	int randomNumber=random.nextInt();
	System.out.println("random number:" + randomNumber);

	System.out.println(Math.abs(-5));*/



/*private static int getTheBigger (int x,int y){
	   if (x>y){
	       return x;
       }
       else {
	       return y;
       }*/

       /*return x>y ? x:y;*/

System.out.println(Math.sum(5,4));
        System.out.println(Math.multiplication(5,4));
        System.out.println(Math.subscraction(5,4));
        System.out.println(Math.dividing(5,4));

    }

}
