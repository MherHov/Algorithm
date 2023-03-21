package main.java;

public class ImNotLeftOut {

    public  void recursion(int n, int m){

        if(n<1){
            return;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(" ես դուրս չեմ մնացել ");
        }
        recursion(n-1,m);
    }
}
