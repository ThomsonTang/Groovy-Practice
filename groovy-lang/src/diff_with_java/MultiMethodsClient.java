package diff_with_java;

/**
 * Created by Intellij idea.
 *
 * @author Thomson Tang
 */
public class MultiMethodsClient {

    static int method(String arg) {
        return 1;
    }

    static int method(Object arg) {
        return 2;
    }

    public static void main(String[] args) {
        Object obj = "test";
        int result = method(obj);
        assert 1 == result;
        assert 2 == result;
    }
}
