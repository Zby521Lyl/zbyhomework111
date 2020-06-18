package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
        public static void main(String[] args){
            //test();
            demo2();
            //demo1(demo());
        }

        private static void demo1(int[] num) {
            int j=0,k=0;
            int[] numJ = new int[8];
            int[] numO = new int[8];
            for(int i=0;i<num.length;i++){
                if(num[i]%2 == 0){
                    numO[j] = num[i];
                    j++;
                }else{
                    numJ[k] = num[i];
                    k++;
                }
            }
            numJ = Arrays.copyOf(numJ,k);
            numO = Arrays.copyOf(numO,j);
            System.out.println("奇数为:"+Arrays.toString(numJ)+",偶数为:"+Arrays.toString(numO));
            int[] num1 = new int[8];
            k = 0;
            j = 0;
            for(int i = 0;i<num1.length;i++){
                if(numJ.length == 8 || numO.length == 8){
                    System.out.println((numJ.length > numO.length ? Arrays.toString(numJ) : Arrays.toString(numO)));
                    break;
                }
                if(i%2 == 0 || j >= numJ.length || k >= numO.length) {
                    if (j < numJ.length) {
                        System.out.print(numJ[j] + "\t");
                        j++;
                    }
                    if( k < numO.length){
                        System.out.print(numO[k] + "\t");
                        k++;
                    }
                }else{
                    if( k < numO.length){
                        System.out.print(numO[k] + "\t");
                        k++;
                    }
                }
            }
        }

        private static void test() {
                int[][] arr = {{1,2,3,},{4,5,6}};
                for(int i = 0;i<arr.length;i++){
                    for(int j=0;j<arr[i].length;j++){
                        System.out.print(arr[i][j]+"\t");
                    }
                    System.out.println();
                }
            }

        private static int[] demo() {
                Scanner sc = new Scanner(System.in);
                int[] nums = new int[8];
                do{System.out.println("请输入8个整数数字");
                for(int i = 0;i < 8;i++){
                    nums[i] = sc.nextInt();
                }}while(false);
                //不会从键盘输出浮点变整数
                System.out.println(Arrays.toString(nums));
                return nums;
        }


        private static void  demo2() {
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            char[] chs = new char[5];
            char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            boolean[] booleans = new boolean[letters.length];
            for(int i = 0;i<chs.length;i++){
                int index = r.nextInt(26);
                do{
                    chs[i] = letters[index];
                }while(booleans[index]);
                booleans[index] = true;
            }
            /*for(int i = 0;i<chs.length;i++){
                chs[i] = letters[r.nextInt(26)];
            }*/
            //System.out.println(Arrays.toString(chs));
            System.out.println("请输入5个大写字母");
            String str = sc.next();
            str = str.toUpperCase();
            while(str.length() != 5){
                System.out.println("请重新输入，只能是5个哦");
                str = sc.next();
                str = str.toUpperCase();
            }
            System.out.println("随机五个大写字母是:"+Arrays.toString(chs));
            char[] chs1 = str.toCharArray();
            int [] nums = new int[2];
            for(int i = 0;i<chs.length;i++){
                for(int j=0;j<str.length();j++){
                    if(chs1[i] == chs[j]){
                        nums[0]++;
                        if(i == j){
                            nums[1]++;
                        }
                    }
                }
            }
            System.out.println("您输入的五个字母是:"+Arrays.toString(chs1));
            System.out.println("最终您猜对了"+nums[0]+"个"+",对了"+nums[1]+"个位置");
        }
    }
