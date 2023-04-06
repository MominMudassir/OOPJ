/** Q.no.21
    Write a program to convert state of Long instance into byte, 
short, int, long, float and double.

 */

 class long_status
 {
    public static void main(String [] args)
    {
        long x = 123;
        Long l = new Long(x);

        //byte value of long instance
        byte bv = l.byteValue();
        System.out.println("byte Value of "+x+" is "+bv);

        //Short value of long instance
        short sv = l.shortValue();
        System.out.println("byte Value of "+x+" is "+sv);

        //int value of long instance
        int iv = l.intValue();
        System.out.println("byte Value of "+x+" is "+iv);

        //long value of long instance
        long lv = l.longValue();
        System.out.println("byte Value of "+x+" is "+lv);

        //float value of long instance
        float fv = l.floatValue();
        System.out.println("byte Value of "+x+" is "+fv);

        //double value of long instance
        double dv = l.doubleValue();
        System.out.println("byte Value of "+x+" is "+dv);


    }
 }
