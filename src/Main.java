public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("   " + Pasien.NAMA_RS + " - LAPORAN PELAYANAN");

        PasienInap windah = new PasienInap("PAS-01", "Windah Basudara", 4, 500000);
        PasienJalan arap = new PasienJalan("PAS-02", "Reza Arap", "Poli Penyakit Dalam", 150000);
        PasienInap tara = new PasienInap("PAS-03", "Tara Arts", 1);
        tara.setBiaya(200000);

        System.out.println("--- Daftar Pasien ---");
        System.out.println("1. " + windah.getIdPasien() + " - " + windah.getNama() + " (" + windah.getHariRawat() + " hari rawat)");
        System.out.println("2. " + arap.getIdPasien() + " - " + arap.getNama() + " (" + arap.getPoliTujuan() + ")");
        System.out.println("3. " + tara.getIdPasien() + " - " + tara.getNama() + " (" + tara.getHariRawat() + " hari rawat)\n");

        System.out.println("--- Evaluasi Pasien ---");
        windah.evaluasi();
        arap.evaluasi();
        tara.evaluasi();

        System.out.println(windah.getNama() + " : " + windah.getStatus() + " | Biaya: Rp " + windah.getBiaya());
        System.out.println(arap.getNama() + " : " + arap.getStatus() + " | Biaya: Rp " + arap.getBiaya());
        System.out.println(tara.getNama() + " : " + tara.getStatus() + " | Biaya: Rp " + tara.getBiaya() + "\n");

        System.out.println("--- Detail Rekam Medis ---");
        windah.tampilkanInfo();
        System.out.println();

        System.out.println("--- Tindakan Gawat Darurat ---");
        Darurat darurat = windah;
        darurat.tanganiDarurat();
        System.out.println();

        System.out.println("--- Pembayaran & Klaim BPJS ---");
        windah.klaimBPJS(150000);
        int sisa = windah.hitungSisaTagihan(500000);
        System.out.println("Sisa tagihan windah setelah bayar Rp 500.000: Rp " + sisa + "\n");

        System.out.println("--- Ringkasan ---");
        System.out.println("Total Pasien : 3 orang");
        System.out.println("Rumah Sakit  : " + Pasien.NAMA_RS);
    }
}
