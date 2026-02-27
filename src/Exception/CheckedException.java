package Exception;

import java.io.IOException;
/*
  java.io.IOException->fully qualified className
 * for checked exceptions we always use try- catch block
 * the'throws' keyword doesn't handle the exception
        * it only passes on the information to colling method
 * the colling method has to handle the exception using try-catch
        * the'throws' keyword is written in the method signature(name)
 */

public class CheckedException {

    static void readFile()throws IOException{
        throw new IOException("File not Found");
    }
public static void main(String[] args) {


    try {
        display();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}
static void display() throws IOException {
    readFile();
}
    }

