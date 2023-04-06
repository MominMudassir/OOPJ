/** Q.no.25
    Write a program to convert state of Float instance into byte, 
short, int, long, float and double.

 */
class float_status
{
    public static void main(String[] args)
    {
        float a = 150.5F;
        Float f = new Float(a);

        //byte value of float object
        byte bv = f.byteValue();
        System.out.println("byte value of float instance : "+bv);

        //short value of float object
        short sv = f.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Float Object
        int iv = f.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Float Object
        long lv = f.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Float Object
        float fv = f.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Float Object
        double dv = f.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);



    }
}
