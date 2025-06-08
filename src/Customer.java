public class Customer {
    String firstName;
    String lastName;
    private String password;
    int accountNumber;
    String username;
    int customerID;

    public Customer(String firstName, String lastName, String password, String username, int accountNumber, int customerID) {
        this.username=username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.accountNumber = accountNumber;
        this.customerID = customerID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
    return "Number of customer: " + customerID + "\nName: " + firstName + " " + lastName + " \nAccount number: " + accountNumber + " \nUsername: " + username;
    }
}
