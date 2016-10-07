package Main;

import Handler.Handler;

public class Main {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 5, 7, 8, 3, 0,123,111,11,7};
        System.out.print("Позиции простых чисел в массиве: ");
        for (int i = 0; i < arrayOfNumbers.length ; i++){
            if (Handler.checkSimpleNumber(arrayOfNumbers[i]))
                System.out.print(i+1+"  ");
        }
    }
}
