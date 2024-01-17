package com.demo.SpringBoot_Excel_Report.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBoot_Excel_Report.service.CourseService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse httpServletResponse) throws IOException {
	
		httpServletResponse.setContentType("application/octent-stream");
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=Course.xls";
		httpServletResponse.addHeader(headerKey, headerValue);
		
		courseService.generateExcel(httpServletResponse);
	}
}
