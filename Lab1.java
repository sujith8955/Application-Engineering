import java.util.ArrayList;

public class Lab1{
    public static void main(String[] args) {

        // Part 1: Arrays
        int[] x = {3, 6, 9, 1, 4};
        int[] y = {8, 4, 3, 2, 5};
        
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Part 2: ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Sujith");
        names.add("Reddy");
        names.add("India");
        names.add("Northeastern");
        names.add("Hello");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            char firstLetter = Character.toLowerCase(name.charAt(0));
            char lastLetter = Character.toUpperCase(name.charAt(name.length() - 1));
            String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
            switchedNames.add(switchedName);
        }

       
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i] + ",");
        }
        System.out.println(" }");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(" " + y[i] + ",");
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(" " + z[i] + ",");
        }
        System.out.println(" }");

       
        System.out.print("Names = {");
        for (String name : names) {
            System.out.print(" " + name + ",");
        }
        System.out.println(" }");

        System.out.print("Names (switched) = {");
        for (String switchedName : switchedNames) {
            System.out.print(" " + switchedName + ",");
        }
        System.out.println(" }");

    }
    
}
