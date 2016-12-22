package com.company;

/**
 * Created by jg101 on 12/19/16.
 */
public class Board {


    public static String[] plot(int inx, int iny,boolean turn){

        String [] prin = new String[3];
        prin[0] = "| | | |";
        prin[1] = "| | | |";
        prin[2] = "| | | |";

        int bolI = 0;
        char mark;
        if (turn){
            mark = 'X';
        }
        else {
            mark = 'O';
        }
        switch (iny) {
            case 1:  bolI = 0;
                break;
            case 2:  bolI = 3;
                break;
            case 3:  bolI = 6;
                break;
            default: break;
        }
        switch (inx) {
            case 2:
                bolI = bolI + 1;
                break;
            case 3:
                bolI = bolI + 2;
                break;
        }
        switch (bolI){
                case 0: prin[0].replace(prin[0].charAt(1),mark);
                    break;
                case 1: prin[0].replace(prin[0].charAt(3),mark);
                    break;
                case 2: prin[0].replace(prin[0].charAt(3),mark);
                    break;
                case 3: prin[0].replace(prin[1].charAt(1),mark);
                    break;
                case 4: prin[0].replace(prin[1].charAt(3),mark);
                    break;
                case 5: prin[0].replace(prin[1].charAt(3),mark);
                    break;
                case 6: prin[2].replace(prin[0].charAt(1),mark);
                    break;
                case 7: prin[2].replace(prin[0].charAt(3),mark);
                    break;
                case 8: prin[2].replace(prin[0].charAt(3),mark);
                    break;
            }





        return prin;
    }


}
