/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // Contador 
    private int playCount;
     //ejer 5 añadimos el campo album, este almacena a que album pertenece una cancion
     private String album;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
   /* EL EJERCICIO 6 PIDE BORRAR EL GETDETAILS
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")"+ " album: " + album ;
    }
    */
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }
    //Setters ejer 2
    public void resetPLayCount(){
        playCount = 0;
    }
    public void incPlayCount(){
        playCount++;
    }
    //setters y getters ejer 4
    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    //metodo ejer6
    public String toString(){
        return artist + ": " + title + "  (file: " + filename + ")"+ " album: " + album ;
    }
}