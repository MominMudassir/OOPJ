/* Q.no.14.Write a program to convert state of Short instance into byte, 
short, int, long, float and double */



class Short_states
{
    public static void main(String [] args)
    {
        short x = 125;
        Short s = new Short(x);
        //byte Value of the short object
        byte bv = s.byteValue();
        //printing the output
        System.out.println("byte value of "+x+"is "+bv);
        //short value of short object
        short sv = s.shortValue();
        //printing the output
        System.out.println("Short value of "+x+" is "+sv);
        //int value of short object
        int iv = s.intValue();
        //printing the output
        System.out.println("int value of  "+x+" is "+iv);
        //float value of short object
        float fv = s.floatValue();
        //printing the output
        System.out.println("float value of "+x+" is "+fv);
        //double value of short object
        double dv = s.doubleValue();
        //printing the output
        System.out.println("double value of "+x+" is "+dv);
        //long value of short object
        long lv = s.longValue();
        //printing the output
        System.out.println("long value of "+x+ " is "+lv);



    }
}