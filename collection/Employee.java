public class Employee {

    int empid;
    String empname;
    float salary;

    public Employee(int empid, String empname, float salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    public Employee() {

    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
