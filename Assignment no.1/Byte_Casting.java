/*8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.*/

class Byte_Casting
{
    public static void main(String args[])
    {
        //int x = 10;
        byte y = 10;
        System.out.println("byte value into String :"+Byte.toString(y));
        System.out.println("byte value into Byte instance. :"+Byte.valueOf(y));
        String str = "10";
        System.out.println("String instance into Byte instance :"+Byte.valueOf(str));

    }
}
