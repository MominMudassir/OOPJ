import javax.lang.model.util.ElementScanner6;


/*Q.no.11 Accept character from command line and perform below operations.Accept
 * here you can use charAt()method to extract character.
 * a.check wether entered character is letter or digit.if it is digit then print its values
 * as well as code point.
 * b.if it is character then check wether it is in lowercase?if it is in lowercase then
 * convert it into uppar case and print it as well as its code point.if it is in uppercase then
 * convert it onto lower case and print it as well as its code point.
 */

 class CommandLine
 {
    public static void main (String [] args)
    {
        int code_point = args[0].codePointAt(0);
        char ch =args[0].charAt(0);
        
        if (Character.isDigit(ch))
        {
            System.out.println("The entered character is digit :"+ch);
            System.out.println("Code point is :"+code_point);
        }
        else if (Character.isLowerCase(ch))
        {
            System.out.println("The entered character is a digit :"+Character.toUpperCase(ch));
            System.out.println("Code point is :"+code_point);
        }
        else
        {
            System.out.println("The entered character is a digit :"+Character.toLowerCase(ch));
            System.out.println("Code point is :"+code_point);
        }
    }
 }