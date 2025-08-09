import sys.EmpManager;

public class Program {
    public static void main(String[] args) {
        Employee w1 = new Worker("Piet", "Pompies", "Accountant", 1234.56f, 2f);
        Employee c1 = new Contractor("John", "Doe", "Plumber", 39.8f);
        Employee l1 = new Labourer("Adam", "Anderson", "Welder", 876.54f);

        System.out.println("Number of Employees created: " + EmpManager._count);
        System.out.println(w1);
        System.out.println(c1);
        System.out.println(l1);
    }
}