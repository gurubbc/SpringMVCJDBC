package com.deloitte;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuruController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public String insertData(Employee employee)
	{
		if (employee!=null){
			employeeDAO.saveEmployee(employee);
		}
		return "Success"; // Success.jsp is rendred
		//return "redirect:/getEmployeeLitc";  
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView employee()
	{
		// viewname, modelname, modelobject
		return new ModelAndView("EmployeeForm"," ",new Employee());
	}
	
	@RequestMapping("/getEmployeeList")  
	 public ModelAndView getEmployeeLitc() {  
	  List<Employee> employeeList = employeeDAO.getEmployeeList();  
	  return new ModelAndView("ShowEmployee", "employeeList", employeeList);  
	 }  
	

}
