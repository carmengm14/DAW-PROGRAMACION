/* letras, digitos, y otras cosas */
public class AnalizaString {

    public static void analizador(String frase) {
        int contadorletras = 0;
        int contadordigitos = 0;
        int contadorotros = 0;

        for (int i = 0; i < frase.length(); i++) {
            
            if(Character.isLetter(frase.charAt(i))){
                contadorletras++;
            } else if(Character.isDigit(frase.charAt(i))){
                contadordigitos++;
            } else{
                contadorotros++;
            }

        }
        
        System.out.println("Hay " + contadordigitos + " digitos, en tu cadena.");
        System.out.println("Hay " + contadorletras + " letras, en tu cadena.");
        System.out.println("Hay " + contadorotros + " caracteres diferentes, en tu cadena.");
    }
	public static void main(String[] args) {

		String frase = Utilidades.leerCadena("Introduce una frase: ");

        analizador(frase);
		
        
        
	}
}
