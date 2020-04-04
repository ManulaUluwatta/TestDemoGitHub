package scr;

public class MyClass {
    public int addNumber(int a, int b){
        return a+b;
    }
    public int calculateMaxValue(int x,int y,int z){
        int max=0;
        if(x>max){
            max=x;
        }
        if(y>max){
            max=y;
        }
        if (z>max){
            max=z;
        }
        return max;


    }
    public boolean findPrimeNumber(int a){
        int value=a;
        for(int i=1;i<=value;i++){
            int result=value%i;
            if(0<result)break;


        }
        return false;
    }
}
