interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun main() {
    // Berbanding terbalik dengan saat kita menandainya dengan kata kunci out, bagaimana saat kita menandainya dengan dengan kata kunci in ?  Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya sebagai tipe argumen untuk setiap fungsi yang ada di dalam kelas tersebut dan tidak untuk diproduksi. Contoh dari deklarasinya bisa kita lihat pada kelas Comparable pada Kotlin berikut:
}