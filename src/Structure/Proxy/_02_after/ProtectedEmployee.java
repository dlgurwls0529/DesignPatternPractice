package Structure.Proxy._02_after;

public class ProtectedEmployee implements Employee {

    private Employee employee;

    public ProtectedEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public GRADE getGrade() {
        return employee.getGrade();
    }

    @Override
    public String getInformation(Employee viewer) {
        if (this.employee.getGrade() == viewer.getGrade()
                && this.employee.getName().equals(viewer.getName())) {
            return this.employee.getInformation(viewer);
        }

        switch (viewer.getGrade()) {
            case VicePresident:
                if (this.employee.getGrade() == GRADE.Manager || this.employee.getGrade()
                    == GRADE.Staff) {
                    return this.employee.getInformation(viewer);
                }

            case Manager:
                if(this.employee.getGrade() == GRADE.Staff) {
                    return this.employee.getInformation(viewer);
                }

            case Staff:

            default:
                return null;
        }
    }
}
