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
        one.setName("Apple.com");
        DotCom two = new DotCom();
        two.setName("Hexlet.ru");
        DotCom three = new DotCom();
        three.setName("HH.ru");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить три сайта - коробля");
        System.out.println("Apple.com, Hexlet.ru, HH.ru");
        System.out.println("Попытайтесь потопить их за наименьшее количество ходов");

        for (DotCom dotComSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3); // запрашиваем адрес "сайта"
            dotComSet.setLocationCells(newLocation); //вызываем setter из объекта DotCom, чтобы передать местоположение,
                                                     // которое получили от вспомогательного объекта
        }
    }
    private void startPlaying () {
        while (!dotComsList.isEmpty()) { // пока массив не станет пустым
            String userGuess = helper.getUserInput("Сделайте ход"); // получаем то, что ввел юзер
            checkUserGuess(userGuess);
        }
        finishGame(); // завершаем игру
    }

    private  void checkUserGuess(String userGuess) {
        numOfGuesses ++; // увеличиваем кол-во попыток которые сделал юзер
        String result = "Мимо"; // думаем что был промах, пока не будет доказано обратное.
        for ( DotCom dotComToTest : dotComsList) { // повторяем для всех объектов в массиве
            result = dotComToTest.checkYourself(userGuess); // просим дотком проверить ход пользователя, ищем попадание либо потопление.
            if (result.equals("Попал")) {
                break; // выход из цикла раньше времени, нет смысла проверять все сайты
            } if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest); // если корабль потоплен то удаляем его из массива.
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты уходят ко дну, молодцы!");
        System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток");
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust(); // создаем игру
        game.setUpGame(); // подготавливаем игру
        game.startPlaying(); // говорим объекту начать главный игровой цикл
    }
}
