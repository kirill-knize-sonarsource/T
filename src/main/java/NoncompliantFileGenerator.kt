import java.io.FileWriter

fun main() {
    generateFile("toolongname")
}

private fun generateFile(s: String) {
    val myWriter = FileWriter("MyClass.java")
    myWriter.write("class MyClass {")
    myWriter.write("\n")
    val funNames = generateAllNames(s)
    funNames.forEach { writeFun(myWriter, it) }
    myWriter.write("\n")
    myWriter.write("}")
    myWriter.close()
}

fun writeFun(writer: FileWriter, name: String) {
    writer.write("\n")
    writer.write("void $name() {}")
    writer.write("\n")
}

fun generateAllNames(name: String): Set<String> {
    val names = HashSet<String>()
    generateAllNames(name, 0, names)
    return names
}

fun generateAllNames(name: String, i: Int, names: HashSet<String>) {
    if (i >= name.length - 1) {
        names.add(name)
        return
    }
    val leftPart = name.substring(0, i)
    val rightPart = if (i < name.length) name.substring(i + 1) else ""
    val upperName: String = leftPart + name[i].toUpperCase() + rightPart
    val lowerName: String = leftPart + name[i] + rightPart
    generateAllNames(upperName, i + 1, names)
    generateAllNames(lowerName, i + 1, names)
}
