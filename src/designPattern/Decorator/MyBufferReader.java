package com.designPattern.Decorator;

import java.io.*;

public class MyBufferReader extends Reader {

    private Reader in;

    public MyBufferReader(Reader in){
        this.in = in;
    }

    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int read;

        while(true){
            read = in.read();
            if (read == '\r')
                continue;
            if (read == '\n' || read == -1){
                break;
            }
            sb.append((char)read);
        }
        if (sb.toString().length() == 0){
            if (read == '\n'){
                return "";
            }else {
                return null;
            }
        }else {
            return sb.toString();
        }
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {
        in.close();
    }


    /*===================客户端===========================*/
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("E:\\1.txt");
        MyBufferReader myBufferReader = new MyBufferReader(in);
      //  BufferedReader br = new BufferedReader(myBufferReader);   可以层层进行套娃包装

        String line;
        while(( line = myBufferReader.readLine() ) != null){
            System.out.println(line);
        }

    }
}
