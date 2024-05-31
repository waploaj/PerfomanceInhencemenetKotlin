package bottlenecks

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader
import java.lang.Exception

class resource {
    //Resource leaks in this code we are acquire the resource but not released
    fun readFirstLine() : String{
        val fileInputStream  = FileInputStream("input.txt")
        val inputStremReader  = InputStreamReader(fileInputStream)
        val bufferedReader = BufferedReader(inputStremReader)
        return bufferedReader.readLine()
    }

    //below is when we are use the resource and close it successful

    fun readFirstLines() : String?{
        var fileInputStream: FileInputStream? =  null
        var inputStreamReader : InputStreamReader? = null
        var bufferedReader : BufferedReader? = null
        return try {
            fileInputStream = FileInputStream("input.txt")
            inputStreamReader = InputStreamReader(fileInputStream)
            bufferedReader = BufferedReader(inputStreamReader)
            bufferedReader.readLine()
        }catch (e:Exception){
            null
        }finally {
            fileInputStream?.close()
            inputStreamReader?.close()
            bufferedReader?.close()
        }
    }

}