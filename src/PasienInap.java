public class PasienInap extends Pasien implements Darurat, BPJS {
    private int hariRawat;

    public PasienInap(String idPasien, String nama, int hariRawat) {
        super(idPasien, nama);
        this.hariRawat = hariRawat;
    }

    public PasienInap(String idPasien, String nama, int hariRawat, int biayaAwal) {
        super(idPasien, nama, biayaAwal);
        this.hariRawat = hariRawat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Hari Rawat: " + this.hariRawat + " hari");
    }

    @Override
    public void evaluasi() {
        if (this.hariRawat >= 3) {
            setStatus("Boleh Pulang");
            setBiaya(getBiaya() + 300000);
        } else {
            setStatus("Masih Dirawat");
            setBiaya(getBiaya() + 100000);
        }
    }

    @Override
    public void tanganiDarurat() {
        System.out.println("[Darurat] Pasien " + getNama() + " mendapat penanganan cepat ICU!");
    }

    @Override
    public void klaimBPJS(int potongan) {
        int biayaBaru = getBiaya() - potongan;
        if (biayaBaru < 0) {
            biayaBaru = 0;
        }
        setBiaya(biayaBaru);
        System.out.println("[BPJS] Klaim berhasil! Potongan: Rp " + potongan);
    }

    public int getHariRawat() {
        return this.hariRawat;
    }

    public void setHariRawat(int hariRawat) {
        this.hariRawat = hariRawat;
    }
}
