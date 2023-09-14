import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x =5.50;
        double y=2;
        System.out.println("How many drinks do you want?");
        Scanner drinks=new Scanner(System.in);
        String amount=drinks.next();
        int result = Integer.valueOf(amount);
        System.out.println("Your total drinks will cost you " +result*y );

        System.out.println("How many hotdogs do you want?");
        Scanner hotdogs=new Scanner(System.in);
        String amountH=hotdogs.next();
        int resultH = Integer.valueOf(amountH);
        System.out.println("Your total hotdogs will cost you " +resultH*x );
        double totalprice = (1.12*resultH*x) + (1.12*result*y);
        System.out.println("Your total price with tax will be" + totalprice);





        }
    }

