import java.util.*;

public static void main(String[] args) {
    String ch="bccacadfc";
    String ans=skip(ch);
    System.out.println(ans);
}

public static String skip(String up){
    if(up.isEmpty()){
        return "";
    }
    char ch = up.charAt(0);
    if(ch=='a'){
        return skip(up.substring(1));
    }
    return ch+skip(up.substring(1));
}