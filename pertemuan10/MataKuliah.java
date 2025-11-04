public class MataKuliah implements Comparable<MataKuliah> {
    private String kode;
    private String nama;
    private int sks;
    private int semester;

    public MataKuliah(String kode, String nama, int sks, int semester) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.semester = semester;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS) " + " semester: " + semester;
    }

    @Override
    public int compareTo(MataKuliah o) {
        // bandingkan sks matakuliah ini dengan matakuliah object o
        int compareSKS = ((Integer) this.sks).compareTo((Integer) o.sks);

        // jika SKS tidak sama, kembalikan nilai perbandingan SKS
        // negatif - lebih kecil, 0 sama, positif - lebih besar
        if (compareSKS != 0) {
            return compareSKS;
        }

        // jika hasil perbandingan SKS sama dengan, bandingkan dengan kode matakuliah
        return this.kode.compareTo(o.kode);
    }
}
