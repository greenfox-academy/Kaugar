public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
        double side_a = 10;
        double side_b = 10;
        double side_c = 10;
//
// Surface Area: 600
        double surface = 6 *(side_a * side_b);
        System.out.println("Surface Area: " + surface);

// Volume: 1000
        double volume = side_a * side_b * side_c;
        System.out.println("Volume: " + volume);



    }
}
