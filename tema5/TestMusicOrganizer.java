public class TestMusicOrganizer {
    public static void main(String[] args) {
        MusicOrganizer index1 = new MusicOrganizer();
        index1.addFile("Cancion 1");
        index1.addFile("Cancion 2");
        index1.addFile("Cancion 3");
        index1.addFile("Cancion 4");

        index1.listFile(4);
        index1.checkIndex(6);
        System.out.println(index1.validIndex(3));
        
    }
}
