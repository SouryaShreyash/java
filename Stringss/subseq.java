package Stringss;

import java.util.ArrayList;

public class subseq{
    static void main() {
        subseq("","abc");
//      ArrayList<String> ans=subSeqRet("","abc");
//      System.out.println(ans);
    }

    public static void subseq(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    public static ArrayList<String> subSeqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right=subSeqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void subseqASCII(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subseqASCII(p+ch,up.substring(1));
        subseqASCII(p,up.substring(1));
        subseqASCII(p+(ch+0),up.substring(1));
    }

}