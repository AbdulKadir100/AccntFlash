import java.io.*;
class CharTest{
   public static void main(String args[]) throws IOException{
     char ch;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true){
       System.out.println("Enter a character: ");
       ch = (char)br.read();     
        System.out.println("You Entered : ");
        if(Character.isDigit(ch))
        System.out.println("a Digit: ");
        else System.out.println(Character.isUpperCase(ch));
} 

  }
}