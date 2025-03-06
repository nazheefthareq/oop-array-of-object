public class Tabung {
    
    public double rad, tinggi;

    Tabung(double rad, double tinggi) {
        this.rad = rad;
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        double volume = 3.14 * (this.rad * this.rad) * this.tinggi;
        return volume;
    }
}
