package org.design.creational.prototyperegistry.student;

public class StudentClient {

    public static void main(String[] args) {
        // Create a registry for students
        IPrototypeRegistry registry = ProptoTypeRegistryImpl.getInstance();

        // Create a new student
        Student student1 = new Student("John Doe","door no 1-75A" ,"bharadwajreddy9@gmail.com","+918074220409", "Computer Science");
        registry.addPrototype("student", student1);

        // Clone the student
        Student clonedStudent = registry.getPrototype("student");

        IntelligentStudent intelligentStudent = new IntelligentStudent("John Doe","door no 1-75A" ,"bharadwajreddy9@gmail.com","+918074220409", "Computer Science",20);
        registry.addPrototype("intelligentStudent", intelligentStudent);
        System.out.println("Cloned Student: " + clonedStudent.toString());
        IntelligentStudent clonedIntelligentStudent = (IntelligentStudent) registry.getPrototype("intelligentStudent");
    }
}
