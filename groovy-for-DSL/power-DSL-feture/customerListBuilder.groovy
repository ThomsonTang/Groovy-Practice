def builder = new groovy.xml.MarkupBuilder()

class Customer {
    int id
    String firstName
    String lastName
    String street
    String city
}

def thomsontang = new Customer(id:1001, firstName:"thomson", lastName:"tang", street:"beiyuanlu", city: "beijing")
def sweetlisa= new Customer(id:1002, firstName:"sweet", lastName:"lisa", street:"xizhimen", city: "beijing")

def customerList = [thomsontang, sweetlisa]

def customers = builder.customers {
    for (cust in customerList) {
        customer(id:cust.id) {
            name(firstname:cust.firstName, lastname:cust.lastName)
            address(street:cust.street, city:cust.city)
        }
    }
}
