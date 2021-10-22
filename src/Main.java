
import java.util.Scanner;

public class Main {
    private static Scanner Reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many shapes do you want? ");
        int count = Integer.valueOf(Reader.nextLine());
        Shape[] shapes = new Shape[count];

        // call procedure fillShapes() passing the array of shapes
        fillShapes(shapes, count);
        // call procedure printShapes() passing the array of shapes
        printShapes(shapes);
        // call function printMenu()

        while (true) {
            printMenu();
            // ask the user for their menu selection
            System.out.print("Please enter the number of your menu choice. ");
            // read user menu selection input
            int choice = Integer.valueOf(Reader.nextLine());
            // if menu selection is 3, then break out of this while loop
            if (choice == 3)
                return;
            // ask the user which shape index they are interested in
            System.out.print("Which shape would you like to select?");
            // read user input for shape selection
             int sChoice = Integer.valueOf(Reader.nextLine());
            // switch on user menu selection
            switch (choice) {
                case 1:
                    //      call the selected shape's area() function

                /*if ( p instanceof Circle)
                   double area = p.area();
                else if ( p instanceof Rectangle)
                    Rectangle c = (Rectangle) p;
                    area = c.area();
                    //      print out the area
                    System.out.println(area);*/

                case 2:
                    //      call the selected shape's perimeter function

                    //      print out the perimeter

            }
        }
    }

    private static void fillShapes(Shape[] stuff, int count) {
        // iterate through the array of shapes passed in with a definite loop
        for (int i = 0; i < stuff.length; i++) {
            //    ask the user if this shape should be a circle
            System.out.println("Is the shape a circle? (yes = 1, no = 2)");
            //    read their response
            int ans = Integer.valueOf(Reader.nextLine());
              if (ans > 2)
              return;
            //    if they want a circle
            //       ask and read in x, y, and radius values
            if (ans == 1){
                System.out.println("Enter x coordinate (positive)");
            double xC = Double.valueOf(Reader.nextLine());
                System.out.println("Enter y coordinate (positive)");
            double yC = Double.valueOf(Reader.nextLine());
                System.out.println("Enter the radius (positive)");
            double radius = Double.valueOf(Reader.nextLine());
            //       create an instance of a Circle obj and store it in the shape array passed in
             stuff[i]= new Circle(xC, yC, radius);
            }
               else if (ans == 2){
            //       ask and read in x, y, width and height values
                System.out.println("Enter x coordinate (positive)");
            double xR = Double.valueOf(Reader.nextLine());
                System.out.println("Enter y coordinate (positive)");
            double yR = Double.valueOf(Reader.nextLine());
                System.out.println("Enter the width (positive)");
            double wR = Double.valueOf(Reader.nextLine());
                System.out.println("Enter the length (positive)");
            double lR = Double.valueOf(Reader.nextLine());
            //       create an instance of a Rectangle obj and store it in the shape array passed in
             stuff[i] = new Rectangle(xR, yR, wR, lR);}
        }
    }


        private static void printShapes (Shape[]stuff) {
            System.out.println("\n--------------------");

            // iterate through the array of shapes passed in with a definite loop
            for (int i = 0; i < stuff.length; i++) {
                //    print each index and shape all on one line
                System.out.println( i + ") " + stuff[i]);
            }

        }

        private static void printMenu ()
        {
            System.out.println("--------------------");
            System.out.println("1) Area");
            System.out.println("2) Perimeter");
            System.out.println("3) EXIT");
            System.out.println("--------------------");
        }
    }
