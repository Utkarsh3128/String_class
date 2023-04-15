import java.lang.*;
public class Print_Methods {
    public static void main(String[] args) {
        //System.out.print();
        //It will print anything that is written inside it.
        //System.out.println();
        //Same as .print, but it will give a next line also.

        int x=10;
        //int y=20;
        float y=1.256f;
        char z='A';
        //System.out.print(x);
        //System.out.print(y);
        //System.out.println("Sum "+x+y); //It will not print sum 30, rather it will print sum 1020. Because it will first concatenate x to string and then to y.
        //System.out.println("Sum"+(x+y)); //It will print sum 30. Because we have given higher precedence to x+y.


        //System.out.printf("Hello %d %f %c",x,y,z);
        //format specifiers :- %d,%o,%x - decimal,octal,hexadecimal
        //                  :- %f,%e,%g - floating point, scientific, scientific
        //                  :- %c,%s - character,string

        //System.out.printf("%1$d  %1$d  %1$d",x);
        // %1$d - in this %1$ means that it will take first argument.
        //System.out.printf("%1$d %2$f %1$d",x,y);
        // %2 - will take second argument i.e., y.
        String str = "Hello java";
        System.out.printf("%3$s %2$f %1$d",x,y,str);
        // %$ - it is argument number.
    }
}
