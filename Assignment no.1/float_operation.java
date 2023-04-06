/** Q.no.26
    Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.
 */

 class float_operation{
    public static void main(String[] a){
        float num1=15.5f, num2=30.23f;
        System.out.println("Maximum using max class level method : "+Float.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Float.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Float.sum(num1,num2));
    }

}
