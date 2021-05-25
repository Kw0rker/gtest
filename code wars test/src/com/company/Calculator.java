package com.company;

import java.util.Stack;

public class Calculator {
    public static Double evaluate(String expression) {
        Double result= (double) 0;

        Stack<String> operands=new Stack<>();
        String [] op=expression.split(" ");
        for (int i = op.length-1; i >= 0; i--) {
            operands.push(op[i]);
        }
        while (!operands.isEmpty()){
            String operat=operands.pop();
            switch (operat){
                case "(":

                    break;

                case "+":

                    break;

                case "-":

                    break;

                case "/":

                    break;

                case "*":

                    break;

                default:

            }

        }
        return -1.0;
    }
}