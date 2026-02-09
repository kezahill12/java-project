public class AnimalHierarchyWithaBirdClass{
    public static void main(String[] args){

        Animal dog = new Dog("Bob", "Bark");
        Animal cat = new Cat("Kitty" , "Meow");
        Animal bird = new Birds("Parrot", "Chirp");

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

class Animal{
    
    private String name;
    private String sound;

    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name +" makes " + sound);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }
}

class Dog extends Animal{

    public Dog(String name, String sound){
        super(name,sound);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog " + getName() + " says: " + getSound());
    }
}

class Cat extends Animal{

    public Cat(String name, String sound){
        super(name,sound);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat " + getName() + " says: " + getSound());
    }
}

class Birds extends Animal{

    public Birds(String name, String sound){
        super(name,sound);
    }

    public String fly(){
        return " and is flying";
    }

    @Override
    public void makeSound(){
        System.out.println("Bird " + getName() +
                           " says: " + getSound() + fly());
    }
}
