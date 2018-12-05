public class StringDemo {

    public static void main(String[] args) {

        String kata = "nama saya aditya";
        char[] helloArray = {'a', 'n', '.', '2', ' ', '@'};

        String helloString = new String(helloArray);

        System.out.println(helloString);

        String contoh = "Dot saw I was TOd";
        int len = contoh.length();
        System.out.println("Panjang string: " + len);

        double harga = 10.6;
        int nilai = 90;
        String alamat = "malang";

        String fs = String.format(
                "The value of float %.2f, while the value of int is %d, and string is %s",
                harga, nilai, alamat
        );

        System.out.println(fs);

        System.out.println("----------------------");

        String s = "Nama saya Aditya";
        char result = s.charAt(8);
        System.out.println(result);

        System.out.println("a".compareTo("aaa"));

        String kataStiki = "Selamat Datang di SKITI!";

        System.out.println(kataStiki.endsWith("SKITI!"));
        System.out.println(kataStiki.endsWith("Elang"));

        for(String rev : kataStiki.split("datang")){
            System.out.println(rev);
        }

    }
}
