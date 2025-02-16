package Intermediario.DataEstructure;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        System.out.println(ninjaStack.peek());
        ninjaStack.pop();
        System.out.println(ninjaStack.peek());
        ninjaStack.pop();
        System.out.println(ninjaStack.peek());
    }
}
