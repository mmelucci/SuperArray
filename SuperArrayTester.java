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
    for(int i = 0; i < 7; ++i) {
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
  }
}
