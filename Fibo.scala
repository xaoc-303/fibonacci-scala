object Fibo {
    def main(args: Array[String]):Unit = {
        val f: String = args(0)
        val n: Int = Integer.parseInt(args(1))

        println(start(f, n))
    }

    def time[R](callback_function: => R): R = {
        val start = System.nanoTime()
        val result = callback_function
        val stop = System.nanoTime()

        println(f"${(stop - start).toFloat / 1000000000}%.8f")

        result
    }

    def start(f: String, n: Int): Long = {
        if (f == "f1") {
            return time {f1(n)}
        }

        if (f == "f2") {
            return time {f2(n)}
        }

        0
    }

    def f1(n: Int): Long = {
        if (n == 0) {
            return 0
        }

        if (n == 1) {
            return 1
        }

        f1(n-1) + f1(n-2)
    }

    def f2(n: Int): Long = {
        var a: Long = 0
        var b: Long = 1

        for (i <- 2 to n) {
            val next = a + b
            a = b
            b = next
        }

        b
    }
}
