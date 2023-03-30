package tictactoe;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static  int num_x = 0, num_o = 0,num=0;
    static boolean istrue=true;
    static String res;

    public static void printField(String[][] field) {
        System.out.println("----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("----------");
    }
    public static String result(String[][] field) {

        if(field[0][0].equals(field[0][1])&&field[0][0].equals(field[0][2])){res=field[0][0];}
         else if(field[1][0].equals(field[1][1])&&field[1][0].equals(field[1][2])){ res=field[1][0];}
        else if(field[0][0].equals(field[1][0])&&field[1][0].equals(field[2][0])){ res=field[0][0];}
        else if(field[0][1].equals(field[1][1])&&field[1][1].equals(field[2][1])){ res=field[0][1];}
        else if(field[0][2].equals(field[1][2])&&field[1][2].equals(field[2][2])){ res=field[2][2];}
         else  if (field[2][0].equals(field[2][1])&&field[2][1].equals(field[2][2])) { res=field[2][0];}
         else   if (field[0][0].equals(field[1][1])&&field[1][1].equals(field[2][2])) { res=field[0][0];}
         else if (field[2][0].equals(field[1][1])&&field[2][0].equals(field[0][2])){ res=field[0][2];}
            return res;
        }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       String[][] field = new String[3][3];

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                field[i][j] = "  ";
                if (field[i][j].equals(" X")) num_x++;
                if (field[i][j].equals(" O")) num_o++;
            }
        }
        printField(field);
        while (istrue) {

            num_o=0;
            num_x=0;
            num=0;
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {

                    if (Objects.equals(field[i][j], " X")) num_x++;

                    if (Objects.equals(field[i][j], " O")) num_o++;
                    if (Objects.equals(field[i][j], "  ")) num++;
                }}
if (num==0){
    istrue=false;

}
            int x1, x2;
            try {
                x1 = s.nextInt();
                x2 = s.nextInt();
                if (x1 < 1 || x1 > 3 || x2 < 1 || x2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    if (!Objects.equals(field[x1 - 1][x2 - 1], "  ")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        if(num_o==num_x) {
                            field[x1 - 1][x2 - 1] = " X";
                        }else{
                            field[x1 - 1][x2 - 1] = " O";
                        }

                    }
                }
            } catch(Exception e) {
                System.out.println("You should enter numbers!");
            }
            printField(field);
            if (result(field).equals(" X")) {System.out.println("X wins");break;}
            else if (result(field).equals(" O")) {System.out.println("O wins!");break;}
            else if(num==0){System.out.println("Draw");}


            }

    }
}
