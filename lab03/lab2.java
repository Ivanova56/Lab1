package lab2;

public class lab2 {
    public static void main(String[] args){
        Animal animal1=new Animal(" ","Россия");
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.sleep());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.unSleep());
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println();
        Dog animal2=new Dog("Педигри","Россия", true);
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.sleep());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.unSleep());
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println("Собака знает команды?:" + animal2.isKnowCommands);
        System.out.println();
        Cat animal3=new Cat("Вискас","Россия", false);
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.sleep());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.unSleep());
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println("Кот приучен к лотку?:" + animal3.isKnowWhereWc);
        System.out.println();

        Horse animal4=new Horse("сено","Россия", "мустанг");
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.sleep());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.unSleep());
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println("Порода лошади:" + animal4.porod);
        System.out.println();
        Animal[] animals = {animal1, animal2, animal3, animal4};
        Veterinar.treatAnimal(animals);
    }
}

