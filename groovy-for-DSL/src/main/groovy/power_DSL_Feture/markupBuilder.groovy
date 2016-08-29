/*************************************************************
  * MarkupBuilder
  * using the MarkupBuilder class from the groovy.xml package. 
  *
  ***********************************************************/
//def builder = new groovy.xml.MarkupBuilder()
def builder = new groovy.xml.MarkupBuilder(new FileWriter("customers.xml")) // also can write to a file.

def customers = builder.customers {
    customer(id: 1001) {
        name(firstName:"thomson", lastName:"tang")
        address(street:"Beiyuanlu", city:"Beijing")
    }
    customer(id: 1002) {
        name(firstName:"sweet", lastName:"lisa")
        address(street:"jishuitan", city:"Beijing")
    }
}

def html = new groovy.xml.MarkupBuilder()

html.html(lang:"en") {
    head {
        title "Groovy Builders"
    }
    body {
        h1 "Groovy Builders are cool!"
    }
}

