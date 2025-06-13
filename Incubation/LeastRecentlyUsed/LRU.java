public class LRU {
    int size = 3;
    DoublyLinkedList d = new DoublyLinkedList(size);
    void putData()
    {
        d.putData(1,2);
        d.putData(2,3);
        d.putData(3,4);
    }
    void getData()
    {
        d.getData(3);
        d.getData(2);
        d.getData(1);
    }
    void printMemory()
    {
        d.printData();
    }
}