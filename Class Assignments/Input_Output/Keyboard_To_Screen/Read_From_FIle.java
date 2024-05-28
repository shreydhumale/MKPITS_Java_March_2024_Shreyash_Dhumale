package Keyboard_To_Screen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_From_FIle {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name: ");
        Scanner sc=new Scanner(System.in);
        String fileName=sc.next();
        System.out.println(fileName);
        BufferedReader bufferedReader=new BufferedReader(new FileReader("abc.txt"));
        String name=bufferedReader.readLine();
        while (name != null) {
            System.out.println(name);
            name=bufferedReader.readLine();
        }
    }
}
