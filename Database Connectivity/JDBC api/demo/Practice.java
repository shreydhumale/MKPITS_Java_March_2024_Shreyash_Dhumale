package com.demo;

import java.util.Random;

import com.dao.StudentDao3;
import com.model.Student;

public class Practice {
    public static void main(String[] args) {
        StudentDao3 sd = new StudentDao3();
        String[] city = {"Amravati", "Pune", "Nagpur", "Hyderabad", "Banglore", "Chennai", "Delhi"};
        Random random = new Random();

        for (int i = 1; i <= 1000; i++) {
            Student s = new Student();
            StringBuilder name = new StringBuilder();

            for (int j = 0; j < 10; j++) {
            	 name.append((char) (random.nextInt(26) + 65));
            }
            s.setSname(name.toString());
            s.setScity(city[random.nextInt(city.length)]);  
            s.setSpercentage(random.nextDouble() * 100);
            System.out.println(sd.insertStudent(s));
        }
    }
}
