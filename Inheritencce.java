public class Inheritencce {
    class Animal{

        String color;
        int leg;
    }

    /**
     * InnerInheritencce
     */
    class cow extends Animal{

    }

    public static void main(String[] args){
        Animal a = new Animal();
        Cow c = new Cow();

        a.color= "red";
        a.leg= 4;
        c.color = "black";
        c.leg = "8";
        System.out.println("is ");

    }
    
    
}
