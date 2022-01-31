public class TestMail {
    public static void main(String[] args) {
        MailItem user1 = new MailItem("Carmen Garcia", "Manolito","Saludo", "Hola, que tal");
        user1.print();
        MailServer user2 = new MailServer();
        user2.getNextMailItem("Carmen Garcia");
    }
}
