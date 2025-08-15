package recursion;

public class dice {
    static void main(String[] args) {
        newdice("",4);
    }

    public static void newdice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            newdice(p+i,target-i);
        }
    }
}