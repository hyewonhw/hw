package com.gdu.pre.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpDTO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private DeptDTO deptDTO;
	private double salary;
}