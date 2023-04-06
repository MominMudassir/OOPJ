/** Q.no.22
    Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.
 */

 class long_operation
 {
    public static void main(String [] args)
    {
        long x= 12355  , y = 23455;
        System.out.println("Maximum using max class level method :"+Long.max(x,y));
        System.out.println("Minimum using min class level method :"+Long.min(x,y));
        System.out.println("Addition using sum class level method :"+Long.sum(x,y));
    }
 }
