package diff_with_java

/**
 * Differences with java.
 * Java is static language, the methods which will be invoked are chosen at compile time, based on declared type. In groovy, however, the methods which will be invoked are chosen at runtime, it is dynamic language.
 *
 * @author Thomson Tang
 */
class MultiMethods {
    static int method(String arg) {
        return 1
    }

    static int method(Object arg) {
        return 2
    }

    public static void main(String[] args) {
        Object obj = "object"
        int result = method(obj)
        assert 1 == result
//        assert 2 == result
    }
}
