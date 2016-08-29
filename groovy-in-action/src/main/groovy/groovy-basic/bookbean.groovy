class Book {
    String title
}

def groovyBook = new Book()

groovyBook.setTitle('Groovy world')
assert groovyBook.getTitle() == 'Groovy world'

groovyBook.title = 'Groovy in action'
assert groovyBook.title == 'Groovy in action'
