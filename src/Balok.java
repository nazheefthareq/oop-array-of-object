public class Balok {

    public double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
}
