// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Pass the N variable as number 10
class Refnum{

    int n;

    // Function to assign the value
    // to the class variables
    Refnum(int x) {

        n = x;
    }

        }


public class Main {


    public static void main() {
        main(null);
    }


    public static void main(String[] args) {



    // Call in the referenced number from the other class Refnum
    Refnum object = new Refnum(10);

    // Make the object into a variable easier to use
    int n = 0;
    n = object.n;



    // Test Code goes here
   // System.out.print("The nth term of the referenced class is " + object.n); // Test output

    // Create Fibonacci sequence

   // Create the variables
    int a=0, b=1, first=0, second=1;

    // Print out Results

        System.out.print("The Fibonacci Sequence is as followed for " + n + " terms:  ");

    // Loop for Fibonacci
    // Used for all elements after the 1st 2 entries
    // N terms long



    for (int i = 0; i <= n; ++i) {


            // print and then calculate next
            System.out.print(first + ", ");

            int next = first + second;
            first = second;
            second = next;

         }

    }

}

