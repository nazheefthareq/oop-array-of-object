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

        System.out.println("========================== BALOK ============================");
        Balok[] blockArray;
        blockArray = new Balok[5];

        blockArray[0] = new Balok(4, 3, 3);
        blockArray[1] = new Balok(5, 2, 3);
        blockArray[2] = new Balok(3, 2, 4);
        blockArray[3] = new Balok(5, 3, 2);
        blockArray[4] = new Balok(4, 3, 2);

        index = 0;
        for (Balok loopBalok : blockArray) {
            System.out.println("Volume Balok ke-"+ (index+1)+ " adalah:"+ loopBalok.ComputeAndSetVolume());
            index++;
        }

        double totalVolumeBalok = 0;
        for (Balok loopBalok : blockArray) {
            totalVolumeBalok += loopBalok.ComputeAndSetVolume();
        }

        double avgVolumeBalok = totalVolumeBalok / blockArray.length;
        System.out.println("Rata-rata Volume Balok adalah: "+ avgVolumeBalok + "\n");
        
        System.out.println("========================== BOLA ============================");
        Bola[] ballArray;
        ballArray = new Bola[5];

        ballArray[0] = new Bola(4);
        ballArray[1] = new Bola(3);
        ballArray[2] = new Bola(5);
        ballArray[3] = new Bola(2);
        ballArray[4] = new Bola(7);
        

        index = 0;
        for (Bola loopBola : ballArray) {
            System.out.println("Volume Bola ke-"+ (index+1)+ " adalah:"+ loopBola.ComputeAndSetVolume());
            index++;
        }

        double totalVolumeBola = 0;
        for (Bola loopBola : ballArray) {
            totalVolumeBola += loopBola.ComputeAndSetVolume();
        }

        double avgVolumeBola = totalVolumeBola / ballArray.length;
        System.out.println("Rata-rata Volume Bola adalah: "+ avgVolumeBola + "\n");

        System.out.println("========================== LIMAS SEGI EMPAT ============================");
        LimasPersegi[] pyramidArray;
        pyramidArray = new LimasPersegi[5];

        pyramidArray[0] = new LimasPersegi(4, 3);
        pyramidArray[1] = new LimasPersegi(2, 3);
        pyramidArray[2] = new LimasPersegi(2, 4);
        pyramidArray[3] = new LimasPersegi(4,2);
        pyramidArray[4] = new LimasPersegi(3, 2);
        

        index = 0;
        for (LimasPersegi loopLimasPersegi : pyramidArray) {
            System.out.println("Volume Limas Segi Empat ke-"+ (index+1)+ " adalah:"+ loopLimasPersegi.ComputeAndSetVolume());
            index++;
        }

        double totalVolumeLimasPersegi = 0;
        for (LimasPersegi loopLimasPersegi : pyramidArray) {
            totalVolumeLimasPersegi += loopLimasPersegi.ComputeAndSetVolume();
        }

        double avgVolumeLimasPersegi = totalVolumeLimasPersegi / pyramidArray.length;
        System.out.println("Rata-rata Volume Limas Segi Empat adalah: "+ avgVolumeLimasPersegi + "\n");
        
    }
}
