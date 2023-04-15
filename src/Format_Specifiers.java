import java.lang.*;
public class Format_Specifiers {
    public static void main(String[] args) {
        int a=10;
        //System.out.printf("%d",a); //simply prints the value of a.
        //width :- it leaves the gap before printing the number.
        //System.out.printf("%5d",a);  //It will leave 5 gaps including the number.
        //Flag:- -,+,0,'',(.
        //System.out.printf("%05d",a);  //It will print 0 before the number and total of 5 numbers will be printed.
        //System.out.printf("%(5d",a);    //It will print the number in bracket if it is negative,else as it is.
        //System.out.printf("%+5d",a);    //It will print the sign of number.

        float b=8728893.789f;
        //System.out.printf("%f",b);   //It has printed the precise value of b.
        //System.out.printf("%6.2f",b);  //This is the way of giving widht to floating point numbers. 6 places and 2 numbers after decimal.
        //System.out.printf("%.2f",b);  //This is another way of giving how many numbers after decimal to be printed.

        //Note:- If the number is large and the width is less, then the whole number will be printed regardless of the width.
        //       If the number is small and the width is more, then the spaces will be printed also.

        //System.out.printf("%010.2f",b);  //Here width is 10 and flag is 0,so rest of the places will be filled with 0.

        String str ="java";
        //System.out.printf("%s",str);
        //System.out.printf("%20s",str);  //This will print java with 20 spaces including the string java.
        System.out.printf("%-20s",str); //This will print java left side and will leave the spaces right side.
    }
}
