
/*
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author carmen garcia
 * @version (a version number or a date)
 */
/*
public class Club
{
    // Define any necessary fields here ...
    //como queremos almacenar miembros los guardamos como Membership en vez de String o cualquier otro
    public static ArrayList<Membership> miembros = new ArrayList<Membership>();

    /**
     * Constructor for objects of class Club
     */
/*
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /** 
     Determinar el número de miembros que se han unido en el mes indicado.
     @param month El mes que nos interesa
     @return El numero de miembros que se han unido ese mes
    */
    /*
    public int joinedInMonth(int month){
        int contador = 0;
     if (month <= 0 || month > 12) {
         System.out.println("Esta fuera de rango");
         return contador;
     }else{
        for (Membership miembro : miembros) {
            if (miembro.getMonth() == month) {
                contador++;
            }
        }
     }
     return contador;
    }

    /** 
     Metodo que elimina la coleccion a todos los miembros que se unieron en determinado mes.
     @param month El mes que nos interesa
     @return El numero de miembros eliminaremos
    */
    /*
    public int purge(int month){
        int contador = 0;
        Iterator<Membership> it = miembros.iterator();
        while (it.hasNext()) {
            Membership item = it.next();
            if (item.getMonth() == month) {
                it.remove();
                contador++;
            }
        }
        return contador;
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    /*
    public void join(Membership member)
    {
        miembros.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    /*
    public int numberOfMembers()
    {
        return miembros.size();   
    }

    //getters and setters
    public static ArrayList<Membership> getMiembros() {
        return miembros;
    }
    
} */

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...

    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }

    /**
     * Determinar el número de miembros que se han unido en el mes indicado
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido ese mes
     */
     
    public int joinedInMonth(int month){
        int resultado = 0;

        if(month < 1 || month > 12){
            System.out.println("joinedInMonth - Mes incorrecto: " + month);
        }else{

            for (Membership item : members) {
                if(item.getMonth() == month){
                    resultado++;
                }
            }
        }

        return resultado;
    }

    public int purgue(int month){
        int eliminados = 0;

        Iterator<Membership> it = members.iterator();

        while (it.hasNext()) {
            Membership item = it.next();

            if (item.getMonth() == month){
                it.remove();
                eliminados++;
            }
        }

        return eliminados;
    }
}
