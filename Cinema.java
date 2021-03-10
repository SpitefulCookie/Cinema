import java.util.Date;

public class Cinema {
    
    Persona[] registi;

    Sala[] sale;

    Film[] film;

    Proiezione[] proiezioni;

    Biglietto[] biglietti;

    public Cinema(){

        // ...

    }

    public int postiLiberi(Proiezione p){

        int postiSala = p.sala.capienza;

        for(int i=0; i<biglietti.length; i++){

            if (biglietti[i].proiezione==p){

                postiSala--;

            }

        }

        return postiSala;

    }

    /*

    public double vendiBiglietto(Film f, Date d, Sala s){

        Proiezione p;

        p = new Proiezione(f,d,s); //setup costruttore

        Biglietto b = new Biglietto(p);

        if((new Date() - spettatore.dataDiNascita)<18){ //pseudocodice

            b.prezzo = b.prezzo * 0.7;

        }
            
        return b;

    }

    */

    public int contaProiezioni(Date d){ //pseudocodice

        int proiez = 0;

        for(int i = 0; i<proiezioni.length; i++){

            if(proiezioni[i].data == d){

                proiez++;

            }

        }

        return proiez;

    }

    public int contaSpettatori(Film f){

        int spett = 0;

        for(int i = 0; i<biglietti.length; i++){

            if(biglietti[i].proiezione.film == f){

                spett++;

            }

        }

        return spett;

    }

    public double incassoFilm(Date d, Film f){

        double incasso =0;

        for(int i = 0; i<biglietti.length; i++){

            if(biglietti[i].proiezione.data == d && biglietti[i].proiezione.film == f ){

                incasso = incasso + biglietti[i].prezzo;

            }

        }

        return incasso;

    }
    
    public double incassoFilm(Film f){

        double incasso = 0;

        for(int i = 0; i<biglietti.length; i++){

            if( biglietti[i].proiezione.film == f ){

                incasso = incasso + biglietti[i].prezzo;

            }

        }

        return incasso;
        
    }

    public double incassoRegista(Regista r){

        double incasso = 0;

        for (int i = 0; i<biglietti.length; i++){
        
            if (biglietti[i].proiezione.film.regista == r){

                incasso = incasso + biglietti[i].prezzo;

            }
        }

        return incasso;

    }

}
