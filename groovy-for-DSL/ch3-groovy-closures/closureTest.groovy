def closureMethodString(String s, Closure c) {
    println "Greet someone"
    c.call(s)
}

closureMethodString("TGK") { it ->
    println "Hello, ${it}"
}

def greet = { greeting, name -> println greeting + "," + name }
greet "HI", "LISA"
