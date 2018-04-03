package fr.gwombat.demospringtests.service;


import fr.gwombat.demospringtests.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getById(Long id);

    Employee getByName(String name);

    Employee save(Employee employee);

    void delete(Employee employee);
}
