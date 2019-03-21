object Acronym {
    fun generate(phrase: String) =
            phrase.split(Regex("""[^\w]+""")).map { it[0].toUpperCase() }.joinToString("")
}
fun main(args: Array<String>){
    val result=Acronym.generate("Three Letter Acronyms")
    print(result)
}