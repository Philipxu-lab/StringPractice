import java.util.Scanner;

class pigLatin {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     //String word = scan.nextLine();
     String word = "i love strarcraft";
     int i = 0;
     String ans = "";
     while (i < word.length()) {
         i = 0;
         String chunk = "";
         if (word.charAt(i) == ' ') { 
         chunk = word.substring(0, i);
         word = word.substring(i+1);
         piggy(chunk);
        }
        i++;
        }
    }
    
    public static void piggy(String pig) {
     if (pig.length() < 2) System.out.print(pig);
     pig = pig.substring(1) + pig.charAt(0) + "ay";
     System.out.print(pig);
    }
}