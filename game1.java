package game;
import java.util.*;

public class game1 {
	static Scanner s = new Scanner(System.in);
	static boolean Pobeda(){
		String b;
		System.out.println("If you want to continue game, then press the button 'n'");
		b = s.next();
		if(b.charAt(0) == 'n') {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		
		String str[] = new String[51];
		str[0] = "FOOTBALL";                str[1] = "NECESSARY";        str[2] = "KAZAKHSTAN";
		str[3] = "HOUSE";                   str[4] = "LANGUAGE";         str[5] = "ARYS";
		str[6] = "MOUNTAIN";                str[7] = "ZHOLBARYSKHAN";    str[8] = "PARKOVY";
		str[9] = "PLANE";                   str[10] = "ITTU";            str[11] = "ERUBAEV";
		str[12] = "DOG";                    str[13] = "UNIVERSITY";      str[14] = "ABAI";
		str[15] = "BANANA";                 str[16] = "MOTHER";          str[17] = "SHAKARIM";
		str[18] = "GRAPEFRUIT";             str[19] = "FATHER";          str[20] = "MONEY";
		str[21] = "TEXAS";                  str[22] = "SISTER";          str[23] = "BYCYCLE";
		str[24] = "LAPTOP";                 str[25] = "CHAIR";           str[26] = "STATISTICS";
		str[27] = "TELEVISOR";              str[28] = "RAILWAY";         str[29] = "ALMATY";
		str[30] = "ELECTROSITY";            str[31] = "CAR";             str[32] = "ANONYMOUS";
		str[33] = "CITY";                   str[34] = "PROFESSOR";       str[35] = "HOSPITAL";  
		str[36] = "JAVA";                   str[37] = "SWUITZERLAND";    str[38] = "PROVOCATIVELY";
		str[39] = "CONSOL";                 str[40] = "CHELSEA";         str[41] = "ARSENAL";
		str[42] = "MILITARY";               str[43] = "ENGLISH";         str[44] = "MANCHESTERCITY";
		str[46] = "PHENOMENON";             str[46] = "BASKETBALL";      str[47] = "BARSELONA";
		str[49] = "FEBRUARY";               str[49] = "VOLLEYBALL";      str[50] = "JUVENTUS";
		int c = 0,p = 0,win = 0,lose = 0;
		int o = 0;
		String a = "";
				
		char[] otvet = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		boolean igra = true;
		boolean Utyldyn = true;
		boolean pobeda = false ;
		boolean tok  = true;
		boolean povtor = true;
		
		Scanner st = new Scanner(System.in);
		
		while(Utyldyn == true){
			int random = (int)(Math.random() * (str.length));
			for(int i = 0;i < str[random].length();i++) {
				otvet[i] = '?';
			}
			int s = str[random].length();
			System.out.println("Would you like to play?  (Enter 'Y' and then enter if yes)");
			
			a = st.next();
			
			if(a.charAt(0)=='y'||a.charAt(0) == 'Y') {
				igra = true;
				System.out.println(otvet);
			}
			else
				igra = false;
			int r = 0;
			int q = 0;
			boolean hh = true;
			boolean prav = true;
			String pov = " ";
			int v = 10;
			if(igra == true) {
				while(igra == true) {
					System.out.println("Choose the letter!!!");
					a = st.next();
					a = a.toUpperCase();
					povtor = true;
						r++;
						hh = true;
						while(hh == true) {
							for(int i = 0; i < r;i++) {
								if(pov.charAt(i) == a.charAt(0)) {
									povtor = false;
								}
							}
							pov += a;
							hh = false;
						}
						if(povtor==false) {
							System.out.println("You have already choosen this letter.Please choose another letter!");
						}
						if(povtor==true) {
						for(int j = 0;j < str[random].length();j++) {
							if(a.charAt(0) == str[random].charAt(j)) {
								otvet [j] = str[random].charAt(j);
								s--;
							}
							else {
								p++;
							}
						}
					
						if(p==str[random].length()) {
							v--;
							System.out.println("You haven't guessed the letter((");
							System.out.println("You have " + v + " life left");
							c++;
							if(c == 10)
								igra = false;
						}
						p = 0;
						System.out.println(otvet);
						if(s == 0) {
							igra = false;
						}
					}
					a = "";
				
				}
			}
			
			else 
				Utyldyn = false;
			
				c = 0;
			if(s == 0) {
				pobeda = true;
			}
			p = 0;
			o = 0;
			if(pobeda == true) {
				System.out.println("You win!!!");
				System.out.println("The word was " + str[random]);
				win++;
				System.out.println("Your win: "+win);
				System.out.println("Your lose: "+lose);
				if(Pobeda()==true) {
					Utyldyn = true;
				}
				else{
					Utyldyn = false;
				}
			}
			else{
				System.out.println("You Lose!");
				System.out.println("The word was " + str[random]);
				lose++;
				System.out.println("Your win: "+win);
				System.out.println("Your lose: "+lose);
				if(Pobeda()==false) {
					Utyldyn = false;
				}
				else {
					Utyldyn = true;
				}
			}
			s = 0;
			
			str[random]  = "";
			random = 0;
			c = 0;
		}
	}
}
