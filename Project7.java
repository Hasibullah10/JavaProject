package OOPSPROJECTS;
/*
You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
 */

import java.util.ArrayList;

public class Project7 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hasib");
        words.add("Mesbah");
        words.add("Ali");
        words.add("Ahmad");
        words.add("Jan");
        words.add("Hanzala");


        for (String str : words) {
            if (str.startsWith("a")||str.startsWith("A")) {
                System.out.println(str.toLowerCase());
            }
        }
    }
}
