package lab01;

public class Aspirant extends Student {
	String work;

	public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
		super(firstName, lastName, group, avgMark);
		this.work = work;
	}
	
	@Override
    int getScholarship(){
        return (this.avgMark==5) ? 200:180;
    }
	

}
