package teng.spring04webrestful.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import teng.spring04webrestful.dao.DepartmentDao;
import teng.spring04webrestful.dao.EmployeeDao;
import teng.spring04webrestful.entities.Department;
import teng.spring04webrestful.entities.Employee;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    // 返回员工列表
    @GetMapping(path = "/employees")
    public String getAllEmployee(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("employees", employees);
        return "employee/list";
    }

    // 返回员工添加页面
    @GetMapping(path = "/employee")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "employee/add";
    }

    // 添加新员工
    @PostMapping(path = "/employee")
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        // 转发到employees
        // redirect和forward的区别
        return "redirect:/employees";
    }

    // 根据id查出员工信息，来到员工修改页面
    @GetMapping(path = "/employee/{id}")
    public String toEditPage(@PathVariable(name = "id") Integer id,
                             Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        return "employee/add";
    }

    // 修改员工信息
    @PutMapping(path = "/employee")
    public String updateEmployee(Employee employee) {
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/employees";
    }

    // 删除员工
    @DeleteMapping(path = "/employee/{id}")
    public String deleteEmployee(@PathVariable(name="id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employees";
    }
}
