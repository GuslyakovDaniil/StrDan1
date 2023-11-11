import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        Minion minion1 = new Minion("Kirill", 25);
        Minion minion2 = new Minion("Daniil", 22);
        Minion minion3 = new Minion("Vlad", 30);
        Minion minion4 = new Minion("Kirill", 25);
        Minion minion5 = new Minion("Daniil", 22);
        Minion minion6 = new Minion("Vlad", 30);

        list.add(minion1);
        list.add(minion2);
        list.add(minion3);
        list.add(minion4);
        list.add(minion5);
        list.add(minion6);

        System.out.println("Список до удаления:");
        list.displayWithNumbers();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс для удаления элемента:");
        int deleteIndex = scanner.nextInt();
        list.deleteByIndex(deleteIndex);

        System.out.println("Список после удаления по индексу:");
        list.displayWithNumbers();

        Minion newMinion = new Minion("Denis", 28);
        list.edit(minion1, newMinion);

        System.out.println("Список после редактирования:");
        list.displayWithNumbers();

        System.out.println("Количество объектов в списке: " + list.countObjects());

        System.out.println("Введите имя для нового миньона:");
        String newName = scanner.next();
        System.out.println("Введите возраст для нового миньона:");
        int newAge = scanner.nextInt();
        Minion userMinion = new Minion(newName, newAge);

        System.out.println("Введите индекс для вставки нового миньона:");
        int index = scanner.nextInt();
        list.addAtIndex(index, userMinion);

        System.out.println("Список после добавления нового миньона:");
        list.displayWithNumbers();
    }
}