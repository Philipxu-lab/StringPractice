class stuff {
 public static void main(String []args) {
String str = "XXsdocXjknXXKiohXXX";
String ans = str;

while (ans.charAt(0) == 'X') {
  ans = ans.substring(1);   
}

while (ans.charAt(ans.length()-1) == 'X') {    
ans = ans.substring (0, ans.length()-1);
}
System.out.print(ans);
}
}