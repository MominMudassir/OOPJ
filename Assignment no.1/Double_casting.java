/** Q.no.28
    Write a program to convert:
        a. double value into String
        b. double value into Double instance.
        c. String instance into Double instance.
        d. double value into binary, octal and hexadecimal string(Note: Here you can use 
            doubleToLongBits() method along with methods of Long class).
 */

 class Double_casting{
    public static void main(String a[])
    {
        double num=111.0987;

        System.out.println("Double value into String (Boxing) : "+ Double.toString(num));
        System.out.println("Double value into Double instance : "+ Double.valueOf(num));
        String str2="112.875";
        System.out.println("String instance into Double instance : "+ Double.valueOf(str2));
        System.out.println("Double value into binary : "+Long.toHexString( Double.doubleToLongBits(num)));
        System.out.println("Double value into hexadecimal : "+Long.toOctalString(Double.doubleToLongBits(num)));
        System.out.println("Double value into octal : "+Long.toBinaryString(Double.doubleToLongBits(num)));
    }
}
