public class TestBook {
    public static void main(String[] args) {
        Book libro1 = new Book("Manuel Carrasco", "Buenos Dias", 350, true);
        libro1.setRefNumbre("12345");
        libro1.printDetails();
        libro1.borrow();
    }
}
