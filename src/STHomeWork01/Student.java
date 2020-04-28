package STHomeWork01;

import java.util.Date;

import javax.swing.Spring;

public class Student {
	private String studentID;
	private String name;
	private String birDate;
	private String gender;
	
	public Student(String studentID, String name, String birDate, String studentGender) {
        this.studentID = studentID;
        this.name = name;
        this.birDate = birDate;
        this.gender = studentGender;
    }
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setID(String studentID) {
        this.studentID = studentID;
    }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
        this.name = name;
    }
	
	public String getBirdate() {
		return birDate;
	}
	
	public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
        this.gender = gender;
    }
	
	}
