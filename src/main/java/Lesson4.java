import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Er on 26.07.2016.
 */
public class Lesson4 {

    /*Задачи*/

        //1. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же
        // массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

    public static void oneTask() {

        int a = 1, b = 99, h = 0, t = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                h = h + 1;
            }
        }
        System.out.print("Кол-во элементов в массиве - " + h);

        System.out.println();
        System.out.println();

        /*int[]d = new int[h-1];
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                t = t + 1;
                d[t] = i;
                System.out.print(" " + d[t]);
            }
        }*/

        //System.out.println(Arrays.toString(d));

        /*for (int q = d.length; q >= 0; q--) {
            System.out.println(" " + d[q]);
        }*/

    }

        /*2. Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных
        элементов и выведете это количество на экран на отдельной строке.*/

    public static void twoTask(){
        int[] g = new int[15];
        int a = 0, b = 9;
        for (int i = a; i < g.length; i++){
            int e = (int) (Math.random() * 10.0);
            if (e%2 == 0) {
                g[i] = e;
            }
            System.out.println("Случайное чисел в массиве " + (i+1) + " - " + g[i]);
        }

        for (int z = 0; z < g.length; z++){
            if (g[z] != 0){
                System.out.println(" = " + g[z]);
            }
        }
        System.out.println("Элементов в массиве - " + g.length);
        System.out.println(Arrays.toString(g));
    }

        /*3. Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый
        урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди
        них не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 примеров
        из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
        При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).*/

    public static void threeTask(){



/*================ таблица умножения==================*/

        int y = 0, p = -1;

        for (int i = 2; i < 10; i++){
                for (int j = 2; j < 10; j++) {
                    p = p + 1;
                    System.out.print("\t" + j + " * " + i + " = " + i * j);
                }
            System.out.println();
        }
        System.out.println(); System.out.println();

/*========== Согластно задания==============*/

        String[]x = new String[15];

        for (int i = 0; i < 15; i++) {

            int a = (int) (Math.random() * 10.0);
            int b = (int) (Math.random() * 10.0);
            if (x[0] == null){
             x[0] = a + " * " + b;
            }else {
                for (int e = 0; e < x.length; e++){


                }
            }
            System.out.println(x[0]);
        }




        /*========== Согластно задания==============*/


        /*int l = 5, z = 0;
        int z1[] = new int[8];

        if (z1.length <= 8){
            z = (int) ((Math.random() * 100) % 5);
            for (y = 0; y < z1.length; y++){
                if (z1[y] != z){
                    z1[y] = z;
                    //System.out.println(" ISSE - " + z);
                }else {
                    y--;
                }
            }
            System.out.println(Arrays.toString(z1));
        }*/
    }

        /*4. Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        Вывести массив на экран.
        Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При этом изменять
        состав массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок остальных элементов строки не
        важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку). Вывести
        преобразованный массив на экран.*/

    public static void fourTask(){
        int[][]q = new int[6][7];
        for (int i = 0; i < q.length; i++){
            for (int j = 0; j < q[i].length; j++){
                q[i][j] = (int) (Math.random() * 10.0);
                System.out.print("\t" + q[i][j]);
            }
            System.out.println();
           // System.out.println(Arrays.sort(q));

        }
        System.out.println(Arrays.toString(q));

    }

        /*5. Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи, вычисление с использованием
        рекурсии становится неприемлемым (занимает более минуты по времени).(Использовать для замера времени System.
        currentTimeMillis() который возвращает время в миллисекундах)*/

    public static void fiveTask() {

        // последовательности Фибоначчи
        int a = 0;
        int b = 1, m = 0, c = 8;

        while (m < c) {
            int w = a + b;
            a = b;
            b = w;
            m++;
            System.out.println(" " + w);
            System.currentTimeMillis();

        }
        double d1 = System.currentTimeMillis();
        System.out.println(" d1 - " + d1);
        //использованием рекурсии
        a = 1;
        m = 1;
        int  w = 1;
        while (m <= 9){
            w = w * m++;
            System.out.print("  p - " +  w);

        }
        double d = System.currentTimeMillis();
        System.out.println("\n" +"d - " + d);
    }


        /*6. Создайте в классе Circle метод, вычисляющий длину окружности.*/

        /*7. Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с
        диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод, применимый к
        уже существующему объекту, а не конструктор создающий новый объект.*/

        /*8. Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью, координаты центра и
        радиус окружности пользователь вводил с клавиатуры.*/

        /*9. Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.*/

        /*10. Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен
        вариант, когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.*/



}
