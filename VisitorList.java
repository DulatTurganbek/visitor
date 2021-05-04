package visitor;


import java.util.ArrayList;

public class VisitorList implements IVisitor{

    @Override
    public void VisitorForEmployee(Employee employee) {
        employee.Add(employee);
    }

    @Override
    public void VisitorForClerk(Clerk clerk) {
        clerk.Add(clerk);

    }
}
