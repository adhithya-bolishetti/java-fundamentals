package com.stschool.java.fundamentals;

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        int[] values = {10, 20, 30, 40, 50};

        System.out.print("Pushed: ");
        for (int value : values) {
            stack.push(value);
            System.out.print(value + " ");
        }

        System.out.print(" Peek: " + stack.peek() + " ");

        System.out.print(" Popped: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(stack.pop() + " ");
        }

        System.out.print(" ");
        stack.display();
    }
}

class Stack {
    int[] arr;
    int top;
    int capacity;

    Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void display() {
        System.out.print("Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}