package ch3_groovy_closures

class Greeter {
    def seperator = ', '

    def greeting(name) {
        def salutation = "hello"

        def greeter = { println "${salutation}${seperator}${name}" }
        greeter()
    }
}

Greeter greeter = new Greeter()
greeter.greeting("TGK")
