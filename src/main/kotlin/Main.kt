fun main() {
    // Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan. Pendeklarasiannya ditandai dengan tipe parameter. Kita juga bisa mengganti tipe parameter menjadi tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut.

    val contributor = listOf<String>("Jasoet" , "Alfian" , "Nrohmen" , "Dimas" , "Widy")

    // Selain itu, kita juga bisa mendeklarasikan lebih dari satu tipe parameter untuk sebuah kelas. Contohnya adalah kelas Map yang memiliki dua tipe parameter yang digunakan sebagai key dan value. Kita bisa menentukannya dengan argumen tertentu, misalnya seperti berikut:

    val points = mapOf<String, Int>(
        "Alvian" to 10,
        "Dimas" to 20
    )
}