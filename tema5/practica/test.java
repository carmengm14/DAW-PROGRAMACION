public class test {
   public static void main(String[] args) {
       Usuario user1 = new Usuario("maria@gmail.com", "contraseña321");
       Media media1 = new Media("Carlos", "Hola", MediaType.audio, 1);

       
       for (int i = 0; i < Usuario.UsuariosNuevos.size(); i++) {
        System.out.println(Usuario.UsuariosNuevos.get(i));   
       }

      /* user1.comprobarEmail("maria@gmail.com");
       user1.eliminarMediaEmail("carlos@yahoo.com");
       user1.eliminarUserDom("gmail.com");
       */

       System.out.println(user1.generateXML());
       System.out.println(media1.generateXML());

       user1.writeXML();
       media1.writeXML();
    }
}
