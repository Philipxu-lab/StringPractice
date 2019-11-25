import java.util.Scanner;

class Converter {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     
     convert(n);
     
     
     
    }
    
    public static void convert(int num) {
     
        int q = num;
        String bin = "";
        
        while (q != 0) {
         if (q % 2 == 0) {
             bin += "0";
            } else {
                bin += "1";
            }
            q /= 2;
        }
        
        StringBuilder newbin = new StringBuilder(bin);
    
        System.out.print(newbin.reverse());
    }
}