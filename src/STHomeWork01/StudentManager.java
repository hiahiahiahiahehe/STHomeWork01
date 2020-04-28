package STHomeWork01;
import java.util.*;
import STHomeWork01.Student;


public class StudentManager {
	public static void app(List<Student> StudentList) {
		System.out.println("************************************************************");
		System.out.println("*                            1.插入                        *");
		System.out.println("*                            2.查找                        *");
		System.out.println("*                            3.删除                        *");
		System.out.println("*                            4.修改                        *");
		System.out.println("*                            5.输出                        *");
		System.out.println("*                            6.退出                        *");
		System.out.println("************************************************************");
		System.out.println("请选择操作：");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		//insert student
		case 1:

			System.out.println("请输入学生的学号：");
			Scanner Sid = new Scanner(System.in);
			String studentID = Sid.nextLine();
			boolean isfind1 = true;
			if(StudentList.size()==20) {
				System.out.println("学生人数已满，无法插入信息");
				isfind1 = false;
			}
			

			for(int i=0;i<StudentList.size();i++) {
				if(studentID.equals(StudentList.get(i).getStudentID())) {
					System.out.println("该学生信息已存在");
					isfind1 = false;
				}
			}
			
			if(isfind1)
			{
				System.out.println("请输入学生的姓名：");
				Scanner Sname = new Scanner(System.in);
				String studentName = Sname.nextLine();
				
				System.out.println("请输入学生的出生日期(例：2020-01-01)：");
				Scanner SbirDate = new Scanner(System.in);
				String studentBirDate = SbirDate.nextLine();
				
				System.out.println("请输入学生的性别(男/女)：");
				Scanner Sgender = new Scanner(System.in);
				String studentGender = Sgender.nextLine();
				
	            StudentList.add(new Student(studentID,studentName,studentBirDate,studentGender));
	            System.out.println("插入成功");
			}
			
			app(StudentList);
	        break;
            
        
        //check student
		case 2:
			System.out.println("请输入需要查询信息的学生学号：");
            Scanner chId = new Scanner(System.in);
            String checkID = chId.nextLine();
            boolean isfind2 = false;
            for(int i=0;i<StudentList.size();i++) {
            	if(checkID.equals(StudentList.get(i).getStudentID())) {
            		System.out.println("学号："+StudentList.get(i).getStudentID());
            		System.out.println("姓名："+StudentList.get(i).getName());
            		System.out.println("性别："+StudentList.get(i).getGender());
            		System.out.println("出生日期："+StudentList.get(i).getBirdate());
            		isfind2=true;
            	}
            }
            if(!isfind2) {
            	System.out.println("抱歉，无该学生信息");
            }
            
            app(StudentList);
			break;
    
        //delate student
		case 3:
            System.out.println("请输入需要删除信息的学生学号：");
            Scanner deID = new Scanner(System.in);
			String delateID = deID.nextLine();		
            boolean isfind3 = false;
			for(int i=0;i<StudentList.size();i++) {
				if(delateID.equals(StudentList.get(i).getStudentID())) {
					StudentList.remove(i);			
					System.out.println("删除成功");
					isfind3=true;
				}
			}
			if(!isfind3) {
            	System.out.println("抱歉，无该学生信息，无法删除");
            }
			
			app(StudentList);
			break;
		
		//update student
		case 4:
			System.out.println("请输入需要修改信息的学生学号：");
			Scanner upID = new Scanner(System.in);
			String updateID = upID.nextLine();
			boolean isfind4 = false;
			for(int i=0;i<StudentList.size();i++) {
				if(updateID.equals(StudentList.get(i).getStudentID())) {
					System.out.println("该学生原信息为：");
					System.out.println(StudentList.get(i).getStudentID()+"  "+StudentList.get(i).getName()+"  "+StudentList.get(i).getGender()+"  "+StudentList.get(i).getBirdate());
            		System.out.println("-------------------------------------------------------------");
            		System.out.println("修改该学生的学号为：");
        			Scanner Nid = new Scanner(System.in);
        			String newID = Nid.nextLine();
        			
        			System.out.println("修改该学生的姓名为：");
        			Scanner Nname = new Scanner(System.in);
        			String newName = Nid.nextLine();
        			
        			System.out.println("修改该学生的出生日期为(例：2020-01-01)：");
        			Scanner NbirDate = new Scanner(System.in);
        			String newBirDate = Nid.nextLine();
        			
        			System.out.println("修改该学生的性别为：");
        			Scanner Ngender = new Scanner(System.in);
        			String newGender = Nid.nextLine();
					
					StudentList.get(i).setID(newID);
					StudentList.get(i).setName(newName);
					StudentList.get(i).setBirDate(newBirDate);
					StudentList.get(i).setGender(newGender);
					
					System.out.println("修改成功");
					isfind4=true;
					System.out.println("-------------------------------------------------------------");
					System.out.println("修改后该学生的信息为：");
					System.out.println(StudentList.get(i).getStudentID()+"  "+StudentList.get(i).getName()+"  "+StudentList.get(i).getGender()+"  "+StudentList.get(i).getBirdate());

				}
			}
			if(!isfind4) {
            	System.out.println("抱歉，无该学生信息，无法修改");
            }
			
			app(StudentList);
			break;
		//check all students
		case 5:
			if(StudentList.size()>0) {
				for(int i=0;i<StudentList.size();i++) {
					System.out.println(StudentList.get(i).getStudentID()+"  "+StudentList.get(i).getName()+"  "+StudentList.get(i).getGender()+"  "+StudentList.get(i).getBirdate());
				}
			}
			else{System.out.println("暂无学生信息");}
			app(StudentList);
			break;
			
		case 6:
			app(StudentList);
			System.out.println("已退出");
			break;
		}
	}

}
