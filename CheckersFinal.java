package checkers;

import java.util.Scanner;

public class CheckersFinal {
	public static int p = 12;
	public static int z = 12;
	public static void main(String[] args) {
		String [][] board2= new String[10][10];
		Scanner lemon= new Scanner(System.in);
		Piece [] P1=new Piece[12];
		Piece [] P2=new Piece[12];
		
		for(int height=1;height<=8;height++) {
			for(int lenth=1; lenth<=8;lenth++) {
				board2[height][lenth]="___";
			}
		}
		for(int height=0;height<=8;height++) {
			board2[height][0]="void";
			board2[height][9]="void";
			board2[9][height]="void";
			board2[0][height]="void";
		}
	
		P1[0]=new Piece(1,1,false,true);
		P1[1]=new Piece(3,1,false,true);
		P1[2]=new Piece(5,1,false,true);
		P1[3]=new Piece(7,1,false,true);
		P1[4]=new Piece(2,2,false,true);
		P1[5]=new Piece(4,2,false,true);
		P1[6]=new Piece(6,2,false,true);
		P1[7]=new Piece(8,2,false,true);
		P1[8]=new Piece(1,3,false,true);
		P1[9]=new Piece(3,3,false, true);
		P1[10]=new Piece(5,3,false, true );
		P1[11]=new Piece(7,3,false,true);

		board2[P1[0].getXcoordinate()][P1[0].getYcoordinate()]="O1_";
		board2[P1[1].getXcoordinate()][P1[1].getYcoordinate()]="O2_";
		board2[P1[2].getXcoordinate()][P1[2].getYcoordinate()]="O3_";
		board2[P1[3].getXcoordinate()][P1[3].getYcoordinate()]="O4_";
		board2[P1[4].getXcoordinate()][P1[4].getYcoordinate()]="O5_";
		board2[P1[5].getXcoordinate()][P1[5].getYcoordinate()]="O6_";
		board2[P1[6].getXcoordinate()][P1[6].getYcoordinate()]="O7_";
		board2[P1[7].getXcoordinate()][P1[7].getYcoordinate()]="O8_";
		board2[P1[8].getXcoordinate()][P1[8].getYcoordinate()]="O9_";
		board2[P1[9].getXcoordinate()][P1[9].getYcoordinate()]="O10";
		board2[P1[10].getXcoordinate()][P1[10].getYcoordinate()]="O11";
		board2[P1[11].getXcoordinate()][P1[11].getYcoordinate()]="O12";
		
		P2[0] = new Piece (2,8,false,true);
		P2[1]=new Piece(4,8,false,true);
		P2[2]=new Piece(6,8,false,true);
		P2[3]=new Piece(8,8,false,true);
		P2[4]=new Piece(1,7,false,true);
		P2[5]=new Piece(3,7,false,true);
		P2[6]=new Piece(5,7,false,true);
		P2[7]=new Piece(7,7,false,true);
		P2[8]=new Piece(2,6,false,true);
		P2[9]=new Piece(4,6,false,true );
		P2[10]=new Piece(6,6,false,true );
		P2[11]=new Piece(8,6,false,true);
		

		board2[P2[0].getXcoordinate()][P2[0].getYcoordinate()]="T1_";
		board2[P2[1].getXcoordinate()][P2[1].getYcoordinate()]="T2_";
		board2[P2[2].getXcoordinate()][P2[2].getYcoordinate()]="T3_";
		board2[P2[3].getXcoordinate()][P2[3].getYcoordinate()]="T4_";
		board2[P2[4].getXcoordinate()][P2[4].getYcoordinate()]="T5_";
		board2[P2[5].getXcoordinate()][P2[5].getYcoordinate()]="T6_";
		board2[P2[6].getXcoordinate()][P2[6].getYcoordinate()]="T7_";
		board2[P2[7].getXcoordinate()][P2[7].getYcoordinate()]="T8_";
		board2[P2[8].getXcoordinate()][P2[8].getYcoordinate()]="T9_";
		board2[P2[9].getXcoordinate()][P2[9].getYcoordinate()]="T10";
		board2[P2[10].getXcoordinate()][P2[10].getYcoordinate()]="T11";
		board2[P2[11].getXcoordinate()][P2[11].getYcoordinate()]="T12";
		
		System.out.print("_________________________________");
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][8]+"|"+board2[2][8]+"|"+board2[3][8]+"|"+board2[4][8]+"|"+board2[5][8]+"|"+board2[6][8]+"|"+board2[7][8]+"|"+board2[8][8]+"|"+8);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][7]+"|"+board2[2][7]+"|"+board2[3][7]+"|"+board2[4][7]+"|"+board2[5][7]+"|"+board2[6][7]+"|"+board2[7][7]+"|"+board2[8][7]+"|"+7);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][6]+"|"+board2[2][6]+"|"+board2[3][6]+"|"+board2[4][6]+"|"+board2[5][6]+"|"+board2[6][6]+"|"+board2[7][6]+"|"+board2[8][6]+"|"+6);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][5]+"|"+board2[2][5]+"|"+board2[3][5]+"|"+board2[4][5]+"|"+board2[5][5]+"|"+board2[6][5]+"|"+board2[7][5]+"|"+board2[8][5]+"|"+5);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][4]+"|"+board2[2][4]+"|"+board2[3][4]+"|"+board2[4][4]+"|"+board2[5][4]+"|"+board2[6][4]+"|"+board2[7][4]+"|"+board2[8][4]+"|"+4);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][3]+"|"+board2[2][3]+"|"+board2[3][3]+"|"+board2[4][3]+"|"+board2[5][3]+"|"+board2[6][3]+"|"+board2[7][3]+"|"+board2[8][3]+"|"+3);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][2]+"|"+board2[2][2]+"|"+board2[3][2]+"|"+board2[4][2]+"|"+board2[5][2]+"|"+board2[6][2]+"|"+board2[7][2]+"|"+board2[8][2]+"|"+2);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][1]+"|"+board2[2][1]+"|"+board2[3][1]+"|"+board2[4][1]+"|"+board2[5][1]+"|"+board2[6][1]+"|"+board2[7][1]+"|"+board2[8][1]+"|"+1);
		System.out.println("\n  1   2   3   4   5   6   7   8");
		
		System.out.println("Welcome to checkers. Player one's pieces have");
		System.out.println("the letter O in front of them. Player two's");
		System.out.println("pieces the letter T in front of them. To choose");
		System.out.println(" a piece type the number of the piece.(Ex. 3 or 12 )");
		System.out.println("To kill a piece you must enter the xcoordinate of the piece \nthat you want to kill. If there are multiple\npieces to kill type the x coordinate of first piece to be killed\n. If a piece is a king you must enter the y coordinate as well as the x coordinate of the piece that you want to kill.\n If you type the wrong numbers you will be asked to choose again.\n However DO NOT TYPE ANY LETTERS. There is no move that requires letter\n inputs. The game will shut down if you input a letter. ");
		 
		while ((P2[0].getAlive()==true ||P2[1].getAlive()==true||P2[2].getAlive()==true||P2[3].getAlive()==true||P2[4].getAlive()==true||P2[5].getAlive()==true||P2[6].getAlive()==true||P2[7].getAlive()==true||P2[8].getAlive()==true||P2[9].getAlive()==true||P2[10].getAlive()==true||P2[11].getAlive()==true) && (P1[0].getAlive()==true||P1[1].getAlive()==true||P1[2].getAlive()==true||P1[3].getAlive()==true||P1[4].getAlive()==true||P1[5].getAlive()==true||P1[6].getAlive()==true||P1[7].getAlive()==true||P1[8].getAlive()==true||P1[9].getAlive()==true||P1[10].getAlive()==true||P1[11].getAlive()==true)) {
			int killcode1=5;
			if(P1[0].getAlive()==true||P1[1].getAlive()==true||P1[2].getAlive()==true||P1[3].getAlive()==true||P1[4].getAlive()==true||P1[5].getAlive()==true||P1[6].getAlive()==true||P1[7].getAlive()==true||P1[8].getAlive()==true||P1[9].getAlive()==true||P1[10].getAlive()==true||P1[11].getAlive()==true) {
			while (killcode1==5) {
				System.out.println("\nPlayer one please choose which piece to move");
				int FirstChoice=lemon.nextInt();
				lemon.nextLine();
				System.out.println("Where should the x coordinate be.");
				int XCoordinate =lemon.nextInt();
				lemon.nextLine();
				
				if (FirstChoice<=12 && FirstChoice>=1)	{
					
					if(P1[FirstChoice-1].getKing()==true) {
						int x=24;
						while (x==24) {
						System.out.println("what should the y coordinate be");
						int YCoordinate =lemon.nextInt();
						if (YCoordinate==P1[FirstChoice-1].getYcoordinate() - 1) {
							x=25;
							if ((XCoordinate==P1[FirstChoice-1].getXcoordinate()-1 || XCoordinate==P1[FirstChoice-1].getXcoordinate()+1) && XCoordinate>0 && XCoordinate<9 && board2[(XCoordinate)][(P1[FirstChoice-1].getYcoordinate()-1)]==("___") && P1[FirstChoice-1].getAlive()==true ) {
								P1[FirstChoice-1].setXcoordinate(XCoordinate);
								P1[FirstChoice-1].setYcoordinate(P1[FirstChoice-1].getYcoordinate()-1);
								killcode1=234;
								}
							else if ((XCoordinate==P1[FirstChoice-1].getXcoordinate()-1 ) && XCoordinate>0 && XCoordinate<9  && (board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T12")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T11")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T10")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T9_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T8_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T7_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T6_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T5_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T4_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T3_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T2_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T1_")) && board2[P1[FirstChoice-1].getXcoordinate()-2][P1[FirstChoice-1].getYcoordinate()-2]=="___" && P1[FirstChoice-1].getAlive()==true ){
								killpieceleft2front(XCoordinate, board2, P1[FirstChoice-1], P2, z, 0);
								killcode1=234;
							}                                                                                                                                                                                                                                            //stop heere wniwgiugoqrhgi wuhqwi ithei wqthuie iohtiu 
							else if ((XCoordinate==P1[FirstChoice-1].getXcoordinate()+1 ) && XCoordinate>0 && XCoordinate<9  && (board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T12")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T11")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T10")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T9_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T8_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T7_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T6_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T5_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T4_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T3_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T2_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()-1)].equals("T1_")) && board2[P1[FirstChoice-1].getXcoordinate()+2][P1[FirstChoice-1].getYcoordinate()-2]=="___" && P1[FirstChoice-1].getAlive()==true ){
								killpieceleft2front(XCoordinate, board2, P1[FirstChoice-1], P2, z,0);
								killcode1=234;
							
							}
							}
						if (YCoordinate==P1[FirstChoice-1].getYcoordinate() + 1) {
								killcode1=234251;
								x=24234;
							}
						else if (x==24){
							System.out.println("This y coordinate does not work. Please choose another y coordinate");
							
							}
						}
					}
					
					if ((XCoordinate==P1[FirstChoice-1].getXcoordinate()-1 || XCoordinate==P1[FirstChoice-1].getXcoordinate()+1) && XCoordinate>0 && XCoordinate<9 && board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("___") && P1[FirstChoice-1].getAlive()==true) {
						P1[FirstChoice-1].setXcoordinate(XCoordinate);
						P1[FirstChoice-1].setYcoordinate(P1[FirstChoice-1].getYcoordinate()+1);
						killcode1=23;
					
					}
					else if ((XCoordinate==P1[FirstChoice-1].getXcoordinate()-1 ) && XCoordinate>0 && XCoordinate<9 && (board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T12")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T11")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T10")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T9_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T8_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T7_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T6_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T5_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T4_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T3_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T2_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T1_")) && board2[P1[FirstChoice-1].getXcoordinate()-2][P1[FirstChoice-1].getYcoordinate()+2]=="___" && P1[FirstChoice-1].getAlive()==true ){
						killpieceleft1front(XCoordinate, board2, P1[FirstChoice-1], P2, z, 0,P1);
						killcode1=23;
						
					}
					else if (( XCoordinate==P1[FirstChoice-1].getXcoordinate()+1) && XCoordinate>0 && XCoordinate<9  && (board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T12")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T11")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T10")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T9_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T8_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T7_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T6_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T5_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T4_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T3_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T2_")||board2[XCoordinate][(P1[FirstChoice-1].getYcoordinate()+1)].equals("T1_")) && board2[P1[FirstChoice-1].getXcoordinate()+2][P1[FirstChoice-1].getYcoordinate()+2]=="___" && P1[FirstChoice-1].getAlive()==true  ){
						killpieceleft1front(XCoordinate, board2, P1[FirstChoice-1], P2, z,0,P1);						
						killcode1=23;
									
					}
				}
				if (killcode1==5) {
					System.out.println("This move does not work");
					}
				}
			}
				
			printBoard(board2, P1, P2);
			if(P2[0].getAlive()==true||P2[1].getAlive()==true||P2[2].getAlive()==true||P2[3].getAlive()==true||P2[4].getAlive()==true||P2[5].getAlive()==true||P2[6].getAlive()==true||P2[7].getAlive()==true||P2[8].getAlive()==true||P2[9].getAlive()==true||P2[10].getAlive()==true||P2[11].getAlive()==true) {
			int killcode2=5;
			while (killcode2==5) {
				System.out.println("\nPlayer two please choose which piece to move");
				int FirstChoice2=lemon.nextInt();
				lemon.nextLine();
				System.out.println("Where should the x coordinate be.");
				int XCoordinate =lemon.nextInt();
				lemon.nextLine();
				
				if(P2[FirstChoice2-1].getKing()==true) {
					int x=24;
					while (x==24) {
					System.out.println("what should the y coordinate be");
					int YCoordinate =lemon.nextInt();
					if (YCoordinate==P2[FirstChoice2-1].getYcoordinate() + 1) {
						x=25;
						if ((XCoordinate==P2[FirstChoice2-1].getXcoordinate()-1 || XCoordinate==P2[FirstChoice2-1].getXcoordinate()+1) && XCoordinate>0 && XCoordinate<9 && board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("___") && P2[FirstChoice2-1].getAlive()==true) {
							P2[FirstChoice2-1].setXcoordinate(XCoordinate);
							P2[FirstChoice2-1].setYcoordinate(P2[FirstChoice2-1].getYcoordinate()+1);
							killcode2=234;
						
						}//werwr //wrw2t //wg2g4 //23r22 //r2g
						else if ((XCoordinate==P2[FirstChoice2-1].getXcoordinate()-1 ) && XCoordinate>0 && XCoordinate<9 && (board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("012")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O11")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O10")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O9_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O8_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O7_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O6_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O5_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O4_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O3_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O2_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O1_")) && board2[P2[FirstChoice2-1].getXcoordinate()-2][P2[FirstChoice2-1].getYcoordinate()+2]=="___" && P2[FirstChoice2-1].getAlive()==true ){
							killpieceleft1front(XCoordinate, board2, P2[FirstChoice2-1], P1, z, 0,P2);
							killcode2=234;
							
						}
						else if (( XCoordinate==P2[FirstChoice2-1].getXcoordinate()+1) && XCoordinate>0 && XCoordinate<9  && (board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O12")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("T11")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O10")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O9_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O8_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("07_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O6_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O5_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O4_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O3_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O2_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()+1)].equals("O1_")) && board2[P2[FirstChoice2-1].getXcoordinate()+2][P2[FirstChoice2-1].getYcoordinate()+2]=="___" && P2[FirstChoice2-1].getAlive()==true  ){
							killpieceleft1front(XCoordinate, board2, P2[FirstChoice2-1], P1, z ,0, P2);						
							killcode1=234;
										
						}
						
						}
					if (YCoordinate==P2[FirstChoice2-1].getYcoordinate() - 1) {
						killcode2=234251;
						x=24234;
					}
					else if (x==24){
						System.out.println("This move does not work. Please choose another y coordinate");
						
						}
					}
				}
				if(FirstChoice2>0 && FirstChoice2<13) {
					if ((XCoordinate==P2[FirstChoice2-1].getXcoordinate()-1 || XCoordinate==P2[FirstChoice2-1].getXcoordinate()+1) && XCoordinate>0 && XCoordinate<9  && board2[(XCoordinate)][(P2[FirstChoice2-1].getYcoordinate()-1)]==("___") && P2[FirstChoice2-1].getAlive()==true ) {
						P2[FirstChoice2-1].setXcoordinate(XCoordinate);
						P2[FirstChoice2-1].setYcoordinate(P2[FirstChoice2-1].getYcoordinate()-1);
						killcode2=25;
					}
					else if ((XCoordinate==P2[FirstChoice2-1].getXcoordinate()-1 ) && XCoordinate>0 && XCoordinate<9  && (board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O12")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O11")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O10")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O9_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O8_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O7_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O6_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O5_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O4_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O3_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O2_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O1_")) && board2[P2[FirstChoice2-1].getXcoordinate()-2][P2[FirstChoice2-1].getYcoordinate()-2]=="___" && P2[FirstChoice2-1].getAlive()==true ){
						killpieceleft2front(XCoordinate, board2, P2[FirstChoice2-1], P1, z, 0);
						killcode2=25;
					}
					else if ((XCoordinate==P2[FirstChoice2-1].getXcoordinate()+1 ) && XCoordinate>0 && XCoordinate<9  && (board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O12")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O11")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O10")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O9_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O8_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O7_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O6_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O5_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O4_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O3_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O2_")||board2[XCoordinate][(P2[FirstChoice2-1].getYcoordinate()-1)].equals("O1_")) && board2[P2[FirstChoice2-1].getXcoordinate()+2][P2[FirstChoice2-1].getYcoordinate()-2]=="___" && P2[FirstChoice2-1].getAlive()==true ){
						killpieceleft2front(XCoordinate, board2, P2[FirstChoice2-1], P1, z,0);
						killcode2=25;
					
					}
					}
				if (killcode2==5) {
					System.out.println("This move does not work");
				}
			}
			}
			printBoard(board2, P1, P2);

			
		}
		if(P1[0].getAlive()==true||P1[1].getAlive()==true||P1[2].getAlive()==true||P1[3].getAlive()==true||P1[4].getAlive()==true||P1[5].getAlive()==true||P1[6].getAlive()==true||P1[7].getAlive()==true||P1[8].getAlive()==true||P1[9].getAlive()==true||P1[10].getAlive()==true||P1[11].getAlive()==true) {
			System.out.println("Player one is the winner");
		}
		else {
			System.out.println("Player two is the winner");
		}
	
	}
	public static void killpieceleft1front(int a, String [][] b,Piece c,Piece [] d,int e,int f,Piece[] g ) {
		
		int x=0;
		for(int z=0;z<=11;z++) {
			if (d[z].getAlive() == false) {
				continue;
				}
			if( (c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()+2]=="___") || (c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()+2]=="___") ) {
				x=x+1;
			}
				
			}
		
		if(x==2 && f==0) {
			int status=5;	
			f=f+1;	
			while (status==5) {
				
				System.out.println("You can actually kill a piece on the left or right. Press 1 to kill the left and 2 to kill the right");
				Scanner lemon= new Scanner(System.in);
				int choice=lemon.nextInt();
			
				if(choice==1) {
					for(int z=0;z<=11;z++ ) {
						// dead piece
						if (d[z].getAlive() == false) {
							continue;
						}
						if(c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()+2]=="___") {
							c.setXcoordinate(c.getXcoordinate()-2);
							c.setYcoordinate(c.getYcoordinate()+2);
							d[z].setAlive(false);
							e=e-1;
							f=0;
						}
					}
					killpieceleft1front(a,b,c,d,e,f,g);
					status=544;
				
				}
				if (choice==2) {
					for(int z=0;z<=11;z++ ) {
						// dead piece
						if (d[z].getAlive() == false) {
							continue;
						}
						if(c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()+2]=="___") {
							c.setXcoordinate(c.getXcoordinate()+2);
							c.setYcoordinate(c.getYcoordinate()+2);
							d[z].setAlive(false);
							//a=a+2;
							e=e-1;
						}
					}
					killpieceleft1front(a,b,c,d,e,f,g);
					status=544;
				}
				else {
					System.out.println("This move is invalid.");
				}
			
			}
		
		}
		for(int z=0;z<=11;z++ ) {
			// dead piece
			if (d[z].getAlive() == false) {
				continue;
			}
			if(c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()+2]=="___") {
				c.setXcoordinate(c.getXcoordinate()-2);
				c.setYcoordinate(c.getYcoordinate()+2);
				d[z].setAlive(false);
				e=e-1;
				f=0;
			}
		}
		
		for(int z=0;z<=11;z++ ) {
			// dead piece
			if (d[z].getAlive() == false) {
				continue;
			}
			if(c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()+2]=="___") {
				c.setXcoordinate(c.getXcoordinate()+2);
				c.setYcoordinate(c.getYcoordinate()+2);
				d[z].setAlive(false);
				//a=a+2;
				e=e-1;
			}
		}
			
		for(int z=0;z<=11;z++ ) {
			// dead piece
			if (d[z].getAlive() == false) {
				continue;
			}
			if( (c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()+2]=="___") || (c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()+1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()+2]=="___")) {
				f=0;
				killpieceleft1front(a,b,c,d,e, f,g);
				
			}
		}
	}
	

	public static void killpieceleft2front(int a, String [][] b,Piece c,Piece [] d,int e, int f ) {
		
		int x=0;
		for(int z=0;z<=11;z++) {
			if (d[z].getAlive() == false) {
				continue;
				}
			if( (c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()-2]=="___")||(c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()-2]=="___") ) {
				x=x+1;
			}
		}
		if(x==2 && f==0) {
			int status=5;	
			f=f+1;	
			while (status==5) {
				
				System.out.println("You can actually kill a piece on the left or right. Press 1 to kill the left and 2 to kill the right");
				Scanner lemon= new Scanner(System.in);
				int choice=lemon.nextInt();
				
				if (choice==1) {
					for(int z=0;z<=11;z++ ) {
						// dead piece
						if (d[z].getAlive() == false) {
							continue;
						}
						if(c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()-2]=="___") {
							c.setXcoordinate(c.getXcoordinate()-2);
							c.setYcoordinate(c.getYcoordinate()-2);
							d[z].setAlive(false);
							//a=a-2;
							e=e-1;
							
						}
					}
					killpieceleft2front(a,b,c,d,e,f);
					status=544;
					}
				if(choice==2) {
					for(int z=0;z<=11;z++ ) {
						// dead piece
						if (d[z].getAlive() == false) {
							continue;
						}
						if(c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()-2]=="___") {
							c.setXcoordinate(c.getXcoordinate()+2);
							c.setYcoordinate(c.getYcoordinate()-2);
							d[z].setAlive(false);
							//a=a+2;
							e=e-1;
						}
					}
					killpieceleft2front(a,b,c,d,e,f);
					status=544;
				}
				
				else {
					System.out.println("This move is invalid.");
				}
				}
			}
		for(int z=0;z<=11;z++ ) {
			// dead piece
			if (d[z].getAlive() == false) {
				continue;
			}
			if(c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()-2]=="___") {
				c.setXcoordinate(c.getXcoordinate()-2);
				c.setYcoordinate(c.getYcoordinate()-2);
				d[z].setAlive(false);
				//a=a-2;
				e=e-1;
				
			}
		}
		for(int z=0;z<=11;z++ ) {
			// dead piece
			if (d[z].getAlive() == false) {
				continue;
			}
			if(c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()-2]=="___") {
				c.setXcoordinate(c.getXcoordinate()+2);
				c.setYcoordinate(c.getYcoordinate()-2);
				d[z].setAlive(false);
				//a=a+2;
				e=e-1;
			}
		}
		for(int z=0;z<=11;z++ ) {
			// dead piece
			if (d[z].getAlive() == false) {
				continue;
			}
			if((c.getXcoordinate()-1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()-2][c.getYcoordinate()-2]=="___")||(c.getXcoordinate()+1==d[z].getXcoordinate() && c.getYcoordinate()-1==d[z].getYcoordinate() && a>0 && a<9 && b[c.getXcoordinate()+2][c.getYcoordinate()-2]=="___")) {
				killpieceleft2front(a,b,c,d,e, 0);
			}	
		}		
	}
	
	public static void printBoard(String[][] board2, Piece[] P1, Piece[] P2) {
		for(int height=1;height<=8;height++) {
			for(int lenth=1; lenth<=8;lenth++) {
				board2[height][lenth]="___";
			}
		}
		
		if (P1[0].getAlive()==true) {
			board2[P1[0].getXcoordinate()][P1[0].getYcoordinate()]="O1_";
			}
		if (P1[1].getAlive()==true) {
			board2[P1[1].getXcoordinate()][P1[1].getYcoordinate()]="O2_";
			}
		if (P1[2].getAlive()==true) {
			board2[P1[2].getXcoordinate()][P1[2].getYcoordinate()]="O3_";
			}
		if (P1[3].getAlive()==true) {
			board2[P1[3].getXcoordinate()][P1[3].getYcoordinate()]="O4_";
			}
		if (P1[4].getAlive()==true) {
			board2[P1[4].getXcoordinate()][P1[4].getYcoordinate()]="O5_";
			}
		if (P1[5].getAlive()==true) {
			board2[P1[5].getXcoordinate()][P1[5].getYcoordinate()]="O6_";
			}
		if (P1[6].getAlive()==true) {
			board2[P1[6].getXcoordinate()][P1[6].getYcoordinate()]="O7_";
			}
		if (P1[7].getAlive()==true) {
			board2[P1[7].getXcoordinate()][P1[7].getYcoordinate()]="O8_";
			}
		if (P1[8].getAlive()==true) {
			board2[P1[8].getXcoordinate()][P1[8].getYcoordinate()]="O9_";
			}
		if (P1[9].getAlive()==true) {
			board2[P1[9].getXcoordinate()][P1[9].getYcoordinate()]="O10";
			}
		if (P1[10].getAlive()==true) {
			board2[P1[10].getXcoordinate()][P1[10].getYcoordinate()]="O11";
			}
		if (P1[11].getAlive()==true) {
			board2[P1[11].getXcoordinate()][P1[11].getYcoordinate()]="O12";
			}
		if (P2[0].getAlive()==true) {
			board2[P2[0].getXcoordinate()][P2[0].getYcoordinate()]="T1_";
			}
		if (P2[1].getAlive()==true) {
			board2[P2[1].getXcoordinate()][P2[1].getYcoordinate()]="T2_";
			}
		if (P2[2].getAlive()==true) {
			board2[P2[2].getXcoordinate()][P2[2].getYcoordinate()]="T3_";
			}
		if (P2[3].getAlive()==true) {
			board2[P2[3].getXcoordinate()][P2[3].getYcoordinate()]="T4_";
			}
		if (P2[4].getAlive()==true) {
			board2[P2[4].getXcoordinate()][P2[4].getYcoordinate()]="T5_";
			}
		if (P2[5].getAlive()==true) {
			board2[P2[5].getXcoordinate()][P2[5].getYcoordinate()]="T6_";
			}
		if (P2[6].getAlive()==true) {
			board2[P2[6].getXcoordinate()][P2[6].getYcoordinate()]="T7_";
			}
		if (P2[7].getAlive()==true) {
			board2[P2[7].getXcoordinate()][P2[7].getYcoordinate()]="T8_";
			}
		if (P2[8].getAlive()==true) {
			board2[P2[8].getXcoordinate()][P2[8].getYcoordinate()]="T9_";
			}
		if (P2[9].getAlive()==true) {
			board2[P2[9].getXcoordinate()][P2[9].getYcoordinate()]="T10";
			}
		if (P2[10].getAlive()==true) {
			board2[P2[10].getXcoordinate()][P2[10].getYcoordinate()]="T11";
			}
		if (P2[11].getAlive()==true) {
			board2[P2[11].getXcoordinate()][P2[11].getYcoordinate()]="T12";
			}
		System.out.print("_________________________________");
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][8]+"|"+board2[2][8]+"|"+board2[3][8]+"|"+board2[4][8]+"|"+board2[5][8]+"|"+board2[6][8]+"|"+board2[7][8]+"|"+board2[8][8]+"|"+8);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][7]+"|"+board2[2][7]+"|"+board2[3][7]+"|"+board2[4][7]+"|"+board2[5][7]+"|"+board2[6][7]+"|"+board2[7][7]+"|"+board2[8][7]+"|"+7);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][6]+"|"+board2[2][6]+"|"+board2[3][6]+"|"+board2[4][6]+"|"+board2[5][6]+"|"+board2[6][6]+"|"+board2[7][6]+"|"+board2[8][6]+"|"+6);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][5]+"|"+board2[2][5]+"|"+board2[3][5]+"|"+board2[4][5]+"|"+board2[5][5]+"|"+board2[6][5]+"|"+board2[7][5]+"|"+board2[8][5]+"|"+5);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][4]+"|"+board2[2][4]+"|"+board2[3][4]+"|"+board2[4][4]+"|"+board2[5][4]+"|"+board2[6][4]+"|"+board2[7][4]+"|"+board2[8][4]+"|"+4);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][3]+"|"+board2[2][3]+"|"+board2[3][3]+"|"+board2[4][3]+"|"+board2[5][3]+"|"+board2[6][3]+"|"+board2[7][3]+"|"+board2[8][3]+"|"+3);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][2]+"|"+board2[2][2]+"|"+board2[3][2]+"|"+board2[4][2]+"|"+board2[5][2]+"|"+board2[6][2]+"|"+board2[7][2]+"|"+board2[8][2]+"|"+2);
		System.out.print("\n|   |   |   |   |   |   |   |   |");
		System.out.print("\n|"+board2[1][1]+"|"+board2[2][1]+"|"+board2[3][1]+"|"+board2[4][1]+"|"+board2[5][1]+"|"+board2[6][1]+"|"+board2[7][1]+"|"+board2[8][1]+"|"+1);
		System.out.println("\n  1   2   3   4   5   6   7   8");
		for(int km=0;km<=11;km++) {
			if (P1[km].getYcoordinate()==8) {
					P1[km].setKing(true);
				}
			if (P2[km].getYcoordinate()==1) {
					P2[km].setKing(true);
				}
			if (P1[km].getKing()==true) {
				System.out.println("Player one's O"+(km+1)+" piece is a king. It can move backwards.");
				}
			if (P2[km].getKing()==true) {
				System.out.println("Player two's T"+(km+1)+" piece is a king. It can move backwards.");
				}
			}
	}

}
