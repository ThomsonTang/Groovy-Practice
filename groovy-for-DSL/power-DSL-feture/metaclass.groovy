class Customer {
    int id
    String firstName
    String lastName
    String street
    String city
}

def groovyMeta = Customer.metaClass

def javaMeta = String.metaClass
