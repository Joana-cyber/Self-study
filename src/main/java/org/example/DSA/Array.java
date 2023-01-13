package org.example.DSA;

public class Array<T> {
    private int capacity;
    private Object[] arr;

    private int size;

    public Array(int capacity){
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public T get(int index){
        if(index >= 0 && index >= size){
            return (T) arr[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void shrink(){
        capacity = capacity/2;
        Object[] newArr = new Object[capacity];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void expand(){
        capacity = capacity * 2;
        Object[] newArr = new Object[capacity];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(T item){
        if(size == capacity)
            expand();

        if(size == capacity) this.expand();
        arr[size] = item;
        ++size;
    }

    public void add(int index, Object item){
        if(size == capacity)
            expand();
        for(int i = size - 1; i >= index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = item;
        ++size;
    }

    public boolean remove(Object item){
        if(!contains(item)) return false;
        for(int i = 0; i < size; i++){
            if(arr[i].equals(item)){
               for(int j = i; j < size; j++){
                   arr[j] = arr[j+1];
               }
               break;
            }
        }
        --size;

        if(size < capacity/2)
            shrink();

        return true;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = index; i < size; i++){
            arr[i] = arr[i+1];
        }
        --size;

        if(size < capacity/2)
            shrink();
    }

    public boolean contains(Object item){
        for(int i = 0; i < size; i++){
            if(arr[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    public boolean set(int index, Object item){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = item;
        return true;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void printAll(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i].toString());
        }
    }
}
