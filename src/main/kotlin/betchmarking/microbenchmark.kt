package betchmarking
/*
Author abdallahGaliya-31-05-2024-TZ

Benchmark is the process of measure the performance of system
- The type of BenchMark
micro-benchmark
macro-benchmark
meso-benchmark
* */
class microbenchmark {
    //this is used to measure which method have performed better than other
    public inline fun measureTimeinMills(block:() -> Unit) : Long{
        val start  = System.currentTimeMillis()
        block()
        return System.currentTimeMillis() - start

        //at the first glance this approach give us and idea what going on inside block()
        //if we perform several experiment this  approach is wrong

    }

    public fun testMethod() {

    }
}