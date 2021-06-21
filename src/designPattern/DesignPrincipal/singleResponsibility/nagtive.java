package com.designPattern.DesignPrincipal.singleResponsibility;

import java.io.*;

public class nagtive {
    public static void main(String[] args) {
        try{
            //读取文件的内容
            Reader in = new FileReader("E:\\1.txt");
            BufferedReader bufferedReader = new BufferedReader(in);

            String line = null;
            StringBuilder sb = new StringBuilder("");

            while((line =bufferedReader.readLine()) != null){
                sb.append(line);
                sb.append(" ");
            }

            //对内容进行分割
            String[] words = sb.toString().split("[^a-zA-Z]+");
            System.out.println(words.length);

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
