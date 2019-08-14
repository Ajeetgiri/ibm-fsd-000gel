package comm.example;

import java.util.EmptyStackException;

public class MyStack {
	   private int arr[] = new int[5];
	    private int size;
	    private int index = 0;

	    public void Stack(int size) {
	        this.size = size;
	        arr = new int[size];
	    }

	    public void push(int a) {

	        if (isFull()) {
	            System.out.println("stack is full");
	        }

	        arr[index] = a;
	        index++;
	    }

	    public int pop() {

	        if (isEmpty()) {
	            System.out.println("stack is empty");
	        }
	        return arr[--index];
	    }

	    public boolean isEmpty() {
	        if (index == 0) {
	            return true;
	        }
	        return false;
	    }

	    public boolean isFull() {
	        if (index == size) {
	            return true;
	        }
	        return false;
	    }

	    public int size() {
	        return index;
	    }
	}

