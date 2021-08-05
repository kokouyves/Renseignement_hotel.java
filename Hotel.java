package hotel;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Hotel {

   
    public static void main(String[] args) {
        Chambre p = new Chambre(44 , 44 , 55) ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le numero de la chambre");
        int numero = sc.nextInt() ;
        System.out.println("Entrer le nombre de chaise");
        int nbrechaise = sc.nextInt();
        System.out.println("Entrer le nombre de lit");
        int nbrelit = sc.nextInt();
        p.setnumero(numero);
        p.setnbrechaise(nbrechaise);
        p.setnbrelit(nbrelit);
        p.affiche();
        testHotel n = new testHotel("kk" , "ll","ff", p);
        Scanner c = new Scanner(System.in);
        System.out.println("Entre le nom");
        String nom = c.nextLine();
        System.out.println("Entrer le nom du proprietaire");
        String proprietaire = c.nextLine();
        System.out.println("Entrer la localisation");
        String localisation = c.nextLine();
        n.setlocalisation(localisation);
        n.setnom(nom);
        n.setproprietaire(proprietaire);
        n.affiche(nom, proprietaire);
        n.affiche(nom, proprietaire, localisation);
    }
    
}
