package lab01;

public class Main {
    public static void main(String args[]){
        Student student1 = new Student("Синявина", "Наташа","1521" ,4.15);
        Aspirant aspirant1 = new Aspirant ("Романов", "Николай", "1421", 4.80,"work01");
        Student aspirant2 = new Aspirant ("Веденеева", "Юлия", "1621", 5.00,"work02");
        Student[] students = {student1, aspirant1, aspirant2};
        for (Student s:students){
            System.out.println(s.getScholarship());
        }
    }
}
