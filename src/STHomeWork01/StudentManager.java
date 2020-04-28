package STHomeWork01;
import java.util.*;
import STHomeWork01.Student;


public class StudentManager {
	public static void app(List<Student> StudentList) {
		System.out.println("************************************************************");
		System.out.println("*                            1.����                        *");
		System.out.println("*                            2.����                        *");
		System.out.println("*                            3.ɾ��                        *");
		System.out.println("*                            4.�޸�                        *");
		System.out.println("*                            5.���                        *");
		System.out.println("*                            6.�˳�                        *");
		System.out.println("************************************************************");
		System.out.println("��ѡ�������");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		//insert student
		case 1:

			System.out.println("������ѧ����ѧ�ţ�");
			Scanner Sid = new Scanner(System.in);
			String studentID = Sid.nextLine();
			boolean isfind1 = true;
			if(StudentList.size()==20) {
				System.out.println("ѧ�������������޷�������Ϣ");
				isfind1 = false;
			}
			

			for(int i=0;i<StudentList.size();i++) {
				if(studentID.equals(StudentList.get(i).getStudentID())) {
					System.out.println("��ѧ����Ϣ�Ѵ���");
					isfind1 = false;
				}
			}
			
			if(isfind1)
			{
				System.out.println("������ѧ����������");
				Scanner Sname = new Scanner(System.in);
				String studentName = Sname.nextLine();
				
				System.out.println("������ѧ���ĳ�������(����2020-01-01)��");
				Scanner SbirDate = new Scanner(System.in);
				String studentBirDate = SbirDate.nextLine();
				
				System.out.println("������ѧ�����Ա�(��/Ů)��");
				Scanner Sgender = new Scanner(System.in);
				String studentGender = Sgender.nextLine();
				
	            StudentList.add(new Student(studentID,studentName,studentBirDate,studentGender));
	            System.out.println("����ɹ�");
			}
			
			app(StudentList);
	        break;
            
        
        //check student
		case 2:
			System.out.println("��������Ҫ��ѯ��Ϣ��ѧ��ѧ�ţ�");
            Scanner chId = new Scanner(System.in);
            String checkID = chId.nextLine();
            boolean isfind2 = false;
            for(int i=0;i<StudentList.size();i++) {
            	if(checkID.equals(StudentList.get(i).getStudentID())) {
            		System.out.println("ѧ�ţ�"+StudentList.get(i).getStudentID());
            		System.out.println("������"+StudentList.get(i).getName());
            		System.out.println("�Ա�"+StudentList.get(i).getGender());
            		System.out.println("�������ڣ�"+StudentList.get(i).getBirdate());
            		isfind2=true;
            	}
            }
            if(!isfind2) {
            	System.out.println("��Ǹ���޸�ѧ����Ϣ");
            }
            
            app(StudentList);
			break;
    
        //delate student
		case 3:
            System.out.println("��������Ҫɾ����Ϣ��ѧ��ѧ�ţ�");
            Scanner deID = new Scanner(System.in);
			String delateID = deID.nextLine();		
            boolean isfind3 = false;
			for(int i=0;i<StudentList.size();i++) {
				if(delateID.equals(StudentList.get(i).getStudentID())) {
					StudentList.remove(i);			
					System.out.println("ɾ���ɹ�");
					isfind3=true;
				}
			}
			if(!isfind3) {
            	System.out.println("��Ǹ���޸�ѧ����Ϣ���޷�ɾ��");
            }
			
			app(StudentList);
			break;
		
		//update student
		case 4:
			System.out.println("��������Ҫ�޸���Ϣ��ѧ��ѧ�ţ�");
			Scanner upID = new Scanner(System.in);
			String updateID = upID.nextLine();
			boolean isfind4 = false;
			for(int i=0;i<StudentList.size();i++) {
				if(updateID.equals(StudentList.get(i).getStudentID())) {
					System.out.println("��ѧ��ԭ��ϢΪ��");
					System.out.println(StudentList.get(i).getStudentID()+"  "+StudentList.get(i).getName()+"  "+StudentList.get(i).getGender()+"  "+StudentList.get(i).getBirdate());
            		System.out.println("-------------------------------------------------------------");
            		System.out.println("�޸ĸ�ѧ����ѧ��Ϊ��");
        			Scanner Nid = new Scanner(System.in);
        			String newID = Nid.nextLine();
        			
        			System.out.println("�޸ĸ�ѧ��������Ϊ��");
        			Scanner Nname = new Scanner(System.in);
        			String newName = Nid.nextLine();
        			
        			System.out.println("�޸ĸ�ѧ���ĳ�������Ϊ(����2020-01-01)��");
        			Scanner NbirDate = new Scanner(System.in);
        			String newBirDate = Nid.nextLine();
        			
        			System.out.println("�޸ĸ�ѧ�����Ա�Ϊ��");
        			Scanner Ngender = new Scanner(System.in);
        			String newGender = Nid.nextLine();
					
					StudentList.get(i).setID(newID);
					StudentList.get(i).setName(newName);
					StudentList.get(i).setBirDate(newBirDate);
					StudentList.get(i).setGender(newGender);
					
					System.out.println("�޸ĳɹ�");
					isfind4=true;
					System.out.println("-------------------------------------------------------------");
					System.out.println("�޸ĺ��ѧ������ϢΪ��");
					System.out.println(StudentList.get(i).getStudentID()+"  "+StudentList.get(i).getName()+"  "+StudentList.get(i).getGender()+"  "+StudentList.get(i).getBirdate());

				}
			}
			if(!isfind4) {
            	System.out.println("��Ǹ���޸�ѧ����Ϣ���޷��޸�");
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
			else{System.out.println("����ѧ����Ϣ");}
			app(StudentList);
			break;
			
		case 6:
			app(StudentList);
			System.out.println("���˳�");
			break;
		}
	}

}
