package ProjectRelationship;
    public class Main {
        public static void main(String[] args) {
            MiniBus minibus1 = new MiniBus("B 1234 AB", "Toyota", 1000.0f, "Safety Package", 2000, "Comfort Package", 30, 300.0f, "Pribadi");
            MiniBus minibus2 = new MiniBus("B 5678 CD", "Isuzu", 1200.0f, "Basic Safety", 2500, "Standard Comfort", 40, 400.0f, "Wagon");

            System.out.println("Info MiniBus 1:");
            minibus1.tampilInfo();
            System.out.println("Pajak MiniBus 1: " + minibus1.hitungPajak());

            System.out.println("\nInfo MiniBus 2:");
            minibus2.tampilInfo();
            System.out.println("Pajak MiniBus 2: " + minibus2.hitungPajak());
        }
    }

