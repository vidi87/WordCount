public class Main {
   private static FileProcessor processor = new FileProcessor();

    public static void main(String[] args) {
        String fileName = "target/classes/input.txt";
        System.out.println(processor.getWordsCount(fileName));
    }

}
