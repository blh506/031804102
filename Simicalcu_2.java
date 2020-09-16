package xsd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Simicalcu_2{
    public static String Similar(String f1,String f2) throws IOException {
        String str1="";
        File file1=new File(f1);
        FileInputStream in1= null;
        in1 = new FileInputStream(file1);
        // size  为字串的长度 ，这里一次性读完
        int size1=in1.available();
        byte[] buffer1=new byte[size1];
        in1.read(buffer1);
        in1.close();
        str1=new String(buffer1,"utf8");

        String str2="";
        File file2=new File(f2);
        FileInputStream in2=new FileInputStream(file2);
        // size  为字串的长度 ，这里一次性读完
        int size2=in2.available();
        byte[] buffer2=new byte[size2];
        in2.read(buffer2);
        in2.close();
        str2=new String(buffer2,"utf8");

        double result = Computeclass.SimilarDegree(str1, str2);
        return Computeclass.similarityResult(result);
    }
    public static void main(String[] args) throws IOException{
       // Scanner scan1=new Scanner(System.in);
        //String f1 = scan1.nextLine();
        //String[] str = f1.trim().split(" ");
        //Scanner scan2=new Scanner(System.in);
        //String f2 = scan1.nextLine();
        System.out.println(Similar(args[0],args[1]));
    }
}
