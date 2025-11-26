package reto3;

public class funciones {

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String CambioMin(int clave, char[] abecedario, String palabraMin) {
	    
	    char palabraArray[] = new char[palabraMin.length()];
	    char nuevaPalabra[] = new char[palabraArray.length];

	    for (int i = 0; i < palabraMin.length(); i++) {
	        palabraArray[i] = palabraMin.charAt(i);
	    }

	    for (int j = 0; j < palabraArray.length; j++) {
	        boolean encontrado = false;
	        
	        for (int i = 0; i < abecedario.length; i++) {
	            if (palabraArray[j] == abecedario[i]) {
	                int nuevaPos = (i + clave) % abecedario.length;     // para que no pase de la longitu del aarray 
	                nuevaPalabra[j] = abecedario[nuevaPos];
	                encontrado = true;
	                break;
	            }
	        }
	        
	        if (!encontrado) {
	            nuevaPalabra[j] = palabraArray[j];  
	        }
	    }

	    String cambioMin = new String(nuevaPalabra);
	    return cambioMin;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String CambioMay(int clave, char[] abecedarioMay, String palabraMay) {
	    
	    char palabraArray[] = new char[palabraMay.length()];
	    char nuevaPalabra[] = new char[palabraArray.length];

	    for (int i = 0; i < palabraMay.length(); i++) {
	        palabraArray[i] = palabraMay.charAt(i);
	    }

	    for (int j = 0; j < palabraArray.length; j++) {
	        boolean encontrado = false;

	        for (int i = 0; i < abecedarioMay.length; i++) {
	            if (palabraArray[j] == abecedarioMay[i]) {
	                int nuevaPos = (i + clave) % abecedarioMay.length;
	                nuevaPalabra[j] = abecedarioMay[nuevaPos];
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            nuevaPalabra[j] = palabraArray[j];
	        }
	    }

	    String cambioMay = new String(nuevaPalabra);
	    return cambioMay;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public String CambioNum(int clave, char[] numeros, String numerosIn) {

	    char palabraArray[] = new char[numerosIn.length()];
	    char nuevaPalabra[] = new char[palabraArray.length];

	    for (int i = 0; i < numerosIn.length(); i++) {
	        palabraArray[i] = numerosIn.charAt(i);
	    }

	    for (int j = 0; j < palabraArray.length; j++) {
	        boolean encontrado = false;

	        for (int i = 0; i < numeros.length; i++) {
	            if (palabraArray[j] == numeros[i]) {
	                int nuevaPos = (i + clave) % numeros.length;
	                nuevaPalabra[j] = numeros[nuevaPos];
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            nuevaPalabra[j] = palabraArray[j];  
	        }
	    }

	    String cambioNum = new String(nuevaPalabra);
	    return cambioNum;
	}	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String SaberQueEsTexto(int clave, char[] abecedario, char[] abecedarioMay, char[] numeros, String texto) {
	    
	    
	    char textoArray[] = new char[texto.length()];
	    char resultado[] = new char[textoArray.length];
	    for (int i = 0; i < texto.length(); i++) {
	        textoArray[i] = texto.charAt(i);
	    }
	    for (int i = 0; i < textoArray.length; i++) {
	        
	    	char c = textoArray[i];
	        boolean procesado = false;
	        
	        for (int j = 0; j < abecedario.length; j++) {
	            if (c == abecedario[j]) {
	                String letra = "" + c;
	                String nueva = CambioMin(clave, abecedario, letra);
	                resultado[i] = nueva.charAt(0);
	                procesado = true;
	                break;
	            }
	        }
	        
	        if (!procesado) {
	            for (int j = 0; j < abecedarioMay.length; j++) {
	                if (c == abecedarioMay[j]) {
	                    String letra = "" + c;
	                    String nueva = CambioMay(clave, abecedarioMay, letra);
	                    resultado[i] = nueva.charAt(0);
	                    procesado = true;
	                    break;
	                }
	            }
	        }
	        
	        if (!procesado) {
	            for (int j = 0; j < numeros.length; j++) {
	                if (c == numeros[j]) {
	                    String letra = "" + c;
	                    String nueva = CambioNum(clave, numeros, letra);
	                    resultado[i] = nueva.charAt(0);
	                    procesado = true;
	                    break;
	                }
	            }
	        }
	        
	   
	    }
	    return new String(resultado);
	}

	
	

}