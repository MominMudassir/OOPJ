/* Q.no.13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance. */

class Short_casting
{
    public static void main(String [] args)
{
    short num = 100;
    String str = Short.toString(num);
    System.out.println("Short value into String (BOXING) :"+str);
    System.out.println("Short value into Short instance :"+Short.valueOf(num));

    String str2 = "120";
    System.out.println("String value into short value (UNBOXING) :"+Short.parseShort(str2));
    System.out.println("String value into short instance :"+Short.valueOf(str2));
}
}
