// Class Mobil
public class Mobil {
    // Atribut dibuat private agar tidak bisa diakses langsung
    private String merek;
    private String warna;
    private int kecepatan;

    // Constructor (opsional)
    public Mobil(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatan = 0; // kecepatan awal 0
    }

    // Setter dan Getter
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    // Method untuk mengatur kecepatan dengan validasi
    public void setKecepatan(int kecepatan) {
        if (kecepatan >= 0) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kecepatan tidak boleh negatif!");
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Method tambahan untuk menambah dan mengurangi kecepatan
    public void tambahKecepatan(int nilai) {
        kecepatan += nilai;
        System.out.println("Kecepatan bertambah menjadi: " + kecepatan + " km/jam");
    }

    public void kurangiKecepatan(int nilai) {
        if (kecepatan - nilai >= 0) {
            kecepatan -= nilai;
            System.out.println("Kecepatan berkurang menjadi: " + kecepatan + " km/jam");
        } else {
            System.out.println("Mobil sudah berhenti!");
        }
    }

    // Menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
