package com.company;
import java.util.Stack;

public class Main {
    public static void main(String[]args){
        classStack stack = new classStack();
        stack.game();
        stack.show();

        classQueue queue = new classQueue();
        queue.game();
        queue.show();
    }
}
