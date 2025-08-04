import java.util.*;

public static void main(String[] args) {
  String ch="bccapple";
 String ans=skip(ch);
    System.out.println(ans);
}

public static String skip(String up){
      if(up.isEmpty()) {
          return "";
      }
     if(up.startsWith("apple")){
         return skip(up.substring(5));
     }
     return up.charAt(0)+skip(up.substring(1));
}