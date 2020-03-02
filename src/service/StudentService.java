package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;

public class StudentService {
	StudentDao dao=new StudentDao();
	//查询学生信息
		public List<Student> Query(){
			return dao.Query();  
		}
}
