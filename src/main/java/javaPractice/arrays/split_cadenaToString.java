package javaPractice.arrays;

import java.util.Arrays;

public class split_cadenaToString {
    public static void main(String[] args) {
        String s = "string of words";
        String[] strArr = s.split("\\s+");//Splitting using whitespace
        System.out.println("The String is: " + s);
        System.out.print("The String Array after splitting is: " + Arrays.toString(strArr));
    }
}
