/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/*
Casa memoriabila 
-  

 */
public class CasaMemoriala extends Turism {

    public String Proprietar;
    public String EvenimentMemorial;
    public String tipCladire; //conac cetate casa 
    public CasaMemoriala() {
        super();
        this.Proprietar = "Necunoscut";
        this.EvenimentMemorial="Nimic";
        tipCladire = "Necunoscut";
       
    }

    public CasaMemoriala(String nume, String adresa, int program[], float rating, double[] pret, String tipCladire, int an, String Proprietar,String EvenimentMemoriala) {
        super(nume, adresa, program, rating, pret);
        this.Proprietar = Proprietar;
        this.EvenimentMemorial=EvenimentMemoriala;
        this.tipCladire=tipCladire;
      
    }

    public CasaMemoriala(CasaMemoriala m) {
        super(m);
        this.Proprietar = m.Proprietar;
        this.EvenimentMemorial=m.EvenimentMemorial;
        this.tipCladire=m.tipCladire;
     
    }

    public void cumparBilet(int nrCopii, int nrAdulti) throws Exception {
        System.out.println("******Bine ai venit la: " + nume + " ********");
        System.out.println("Pret la adulti este : " + pret[1] + "lei.   \nPret la copii: " + pret[0] + " lei.");

        if (nrCopii <= 0 && nrAdulti <= 0) {
            throw new Exception("Nu ati setata corect numarul de adulti si/sau copii");
        }

        bill += nrCopii * pret[0] + nrAdulti * pret[1];
        System.out.println("Nr de adulti: " + nrAdulti + " \nNr de copii " + nrCopii + " va ajunge la pretul de " + (nrCopii * pret[0] + nrAdulti * pret[1]) + " lei\n\n");
    }

  
    public void vreaGhid(){
    System.out.println("Taxa pentru ghid este "+pret[2]);
    bill +=pret[2];
    
    }
    
    public void vreaSceneta(){
    System.out.println("Pretul la sceneta este "+pret[3]);
    bill+=pret[3];
    
    }
    
    public void vreaSaDoneze(double donare) {
        System.out.println("Vizitatorii vor dona: " );
        bill += donare;

    }
    
    

    @Override
    public String toString() {
        return super.toString() +"\nTip cladire: "+this.tipCladire +"\n Autor: " + Proprietar+"\nEveniment memorial: "+this.EvenimentMemorial+"\n\n";
    }

}
