class Palindrome {

public static void main(String[] args) {
    String s = "Amy,	must	I	jujitsu	my	ma?";
    s = s.replace("," , "");
    s = s.replace("." , "");
    s = s.replace("?" , "");
    s = s.replace("!" , "");
    s = s.replace(" " , "");
    flipper(s);
}

public static void flipper(String sent) {
    StringBuilder sb = new StringBuilder(sent);
    if (sb.reverse().toString().equals(sent)) 
    System.out.print("palindrome");
    else 
    System.out.print("not palindrome");
}

}