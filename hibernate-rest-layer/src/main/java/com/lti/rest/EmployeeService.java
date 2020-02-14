package com.lti.rest;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lti.dao.EmployeeDao;
import com.lti.entity.Employee;

@Path("/emp")
public class EmployeeService {
	@POST
	public void add( Employee emp, @Context HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException, ParseException {
		response.setHeader("Access-Control-Allow-Origin:*", "http://localhost:4200");
		EmployeeDao empd =new EmployeeDao();
		System.out.println(emp.getName());
		empd.add(emp);
//		 response.setHeader("Access-Control-Allow-Methods", "POST");
//		 response.setHeader("Access-Control-Allow-Credentials", "true");
//		System.out.println(data);
		
//		ObjectMapper mapper = new ObjectMapper();
//		Employee emp=mapper.readValue(data, Employee.class);
//				EmployeeDao empd =new EmployeeDao();
//		System.out.println(emp.getName());
//		empd.add(emp);
//		JSONParser json =new JSONParser();
//		Object obj=  json.parse(data);
//		JSONObject jo =(JSONObject) obj;
//		Employee emp=new Employee();
////		double sal =  jo.get("salary");
////		System.out.println(sal);
//		emp.setName((String) jo.get("name"));
//		double d=Double.parseDouble((String) jo.get("salary"));
//		emp.setSalary(d);
//		LocalDate date = LocalDate.parse((String)jo.get("dateOfJoining"));
//		emp.setDateOfJoining(date);
//		System.out.println(d);
////		double sal = (Double) jo.get("salary");
////		emp.setSalary(sal);
//		
//		//System.out.println(sal);
//		//emp.setSalary((Integer) jo.get("salary"));
////		emp.setDateOfJoining((LocalDate)jo.get("dateOfJoining"));
////		System.out.println(emp.getName());
//		EmployeeDao empd =new EmployeeDao();
//		empd.add(emp);
		
		
		
	}
	

}
