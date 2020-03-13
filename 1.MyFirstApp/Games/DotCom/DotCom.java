package Games.DotCom;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells; // создаем массив для записи местоположения сайта
    private String name; // имя сайта
    public void setLocationCells(ArrayList<String> loc) { // обновляет местоположение сайта(случайный адрес,
                                                          // который получается от метода placeDotCom
        locationCells = loc;
    }
    public void setName(String name) { // сеттер установки имени
        this.name = name;
    }
    public String checkYourself (String userInput) {
        String result = "Мимо";
            int index = locationCells.indexOf(userInput); //проверка содержится ли загаданная юзером ячейка в массиве,
                                                          // запрашивая ее индекс. Если ее нет в списке то index  возвращает -1.
            if (index >= 0) {
                locationCells.remove(index); // если индекс больше нуля, значит ячейка в массиве есть и поэтому удаляем ее.
                if (locationCells.isEmpty()) { // проверяем есть ли еще неразгаданные ячейки (конекретного сайта)
                    result = "Потопил";
                    System.out.println("Вы потопили " + name + " :(");
                } else {
                    result = "Попал";
                }
            } return result;
    }
}
