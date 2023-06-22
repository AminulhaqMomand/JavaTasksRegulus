public class reverseString {
    public static void main(String[] args) {
        FrequncyOfEachChar("AAABBCDDD");
    }
    public static void FrequncyOfEachChar(String givenstring) {
      String str="abcd";
     String str2="";
        for (int i =str.length()-1 ; i >=0 ; i--) {
            str2+=str.charAt(i);
        }
        System.out.println("str2 = " + str2);
    }}