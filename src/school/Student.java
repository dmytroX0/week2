package school;

public class Student extends Person {
	private float GPA;

	public Student(String name, int age, float GPA) {
		super(name, age);
		this.GPA = GPA;
	}
	public float getGPA() {
        return GPA;
    }
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public void work() {
        System.out.println("Student work");
    }
    public String toString() {
        return "Student - name" + getName() +
                "Student - age" + getAge()+
                "Student - GPA" + getGPA();
    }
}
