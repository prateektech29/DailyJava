package JavaOPPsFundamentals.F_staticKeyword.LaunchStatic3;

public class Student {
    int id;
    String name;
    String city;

    static int count;



    {
//        System.out.println("Java Initialization block called");
        count++;
    }

    Student()
    {
        System.out.println("Zero param constructor called");

    }

    Student(int id, String name, String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
        System.out.println("Parameterized constructor called");

    }
}
/*Java’s instance initializer block usecase*/