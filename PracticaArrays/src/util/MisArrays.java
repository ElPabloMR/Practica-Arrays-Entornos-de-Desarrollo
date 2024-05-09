package util;

import java.util.Arrays;

public class MisArrays {
	
/**
 * 
 * Esto devolvera la media de las notas
 * @return la media de las notas
 */
	public static float medianotas(int [] numeros)  {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>10) {
				throw new IllegalArgumentException("No esta en el rango de rotas correcto");
			}
		}
		int num1=0;
		for(int i=0;i<numeros.length;i++) {
			num1=num1+numeros[i];
		}
		float media=num1/numeros.length;
		return media;
	}
	/**
	 * 
	 *Esto devolvera la mediana de las notas
	 * @return la mediana de las notas
	 */
	public static float mediananotas(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>10) {
				throw new IllegalArgumentException("No esta en el rango de rotas correcto");
			}
		}
		Arrays.sort(numeros);
		float mediana=0;
		int mitad=numeros.length/2;
		if(numeros.length%2==0) {
			mediana= numeros[mitad-1]+numeros[mitad]/2;
		}
		else {
			mediana=numeros[mitad];
		}
		return mediana;
	}
	/**
	 * 
	 * Esto devolvera la nota maxima
	 * @return la nota maxima
	 */
	
	public static int maximanota(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>10) {
				throw new IllegalArgumentException("No esta en el rango de rotas correcto");
			}
		}
		int maxima=numeros[0];
		for(int i=0;i<numeros.length;i++) {
			if(maxima < numeros[i]) {
				maxima=numeros[i];
			}
		}
		return maxima;
	}
	/**
	 * 
	 * Esto devolvera la nota minima
	 * @return la nota minima
	 */
	public static int minimanota(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>10) {
				throw new IllegalArgumentException("No esta en el rango de rotas correcto");
			}
		}
		int minimo=numeros[0];
		for(int i=0;i<numeros.length;i++) {
			if(minimo > numeros[i]) {
				minimo = numeros[i];
			}
		}
		return minimo;
	}
}
