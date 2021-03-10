public class Cinema {
    
    Persona[] registi;

    Sala[] sale;

    Film[] film;

    Proiezione[] proiezioni;

    Biglietto[] biglietti;

    public Cinema(){



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
}
