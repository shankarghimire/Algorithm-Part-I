package week01.hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String str1 = StdIn.readString();
        String str2 = StdIn.readString();
        //if(! StdIn.isEmpty()){
            if(StdRandom.bernoulli(0.6)){
                StdOut.println(str1);
            }else{
                StdOut.println(str2);
            }
        //}

    }
}
