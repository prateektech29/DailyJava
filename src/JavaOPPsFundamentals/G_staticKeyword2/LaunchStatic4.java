package JavaOPPsFundamentals.G_staticKeyword2;
class Alien
{
    static
    {
        System.out.println("Static Block1");
    }
    static
    {
        System.out.println("Static Block2");
    }


    {
        System.out.println("Non-Static block1");
    }


    {
        System.out.println("Non-Static block2");
    }

    public static void testing()
    {
        System.out.println("just a method to test class loading and execution of static blocks");
    }
}
public class LaunchStatic4 {
    public static void main(String[] args)
    {
        Alien.testing();
//        Alien alien = null;
//        alien.testing();

       Alien a1= new Alien();

          Alien a2=new Alien();


    }
}
