package ProjectRelationship;

public class MiniBus extends Sedan {
        private String tipe;

        public MiniBus() {
            super();
            tipe = "";
        }

        public MiniBus(String noPlat, String merk, float pajak, String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan,
                       int kapasitasPenumpang, float kapasitasBagasi, String tipe) {
            super(noPlat, merk, pajak, fasilitasKeamanan, kapasitasCC, fasilitasKenyamanan);
            this.tipe = tipe;
        }

        public void infoMiniBus() {
            if ("Pribadi".equals(tipe)) {
                System.out.println("Tipe MiniBus: Pribadi, digunakan sebagai kendaraan pribadi");
            } else if ("Wagon".equals(tipe)) {
                System.out.println("Tipe MiniBus: Wagon, digunakan sebagai kendaraan angkut/travel");
            } else {
                System.out.println("Tipe MiniBus tidak valid");
            }
        }

        public float hitungPajak() {
            if ("Pribadi".equals(tipe)) {
                return (super.hitungPajak() * 0.05f) + (super.hitungPajak() * 0.03f);
            } else if ("Wagon".equals(tipe)) {
                return (super.hitungPajak() * 0.03f) + (super.hitungPajak() * 0.05f);
            } else {
                return 0.0f;
            }
        }

        public void tampilInfo() {
            super.tampilInfo();
            infoMiniBus();
        }
    }