import java.util.Scanner;

class PPAP {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String input = "";
     
     System.out.println("Format: 'I have a <obj>, I have a <obj>' ");
     
     input = scan.nextLine();
     
     make(input);
     
     
    }
    
    public static void make(String a) {
        String word1 = "";
        String word2 = "";
        
        word1 = a.substring(9, a.indexOf(","));
        word2 = a.substring(a.indexOf(",") + 11, a.length());
        
       System.out.println("UH! " + word2 + " " + word1);  
    }
}