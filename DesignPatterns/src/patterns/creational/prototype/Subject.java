package patterns.creational.prototype;

public class Subject {
	String subjectName;
	int marks;
	public Subject(String subjectName, int marks) {
		this.marks=marks;
		this.subjectName=subjectName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "{ "+this.subjectName+":"+this.marks+"}";
	}
}
