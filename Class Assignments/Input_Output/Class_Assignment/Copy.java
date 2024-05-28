package Class_Assignment;

import java.io.*;

public class Copy {
    public class Read_Write_From_File {
        public void readfile()throws IOException {
            try {
                FileReader fileReader = new FileReader("D:\\java2\\fileIO\\abc.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    System.out.println(string);
                }
                bufferedReader.close();

            } catch (IOException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void readfromfile(String filename)throws IOException {
        File file=new File(filename);
        if (file.exists()) {
            try {
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String string;
                while ((string=bufferedReader.readLine())!=null) {
                    System.out.println(string);
                }
                bufferedReader.close();

            } catch (IOException e) {
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("file not exisit");
        }
    }

    public void copypaste(String sourceString,String targetString) {
        File file=new File(targetString);
        File file2=new File(sourceString);
        if (file2.exists()) {
            try {
                FileReader fileReader=new FileReader(file2);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                FileWriter fileWriter=new FileWriter(file,true);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                String string = null,line;
                while ((line=bufferedReader.readLine())!=null) {
                    string=string+line;
                }
                bufferedWriter.write(string + " ");
                bufferedWriter.newLine();
                bufferedReader.close();
                bufferedWriter.close();
                System.out.println("copy successfull");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("file does not exist" +sourceString);
        }
    }
}
