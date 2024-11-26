package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student();
        student.setRoll(20);
        student.setCollege("SKNCOE");
        student.setCourse("JAVA");
        student.setName("Nikhil");

        System.out.println(student);

        ObjectMapper mapper = new ObjectMapper();
        String obj = mapper.writeValueAsString(student);
        System.out.println(obj);
    }
}
