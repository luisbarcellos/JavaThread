package br.com.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuThread extends Thread{
    private int indice, numeroInicial, numeroFinal;

    public MeuThread(int indice, int numeroInicial, int numeroFinal) {
        this.indice = indice;
        this.numeroInicial = numeroInicial;
        this.numeroFinal = numeroFinal;
    }
    
    @Override
    public void run(){
        for(int i=numeroInicial; numeroFinal==500 ? i<= numeroFinal : i>= numeroFinal ; i+=indice){
            System.out.println("Numero : "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
