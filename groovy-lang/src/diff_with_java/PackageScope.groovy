package diff_with_java

/**
 * Package Scope Visibility.
 *
 * In Groovy, omitting a modifier on a field doesn't result in a package-private field like in java.
 * @author Thomson Tang
 */
class PackageScope {
    String name
    // To create a package-private filed
    @groovy.transform.PackageScope int range
}
