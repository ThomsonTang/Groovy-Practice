package dsl.the_script_class

/**
 * Created by Intellij idea.
 * @author Thomson Tang
 */
abstract class MyBaseClass extends Script {
    String name

    public void greet() { println "hello, $name!" }
}
