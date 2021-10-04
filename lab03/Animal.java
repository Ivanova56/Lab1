package lab2;

public class Animal {
    public Animal(String food, String location){
        this.food=food;
        this.location=location;
        animalType="Животное";
    }
    String food;
    String location;
    String animalType;

    public String makeNoise(){
    	
        if (isSleep) {
            return animalType + " спит";
        }
        else{
            return animalType +" издает разнообразные звуки";
        }
    }
    
    public String eat(){
    	
        if (isSleep) {
            return animalType + " спит";
        }
        else{
            return animalType + " ест " + food;
        }
    }
    
    public String sleep(){
        isSleep=true;
        return animalType + " спит";
    }
    
    public String unSleep(){
        isSleep=false;
        return animalType + " не спит";
    }
    boolean isSleep=false;


}

