package groovy_basic

Book gina = new Book("Groovy in action")

assert gina.getTitle() == 'Groovy in action'
assert getTitleBackwards(gina) == 'noitca ni yvoorG'


String getTitleBackwards(book) {
    title = book.getTitle()
    return title.reverse()
}
