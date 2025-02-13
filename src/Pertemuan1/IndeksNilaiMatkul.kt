package Pertemuan1

import java.util.Scanner

class IndeksNilaiMatkul {

    fun hitungIndeks(nilai: Int): String {
        return when (nilai) {
            in 80..100 -> "A"
            in 70..79 -> "AB"
            in 60..69 -> "B"
            in 50..59 -> "BC"
            in 40..49 -> "C"
            in 30..39 -> "D"
            in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nilai akhir: ")
    if(scanner.hasNextInt()) {
        val nilai = scanner.nextInt()
        val indeksNilaiMatkul = IndeksNilaiMatkul()
        val indeks = indeksNilaiMatkul.hitungIndeks(nilai)
        println("Nilai akhir: $nilai")
        println("Indeks nilai: $indeks")
    } else {
        println("Nilai harus diisi")
    }
}
