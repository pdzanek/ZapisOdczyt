import java.util.Random;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ZapisOdczyt{
	public static void main(String[] args){
	long start, koniec;
	Random randChar = new Random();
	char charTable[] = new char[1000];
	for(int i=0;i<1000;i++){
	 	charTable[i]=(char)(randChar.nextInt(94)+33);
	}
	try{
 		start=System.currentTimeMillis();
		File fileIO= new File("zapisIO.txt");
		PrintWriter zapisIO = new PrintWriter(fileIO);
			zapisIO.println(charTable);
			zapisIO.close();
		char odczytaneIO[] = new char[1000];
		FileReader odczytIO = new FileReader(fileIO);
			odczytIO.read(odczytaneIO);
			odczytIO.close();
		koniec=System.currentTimeMillis();
		System.out.println(odczytaneIO);
		System.out.println("java.io czas: "+(koniec-start));
		System.out.println();
	}catch(Exception e)
		{
			System.out.println(e.getMessage());	
		}

		try{
		start=System.currentTimeMillis();
		FileChannel fileChannel = new FileOutputStream("zapisNIO.txt").getChannel();
		byte[] b = new byte[1000];
		for( int i=0; i<1000;i++) b[i]=(byte)charTable[i];
		ByteBuffer byteBuffer=ByteBuffer.wrap(b);
		fileChannel.write(byteBuffer);
		fileChannel = new FileInputStream("zapisNIO.txt").getChannel();
		byteBuffer.rewind();
		fileChannel.read(byteBuffer);
		char[] odczytaneNIO=new char[1000];
		b=byteBuffer.array();
		for(int i=0;i<1000;i++) odczytaneNIO[i]=(char)b[i];
		koniec=System.currentTimeMillis();
		System.out.println(odczytaneNIO);
		System.out.println("java.nio czas: "+(koniec-start));
	}catch(Exception e)
		{
			System.out.println(e.getMessage());	
		}
	}
}


/*Napisz program losujacy 1000 znakow i zapisz je do pliku, a nastepnie odczytaj pliku i wypisz na ekran. Utworz dwie rozne pary procedur zapisujaco/odczytujacych, raz korzystajac z pakietu java.io a drugi raz z pakietu java.nio. Porownaj szybkosc zapisu i odczytu, wynik wypisz na ekranie. */
