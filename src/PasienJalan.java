public class PasienJalan extends Pasien {
    private String poliTujuan;

    public PasienJalan(String idPasien, String nama, String poliTujuan) {
        super(idPasien, nama);
        this.poliTujuan = poliTujuan;
    }

    public PasienJalan(String idPasien, String nama, String poliTujuan, int biayaAwal) {
        super(idPasien, nama, biayaAwal);
        this.poliTujuan = poliTujuan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poli      : " + this.poliTujuan);
    }

    @Override
    public void evaluasi() {
        if (getBiaya() > 150000) {
            setStatus("Perlu Obat Lanjutan");
        } else {
            setStatus("Selesai Konsultasi");
        }
    }

    public String getPoliTujuan() {
        return this.poliTujuan;
    }

    public void setPoliTujuan(String poliTujuan) {
        this.poliTujuan = poliTujuan;
    }
}
