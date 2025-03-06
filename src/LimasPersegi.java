public class LimasPersegi {
    
    public double sisi, tinggi;

    LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        double volume = 1.0/3 * (this.sisi * this.sisi) * this.tinggi; 
        return volume;
    }
}
