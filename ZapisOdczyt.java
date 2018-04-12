import java.util.Random;
import java.io.*;
import java.nio.*;

public class ZapisOdczyt{
	public static void main(String[] args){
	 Random randChar = new Random();
	char charTable[] = new char[1000];
	char charBrzezio[] = new char[1000];
	for(int i=0;i<1000;i++){
	 	charTable[i]=(char)(randChar.nextInt(94)+33);
		System.out.print(charTable[i]);
	}
	}
}


/*Napisz program losujacy 1000 znakow i zapisz je do pliku, a nastepnie odczytaj pliku i wypisz na ekran. Utworz dwie rozne pary procedur zapisujaco/odczytujacych, raz korzystajac z pakietu java.io a drugi raz z pakietu java.nio. Porownaj szybkosc zapisu i odczytu, wynik wypisz na ekranie. */
