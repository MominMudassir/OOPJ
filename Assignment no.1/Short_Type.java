/* Q.no.12.Write a program to perform below operations on short type to 
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short */
class Short_Type
{
    public static void main (String [] args)
    {
        System.out.println("The number of bits used to reperesent a short value :"+Short.SIZE);
        System.out.println("The number of bytes used to represent a Short value :"+Short.BYTES);
        System.out.println("The minimum value of short :"+Short.MIN_VALUE);
        System.out.println("The maximum value of short :"+Short.MAX_VALUE);
    }
}