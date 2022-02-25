public class test {
   public static void main(String[] args) {
       Usuario user1 = new Usuario("maria@gmail.com", "contraseña321");
       Usuario user2 = new Usuario("maria@gmail.com", "contraseña31");
       Usuario user4 = new Usuario("carlos@yahoo.com", "contraseña32134");
      // Media media1 = new Media("maria", "buenos dias", "imagen", 14);

       
       for (int i = 0; i < Usuario.UsuariosNuevos.size(); i++) {
        System.out.println(Usuario.UsuariosNuevos.get(i));   
       }

       user1.comprobarEmail("maria@gmail.com");
       user1.eliminarMediaEmail("carlos@yahoo.com");
       user1.eliminarUserDom("gmail.com");
    }
}
