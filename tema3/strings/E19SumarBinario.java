/**Haz un programa que lea dos cadenas que representen a sendos números binarios. A continuación, el programa mostrará el número binario que resulta de sumar ambos (y que será otra cadena). Si, por ejemplo, el usuario introduce las cadenas '100' y '111', el programa mostrará como resultado la cadena '1011' */

public class E19SumarBinario {
    public static String resolverOperacion( String numeroUno, String numeroDos){
		String  resultado = "";
		
		if(numeroUno.length() < numeroDos.length() ){
			String temp = numeroDos.substring(0 , numeroDos.length()-numeroUno.length());
			temp 		= temp.replace('1','0');
			numeroUno = temp = temp+numeroUno;
		}else{
			String temp = numeroUno.substring(0 , numeroUno.length()-numeroDos.length());
			temp 		= temp.replace('1','0');
			numeroDos 	= temp = temp+numeroDos;	
		}
			resultado = sumarNumerosBinarios(numeroUno, numeroDos);
		return resultado;
	}
	
	public static String sumarNumerosBinarios(String numeroUno, String numeroDos){
		String resultado = "";
		char acarreo = '0';
		for(int i = numeroUno.length()-1; i>= 0; i--){
			if(numeroUno.charAt(i) == '0' && numeroDos.charAt(i) == '0' ){
				if(acarreo == '0'){
					resultado = "0"+resultado;
				}else {
					resultado = "1"+resultado;
				}
			}else if((numeroUno.charAt(i) == '0' && numeroDos.charAt(i) == '1' )||
					 (numeroUno.charAt(i) == '1' && numeroDos.charAt(i) == '0')){
				if(acarreo == '0'){
					resultado = "1"+resultado;
				}else {
					acarreo = '1';
					resultado = "0"+resultado;
				}
			}else if((numeroUno.charAt(i) == '1' && numeroDos.charAt(i) == '1' )){
				if(acarreo == '0'){
					acarreo = '1';
					resultado = "0"+resultado;
				}else {
					resultado = "1"+resultado;
				}
			}
		}
		if(acarreo =='1'){
			resultado = acarreo + resultado;
		}
		return resultado;
	}
	
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Escribe una cadena: ");
        String cadena2 = Utilidades.leerCadena("Escribe otra cadena: ");
        System.out.println(resolverOperacion(cadena1,cadena2));
    }
}
