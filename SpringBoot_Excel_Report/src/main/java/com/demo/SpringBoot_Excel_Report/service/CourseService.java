package com.demo.SpringBoot_Excel_Report.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBoot_Excel_Report.model.Course;
import com.demo.SpringBoot_Excel_Report.repository.CourseRepository;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public void generateExcel(HttpServletResponse httpServletResponse) throws IOException {
		
		List<Course> course= courseRepository.findAll();
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		HSSFSheet hssfSheet = hssfWorkbook.createSheet("Course Info");
		HSSFRow hssfRow = hssfSheet.createRow(0);
		
		hssfRow.createCell(0).setCellValue("Id");
		hssfRow.createCell(1).setCellValue("Name");
		hssfRow.createCell(2).setCellValue("Price");
		
		int dataRowIndex = 1;
		for(Course course1 : course) {
			HSSFRow dataRow = hssfSheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(course1.getCid());
			dataRow.createCell(1).setCellValue(course1.getCname());
			dataRow.createCell(2).setCellValue(course1.getPrice());
			
			dataRowIndex ++;
		}
		
		ServletOutputStream ops = httpServletResponse.getOutputStream();
		hssfWorkbook.write(ops);
		hssfWorkbook.close();
		ops.close();
		
		
	}
}
