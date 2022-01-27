package converter

fun main() {
    do {
        print("Do you want to convert /from decimal or /to decimal? (To quit type /exit) > ")
        var x = readLine()!!
        if (x == "/from") {
            print("Enter number in decimal system: > ")
            var a = readLine()!!.uppercase().toInt()
            print("Enter target base: > ")
            val b = readLine()!!.toInt()
            print("Conversion result: ")
            var result = ""
            if (b == 2) {
                while (a > 0) {
                    val num: String = (a % 2).toString()
                    result = num + result
                    a /= 2
                }
                println(result)
                println(" ")
            }
            if (b == 8) {
                while (a > 0) {
                    val num: String = (a % 8).toString()
                    result = num + result
                    a /= 8
                }
                println(result)
                println(" ")
            }
            if (b == 16) {
                while (a > 0) {
                    var num2 = (a % 16).toString()
                    if (num2 == "10") { num2 = "A" }
                    else if (num2 == "11") { num2 = "B" }
                    else if (num2 == "12") { num2 = "C" }
                    else if (num2 == "13") { num2 = "D" }
                    else if (num2 == "14") { num2 = "E" }
                    else if (num2 == "15") { num2 = "F" }
                    else (a % 16).toString()
                    result = num2 + result
                    a /= 16
                }
                println(result)
                println(" ")
            }
        }
        if (x == "/to") {
            print("Enter source number: > ")
            var y = readLine()!!.uppercase()
            print("Enter source base: > ")
            var z = readLine()!!.toInt()
            print("Conversion to decimal result: ")
            var resultTo = 0
            var num = 1
            var sum: Int
            var list = mutableListOf<String>()
            for (i in 0 until y.length) list.add(y[i].toString())
            if (z == 2) {
                var m = y.toInt()
                while (m > 0) {
                    var mod = m % 10
                    m /= 10
                    sum = mod * num
                    resultTo += sum
                    num *= 2
                }
                println(resultTo)
                println(" ")
            }
            if (z == 8) {
                var m = y.toInt()
                while (m > 0) {
                    var mod = m % 10
                    m /= 10
                    sum = mod * num
                    resultTo += sum
                    num *= 8
                }
                println(resultTo)
                println(" ")
            }
            if (z == 16) {
                if (list.indexOf("A") >= 0) {
                    val aa = list.indexOf("A")
                    list.add(aa, "10")
                    list.removeAt(aa + 1)
                    }
                if (list.indexOf("B") >= 0) {
                    val bb = list.indexOf("B")
                    list.add(bb, "11")
                    list.removeAt(bb + 1)
                    }
                if (list.indexOf("C") >= 0) {
                    val cc = list.indexOf("C")
                    list.add(cc, "12")
                    list.removeAt(cc + 1)
                }
                    if (list.indexOf("D") >= 0) {
                    val dd = list.indexOf("D")
                    list.add(dd, "13")
                    list.removeAt(dd + 1)
                }
                if (list.indexOf("E") >= 0) {
                    val ee = list.indexOf("E")
                    list.add(ee, "14")
                    list.removeAt(ee + 1)
                }
                if (list.indexOf("F") >= 0) {
                    val ff = list.indexOf("F")
                    list.add(ff, "15")
                    list.removeAt(ff + 1)
                }
            }
            for (i in list.size - 1 downTo 0) {
                sum = list[i].toInt() * num
                resultTo += sum
                num *= 16
            }
            println(resultTo)
            println(" ")
        }
        if (x == "/exit")
            break
    } while (true)
}



