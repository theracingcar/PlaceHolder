import java.util.HashMap;

/**
 * Created by Rory on 7/9/2017.
 */
public class Store {
    public String name;
    public String SID;
    public HashMap<String, Employee> employees;

    public Store(String name){
        this.name = name;
        this.employees = new HashMap<>();

    }

    public void print(){
        System.out.println("Store Name: " + name);
        System.out.println("Store ID: " + SID);
        System.out.println("Employees:");
        for(Employee i : employees.values()){
            i.print();
        }

    }
}
