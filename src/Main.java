/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
  In questa classe avere i metodi pubblici per ottenere le informazioni.
  Creare un LinkedList con elementi e stamparlo in console.
  Aggiungere un elemento al primo posto della lista e uno all'ultimo
  Stampare la collezione aggiornata.*/


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> list = new LinkedList<>();
        list.add (new Fruit("mela"));
        list.add (new Fruit("pera"));
        list.add (new Fruit("kiwi"));

        System.out.println("Lista frutta" + list);

        list.addFirst(new Fruit("ciliegia"));
        list.addLast(new Fruit("melone"));

        System.out.println("Lista frutta aggiornata" + list);

        }
    }
