package Library_homework2;

public class Album extends Book{
    String paperQ;

    Album(String title, int nrPages, String paperQ) {
        super(title, nrPages);
        this.paperQ = paperQ;
    }
}
