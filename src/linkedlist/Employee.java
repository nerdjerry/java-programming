package linkedlist;

public class Employee {

    private String firstname;
    private String lastname;
    private int id;

    public Employee(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }

    public boolean equals(Object employee) {
        if (employee == this) {
            return true;
        }
        if (!(employee instanceof Employee)) {
            return false;
        }
        Employee otherEmployee = (Employee) employee;
        return this.firstname == otherEmployee.getFirstname() &&
                this.lastname == otherEmployee.getLastname() &&
                this.id == otherEmployee.getId();
    }
}
