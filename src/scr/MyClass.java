package scr;

public class MyClass {
    public int addNumber(int a, int b){
        return a+b;
    }
    public void calculateMaxValue(int c[]) {
        int max=0;
            for (int i=0;i<5;i++){
                System.out.print(c[i]+" , ");
                if(max<c[i]){
                    max=c[i];
                }
            }

        System.out.println("\b \n");
        System.out.println("Max number is : "+max);

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
