package Games.DotCom;

import java.util.ArrayList;

public class DotComBust {
    // Объявляем и инициаолизируем переменные которые будут нужны
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList  = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // создаем три объекта DotCom , даем имена и помещаем в массив Array
        DotCom one = new DotCom();
        one.setName("Pet.com");
    }
}
