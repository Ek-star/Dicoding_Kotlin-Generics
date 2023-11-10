interface List2<out E> : Collection<E> {
    operator fun get(index: Int): E
}

fun main() {
    // Ketika kita menandai sebuah tipe parameter dengan kata kunci out maka nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type. Serta tidak dapat dikonsumsi seperti menjadikannya sebagai tipe argumen untuk setiap fungsi di dalam kelas tersebut.
}