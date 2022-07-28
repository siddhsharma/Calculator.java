package com.siddh;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press 'x'/'X'
        int ans = 0;
        while (true) {
            // take an operator as an input
            System.out.print("enter an operator:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%'|| op == '/'){
                System.out.print("enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op== '+'){
                    ans = num1+num2;
                }
                if(op=='-'){
              ans = num1-num2;
            }
         if (op=='*') {
       ans = num1*num2;
    }
     if (op=='%'){
   ans= num1%num2;
}
             if (op=='/'){
              if (num1!=0){
        ans=num1/num2;
       }
}
}else if (op=='x'|| op=='X'){
       break;
        } else {
            System.out.println("invalid opertion:");
}
        System.out.println(ans);
       }
    }
}