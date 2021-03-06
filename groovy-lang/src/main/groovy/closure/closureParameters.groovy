package closure

def closureWithOneArgWithExplicitType = { String str -> str.toUpperCase() }
assert closureWithOneArgWithExplicitType('groovy') == 'GROOVY'

def closureWithTwoArgs = { a, b -> a + b }
assert closureWithTwoArgs(1, 2) == 3

def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a + b }
assert closureWithTwoArgsAndExplicitTypes(1, 2) == 3

def closureWithTwoArgsAndOptionalTypes = { a, int b -> a + b }
assert closureWithTwoArgsAndOptionalTypes(1, 2) == 3

def closureWithTwoArgsAndDefaultValue = { int a, int b = 2 -> a + b }
assert closureWithTwoArgsAndDefaultValue(1) == 3
