import java.util.ArrayList;

public class CustomerList {
    private static ArrayList<Customer> customers = new ArrayList<>();

    public void AddCustomer(String first_name, String last_name, String password, String username, int account_number, int customer_id) {

        customers.add(new Customer(first_name,last_name,password, username, account_number, customer_id));
    }


    public int GetCustomerCount() {
        return customers.size();
    }

    public String GetUsername(int customer_id) {
        return customers.get(customer_id-1).getUsername();
    }

    public String GetPassword(int customer_id) {
        return customers.get(customer_id-1).getPassword();
    }

    public int GetAccountNumber(int customer_id) {
        return customers.get(customer_id-1).getAccountNumber();
    }

    public int GetCustomerID(int customer_id) {
        return customers.get(customer_id-1).getCustomerID();
    }
    public void showCustomers() {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}
