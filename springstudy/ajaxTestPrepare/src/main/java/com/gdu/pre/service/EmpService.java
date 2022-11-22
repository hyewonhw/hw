package com.gdu.pre.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface EmpService {
	public void findAllEmployees(HttpServletRequest request, Model model);
	public void findEmployees(HttpServletRequest request, Model model);
}
