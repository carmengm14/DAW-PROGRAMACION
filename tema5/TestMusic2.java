
public class TestMusic2 {
    public static void main(String[] args) {
        MusicOrganizer2 m1 = new MusicOrganizer2();
        m1.addFile("Hola");
        m1.addFile("Buenas");
        m1.addFile("Tardes");

        m1.listFile(0);
        m1.listFile(2);

        m1.listAllFiles();

        m1.listMatching("CI");
        m1.getMatching("Hola");
        m1.playMatching("Buenas");
       
    }    
}