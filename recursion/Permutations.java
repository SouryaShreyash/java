package recursion;

import java.util.ArrayList;

public class Permutations{
    static void main(String[] args) {
        System.out.println(permutation("","abc"));
    }
    public static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(permutation(first+ch+second,up.substring(1)));
        }
        return ans;
    }
}


