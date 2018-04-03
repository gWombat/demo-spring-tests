package fr.gwombat.demospringtests.service.impl;

import fr.gwombat.demospringtests.domain.Employee;
import fr.gwombat.demospringtests.repository.EmployeeRepository;
import fr.gwombat.demospringtests.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(final Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee getByName(final String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public Employee save(final Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(final Employee employee) {
        employeeRepository.delete(employee);
    }
}
