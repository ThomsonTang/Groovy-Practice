package dsl.the_script_class

import groovy.transform.BaseScript
import org.codehaus.groovy.control.CompilerConfiguration

//1.自定义 script base class
def config = new CompilerConfiguration()
config.scriptBaseClass = 'MyBaseClass'
def shell = new GroovyShell(this.class.classLoader, config)
shell.evaluate """
setName 'Tom'
greet()
"""

//2.直接在脚本里使用@BaseScript注解
@BaseScript MyBaseClass basescript
setName 'Clover'
greet()

