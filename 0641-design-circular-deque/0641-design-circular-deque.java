class MyCircularDeque {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        arr = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            arr[front] = value;
        } else {
            front = (front - 1 + capacity) % capacity;
            arr[front] = value;
        }

        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            arr[rear] = value;
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = value;
        }

        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        if (size > 1) {
            front = (front + 1) % capacity;
        }

        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        if (size > 1) {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
