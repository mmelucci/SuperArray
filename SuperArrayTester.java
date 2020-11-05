public class SuperArrayTester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println("Check Size:");
    System.out.println(words.size());
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
        System.out.println( words.get(i) );
    }
    for(int i = 0; i < 10; ++i) {
        words.add("Word");
    }

    for(int i = 0; i < words.size(); ++i) {
        if(words.get(i).equals("Word")) {
            System.out.println("Changed " + words.set(i, "NewWord") + " into NewWord");
        }
      }
      for(int i = 0; i < words.size(); ++i) {
          System.out.println(words.get(i));
      }
    System.out.println(words.isEmpty());
    words.clear();
    System.out.println(words.isEmpty());
    for(int i = 0; i < 10; ++i) {
        words.add("Word");
    }
    System.out.println(words.toString());
    System.out.println(words.contains("kani"));
    words.add(0, "Works");
    System.out.println(words.toString());
    words.add(4, "Works");
    System.out.println(words.toString());
    System.out.println(words.size());
    words.add(15, "Works");
    System.out.println(words.toString());
    System.out.println(words.size());
    words.remove(4);
    System.out.println(words.toString());
    System.out.println(words.size());
    words.remove(0);
    System.out.println(words.toString());
    System.out.println(words.size());
    words.add(4, "Works");
    System.out.println(words.toString());
    System.out.println(words.indexOf("Works"));
    System.out.println(words.indexOf("NewWord"));
  }
}
