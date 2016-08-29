package diff_with_java

/**
 * the client for package scope visibility
 * @author Thomson Tang
 */
class PackageScopeClient {
    public static void main(String[] args) {
        PackageScope packageScope = new PackageScope()
        packageScope.setName("package scope visibility")
        println packageScope.getName()

        packageScope.range = 10
        println packageScope.range
    }
}
