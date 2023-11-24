import java.util.LinkedList;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Banana");
        Fruit fruit2 = new Fruit("Mela");
        Fruit fruit3 = new Fruit("Arancia");
        Fruit fruit4 = new Fruit("Melone");

        LinkedList<Fruit> fruits = new LinkedList<Fruit>();

        fruits.add(fruit1);
        fruits.add(fruit2);

        System.out.println("\nCollezione normale\n" + fruits);

        fruits.addFirst(fruit3);
        fruits.addLast(fruit4);

        System.out.println("\nCollezione aggiornata\n" + fruits);
    }
}