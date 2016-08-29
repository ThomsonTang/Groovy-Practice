package power_DSL_Feture
/**
  * we can create Category classes that add methods to an existing class.
  * To create a Category class, we define a class containing static methods that take an instance
  * of class that we want to extend as their first parameter. By convention, we named this parameter
  * as self.
  * The Category can then be applied to any closure by using the use keyword.
  *
  */
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

class CustomerPrinter {
    static void prettyPrint(Customer self) {
        println "Customer has following properties:"
        self.properties.each {
            if (it.key != 'prettyPrint') 
                println " " + it.key + ":" + it.value
        }
    }
}

use (CustomerPrinter) {
    for (customer in customerList) {
        customer.prettyPrint()
    }
}

