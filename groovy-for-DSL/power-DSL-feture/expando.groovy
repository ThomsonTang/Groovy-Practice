def customer = new Expando()
assert customer.properties == [:]
assert customer.id == null

customer.id = 1001
customer.name = "thomsontang"
customer.street = "beiyuanlu"

assert customer.id == 1001
assert customer.properties == [id:1001, name:'thomsontang', street:'beiyuanlu']
customer.properties.each {
    println it
}

customer.prettyPrint = {
    println "the customer has following properties:"
    customer.properties.each {
        if (it.key != 'prettyPrint') {
            println " " + it.key + " : " + it.value
        }
    }
}
customer.prettyPrint()
