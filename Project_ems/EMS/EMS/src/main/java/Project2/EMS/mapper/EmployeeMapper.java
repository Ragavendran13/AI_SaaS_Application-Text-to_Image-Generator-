package Project2.EMS.mapper;

import Project2.EMS.dto.EmployeeDto;
import Project2.EMS.entity.Employee;

public class EmployeeMapper {

     public static EmployeeDto mapToEmployeeDto(Employee employee){
         return new EmployeeDto(
                 employee.getId(),
                 employee.getFirstName(),
                 employee.getLastName(),
                 employee.getEmail()
         );
     }

     public static Employee mapToEmployee(EmployeeDto employeeDto){
         return new Employee(
                 employeeDto.getId(),
                 employeeDto.getFirstName(),
                 employeeDto.getLastName(),
                 employeeDto.getEmail()
         );
     }
}
