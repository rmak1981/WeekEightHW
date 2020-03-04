package TwentyNineFebPackage;
// method will create new email

import java.util.Random;

public class NewEmailMethod {
    //private String result ;
    public static void main(String[] args) {
        NewEmailMethod obj =new NewEmailMethod();
        // object created to call the string type method in static method
        obj.myNewEmail();
        System.out.println(obj.myNewEmail());
    }
    private String myNewEmail(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        String email = "ravee."+ c  + "@gmail.com";
        // string type data and random character to create new eamil within a to z
        //System.out.println(email);
        return email;
        // returning result as a new email every time with a to z character
    }

}