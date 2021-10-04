package lab2;

public class Horse extends Animal{
    public Horse(String food, String location, String porod) {
        super(food, location);
        this.porod=porod;
        animalType="Лошадь";
    }
    String porod;
}
