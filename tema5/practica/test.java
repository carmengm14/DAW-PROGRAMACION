package practica;

public class test {
   public static void main(String[] args) {
       Usuario user1 = new Usuario("maria@gmail.com", "contraseña321");
       Usuario user2 = new Usuario("mari@gmail.com", "contraseña123");
       Media media1 = new Media("Carlos", "Hola", MediaType.audio, 0);
       Media media2 = new Media("Carls", "Ha", MediaType.audio, 1);

       //imprimir todos los usuarios
       for (int i = 0; i < Usuario.usuariosNuevos.size(); i++) {
        System.out.println(Usuario.usuariosNuevos.get(i));   
       }

      /* user1.comprobarEmail("maria@gmail.com");
       user1.eliminarMediaEmail("carlos@yahoo.com");
       user1.eliminarUserDom("gmail.com");
       */

       System.out.println(user1.generateXML());
       System.out.println(media1.generateXML());

       user1.writeXML();
       user2.writeXML();
       media1.writeXML();
       media2.writeXML();
    }
}
