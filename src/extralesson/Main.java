package extralesson;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.insert(new DataItem(1));
        hashTable.displayTable();
        hashTable.insert(new DataItem(9));
        hashTable.displayTable();
        hashTable.delete(1);
        hashTable.displayTable();
        hashTable.insert(new DataItem(11));
        hashTable.displayTable();

        System.out.println(hashTable.find(11).getDate());
    }
}
