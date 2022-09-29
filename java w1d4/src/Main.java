import dipendente.Dipendente;

import static dipendente.Dipartimento.PRODUZIONE;
import static dipendente.Livello.QUADRO;

public class Main {
    public static void main(String[] args) {

        Dipendente pino = new Dipendente("pino", 1, 30, QUADRO, PRODUZIONE);

        pino.getInfo();
        getStipendioDipendente(pino);
        schiavoperquanto(pino, 6);
    }

    public static void getStipendioDipendente(Dipendente ist){
        System.out.println(ist.maquantomipagate());
    }
    public static void schiavoperquanto(Dipendente ist, int ore){
        System.out.println(ist.quantomischiavizzate() * ore + ist.maquantomipagate());
    }
}