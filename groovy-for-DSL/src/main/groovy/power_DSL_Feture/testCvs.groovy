class AnjukeLocal {
    String id
    String cityId
    String localName
    String parentId
    String anjukeId
}

class CSVParser {
    static def parseCSV(file, closure) {
        def lineCount = 0
        file.eachLine() { line ->
            def field = line.tokenize(",")
            lineCount++
            closure(lineCount, field)
        }
    }
}

def ajkBuilder = new groovy.xml.MarkupBuilder(new FileWriter("ajkhangzhou.xml"))

def anjukeInfoList = []

use(CSVParser.class) {
    File file = new File("hangzhou.csv")
    file.parseCSV { index, field ->
        def anjukeInfo = new AnjukeLocal(id: "${field[0]}", cityId: "${field[1]}", localName: "${field[2]}", parentId: "${field[3]}", anjukeId: "${field[4]}")
        anjukeInfoList.add(anjukeInfo)
    }
}

def hangzhou = new XmlSlurper().parse("hangzhou.xml")

for (AnjukeLocal anjukeLocal in anjukeInfoList) {
    hangzhou.Sq.each {
        if ("${it.@name}".equals(anjukeLocal.localName)) {
            println anjukeLocal.localName + "||" + "${it.@name}" + "||" + "${it.@id}" + "||" + anjukeLocal.anjukeId
        }
    }
}
