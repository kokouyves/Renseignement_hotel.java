
package hotel;

/**
 *
 * @author  Yves
 */
public class Chambre {
    private int numero ;
    private int nbrechaise ;
    private int nbrelit  ;
   
    
    public Chambre(int numero , int nbrechaise ,int nbrelit)
    {
        this.numero = numero ;
        this.nbrechaise = nbrechaise ;
        this.nbrelit = nbrelit ;
    }
     public void setnumero(int numero){
         this.numero=numero ;
     }
     public void setnbrelit(int nbrelit){
         this.nbrelit=nbrelit ;
     }
     public void setnbrechaise(int nbrechaise){
         this.nbrechaise=nbrechaise ;
     }
     public int getnumero(){
         return numero ;
     }
      public int getnbrelit(){
         return nbrelit ;
     }
       public int getnbrechaise(){
         return nbrechaise ;
     }
       public void affiche(){
           System.out.println("Bienvenue , diriger vous vers la chambre numero"+this.numero+"elle comporte"+this.nbrelit+"lit"+"avec "+this.nbrechaise+"chaise");
       }
}
