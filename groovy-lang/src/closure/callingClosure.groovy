package closure

def code = { 123 }
assert code() == 123
assert code.call() == 123
