package Keyboard_To_Screen;

import java.io.*;

public class Keyboard  {
   // public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
//        BufferedWriter bufferedWriter;
//        String name,choice;
//        bufferedWriter = new BufferedWriter(new FileWriter("abc.txt", true));
//        do {
//            System.out.println("Enter Name: ");
//            name = bufferedReader.readLine();
//            bufferedWriter.write(name + "\n");
//            System.out.println("do you want to add another name : ");
//            choice =bufferedReader.readLine();
//        }while (choice.equalsIgnoreCase("y"));
//        bufferedWriter.close();

    public static void fromStudent(Student student) throws IOException {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("abc.txt"));
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
    }
        public static Student readFromFile() throws IOException, ClassNotFoundException {
            //read from file
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.txt"));
            Student student=(Student) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(student);
            return student;
//            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//            objectOutputStream.writeObject(fromStudent(new Student("yash",80)));
//            bufferedReader.readLine();
//            return new Student("shreyash",80);
        }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student student=new Student("Shreyash",80);
//        Keyboard.fromStudent(student);
        Student student=Keyboard.readFromFile();
        student.displayDetails();
    }
    }
