
public class TestMusic2 {
    public static void main(String[] args) {
        MusicOrganizer2 m1 = new MusicOrganizer2();
        m1.addFile("Hola");
        m1.addFile("Buenas");
        m1.addFile("Tardes");

        m1.listFile(1);
        m1.listAllFiles();
    }    
}