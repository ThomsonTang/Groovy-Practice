class Customer {
    int id
    String name
}

class Account {
    int id
    double balance
    Customer owner

    void credit(double deposit) {
        balance += deposit
    }

    String toString() {
        return "Account id ${id} owner ${owner.name} balance is ${balance}"
    }
}

class AccountSample {

    public static void main(args) {
        def customer = new Customer(id: 100, name: "thomson")
        def savings = new Account(id: 001, balance: 10, owner: customer)

        savings.credit 20.00
        println savings
    }
}
