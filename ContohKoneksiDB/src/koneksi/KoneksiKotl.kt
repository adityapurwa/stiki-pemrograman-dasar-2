package koneksi

import java.sql.DriverManager
import java.sql.SQLException

object KoneksiKotl {
    private const val DB_URL = "jdbc:mysql://localhost/kampus?serverTimezone=UTC"
    private const val USER = "root"
    private const val PASS = ""

    @Throws(SQLException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val connection = DriverManager.getConnection(DB_URL, USER, PASS)

        val statement = connection.createStatement()
        statement.use { stmt ->
            {
                val results = statement.executeQuery("SELECT * FROM dosen")
                while (results.next()) {
                    val nip = results.getString(1)
                    val nama = results.getString(2)
                    val alamat = results.getString(3)
                    val tempatLahir = results.getString(4)
                    val tahunLahir = results.getInt(5)
                    val programStudy = results.getString(6)

                    System.out.printf("NIP: %s%n", nip)
                    System.out.printf("NAMA: %s%n", nama)
                    System.out.printf("ALAMAT: %s%n", alamat)
                    System.out.printf("TEMPAT LAHIR: %s%n", tempatLahir)
                    System.out.printf("TAHUN LAHIR: %d%n", tahunLahir)
                    System.out.printf("PROGRAM: %s%n", programStudy)
                    println("---")
                }
            }
        }


    }
}
