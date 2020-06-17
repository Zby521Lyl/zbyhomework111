package day03;

public class HomeWork {
    public static void main(String[] args){
        //print();
        //System.out.println("\r");
        //print1(7);
        sHMath(100);
    }

    private static void print1(int g) {
        //输出等腰三角形
        /*              *
                       ***
                      *****
                     *******
                    *********
        */
        for(int i = 1; i <= g;i++){
            for(int j = 1;j <= g-i;j++){
                System.out.print(" ");
            }
            for(int z = 1;z <= 2*i-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void print() {
        //输出九九乘法表
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+"*"+j+"="+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    //求100以内质数的和
    private static void sHMath(int n) {
        //求n以内质数之和
        //思路，先求2~n的和，然后判断是否是质数，和减去质数，算出n之内质数之和
        if(n <= 1){
            System.out.println("没有质数");
            return;
        }
        int sum = 0;
        for(int i = 2;i <= n;i++){
            sum += i;
        }
        for(int j = 3;j <= n;j++){
            for(int k = 2;k < j;k++){
                if(j%k == 0){
                    sum -= j;
                    k = j;
                }
            }
        }
        System.out.println(n+"以内的质数和为:"+sum);
    }

}
