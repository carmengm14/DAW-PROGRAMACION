public class test {
   public static void main(String[] args) {
       Usuario user1 = new Usuario("maria@gmail.com", "contraseña321");
       Usuario user2 = new Usuario("maria@gmail.com", "contraseña31");
       Usuario user3 = new Usuario("mario@gmail.com", "contraseña32");
       Usuario user4 = new Usuario("carlos@gmail.com", "contraseña32134");
       
       for (int i = 0; i < Usuario.UsuariosNuevos.size(); i++) {
        System.out.println(Usuario.UsuariosNuevos.get(i));   
       }
    }
}
