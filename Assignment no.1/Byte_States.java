/*9.Write a program to convert state of Byte instance into byte, 
short, int. long, float and double.*/

class Bytes_States
{
    public static void main (String args[])
    {
        int a =10;
        byte x = (byte)a;
        Byte bi = new Byte(x);

        //byte value of byte instance
        byte bv = bi.byteValue();
        System.out.println("Byte value of byte instance :"+bv);

        //short value of byte instance
        short sv = bi.shortValue();
        System.out.println("Short value of byte instance :"+sv);

        //int value of byte instance
        int iv = bi.intValue();
        System.out.println("int value of byte instance :"+iv);

        //long value of byte instance
        long lv = bi.longValue();
        System.out.println("long value of byte instance :"+lv);

        //float value of byte instance
        float fv = bi.floatValue();
        System.out.println("float value of byte instance :"+fv);

        //double value of byte instance
        double dv = bi.doubleValue();
        System.out.println("double value of byte instance :"+dv);
    }
    
}