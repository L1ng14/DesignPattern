package com.designPattern.DesignPrincipal.singleResponsibility;

import java.io.*;

public class postive {

    public static StringBuilder loadFile(String fileLocation) throws IOException {

            //读取文件的内容
            Reader in = new FileReader("E:\\1.txt");
            BufferedReader bufferedReader = new BufferedReader(in);

            String line = null;
            StringBuilder sb = new StringBuilder("");

            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append(" ");
            }

            bufferedReader.close();
            return sb;
    }

    public static String[] getWords(String regex, StringBuilder sb){
        //对内容进行分割
        return  sb.toString().split(regex);
    }

    public static void main(String[] args) throws IOException {

            //读取文件的内容
            StringBuilder sb = loadFile("E:\\1.txt");

            //对内容进行分割
            String[] words = getWords("[^a-zA-Z]+", sb);

            System.out.println(words.length);
    }
}
