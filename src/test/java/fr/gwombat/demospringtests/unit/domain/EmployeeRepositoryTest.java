package fr.gwombat.demospringtests.unit.domain;

import fr.gwombat.demospringtests.domain.Employee;
import fr.gwombat.demospringtests.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private TestEntityManager  entityManager;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        final Employee employee = new Employee();
        employee.setName("John");
        entityManager.persist(employee);
        entityManager.flush();

        final Employee found = employeeRepository.findByName("John");

        assertNotNull(found);
        assertEquals(employee.getName(), found.getName());
    }
}
