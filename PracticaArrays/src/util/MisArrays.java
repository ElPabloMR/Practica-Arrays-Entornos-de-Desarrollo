package util;

import java.util.Arrays;

public class MisArrays {
	

	public float medianotas(int [] numeros)  {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>0) {
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
	
	public float mediananotas(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>0) {
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
	
	public int maximanota(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>0) {
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
	
	public int minimanota(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0 || numeros[i]>0) {
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
