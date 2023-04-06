/*18. Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.*/

class int_Operation
{
    public static void main(String [] args)
    {
        int num1 = 50 , num2 =30 ;
        System.out.println("Maximum using max class level method :" + Integer.max(num1,num2));
        System.out.println("Minimum using min class level method :"+Integer.min(num1,num2));
        System.out.println("Addition using sum class level method :"+Integer.sum(num1,num2));
    }
}