class Customer {
    int id
    String firstName
    String lastName
    String street
    String city

    Object invokeMethod(String name, Object args) {
        if (name == "prettyPrint") {
            println "Customer has following properties: "
            this.properties.each {
                println " " + it.key + ": " + it.value
            }
        }
    }
}

def thomsontang = new Customer(id:1001, firstName:"thomson", lastName:"tang", street:"beiyuanlu", city: "beijing")
def sweetlisa= new Customer(id:1002, firstName:"sweet", lastName:"lisa", street:"xizhimen", city: "beijing")

def customerList = [thomsontang, sweetlisa]

customerList.each {
    it.prettyPrint()
}
