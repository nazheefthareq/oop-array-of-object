public class Bola {
    
    public double rad;
    
    Bola(double rad) {
        this.rad = rad;
    }

    public double ComputeAndSetVolume() {
        double volume = 4.0/3 * 3.14 * this.rad * this.rad * this.rad;
        return volume;
    }
}
