public /**Q.no.19
Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
*/

class long_type
{
    public static void main (String [] args)
    {
        System.out.println("The number of bits used to represent a long value :"+Long.SIZE);
        System.out.println("The number of bytes used to represent a long value :"+Long.BYTES);
        System.out.println("The minimum value a long :"+Long.MIN_VALUE);
        System.out.println("The The maximum value a long :"+Long.MAX_VALUE);
    }
}
