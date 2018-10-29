package com.java.lesson14_stack_pop_push;
import java.util.*;

public class lesson14 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("ALFA");
        stack.push("FUNAI");
        stack.push("LG");
        stack.push("SAMSUNG");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

     }

     public static void printStack(Stack<String> s){
         if(s.empty())
             System.out.println("Aleo nu este nimika!!!");
         else
         System.out.printf("%s ceva este, asta e:\n", s);
         System.out.println();

     }
}
