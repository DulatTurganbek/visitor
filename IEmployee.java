package visitor;

import java.util.ArrayList;

public interface IEmployee {
    void PrintStructures();
    void Accept(IVisitor visitor);
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Clerk> clerks = new ArrayList<>();
}
