package ProjectRelationship;

public class Sedan extends Mobil {
        private String fasilitasKeamanan;
        private int kapasitasCC;
        private String fasilitasKenyamanan;

        public Sedan() {
            super();
            fasilitasKeamanan = "";
            kapasitasCC = 0;
            fasilitasKenyamanan = "";
        }

        public Sedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan) {
            super(noPlat, merk, pajak);
            this.fasilitasKeamanan = fasilitasKeamanan;
            this.kapasitasCC = kapasitasCC;
            this.fasilitasKenyamanan = fasilitasKenyamanan;
        }

        public void infoSedan() {
            System.out.println("Fasilitas Keamanan: " + fasilitasKeamanan + ", Kapasitas CC: " + kapasitasCC + ", Fasilitas Kenyamanan: " + fasilitasKenyamanan);
        }

        public float hitungPajak() {
            return pajak + (pajak * kapasitasCC * 0.00005f);
        }

        public void tampilInfo() {
            super.tampilInfo();
            infoSedan();
        }
    }

