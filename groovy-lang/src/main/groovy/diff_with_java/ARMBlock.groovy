package diff_with_java

/**
 * Created by Intellij idea.
 * @author Thomson Tang
 */
class ARMBlock {
    public static void main(String[] args) {
        new File("/Users/ThomsonTang/Documents/test.txt").eachLine("UTF-8") {
            println it
        }

        new File("/Users/ThomsonTang/Github/Groovy-Practice/groovy-for-DSL/power_DSL_Feture/58hangzhou.xml").withReader("UTF-8") { reader ->
            reader.eachLine {
                println it
            }
        }
    }
}
