public class bitmanipulation {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;

        // get
        /*
         * if((bitmask & n)==0){
         * System.out.println("bit was zero");
         * }
         * else{
         * System.out.println("bit was one");
         * }
         * }
         */

        // set

        /*
         * int newnumber = bitmask | n;
         * System.out.println(newnumber);
         */

        // clear

        /*
         * int newbit=~(bitmask);
         * int newnumber=newbit & n;
         * System.out.println(newnumber);
         */
    }
}
