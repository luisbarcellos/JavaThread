package br.com.thread;

/*
 * Faca um programa composto por duas threads:
 * -a primeira deve exibir em ordem crescente os n�meros de 1 a 500;
 * -a segunda deve exibir em ordem decrescente os n�meros entre 500 e 1;
 * */
public class Main {
    public static void main(String[] args) {
        new MeuThread(1,1,500).start();               
        new MeuThread(-1,500,1).start();
    }
}
