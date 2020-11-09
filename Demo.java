public class Demo {
  public static void removeDuplicates(SuperArray s){
    for (int i = s.size()-1; i >= 0; i--) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray newarray = new SuperArray ();
    for (int i = 0; i < a.size(); i ++) {
      if (b.contains(a.get(i))) {
        newarray.add(a.get(i));
      }
    }
    removeDuplicates(newarray);
    return newarray;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray newarray = new SuperArray ();
    int maxsize;
    if (a.size() > b.size()){
      maxsize = a.size();
    }
    else{
      maxsize = b.size();
    }
    for (int i = 0; i < maxsize; i++) {
      if (i < a.size()){
        newarray.add(a.get(i));
      }
      if (i < b.size()){
        newarray.add(b.get(i));
      }
    }
    return newarray;
  }



  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9");   a.add("1");     a.add("2");
    a.add("2");   a.add("3");     a.add("4");
    b.add("0");   b.add("4");     b.add("2");
    b.add("2");   b.add("9");
    System.out.println(findOverlap(a, b));
  }
}
