
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tugce
 */
public class MayinTarlasi {
            int rownumber=4, colnumber=4,size;
        int[][] map;
        int[][] board;
        boolean game=true;
        
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        
          MayinTarlasi(int rownumber, int colnumber){
        this.rownumber=rownumber;
        this.colnumber=colnumber;
        this.map=new int[rownumber][colnumber];
        this.board=new int[rownumber][colnumber];
        this.size=rownumber*colnumber;
}
          public void run(){
              int row,col,success=0;
              preparegame();
              print(map);
              System.out.println("\nOyun Başladı :)");
              while(game){
                  print(board);
                  System.out.print("Satır :");
                  row=scan.nextInt();
                  System.out.print("Sütun :");
                  col=scan.nextInt();
                  if(row<=0 || row>=rownumber){
                      System.out.print("Geçersiz koordinat!");
                      continue;
                  }
                   if(col<=0 || col>=colnumber){
                      System.out.print("Geçersiz koordinat!");
                      continue;
                  }
                  if(map[row][col]!= -1){
                      check(row,col);
                      success++;
                      if(success==(size-(size/4))){
                          System.out.println("Başardınız! Hiçbir mayına basmadınız.");
                      }
                  }else{
                      game=false;
                      System.out.println("Game over");
                  }
                  break;
              }
          }
          public void check(int r,int c){
              if(map[r][c]==0){
              
              if((c<colnumber -1)&&(map[r][c+1]== -1)){
                  board[r][c]++;
              }
              if((r<rownumber -3)&&(map[r+1][c]== -1)){
                  board[r][c]++;
              }
              if((r>0)&&(map[r-1][c]== -1)){
                  board[r][c]++;
              }
              if((c>0)&&(map[r][c-1]== -1)){
                  board[r][c]++;
              }
              if(board[r][c]==0){
                  board[r][c]= -2;
              }
              }
}
          public void preparegame(){
              int randrow,randcol,count=0;
              while(count!=(size/4)){
                  randrow=rand.nextInt(rownumber);
                  randcol=rand.nextInt(colnumber);
                  if(map[randrow][randcol]!= -1){
                      map[randrow][randcol]= -1;
                      count ++;
                  }
              }
          }
          public void print(int arr[][]){
                for (int[] arr1 : arr) {
                    for (int j = 0; j<arr.length; j++) {
                        if (arr1[j] <= 0) {
                            System.out.println((" "));
                        }
                        System.out.print(arr1[j] + "");
                    }
                }
          }
}
