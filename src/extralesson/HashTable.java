package extralesson;

public class HashTable {

        private DataItem[] hashArray;
        private int size;
        private DataItem nonItem; // It calls when del item

    public HashTable(int size) {
        this.size = size;
        hashArray = new DataItem[size];
        nonItem = new DataItem(-1);
    }
    public void displayTable() {
        System.out.println("Table: " );
        for (int i = 0; i < size; i++) {
            if (hashArray[i] == null) {
                System.out.println(" Element is null");
            } else {
                System.out.println(hashArray[i].getDate() + " ");
            }
        }
    }


    public int hashFunc(int key) {
        return key%size;
    }
    public void insert(DataItem dataItem) {
        int data = dataItem.getDate();
        int hashValue = hashFunc(data);

        while (hashArray[hashValue] != null && hashArray[hashValue].getDate() != -1) {
            hashValue++;
            hashValue %= size;
        }
        hashArray[hashValue] = dataItem;
    }
    public DataItem delete(int key) {
        int hashValue = hashFunc(key);
        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getDate() == key) {
                DataItem temp = hashArray[hashValue];
                hashArray[hashValue] = nonItem;
                return temp;
            }
            hashValue++;
            hashValue %= size;
        }
        return null;
    }
    public DataItem find(int key) {
        int hashValue = hashFunc(key);

        while (hashArray[hashValue] != null) {
            if (hashArray[hashValue].getDate() == key) {
                return hashArray[hashValue];
            }
            else  {
                hashValue++;
            }
            hashValue %= size;
        }
        return null;
    }
}
