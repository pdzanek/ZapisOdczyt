import java.util.Random;
//import java.util.Scanner;

public class ZapisOdczyt{
	public static void main(String[] args){
	 Random randChar = new Random();
	char charTable[] = new double[1000];
	for(i=0;i<1000;i++){
	 	System.out.println(randChar.nextInt(63)+32);
	}
	}
}


/*Napisz program losujacy 1000 znakow i zapisz je do pliku, a nastepnie odczytaj pliku i wypisz na ekran. Utworz dwie rozne pary procedur zapisujaco/odczytujacych, raz korzystajac z pakietu java.io a drugi raz z pakietu java.nio. Porownaj szybkosc zapisu i odczytu, wynik wypisz na ekranie. */
