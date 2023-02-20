package ss09_dsa_list.bai_tap;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTS = {};

    private int size = 0;

    private Object[] elements;

    public MyList() {
        this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTS;
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else if (capacity == 0) {
            this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTS;
        } else throw new IllegalArgumentException("gia tri khong hop le!");
    }

    public void setElements(E[] newElements) {
        this.elements = new Object[newElements.length];
        for (int i = 0; i < newElements.length; i++) {
            this.elements[i] = newElements[i];
        }
    }

    public E[] getElements() {
        E[] e = (E[]) this.elements;
        return e;
    }

    public int getSize() {
        return size = this.elements.length;
    }

    public void add(int index, E element) {
        if (index < 0 || index > this.getSize()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            Object[] elementsTemp = new Object[size];
            for (int i = 0; i < size; i++) {
                elementsTemp[i] = elements[i];
            }
            this.elements = new Object[size + 1];

            for (int i = 0; i < size + 1; i++) {
                if (i > index) {
                    this.elements[i] = elementsTemp[i - 1];
                } else if (i == index) {
                    this.elements[i] = element;
                } else {
                    this.elements[i] = elementsTemp[i];
                }
            }
        }
    }

    public E remove(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else if (index >= 0 && index < this.getSize()) {
            Object[] elementsTemp = new Object[size];
            for (int i = 0; i < size; i++) {
                elementsTemp[i] = elements[i];
            }
            this.elements = new Object[size - 1];
            for (int i = 0; i < size - 1; i++) {
                if (i < index) {
                    this.elements[i] = elementsTemp[i];
                } else {
                    this.elements[i] = elementsTemp[i+1];
                }
            }
            return (E) elementsTemp[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
