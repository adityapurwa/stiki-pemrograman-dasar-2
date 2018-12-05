package koneksi;

import java.sql.*;

public class Koneksi {
    private static final String DB_URL = "jdbc:mysql://localhost/kampus?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);

        Statement statement = connection.createStatement();

        PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE dosen SET nama = ? WHERE nip = ?"
        );
        preparedStatement.setString(1, "Roshan");
        preparedStatement.setString(2, "1000000001");
        preparedStatement.executeUpdate();

        ResultSet results = statement.executeQuery("SELECT * FROM dosen WHERE tempat_lahir LIKE '%egypt% and tahun_lahir > 89'");
        while (results.next()) {
            String nip = results.getString(1);
            String nama = results.getString(2);
            String alamat = results.getString(3);
            String tempatLahir = results.getString(4);
            int tahunLahir = results.getInt(5);
            String programStudy = results.getString(6);

            System.out.printf("NIP: %s%n", nip);
            System.out.printf("NAMA: %s%n", nama);
            System.out.printf("ALAMAT: %s%n", alamat);
            System.out.printf("TEMPAT LAHIR: %s%n", tempatLahir);
            System.out.printf("TAHUN LAHIR: %d%n", tahunLahir);
            System.out.printf("PROGRAM: %s%n", programStudy);
            System.out.println("---");
        }
        preparedStatement.close();
        statement.close();
        connection.close();


    }
}
