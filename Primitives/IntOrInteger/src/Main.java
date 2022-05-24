public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());
        System.out.println();
        System.out.println("Èíòåğâàë Ğóññêîãî àëôàâèòà : ");
        System.out.println();
        char firstLetter = 'À';
        char lastLetter = 'ÿ';
        char letter¨ = '¨';
        char letter¸ = '¸';
        int intLetter_¨ = letter¨;
        int intLetter_¸ = letter¸;
        int firstLetterCharacter = firstLetter;
        int firstLastLetterCharacter = lastLetter;
        for (int i = firstLetterCharacter; i <= firstLastLetterCharacter; i++) {
            char c = (char) i;
            System.out.println(i + " -  " + c);
            if (c == 'Å') {
                System.out.println(intLetter_¨ + " -  " + letter¨);
            }
            if (c == 'å') {
                System.out.println(intLetter_¸ + " -  " + letter¸);
            }
        }
    }
}
