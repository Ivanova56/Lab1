package lab01;

public class Student {
	String firstName, lastName, group;
	double avgMark;
	
	public Student(String firstName, String lastName, String group, double avgMark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.avgMark = avgMark;
	}

	int getScholarship(){
        if (this.avgMark==5){
            return 100;
        }
        else{
            return 80;
        }
	
	}
	
}
