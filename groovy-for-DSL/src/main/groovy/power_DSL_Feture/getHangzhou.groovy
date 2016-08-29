def builder = new groovy.xml.MarkupBuilder(new FileWriter("58hangzhou.xml")) // also can write to a file.
def hangzhou = new XmlSlurper().parse("hangzhou.xml")

def shangquanlist = builder.shangquanlist {
    hangzhou.Sq.each {
        shangquan(name: "${it.@cityName}${it.@areaName}${it.@name}")
    }
}

