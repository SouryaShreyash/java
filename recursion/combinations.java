package recursion;

import java.util.ArrayList;

public class combinations {
    public static ArrayList<String> combinations(String digits, String up){
      if(up.isEmpty()){
          ArrayList<String> list=new ArrayList<>();
          list.add(digits);
          return list;
      }
        ArrayList<String> ans=new ArrayList<>();
      int digit=up.charAt(0)-'0';
      for(int i=(digit-1)*3;i<digit*3;i++){
          char chToAdd=(char)('a'+i);
          ans.addAll(combinations(digits+chToAdd,up.substring(1)));
      }
      return ans;
    }

    static void main(String[] args) {
        System.out.println(combinations("","12"));
    }
}