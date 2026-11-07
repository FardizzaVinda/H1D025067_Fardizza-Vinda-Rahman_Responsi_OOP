public abstract class Pasien {
    public static final String NAMA_RS = "RS Sehat Sentosa";

    private final String idPasien;
    private String nama;
    private int biaya;
    private String status;

    public Pasien(String idPasien, String nama) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.biaya = 0;
        this.status = "Menunggu Pemeriksaan";
    }

    public Pasien(String idPasien, String nama, int biayaAwal) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.biaya = biayaAwal;
        this.status = "Menunggu Pemeriksaan";
    }

    public void tampilkanInfo() {
        System.out.println("ID Pasien : " + this.idPasien);
        System.out.println("Nama      : " + this.nama);
        System.out.println("Status    : " + this.status);
        System.out.println("Biaya     : Rp " + this.biaya);
    }

    public int hitungSisaTagihan(int bayar) {
        return this.biaya - bayar;
    }

    public abstract void evaluasi();

    public String getIdPasien() {
        return this.idPasien;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return this.biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
