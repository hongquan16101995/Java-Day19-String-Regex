package BT_validateclassname;

import java.util.Scanner;

public class CheckClassNameTest {
    public static void main(String[] args) {
        CheckClassName checkClassName = new CheckClassName();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class name: ");
        String regex = sc.nextLine();
        boolean isValid = checkClassName.validate(regex);
        System.out.println("Class name: " + regex + " is valid " + isValid);
    }
}
