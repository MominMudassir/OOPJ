/* 16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.*/

class int_casting
{
    public static void main(String [] args)
    {
        int x = 120;
        System.out.println("int value into String (Boxing):"+Integer.toString(x));
        System.out.println("int value into Integer instance. :"+Integer.valueOf(x));
        String str = "122";
        System.out.println("String instance into Integer instance. :"+Integer.valueOf(str));
        System.out.println("int value into binary :"+Integer.toBinaryString(x));
        System.out.println("int value into octal :"+Integer.toOctalString(x));
        System.out.println("int value into hexadecimal string :"+ Integer.toHexString(x));

        
    }
}