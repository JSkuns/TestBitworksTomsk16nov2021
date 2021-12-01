import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    // TODO:
    //  кол-во M-субъектов может быть и <=> кол-ву N-объектов (сначала зададим это значение, потом перейдём к RND, потом сделать опцией библиотеки)
    //  использовать алгоритм равномерного распределения N-объектов между M-субъектоми

    // TODO: если N1 принадлежит M1, то другим M-субъектам он не может принадлежать (а если им может пользоваться другой субъект???)

    // TODO: при добавлении/удалении субъекта, не должен происходить сброс состояния всех субъектов, а только произойдёт перераспределение объектов

    // TODO: возможность задать субъекту параметр LOWPRIO, что означает, что он должен избегать быть владельцем объектов.
    //  И принимает к себе объект если никому больше он не нужен

    // TODO: сделать из этого всего библиотеку

    // TODO: тесты, я так понимаю юнит (стандартные) и интеграционный

    // TODO: составить описание всего этого, документация???

    // TODO: выложить на GitHub, сформировать README.md, в нём описать как выполнить запуск тестов

    public static void main(String[] args) {

        SubjectList listSub = new SubjectList();
        ObjectList listObj = new ObjectList();
        SortObjectsBetweenSubjects sort = new SortObjectsBetweenSubjects(listSub,listObj);

        int m = randomInt20(); // зададим первоначальное кол-во субъектов
        int n = randomInt20(); // зададим первоначальное кол-во объектов
//        System.out.println("Кол-во субъектов: " + m);
//        System.out.println("Кол-во объектов: " + n);
        listObj.setObjectNList(50); // задаём кол-во первоначальных объектов // TODO: в параметр библиотеки *** // TODO проверить на нуль
        listSub.setSubjectMList(m);  // задаём кол-во первоначальных субъектов // TODO: в параметр библиотеки ***

        // TODO: количество объектов и субъектов не должно быть меньше 0

        listSub.setPriority(5, true);
        listSub.setPriority(6, true);
        listSub.setPriority(7, true);
        listSub.setPriority(8, true);

        sort.sort();
        sort.printAll();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            int mm = randomInt_5(); // кол-во субъектов которое +/- после каждой итерации // TODO: в параметр библиотеки (интервал???) *** // TODO проверить на нуль
            int nn = randomInt_5(); // кол-во объектов которое +/- после каждой итерации // TODO: в параметр библиотеки (интервал???) ***
//            System.out.println("Кол-во +/- субъектов: " + mm);
//            System.out.println("Кол-во +/- объектов: " + nn);
            m += mm; // TODO:
            n += nn;
//            System.out.println("Получилось субъектов: " + m);
//            System.out.println("Получилось объектов: " + n);
            // TODO: количество объектов и субъектов после каждого решения будет изменяться на какое-то значение
            //  оно видимо тоже должно задавться отсюда (SET)

            String input = scanner.nextLine();
            if (input.equals("0")) break;
        }

        // TODO: вывести список субъектов с принадлежащими им объектами (как результат)
        //  т.е. нужно вывести SubjectList(... objects ...)

    }

    public static int randomInt20() { // 1...20
        return ThreadLocalRandom.current().nextInt(1, 20);
    }

    public static int randomInt_5() { // -20...20
        return ThreadLocalRandom.current().nextInt(-5, 5);
    }

}




