class Clazz {
    void method() {
        println "Class method this is: " + this.class
    }

    void methodClosure() {
        def methodClosure = {
            println "Method closure this is: " + this.class
            assert owner == this
            assert delegate == this
        }
        methodClosure()
    }
}

def clazz = new Clazz()
clazz.method()

def closure = { self ->
    println "Closure this is: " + this.class
    assert this == owner
    assert delegate == this

    def closureClosure = {
        println "Closure closure this is: " + this.class
        assert owner == self
        assert delegate == self
    }
    assert closureClosure.delegate == self

    closureClosure()    
}

//closure.delegate = clazz
closure(closure)
clazz.methodClosure()

println this.class
