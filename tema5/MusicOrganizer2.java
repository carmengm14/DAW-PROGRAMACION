import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer2
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer2()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }

    //metodo match
    public void listMatching(String match){
        //EJER5
        for (String cancion : getMatching(match)) {
                System.out.println(cancion);
        }
        if (getMatching(match).size() == 0) {
            System.out.println("No se ha encontrado este match");
        }

       /*
       EJER 2
       int contador = 0;
       for (String cancion : files) {
            if (cancion.contains(match)) {
                System.out.println(cancion);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se ha encontrado este match");
        }
        */
    }

    //metodo playMatching
    public void playMatching(String match){
       //EJER5
       for (String cancion : getMatching(match)) {
        System.out.println(cancion);
        player.playSample(cancion);
        }
        if (getMatching(match).size() == 0) {
            System.out.println("No se ha encontrado este match");
        }
        /* 
       EJER 2
       for (String cancion : files) {
            if (cancion.contains(match)) {
                System.out.println(cancion);
                player.playSample(cancion);
            }
        }
        */
    }
    //getMatching, creamos el ArrayList
    public ArrayList<String> getMatching(String match){
        
        ArrayList<String> resultado = new ArrayList<>();
        
        for (String cancion : files) {
            if (cancion.contains(match)) {
                resultado.add(cancion);
            }
        }
        return resultado;
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    public void listAllFiles(){
       for (String files : files) {
        System.out.print(files + " "); 
       }
       System.out.println(" ");
    }

    public int findFirst(String searchString){
    int indice = 0; 
    int resultado = -1;
        while(indice < files.size()) {
            
            if (files.get(indice).contains(searchString)){
                resultado = indice;
                break;
            }else{
            indice ++;
            }
        }
        return resultado;
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
}