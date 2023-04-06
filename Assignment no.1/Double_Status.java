/* Q.no.29 Write a program to convert state of Double instance into byte, 
short, int, long, float and double.
 */

 class Double_Status
 {
    public static void main(String [] args)
    {
        double d = 122.07;
        Double db = new Double(d);

        //byte value of double object
        byte bv = db.byteValue();
        System.out.println("byte value of "+d+ " is "+bv);

        //short value of double object
        short sv = db.shortValue();
        System.out.println("Short value of "+d+" is "+sv);

        //long value of double object
        long lv = db.longValue();
        System.out.println("Long value of "+d+" is "+lv);

        //float value of double object
        float fv = db.floatValue();
        System.out.println("Float value of "+d+" is "+fv);

        //double value of double instance
        double dbv = db.doubleValue();
        System.out.println("Double value of "+d+" is "+dbv);

    }
 }
