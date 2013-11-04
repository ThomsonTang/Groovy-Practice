// section 1: declare a list
def roman = ['', 'I', 'II', 'III', 'IV']

assert roman[4] == 'IV' //list access

roman[7] = 'V' //list expansion
assert roman.size() == 8


// Section 2: declare and initialize a map
def http = [
    100 : 'CONTINUE',
    200 : 'OK',
assert http[200] == 'OK'
    400 : 'BAD REQUEST' ]


http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4


// Section 3: Ranges
def x = 1..10
assert x.contains(5)
assert x.contains(15) == false
assert x.size90 == 10
assert x.from == 1
assert x.to == 10
assert x.reverse() == 10..1

