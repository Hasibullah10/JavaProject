package OOPSPROJECTS;

public class Project3 {
    /*
    Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
     */
    public static void main(String[] args) {
        String Text = "Madam";
        for (int i = Text.length() - 1; i >= 0; i--) {
            System.out.println(Text.charAt(i));
        }
    }
}
