package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/showEmployees")
	public String showEmployees(Model model) {
		List<Employee> emps = employeeDao.getAllEmployees();
		model.addAttribute("emps", emps);
		return "show_employees";
	}
	
	
}
