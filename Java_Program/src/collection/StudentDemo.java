package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDemo {

	public static void main(String[] args) {
		
		List<Student>student = new ArrayList<Student>();
		student.add(new Student(1,"Mukesh Kumar",25));
		student.add(new Student(2,"Rakesh Kumar",26));
		
		Map<Integer,String> stu = new HashMap<Integer,String>();
		for(Student newStudent : student)
		{
			stu.put(newStudent.getId(),newStudent.getName());
		}
		
		System.out.println(stu);
	}
}
