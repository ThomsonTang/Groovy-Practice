/************************************************************************
 * Rules for resolving this, owner and delegate in the various contexts:
 *  1. In a class instance method, this is always the instance object,
 *     owner and delegate are not applicable and will be disallowed.
 *  2. In a class static method, this, owner, and delegate references
 *     will be disallowed by the compiler.
 *  3. In a closure defined within a script, this, owner, and delegate all
 *     refer to the Script object unless delegate has been reassigned.
 *  4. In a closure within a method, this and owner refer to the instance 
 *     object of the enclosing class; as will delegate, unless it has been
 *     reassigned to another object.
 *  5. In a script, this is the Script object, and owner and delegate are
 *     not applicable.
 *
 ***********************************************************************/
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
