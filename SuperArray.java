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
      newstring += ", ";
  }
    newstring = newstring.substring(0,newstring.length()-2);
    newstring += "]";
    return newstring;
  }

  public void clear() {
    this.size = 0;
  }

  public boolean contains(String s) {
    for (int i = 0; i < this.size; i ++) {
      if (this.data[i] == s) {
        return true;
      }
    }
    return false;
  }
}
