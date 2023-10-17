package ex04;

class Animal
{
    void cry(){};
}

class Bird extends Animal{
    @Override
    void cry()
    {
        System.out.println("Quirk");
    }
}

class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("Bark");
    }
}
public class MethodOverriding
{
    public static void main(String[] args) {
        Animal aa = new Animal();
        aa.cry();
        Bird bb = new Bird();
        bb.cry();
        Cat cc = new  Cat();
        cc.cry();
        Dog dd = new Dog();
        dd.cry();

        // If you want to manage 3 objects in one LIST
        // Compiler UP-CASTS to Animal Class
        Animal[] animals = {(Animal)bb,(Animal)cc,(Animal)dd};

        // Pick out every objects using EACH-FOR
        for(Animal animal : animals)
        {
            animal.cry();
        }
    }
}
