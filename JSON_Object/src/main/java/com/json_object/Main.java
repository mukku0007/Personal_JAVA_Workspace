package com.json_object;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Main {
	
		public static void main(String[] args) {
			
			Student stu1 = new Student("Mukesh","9758985487","Noida", 101L);
			Student stu2 = new Student("Mukesh","9758985487","Noida", 101L);
			
			List<Student> list = new ArrayList<Student>();
			list.add(stu1);
			list.add(stu2);
			
			Gson gson = new Gson();
			
			String str1 = gson.toJson(stu1);
			System.out.println(str1);
			
			String str2 = gson.toJson(stu2);
			System.out.println(str2);
		}
}
