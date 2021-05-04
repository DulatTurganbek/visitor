package visitor;
import java.util.ArrayList;
import java.util.List;

public class Employee implements IEmployee{
    ArrayList<Employee> employees = IEmployee.employees;
    private int VocationDays;
    private String name;
    private int salary;
    private int yearsOfExperience;

    public Employee(String name, int salary, int experience, int VocationDays) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = experience;
        this.VocationDays = VocationDays;

    }
    void Add(Employee employee){
        employees.add(employee);
    }

    public int getVocationDays() {
        return VocationDays;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void PrintStructures() {

        System.out.println("\t" + "Name: " + this.name + "  salary is: " +
                this.salary  + "   " + "Experience: " +
                this.yearsOfExperience + "years" + "  Vocation days: " + this.VocationDays);
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitorForEmployee(this);
    }
}