// David Shapiro
// 1/24/19
// CS 140
// Lab #1
//
// This program will print lyrics for a cumulative song.
public class Song {
   public static void main(String[] args)  {
// call the methods...
      verse1();
      verse2(); 
      verse3();
      verse4();
      verse5();
      verse6();
      verse7();
   }
// repetitive verse lines
// repeat in verse 1
   public static void repeat1() {
     System.out.println("I don't know why she swallowed that fly,");
     System.out.println("Perhaps she'll die.");
   }
// repeat in verse 2
   public static void repeat2() {
     System.out.println("She swallowed the spider to catch the fly,");
     repeat1();
   }   
// repeat in verse 3
   public static void repeat3() {
     System.out.println("She swallowed the bird to catch the spider,");
     repeat2();
   }  
// repeat in verse 4
   public static void repeat4() {
     System.out.println("She swallowed the cat to catch the bird,");
     repeat3();
   } 
// repeat in verse 5
   public static void repeat5() {
     System.out.println("She swallowed the dog to catch the cat,");
     repeat4();   
    } 
// repeat in verse 6 
   public static void repeat6() {
     repeat5();
    }
// full verses
// verse 1
   public static void verse1() {
      System.out.println("There was an old woman who swallowed a fly.");
      repeat1();
   }
// verse 2
   public static void verse2() {
      System.out.println();
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      repeat2();
   }
// verse 3
   public static void verse3() {
      System.out.println();
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      repeat3();
   }
// verse 4
   public static void verse4() {
      System.out.println();
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      repeat4();
   }
// verse 5
   public static void verse5() {
      System.out.println();
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      repeat5();
   }
// verse 6
   public static void verse6() {
      System.out.println();
      System.out.println("There was an old woman who swallowed a giraffe,");
      System.out.println("Her belly laughed as she swallowed that giraffe.");
      System.out.println("She swallowed the giraffe to catch the dog,");
      repeat6();
   }
// verse 7
   public static void verse7() {
      System.out.println();
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
}