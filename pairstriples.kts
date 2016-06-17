
// Pair
//
var a = Pair(3, 5)

println(a)
println("a.first " + a.first)
println("a.second " + a.second)

// "unpack", parentheses required

val (x, y) = a

// println(x)
// println(y)
// error: unresolved reference: ...
//
// println($x)
// println($y)
// error: ...

val b = Pair(2, 7.9)

println(b)
println("b.first " + b.first)
println("b.second " + b.second)

// "unpack" works correctly inside functions
fun unpacker(b: Pair<Int, Double>) {
    val (x, y) = b
    println("$b consists of $x and $y")
}

unpacker(b)


// Triple
//

fun unpackYYMMDD(n: Int): Triple<Int, Int, Int> {
    return Triple(n / 10000, (n / 100) % 100, n % 100)
}

println( unpackYYMMDD(20170315) )

val (y, m, d) = unpackYYMMDD(20170315)
// println(y + m + d)
// error: ...

val t = unpackYYMMDD(20001231)
println(t)
println(t.first)
println(t.second)
println(t.third)


