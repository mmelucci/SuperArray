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
    words.add(10, "Works");
    System.out.println(words.toString());
    System.out.println(words.size());
    words.remove(4);
    System.out.println(words.toString());
    System.out.println(words.size());
    words.remove(11);
    System.out.println(words.toString());
    System.out.println(words.size());
    words.add(4, "Works");
    System.out.println(words.toString());
    System.out.println(words.indexOf("Works"));
    System.out.println(words.indexOf("NewWord"));

    SuperArray testarray = new SuperArray();
    testarray.add("kani");   testarray.add("uni");     testarray.add("ebi");     testarray.add("una");
    testarray.add("una");    testarray.add("ebi");     testarray.add("kani");    testarray.add("una");
    testarray.add("una");    testarray.add("ebi");     testarray.add("toro");
    SuperArray testarray1 = new SuperArray();
    testarray1.add("kani");   testarray1.add("uni");     testarray1.add("ebi");     testarray1.add("una");
    testarray1.add("una");    testarray1.add("ebi");     testarray1.add("kani");    testarray1.add("una");
    testarray1.add("una");    testarray1.add("ebi");     testarray1.add("toro");

    System.out.println(testarray);
    System.out.println(testarray.lastIndexOf("toro"));
    System.out.println(testarray.lastIndexOf("una"));
    System.out.println(testarray.equals(testarray1));
    System.out.println(testarray.equals(words));


    try {
      SuperArray testarray2 = new SuperArray(-1);
    }
    catch (IllegalArgumentException e) {
     System.out.println("InitialCapacity cannot be negative");
     System.out.println(e);
   }
   try {
    testarray.get(11);
   }
   catch (IndexOutOfBoundsException e) {
    System.out.println("get index out of bounds");
    System.out.println(e);
  }
  try {
   testarray.set(11, "hello");
  }
  catch (IndexOutOfBoundsException e) {
   System.out.println("set index out of bounds");
   System.out.println(e);
 }
 try {
   testarray.add(12, "hi");
 }
 catch (IndexOutOfBoundsException e) {
  System.out.println("add index out of bounds");
  System.out.println(e);
 }
 try {
   testarray.remove(14);
 }
 catch (IndexOutOfBoundsException e) {
  System.out.println("remove index out of bounds");
  System.out.println(e);
}
  }
}
