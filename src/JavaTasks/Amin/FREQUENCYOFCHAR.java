

import java.lang.reflect.Array;
import java.util.*;

public class FREQUENCYOFCHAR {
    public static void main(String[] args) {
        FrequncyOfEachChar("AAABBCDD");
    }
    public static void FrequncyOfEachChar(String givenstring) {
        String output[] = new String[givenstring.length()];

        for (int a = 0; a < givenstring.length(); a++) {
            int frequency = 0;
            for (int i = 0; i < givenstring.length(); i++) {
                if (givenstring.charAt(a) == givenstring.charAt(i)) {
                    frequency++;
                }
            }
            output[a] = givenstring.charAt(a) + "" + frequency;
        }
        TreeSet<String> lis=new TreeSet<>(Arrays.asList(output));
        System.out.println(lis);
    }}