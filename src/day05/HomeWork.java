package day05;

import java.io.*;

public class HomeWork {
    public static void main(String[] args) throws Exception{
        //demo();
        //demo1();
        //demo2();
        demo3();
    }

    //利用字符缓冲流
    private static void demo3() throws Exception{
        InputStreamReader is = new InputStreamReader(new FileInputStream("G:\\io\\d.txt"));
        BufferedReader br = new BufferedReader(is);
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\io\\i.txt"));
        BufferedWriter bw = new BufferedWriter(osw);
        String s;
        char[] chars = new char[1024];
        while((s = br.readLine())!=null){
            bw.write(s);
        }
        bw.flush();
        bw.close();
        br.close();
    }

    //利用字符类
    private static void demo2() throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\io\\d.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\io\\h.txt"));
        char[] chars = new char[1024];
        int len = 0;
        while((len = isr.read(chars))!=-1){
            osw.write(chars);
        }
        osw.flush();//初学者要加上flush要知道他也有缓冲区
        osw.close();
        isr.close();
    }

    //利用缓冲字节流
    private static void demo1() throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\io\\d.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\io\\g.txt"));
        int len;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes);
        }
        bos.flush();//初学还是写着flush
        bos.close();
        bis.close();
    }

    //利用字节流
    private static void demo() throws Exception{
        InputStream is = new FileInputStream("G:\\io\\d.txt");
        OutputStream os = new FileOutputStream("G:\\io\\f.txt");
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len=is.read(bytes))!=-1){
            os.write(bytes);
        }
        is.close();
        os.close();
    }

}
