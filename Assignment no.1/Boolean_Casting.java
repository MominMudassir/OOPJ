/*6.Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.*/

class Boolean_Casting
{
    public static void main (String [] args)
    {
        boolean x = true;
        System.out.println("boolean value into String :"+Boolean.toString(x));
        System.out.println("boolean value into Boolean instance.:"+Boolean.valueOf(x));
        String str = "true";
        System.out.println("String value into boolean value :"+Boolean.valueOf(str));
        System.out.println("String value into Boolean instance :"+Boolean.valueOf(str));
    }
}
