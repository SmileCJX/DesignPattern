package pers.caijx.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demeter1
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/5
 * @Version V1.0
 **/
public class Demeter1 {

    public static void main(String[] args) {

        // 使用迪米特法则的改进
        System.out.println("----使用迪米特法则的改进----");
        // 先创建一个SchoolMananger 对象
        SchoolManager schoolManager = new SchoolManager();
        // 输出学院的员工id 和 学校总部的员工信息
        schoolManager.printAllEmployer(new CollegeManager());

    }
}

// 学校总部员工类
class Employee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院的员工类
class CollegeEmployee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {

    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // 这里我们增加了10个员工到list
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id = " + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    // 输出学院员工的信息
    public void printEmployee() {
        // 获取到学院员工
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("---- 学院员工 ----");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

// 学校管理类
// 分析SchoolManager类的直接朋友有哪些 Employee 和 CollegeManager
// CollegeEmployee 不是直接朋友 而是一个陌生类，这样违背了迪米特法则
class SchoolManager {

    // 返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id = " + i);
            list.add(employee);
        }
        return list;
    }

    // 该方法完成输出学校总部和学院员工信息（id）
    public void printAllEmployer(CollegeManager sub) {

        // 分析问题
        // 1.将输出学院的员工方法，封装到CollegeManager
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("---- 学校总部员工 ----");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}


