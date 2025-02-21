package cpsc2150.MyDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DequeApp {
    public static void main(String[] args) {
        IDeque q;
        Scanner userInput = new Scanner(System.in);
/*
Prompt the user to pick an implementation using the following
message: "Enter 1 for array implementation or 2 for List
implementation"
Your code needs to make sure that they only enter either 1 or 2.
Re-print the message to prompt the user to enter it again. Once
you have gotten an answer, use it to initialize q appropriately.
*/
        do {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            int input = userInput.nextInt();
        } while(input != 1 || input != 2);

        if(input == 1) {
            q = new ArrayDeque();
        }

        Double x = 3.0;
        q.enqueue(x);
        x = -1.3;
        q.enqueue(x);
        x = -2.4;
        q.enqueue(x);
        x = 5.3;
        q.enqueue(x);
        x = 16.1;
        q.enqueue(x);
//Add the code to print the deque. After the code is finished,
// the deque should still contain all its values in order

    }
}
