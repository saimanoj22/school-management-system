package schoolManagement;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned = 0;
    
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void receiveSalary(int salary){
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + '}';
    }
    
    
}
