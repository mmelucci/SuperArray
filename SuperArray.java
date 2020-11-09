public class SuperArray {
  private String [] data;
  private int size;

  public SuperArray() {
    this.data = new String[10];
    this.size = 0;
  }

  public int size() {
    return this.size;
  }

  public boolean add(String element) {
    if (this.size < data.length) {
      this.data[size] = element;
      size ++;
    }
    else {
      resize();
      this.data[size] = element;
      size ++;
    }
    return true;
  }

  public String get(int index) {
    return this.data[index];
  }

  public String set(int index, String element) {
    String temp = this.data[index];
    this.data[index] = element;
    return temp;
  }

  private void resize() {
    String [] resizedarray = new String[data.length * 2];
    for (int i = 0; i < this.size; i++) {
      resizedarray[i] = this.data[i];
    }
    this.data = resizedarray;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public String toString() {
    String newstring = "[";
    for (int i = 0; i < this.size; i ++) {
      newstring += this.data[i];
      if (i != this.size-1) {
        newstring += ", ";
      }
     }
    newstring += "]";
    return newstring;
  }

  public void clear() {
    this.size = 0;
  }

  public boolean contains(String s) {
    for (int i = 0; i < this.size; i ++) {
      if (this.data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

  public SuperArray(int InitialCapacity) {
    this.data = new String[InitialCapacity];
  }

  public void add(int index, String element) {
    if (index >= size) {
      this.add(element);
    }
    else {
      if (size == data.length) {
        resize();
      }
      for (int i = this.size; i > index; i --) {
        this.data[i] = this.data[i-1];
      }
      this.data[index] = element;
      size ++;
    }
  }

  public String remove(int index) {
    String temporary = data[index];
    for (int i = index; i < this.size-1; i ++) {
      this.data[i] = this.data[i + 1];
    }
    size --;
    return temporary;
  }

  public int indexOf(String s) {
    for (int i = 0; i < this.size; i ++) {
      if (this.data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String [] newarray = new String[this.size];
    for (int i = 0; i < this.size; i ++) {
      newarray[i] = data[i];
  }
    return newarray;
  }

  public int lastIndexOf(String value){
    for (int i = this.size-1; i >= 0; i --) {
      if (this.data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }
}
