// section 1: declare a list
def roman = ['', 'I', 'II', 'III', 'IV']

assert roman[4] == 'IV' //list access

roman[7] = 'V' //list expansion
assert roman.size() == 8


// Section 2: declare and initialize a map
def http = [
    100 : 'CONTINUE',
    200 : 'OK',
    400 : 'BAD REQUEST' ]

assert http[200] == 'OK'

http[500] = 'INTERNAL SERVER ERROR'
assert http.size() == 4
