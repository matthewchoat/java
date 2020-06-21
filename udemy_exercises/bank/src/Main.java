package src;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Frost Bank");

        if(bank.addBranch("Lewisville")) {
            System.out.println("Lewisville branch created");
        }

        if(bank.addBranch("Dallas")) {
            System.out.println("Dallas branch created");
        }

        if(bank.addBranch("San Marcos")) {
            System.out.println("San Marcos branch created");
        }

        bank.addCustomer("Lewisville", "Matt C", 104.56);
        bank.addCustomer("Lewisville", "Hannah C", 342.85);
        bank.addCustomer("Lewisville", "Boris R", 172.30);

        bank.addBranch("Dallas");
        bank.addCustomer("Dallas", "Chris D", 1003.42);

        bank.addCustomerTransaction("Lewisville", "Matt C", 14.57);
        bank.addCustomerTransaction("Lewisville", "Matt C", 46.24);
        bank.addCustomerTransaction("Lewisville", "Hannah C", 68.95);

        bank.listCustomers("Lewisville", true);
        bank.listCustomers("Dallas", true);

        bank.addBranch("San Marcos");

        if(!bank.addCustomer("San Marcos", "Sarah B", 5236.32)) {
            System.out.println("Error San Marcos branch does not exist");
        }

        if(!bank.addBranch("Lewisville")) {
            System.out.println("Lewisville branch already exists");
        }

        if(!bank.addBranch("Dallas")) {
            System.out.println("Dallas branch already exists");
        }

        if(!bank.addBranch("San Marcos")) {
            System.out.println("San Marcos branch already exists");
        }

        if(!bank.addCustomerTransaction("Lewisville", "Micah", 23.76)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Lewisville", "Matt C", 24.52)) {
            System.out.println("Customer Matt C already exists");
        }


















    }
}
