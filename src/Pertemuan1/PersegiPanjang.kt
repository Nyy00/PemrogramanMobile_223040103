package Pertemuan1

import java.util.Scanner

class PersegiPanjang(private val panjang: Double, private val lebar: Double) {
    fun hitungLuas(): Double {
        return panjang * lebar
    }

    fun hitungKeliling(): Double {
        return 2 * (panjang + lebar)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nilai panjang: ")
    val panjang = scanner.nextDouble()

    print("Masukkan nilai lebar: ")
    val lebar = scanner.nextDouble()

    val persegiPanjang = PersegiPanjang(panjang, lebar)

    println("Panjang persegi: $panjang")
    println("Lebar persegi: $lebar")
    println("Luas persegi: ${persegiPanjang.hitungLuas()}")
    println("Keliling persegi: ${persegiPanjang.hitungKeliling()}")
}
