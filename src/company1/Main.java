package company1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by yury on 7.12.16.
 */
public class Main {
    public static void main(String[] args) throws DivisionOnZero {
        Stack<Integer> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            String[] p = str.split(" ");
            switch (p[0]) {
                case "push":
                    for (int i = 1; i < p.length; i++) {
                        stack.push(Integer.valueOf(p[i]));
                    }
                    break;
                case "pop":
                        System.out.println(stack.peek());
                    break;
                case "t": return;
            }
        }
    }
}
