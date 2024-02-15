import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        //printTriangle method
        printTriangle();
    }

    public static void printTriangle() {
        //Scanner for the size of the triangle
        Scanner in = new Scanner(System.in);
        int sizeoftriangle;
        //To continuesly checking the input and validate the number is in between 1-50
        while (true) {
            System.out.print("Enter the size of the triangle(size should be in range 1-50):");
            sizeoftriangle = in.nextInt();
            if (sizeoftriangle >= 1 && sizeoftriangle <= 50) {
                //break the while loop if the condition satisfies
                break;
            } else System.out.println("Size must be between 1-50!");
        }

        //Scanner for character of the triangle
        Scanner ch = new Scanner(System.in);
        System.out.print("Enter the character of the triangle:");
        String charoftriangle = String.valueOf(ch.next().charAt(0));

        //For loop to print triangle
        for (int i = 1; i <= sizeoftriangle; i++) {
            //for loop to print the spaces before the character
            for (int k = 1; k <= sizeoftriangle - i; k++) {
                System.out.print(" ");
            }

            //for loop to print the character
            for (int y = 1; y <= i; y++) {
                System.out.print(charoftriangle + " ");
            }
            //New line
            System.out.println();
        }

        //Asking for another triangle
        Scanner nexttriangle = new Scanner(System.in);
        System.out.print("Would you like another triangle (Y/N)?");
        String usernexttriangle = nexttriangle.nextLine().toLowerCase();
        //checking if we need another triangle.if yes calling the printTriangle method again
        if (usernexttriangle.equals("y")) {
            printTriangle();
        }

    }
}
