package visitor;
public class Visitor implements IVisitor {
    @Override
    public void VisitorForEmployee(Employee employee) {
        employee.PrintStructures();
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 2 ? true : false;
        System.out.println("\t\t" + "Year of experience: "
                + employee.getYearsOfExperience() + " is eligible for increasing salary for 15% and vocation for 4 days?" + eligibleForPromotion);
        if(eligibleForPromotion == true){
            System.out.println("Increased salary is: " + (employee.getSalary() + employee.getSalary()*0.15) + "  and Vocation day is: " +
                    (employee.getVocationDays()+4));
        }
        else{
            System.out.println("Lack of experiance day :(");
        }
    }

    @Override
    public void VisitorForClerk(Clerk clerk) {
        clerk.PrintStructures();
        boolean eligibleForPromotion = clerk.getYearsOfExperience() > 2 ? true : false;
        System.out.println("\t\t" + "Year of experience: " + clerk.getYearsOfExperience()
                + " is eligible for increasing salary for 10% and vocation for 2 days?" + eligibleForPromotion);
        if(eligibleForPromotion == true){
            System.out.println("Increased salary is: " + (clerk.getSalary() + clerk.getSalary()*0.10) + "  and Vocation day is: " +
                    (clerk.getVocationDays()+2));
        }
        else{
            System.out.println("Lack of experiance day :(");
        }

    }
}
