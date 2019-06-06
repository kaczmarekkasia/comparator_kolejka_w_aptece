import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(25, false, "Ania");
        Customer c2 = new Customer(80, false, "Marek");
        Customer c3 = new Customer(25, true, "Ania");
        Customer c4 = new Customer(70, false, "Olaf");
        Customer c5 = new Customer(35, true, "Magda");

        List<Customer> customers = new ArrayList<Customer> (Arrays.asList(c1, c2, c3, c4, c5));

        Apteka apteka1 = new Apteka (customers);

        System.out.println(apteka1);

        Collections.sort(customers, new ComparatorCustomer());

        System.out.println(apteka1);
    }
}
