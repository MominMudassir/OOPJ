/** Q.no.24
    .Write a program to convert:
        a. float value into String
        b. float value into Float instance.
        c. String instance into Float instance.
        d. float value into hexadecimal string.

 */

 class float_casting
 {
    public static void main(String[] args)
    {
        float fv = 150.5f;
        System.out.println("float value into String :"+Float.toString(fv));
        System.out.println("float value into Float instance.:"+Float.valueOf(fv));
        String str = "150.5F";
        System.out.println("String instance into Float instance. :"+Float.valueOf(str));
        System.out.println("float value into hexadecimal string. :"+Float.toHexString(fv));
    }
 }
