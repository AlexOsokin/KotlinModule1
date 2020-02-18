fun main(args: Array<String>){

    val five: Char = '5'

    print("""${five.toString()} - string
        |${five.toByte()} - byte
        |${five.toShort()} - short
        |${five.toInt()} - int
        |${five.toDouble()} - double
        |${five.toFloat()} - float
        |${five.toLong()} - long""".trimMargin())
}