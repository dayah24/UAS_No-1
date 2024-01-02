package mahasiswa;

/* Nama : Nur Hidayah
/* NIM  : 22166034
/* UAS_PBO_No 1

*/
// Mahasiswa class
public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}

// MahasiswaBaru class
class MahasiswaBaru extends Mahasiswa {
    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

// MahasiswaLama class
class MahasiswaLama extends Mahasiswa {
    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create an instance of Mahasiswa
        System.out.println("====== Mahasiswa ======");
        Mahasiswa mahasiswa = new Mahasiswa("Nur Hidayah", 20);
        mahasiswa.displayInfo();

        // Create an instance of MahasiswaBaru
        System.out.println("====== Mahasiswa Baru ======");
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Nurisa", 18, 123456);
        mahasiswaBaru.displayInfo();

        // Create an instance of MahasiswaLama
        System.out.println("====== Mahasiswa Lama ======");
        MahasiswaLama mahasiswaLama = new MahasiswaLama("Diyah", 22, 2020);
        mahasiswaLama.displayInfo();
    }
}

    
