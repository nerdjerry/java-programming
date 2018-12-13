package linkedlist;

public class EmployeeNode {

    Employee employee;
    EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getNext() {
        return this.next;
    }
}
