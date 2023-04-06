/* Q.no.31 Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double
 */

 class Double_Operations
 {
    public static void main (String [] args)
    {
        double num1 = 112.456;
        double num2 = 124.234;
        System.out.println("Minimum of given number :" + Double.min(num1,num2));
        System.out.println("Maximum of given number :"+Double.max(num1,num2));
        System.out.println("Addition of given number :"+Double.sum(num1,num2));

    }
 }
