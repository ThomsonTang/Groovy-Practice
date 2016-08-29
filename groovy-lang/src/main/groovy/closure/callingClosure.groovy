package closure

def code = { 123 }
assert code() == 12
assert code.call() == 123
