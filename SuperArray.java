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
    String [] resizedarray = new String[data.length + 10];
    for (int i = 0; i < this.size; i++) {
      resizedarray[i] = this.data[i];
    }
    this.data = resizedarray;
  }
}
