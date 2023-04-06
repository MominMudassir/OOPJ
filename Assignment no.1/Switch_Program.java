/** Q.no.33
   Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case. 
 */

 import java.util.Scanner;

 class Switch_Program
 {
    public static void main (String [] args)
    {
        int x = Integer.parseInt(args[0]);
        float y = Float.parseFloat(args[1]);
        double z = Double.parseDouble(args[2]);

        Scanner sc = new Scanner (System.in);
       // System.out.println("Enter a number between 1 to 4 :");

        int ch = sc.nextInt();

        switch (ch)
        {
            case 1:
            System.out.println("Addition is "+(x+y+z));
            break;

            case 2:
            System.out.println("Substraction is "+(x-y-z));
            break;

            case 3:
            System.out.println("Multiplication is "+(x*y*z));
            break;

            case 4:
            System.out.println("Division is "+(x/y/z));
            break;

            default:
            System.out.println("please enter valid input ");
        }




    }
 }
