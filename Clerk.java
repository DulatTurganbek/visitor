package visitor;

import java.util.ArrayList;

public class Clerk implements IEmployee {
    ArrayList<Clerk> clerks = IEmployee.clerks;
    private int VocationDays;
    private String name;
    private int salary;
    private int yearsOfExperience;
    public Clerk(String name, int salary, int experience, int VocationDays) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = experience;
        this.VocationDays = VocationDays;
    }
    public void PrintStructures() {
        System.out.println("\t" +" Name: " + this.name + "  Salary is: "
                + this.salary +"  "+ "Experience : "
                + this.yearsOfExperience + "years" + "  Vocation days: " + this.VocationDays);
    }

    void Add(Clerk clerk){
        clerks.add(clerk);
    }

    public String getName() {
        return name;
    }

    public int getVocationDays() {
        return VocationDays;
    }

    public int getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitorForClerk(this);
    }
}
