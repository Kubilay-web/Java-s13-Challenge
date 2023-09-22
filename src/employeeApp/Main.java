package employeeApp;

import java.util.Arrays;

enum Plan {
    BASIC, SILVER, GOLD;
}

class Healthplan {
    private int id;
    private String name;
    private Plan plan;
    private double price;

    public Healthplan(int id, String name, Plan plan, double price) {
        this.id = id;
        this.name = name;
        this.plan = plan;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Healthplan [id=" + id + ", name=" + name + ", plan=" + plan + ", price=" + price + "]";
    }
}

class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[3]; // Assuming there can be at most 3 healthplans for an employee
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Invalid index");
            return;
        }

        if (healthplans[index] == null) {
            healthplans[index] = name;
        } else {
            System.out.println("Index is already occupied");
        }
    }


    public String toString() {
        return "Employee [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
                + ", healthplans=" + Arrays.toString(healthplans) + "]";
    }
}

class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro) {
        this.id = id;
        this.name = name;
        if (giro < 0) {
            System.out.println("Invalid giro value");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.developerNames = new String[10]; // Assuming there can be at most 10 developers in the company
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Index is already occupied");
        }
    }


    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", giro=" + giro + ", developerNames="
                + Arrays.toString(developerNames) + "]";
    }
}

public class Main {

    private static void workWithData() {
        // Create instances of Healthplan, Employee, and Company
        Healthplan healthplan1 = new Healthplan(1, "Basic Plan", Plan.BASIC, 100.0);
        Healthplan healthplan2 = new Healthplan(2, "Silver Plan", Plan.SILVER, 200.0);
        Employee employee1 = new Employee(1, "John Doe", "john@example.com", "password123");
        Company company1 = new Company(1, "ABC Inc.", 10000.0);

        // Add healthplans to the employee
        employee1.addHealthplan(0, "Basic Plan");
        employee1.addHealthplan(1, "Silver Plan");

        // Add employees to the company
        company1.addEmployee(0, "Alice");
        company1.addEmployee(1, "Bob");

        // Print the objects using their toString() methods
        System.out.println(healthplan1);
        System.out.println(healthplan2);
        System.out.println(employee1);
        System.out.println(company1);
    }

    public static void main(String[] args) {
        workWithData();
    }
}
