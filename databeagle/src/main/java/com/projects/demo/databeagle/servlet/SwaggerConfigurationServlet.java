package com.projects.demo.databeagle.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfigurationServlet extends HttpServlet 
{
    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	super.init(config);
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setSchemes(new String[] {"http"});
        beanConfig.setHost("localhost:8080");
		beanConfig.setBasePath("/databeagle/rest");
        beanConfig.setResourcePackage("com.projects.demo");
        beanConfig.setTitle("DataBeagle Swagger Documentation");
		beanConfig.setVersion("1.0");
        beanConfig.setScan(true);
		beanConfig.setPrettyPrint(true);
    }
}