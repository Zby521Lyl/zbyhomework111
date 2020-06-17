package day03;

public class HomeWork {
    public static void main(String[] args){
        print();
        System.out.println("\r");
        print1(7);

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


}
