public class Kubus {

    public double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double ComputeAndSetVolume() {
        double volume = this.sisi * this.sisi * this.sisi;
        return volume;
    }
}
