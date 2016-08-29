def nodeBuilder = new groovy.util.NodeBuilder()

class Customer {
    int id
    String firstName
    String lastName
    String street
    String city
}

def thomsontang = new Customer(id:1001, firstName:"thomson", lastName:"tang", street:"beiyuanlu", city: "beijing")
def sweetlisa= new Customer(id:1002, firstName:"sweet", lastName:"lisa", street:"xizhimen", city: "beijing")
def clover = new Customer(id:1003, firstName:"zhu", lastName:"clover", street:"xizhimen", city: "beijing")
def hui = new Customer(id:1004, firstName:"Hui", lastName:"tang", street:"beiyuanlu", city: "beijing")

def customerList = [thomsontang, sweetlisa, clover, hui]

def customers = nodeBuilder.customers {
    for (cust in customerList) {
        customer(id:cust.id) {
            name(firstname:cust.firstName, lastname:cust.lastName)
            address(street:cust.street, city:cust.city)
        }
    }
}

assert customers.customer[0].'@id' == 1001
assert customers.customer[1].'@id' == 1002
assert customers.customer[0].name[0].'@firstname' == 'thomson'
assert customers.customer[1].address[0].'@street' == customers.customer[2].address[0].'@street'
assert customers.grep {
    it.address.any {it.'@city' == 'beijing'}
}.size == 4
assert customers.grep {
    it.name.any {it.'@lastname' == 'tang'}
}.address.every {it.'@street'[0] == 'beiyuanlu'}
