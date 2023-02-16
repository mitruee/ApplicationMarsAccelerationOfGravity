package com.example.applicationmarsaccelerationofgravity;

public class Algorithm {

    // создание поля для алгоритма (скорости света)
    private final float MASS_FOR_ONE_KG = 40; // метров в секунду

    // создание пустого конструктора
    public Algorithm() {
    }

    // метод вычисляющий абсолютную энергию по величине массы
    public long absoluteMassCalculation(String input) {

        /** Необходимо проверить корректность ввода массы тела, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */
        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            float inputFloat = Float.parseFloat(inputMod);

            // возврат вычисленного значения
            return (long) (inputFloat * MASS_FOR_ONE_KG);

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputFloat = Float.parseFloat(input);

            // возврат вычисленного значения
            return (long) (inputFloat * MASS_FOR_ONE_KG);
        }
    }
}