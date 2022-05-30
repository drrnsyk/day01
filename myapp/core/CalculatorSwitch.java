package myapp.core;

import java.io.Console;

public class CalculatorSwitch {
    public static void main(String[] args){
        Console cons = System.console();
        String opnd0 = cons.readLine("Operand 0:").trim();
        String opnd1 = cons.readLine("Operand 1:").trim();
        String operator = cons.readLine("Operator; one of add,sub,div,mul:").trim();
        Integer val0 = Integer.parseInt(opnd0);
        Integer val1 = Integer.parseInt(opnd1);
        float result = 0f;
        switch (operator){
            case "add":
            result = (float)(val0 + val1);
            break;
            case "sub":
            result = (float)(val0 - val1);
            break;
            case "div":
            result = (float)(val0 / val1);
            break;
            case "mul":
            result = (float)(val0 * val1);
            break;
            default:
        }
        System.out.printf("Result: %d %s %d = %.3f\n ", val0 , operator , val1, result);
   }
}
