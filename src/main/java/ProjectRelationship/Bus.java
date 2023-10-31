package ProjectRelationship;

public class Bus extends Mobil {
    private int kapasitasPenumpang;
    private float kapasitasBagasi;

    public Bus() {
        super();
        kapasitasPenumpang = 0;
        kapasitasBagasi = 0.0f;
    }

    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, float kapasitasBagasi) {
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }

    public void infoBus() {
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + ", Kapasitas Bagasi: " + kapasitasBagasi);
    }

    public float hitungPajak() {
        return pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005f);
    }

    public void tampilInfo() {
        super.tampilInfo();
        infoBus();
    }
}

