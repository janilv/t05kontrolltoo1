import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class Geokesk{
	public static void main(String[] args){
		int arv1 = 9;
		int arv2 = 4;
		int[] list = {1, 2, 3, 4, 5};
		juurelist(list);
	
		int korrutis = arv1 * arv2;
        double ruutjuur = Math.sqrt(korrutis);
        System.out.println("Esimene arv on " + arv1);
        System.out.println("Teine arv on " + arv2);
        System.out.println("Korrutis on " + korrutis);
        System.out.println("Ruutjuur korrutisest "+ korrutis +" on " + ruutjuur);
	}
	
	public static void juurelist(int[] list){
		int korrutis = 1;
		for(int i = 0; i < list.length; i++) {
			korrutis = korrutis * list[i];
		}
		double pikkus = list.length;
		double pow = Math.pow(korrutis, 1.0 / pikkus);
		System.out.println("Korrutis on " + korrutis);
		System.out.println("Juur on " +pow);
	
	}

}



/*
Korrutis on 120
Juur on 2.605171084697352
Esimene arv on 9
Teine arv on 4
Korrutis on 36
Ruutjuur korrutisest 36 on 6.0
*/