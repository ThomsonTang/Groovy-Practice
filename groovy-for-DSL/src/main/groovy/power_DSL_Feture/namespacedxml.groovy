def xml = new groovy.xml.StreamingMarkupBuilder().bind {
    mkp.xmlDeclaration()
    mkp.declareNamespace('bk':'urn:loc.gov:books')
    mkp.declareNamespace('isbn':'urn:ISBN:0-21-34')

    println mkp.class

    bk.book {
        bk.title("Cheaper by Dozen")
        isbn.number(1234567)
    }
}

println xml
