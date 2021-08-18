/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author kurdistan
 */
public class Switch {

    public static void main(String[] args) {
int x=14;
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                      System.out.println("2");
                break;
                default:
                    System.out.println("Sorry We cant found any case");
            
        }

        String season = "Autumn";

        switch (season) {

            case "winter":
                System.out.println("December ,January ,February");
                break;
            case "Spring":
                 System.out.println("March,April ,May");
                break;

            case " Summer":
                 System.out.println("June ,july ,August");
                break;
            case "Autumn":
                 System.out.println("The Autumn season is   :"+"Sptember ,October ,November");
                break;
                
                default: 
                     System.out.println("Sorry we dont have this season pleas check your input");
        }

    }
}
