package closure

def cl = { name.toUpperCase() }

class Person {
    String name
}
Person p = new Person(name: 'tom')
cl.delegate = p
assert cl() == 'TOM'
