package datastructure;
import java.util.ArrayList;
import java.util.List;


public class Stack {
    private Integer[] arr;
    private int pointer = 0;

    public Stack() {
        this.arr = new Integer[10000];
    }

    public Stack(int size) {
        this.arr = new Integer[10000];
    }


    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop() {
        // push 10 push 20 point 2
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }
    public Integer[] getArr() {
        return arr;
    }
}