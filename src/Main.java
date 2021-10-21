import java.util.Scanner;

public class Main {
    private static Scanner Reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many shapes do you want? ");
        int count = Integer.valueOf(Reader.nextLine());

        Shape[] shapes = new Shape[count];

        // call procedure fillShapes() passing the array of shapes
        fillShapes(shapes);

        // call procedure printShapes() passing the array of shapes
        printShapes(shapes);
        // call function printMenu()

        while (true) {
            // ask the user for their menu selection
            System.out.print("Please enter the number of your menu choice. ");
            // read user menu selection input
            int choice = Integer.valueOf(Reader.nextLine());
            // if menu selection is 3, then break out of this while loop
            if (choice == 3)
                return;
            // ask the user which shape index they are interested in
            System.out.println("Which shape would you like to select?");
            // read user input for shape selection
            int sChoice = Integer.valueOf(Reader.nextLine());
            // switch on user menu selection

            //   case 1
            //      call the selected shape's area() function

            //      print out the area

            //   case 2
            //      call the selected shape's perimeter function

            //      print out the perimeter
        }
    }

    private static void fillShapes(Shape[] stuff) {
        // iterate through the array of shapes passed in with a definite loop
        for (int i = 0; i < stuff.length; i++) {
            //    ask the user if this shape should be a circle
            System.out.println("Is the shape a circle? (yes = 1, no = 2)");
            //    read their response
            int ans = Integer.valueOf(Reader.nextLine());
            //    if they want a circle
            //       ask and read in x, y, and radius values
            if (ans == 1){
                System.out.println("Enter x coordinate (positive)");
            double x = Double.valueOf(Reader.nextLine());
                System.out.println("Enter y coordinate (positive)");
            double y = Double.valueOf(Reader.nextLine());
                System.out.println("Enter the radius (positive)");
            double radius = Double.valueOf(Reader.nextLine());
            //       create an instance of a Circle obj and store it in the shape array passed in
                Circle c = new Circle (x, y, radius);}
            //    else
            //       ask and read in x, y, width and height values
            else{
                System.out.println("Enter x coordinate (positive)");
            double xR = Double.valueOf(Reader.nextLine());
                System.out.println("Enter y coordinate (positive)");
            double yR = Double.valueOf(Reader.nextLine());
                System.out.println("Enter the width (positive)");
            double wR = Double.valueOf(Reader.nextLine());
                System.out.println("Enter the length (positive)");
            double lR = Double.valueOf(Reader.nextLine());
            //       create an instance of a Rectangle obj and store it in the shape array passed in
            Rectangle r = new Rectangle(xR, yR, wR, lR);}
        }
    }


        private static void printShapes (Shape[]stuff)
        {
            System.out.println("\n--------------------");

            // iterate through the array of shapes passed in with a definite loop
            for (int i = 0; i<stuff.length; i++)
            {
            //    print each index and shape all on one line
                if (
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
