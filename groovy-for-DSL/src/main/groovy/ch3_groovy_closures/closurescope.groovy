class MyClass {
    def member = "original"

    def method(String param) {
        def local = member

        return {
            println "Member: " + member +
            ", Local: " + local +
            ", Param: " + param
        }
    }
}

MyClass myClazz = new MyClass()
def closure1 = myClazz.method("First")
closure1()
myClazz.member = "modified"
def closure2 = myClazz.method("Second")
closure2()
closure1()
