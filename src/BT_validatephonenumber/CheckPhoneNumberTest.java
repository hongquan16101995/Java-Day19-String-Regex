package BT_validatephonenumber;

import java.util.Scanner;

public class CheckPhoneNumberTest {
    public static void main(String[] args) {
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String regex = sc.nextLine();
        boolean isValid = checkPhoneNumber.validate(regex);
        System.out.println("Phone number: " + regex + " is valid " + isValid);
    }
}
