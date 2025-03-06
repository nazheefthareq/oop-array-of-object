public class MainBangunRuang {
    public static void main(String[] args) {

        System.out.println("========================== KUBUS ============================");
        Kubus[] cubesArray;
        cubesArray = new Kubus[5];

        cubesArray[0] = new Kubus(4);
        cubesArray[1] = new Kubus(6);
        cubesArray[2] = new Kubus(3);
        cubesArray[3] = new Kubus(5);
        cubesArray[4] = new Kubus(2);

        int index = 0;
        for (Kubus loopKubus : cubesArray) {
            System.out.println("Volume Kubus ke-"+ (index+1)+ " adalah:"+ loopKubus.ComputeAndSetVolume());
            index++;
        }

        double totalVolumeKubus = 0;
        for (Kubus loopKubus : cubesArray) {
            totalVolumeKubus += loopKubus.ComputeAndSetVolume();
        }

        double avgVolumeKubus = totalVolumeKubus / cubesArray.length;
        System.out.println("Rata-rata Volume Kubus adalah: "+ avgVolumeKubus + "\n");

    }
}
