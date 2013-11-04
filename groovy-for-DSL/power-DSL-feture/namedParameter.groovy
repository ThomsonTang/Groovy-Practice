def namedParamsMethod(params) {
    assert params.a == 1
    assert params.b == 2
    assert params.c == 3
}

namedParamsMethod(a:1, b:2, c:3)
