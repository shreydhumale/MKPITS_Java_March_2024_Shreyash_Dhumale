package stud;
public class Student {
   String name;
    int marks;
    float fees;

    public Student(String name, int marks, float fees) {
        this.name = "Shreyash";
        this.marks = 80;
        this.fees = 5000;
    }





//
//    public void displayStudent() {
//        System.out.println("\nname:" + name + "\nmarks:" + marks + "\nfees:" + fees);
//    }

            //    public void setName(String name) {
//        this.name=name;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
        public String getName(){
            return name;
            }
        public int getMarks(){
            return marks;
            }
        public float getFees(){
            return fees;
        }


}
