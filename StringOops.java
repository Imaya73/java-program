class Employee {
    int salary = 50000; // field

    void display() {
        System.out.println("Employee display method");
    }
}

public class StringOops {
    public static void main(String[] args) {

        Employee obj = new Employee();
        Employee obj1 = new Employee();

        System.out.println(obj.salary);
        obj.display();

        System.out.println(obj1.salary);
        obj1.display();

        // StringBuilder -> mutable , non-synchronized
        StringBuilder sb = new StringBuilder("Academy");

        sb.append("FIIT");
        sb.insert(7, " ");
        sb.delete(0, 7);

        System.out.println(sb);

        // StringBuffer -> mutable , synchronized
        StringBuffer sf = new StringBuffer("Coursee");

        sf.append("FIIT");
        sf.insert(7, " ");
        sf.delete(0, 7);

        System.out.println(sf);
    }
}