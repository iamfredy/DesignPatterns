package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class MarklistWithShallowCloning implements Cloneable{
	private String studentName;	
	public List<Subject> subjects;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	public MarklistWithShallowCloning(String studentName) {
		this.studentName=studentName;
		this.subjects=new ArrayList<>();
		//Loading data-In realworld scenario, this might be populated via DB query
		for(int i=0;i<3;i++) {
			this.subjects.add(new Subject("Subject"+i,100-i));
		}
	}

	public MarklistWithShallowCloning() {
		this.subjects=new ArrayList<>();
	}

	@Override 
	public String toString(){
		return "Student Name: "+this.studentName+" [Subjects: "+this.subjects+" ]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
