/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodarry;

/**
 *
 * @author gmoce
 */
public class TwoDArry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int twoD [][]=new int [4][5];
         
         int number [][]= { {1,2,3,6}
                 ,          {4,5,6,0},
                            {7,8,9,90}      };
         
           String name [][]= { {"very","db","go","momgo"},
                               {"web","is","jsp","strong"},
                               {"java","h2","o2","vb"}
                   
                        };
         twoD [0][0]=56;
         twoD [3][4]=100;
         System.out.println("The value in index [0][0] is:"+number[0][0]);
         System.out.println("The value in index [0][1] is:"+number[0][1]);
          System.out.println("The value in index [0][2] is:"+number[0][2]);
          // compelt other ....
        System.out.println(name[2][0]+" "+name[1][1]+" "+name[0][0]+" "+name[1][3]+" ");
         
         
         
    }
    
}
