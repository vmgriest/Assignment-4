public class Animal {
    public int age;
    public String gender;

    public void isMammal(){
        System.out.println("This is a public method IsMammal() from class Animal");
    }
    public void mate(){
        System.out.println("This is public method mate() from class Animal");
    }
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
    }

}
