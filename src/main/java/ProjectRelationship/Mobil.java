package ProjectRelationship;

public class Mobil implements InterfaceSedan, InterfaceBus{
    protected String noPlat;
    protected String merk;
    protected float pajak;

    public Mobil() {
        noPlat = "";
        merk = "";
        pajak = 0.0f;
    }

    public Mobil(String noPlat, String merk, float pajak) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }

    public void tampilInfo() {
        System.out.println("Nomor Plat: " + noPlat + ", Merk: " + merk + ", Pajak: " + pajak);
    }

    public float hitungPajak() {
        return pajak;
    }
}
