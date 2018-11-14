package array;

public class Array {

    private int[] data;
    private int last;
    private int length;

    Array(){
        data = new int[20];
        last = -1;
        length = data.length;
        fillNull(data);
    }

    private void fillNull(int[] array) {
        for (int i = 0 ; i < array.length ; i ++){
            array[i] = -1;
        }
    }

    public int getAt(int index) {
        return index < length ? data[index]: -1;
    }

    public int getIndex(int item) {
        for(int i = 0; i < length ; i++){
            if (data[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void insertAtEnd(int item){
        if (last + 1 < length){
            data[last + 1] = item;
            last += 1;
        } else {
            insert(item);
        }
    }

    public void insertAt(int item, int index){
        if(index < length){
            data[index] = item;
            last = index;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    private void insert(int item){
        int[] temp = new int[2*length];
        fillNull(temp);
        for(int i = 0 ; i < length ; i++){
            temp[i] = data[i];
        }
        data = temp;
        data[last+1] = item;
        last += 1 ;
        length = data.length;
    }

    public void delete(int item){
        int i;
        for (i = 0; i < length ; i++){
            if(data[i] == item){
                data[i] = -1;
                break;
            }
        }
        if(i == length){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void deleteAt(int index){
        if(index < length){
            data[index] = -1;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void deleteByShift(int item){
        int index;
        for ( index = 0 ; index < length ; index++){
            if(data[index] == item){
                break;
            }
        }
        for (int i = index ; i < length; i ++){
            if(i+1 != length){
                data[i] = data[i+1];
            }
        }
        data[length-1] = -1;
    }
    public void print(){
        for (int i = 0 ; i < length ; i++) {
            System.out.println(data[i]);
        }
    }
}
