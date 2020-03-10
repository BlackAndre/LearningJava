package Games.DotCom;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; // создаем массив для записи ???????????
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public String checkYourself (String userInput) {
        String result = "Мимо";
            int index = locationCells.indexOf(userInput); //проверка содержится ли загаданная юзером ячейка в массиве,
                                                          // запрашивая ее индекс. Если ее нет в списке то index  возвращает -1.
            if (index >= 0) {
                locationCells.remove(index); // если индекс больше нуля, значит ячейка в массиве есть и поэтому удаляем ее.
                if (locationCells.isEmpty()) {
                    result = "Потопил";
                } else {
                    result = "Попал";
                }
            } return result;
    }
}
