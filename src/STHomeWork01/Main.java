package STHomeWork01;

import java.util.LinkedList;
import java.util.List;

public class Main {
	static List<Student> StudentList = new LinkedList<Student>();
	public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        StudentManager.app(StudentList);
    }
}
