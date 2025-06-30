import java.util.ArrayList;

class MyHashSet {
    private ArrayList<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        list.remove(Integer.valueOf(key)); // Removes by value, not index
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}
