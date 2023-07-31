public class Main {
    public static void main(String[] args) {
        Politician politician = new Politician();
        Priest priest = new Priest();
        Lecture lecture = new Lecture();

        politician.speak();
        priest.speak();
        lecture.speak();
    }
}