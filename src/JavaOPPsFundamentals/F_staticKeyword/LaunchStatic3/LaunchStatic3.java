package JavaOPPsFundamentals.F_staticKeyword.LaunchStatic3;

public class LaunchStatic3 {

    public static void main(String[] args) {

        Student st1 = new Student(1, "Rohan", "Bengaluru");
        System.out.println("no of objects created  : " + Student.count);

        Student st2 = new Student(2, "Rohit", "Mumbai");
        System.out.println("no of objects created  : " + Student.count);


        Student st3 = new Student(3, "Ramesh", "Chennai");
        System.out.println("no of objects created  : " + Student.count);

        Student st4 =new Student();
        System.out.println("no of objects created  : " + Student.count);

        Student st5 =new Student();
        System.out.println("no of objects created  : " + Student.count);

        Student st6 =new Student();
        System.out.println("no of objects created  : " + Student.count);
    }

}
