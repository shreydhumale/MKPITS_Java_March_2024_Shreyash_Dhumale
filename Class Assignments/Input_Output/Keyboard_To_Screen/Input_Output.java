package Keyboard_To_Screen;

import java.io.*;

public class Input_Output {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name: ");
        String name = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt",true));
        bufferedWriter.write(name+"/n");
        bufferedWriter.close();
    }
}
