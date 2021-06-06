package base;

//Sometimes you have to round up to the next number rather than follow standard rounding rules.
//Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
//You will need to purchase 2 gallons of paint to cover 360 square feet.

//Remember, you can’t buy a partial gallon of paint. You must
//round up to the next whole gallon.

//Use a constant to hold the conversion rate.
//Ensure that you round up to the next whole number.


import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        String length = input.nextLine();
        System.out.println("what is the width of the room in feet?");
        String width = input.nextLine();
        int a = Integer.parseInt(length);
        int b = Integer.parseInt(width);
        int area = (a * b);
        int gallon = 350;
        int paint = ((area + gallon-1)/gallon);
        System.out.println("You will need to purchase " + paint + " gallons of paint to cover " + area + " square feet");


    }
}
