fun main(args: Array<String>) {

    println("Введите первое число:")
    val a = readLine().toString().toDouble()

    println("Введите второе число:")
    val b = readLine().toString().toDouble()

    val check = a > b
    println("Первое число больше второго? Ответ: $check")
}
