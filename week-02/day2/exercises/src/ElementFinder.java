import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSeven2(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
    public static String containsSeven (ArrayList<Integer> inputList){
        String out = "";
        if (inputList.contains(7)){
            out += "Hoorray";
        } else {
            out += "Noooo";
        }
        return out;
    }
    public static String containsSeven2(ArrayList inputList){
        int counter = 0;
        String out = "";
        for (int i = 0; i < inputList.size(); i++) {
           if (inputList.get(i).equals(7)) {
                counter += 0;
            }
            }
        if(counter == 0){
            out += "Noooo";
        } else {
            out += "Hooray";
        }
        return out;

    }

}
