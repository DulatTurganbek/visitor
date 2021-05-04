package visitor;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<IEmployee> allEmployee = new ArrayList<>();
        IVisitor aVisitor = new Visitor();
        IVisitor lVisitor = new VisitorList();

        //Employees
        Employee employee1 = new Employee("Dulat",90000, 3, 17);
        Employee employee2 = new Employee("Batyr",90000, 1,17);

        //Clerks
        Clerk clerk1 = new Clerk("Aziz",65000, 3,21);
        Clerk clerk2 = new Clerk("Arman",65000, 1,21);

        allEmployee.add(employee1);
        allEmployee.add(employee2);
        allEmployee.add(clerk1);
        allEmployee.add(clerk2);


        for (IEmployee e:allEmployee
             ) {
            e.Accept(aVisitor);
        }
        for (IEmployee e:allEmployee
        ) {
            e.Accept(lVisitor);

        }
        System.out.println(" ");
        System.out.println("List of employee: ");
        for (Employee e:employee1.employees
             ) {
            System.out.println(e.getName());
        }
        System.out.println(" ");
        System.out.println("List of clerks: ");
        for (Clerk c:clerk1.clerks
             ) {
            System.out.println(c.getName());
        }

    }
}
