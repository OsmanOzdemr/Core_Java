package day08_IfStatements;

/*
 write a program that can swipe two variables' value by using a
temporary variable
    Ex:
        if a= 10, b=15
    output:
        a = 15
        b = 10
 */
public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

      int a =10, b= 15;
      int c = b;
      b = a;
      a = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}