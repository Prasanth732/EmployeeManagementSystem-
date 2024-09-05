


class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id,String name, double salary) {
        this.id=id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("ID "+id+"\n"+"Name "+name+"\n"+"Salary "+salary);
    }
}

class Manager extends Employee{
    private String department;
    public Manager(int id,String name, double salary,String department){
        super(id,name,salary);
        this.department=department;
    }
}

class Developer extends Employee{
    private String role;
    public Developer(int id,String name, double salary,String role){
        super(id,name,salary);
        this.role=role;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Developer d=new Developer(202,"prasanth",200002.0,"software");
        d.display();
        
    }
}
