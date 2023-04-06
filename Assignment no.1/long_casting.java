/**Q.no.20
    Write a program to convert:
        a. long value into String
        b. long value into Long instance.
        c. String instance into Long instance.
        d. long value into binary, octal and hexadecimal string.
 */

 class long_casting
 {
    public static void main(String[]args)
    {
        long x = 12000;
        System.out.println("long value into String :"+Long.toString(x));
        System.out.println("long value into Long instance. :"+Long.valueOf(x));
        String str = "120";
        System.out.println("String instance into Long instance. :"+Long.valueOf(str));
        System.out.println("long value into binary string :"+Long.toBinaryString(x));
        System.out.println("long value into octal string :"+Long.toOctalString(x));
        System.out.println("long value into hexadecimal string :"+Long.toHexString(x));

    }
 }
