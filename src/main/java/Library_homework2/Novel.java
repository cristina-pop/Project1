package Library_homework2;

import java.util.ArrayList;
import java.util.List;

public class Novel extends Book{
    String type;

    Novel(String title, int nrPages, String type) {
        super(title,nrPages);
        this.type = type;
    }
}
