import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ObjectList {

    Set<Integer> objectNSet = new HashSet<>();
    List<ObjectN> objectNList = new ArrayList<>();

    @Override
    public String toString() {
        return "ObjectList{" +
                "objectNList=" + objectNList +
                '}';
    }

    public List<ObjectN> getObjectNList() {
        return objectNList;
    }

    public void setObjectNList(int quantity) {
        // инициализация ArrayList с объектами
        for (int i = 0; i < quantity; i++) { // создаём случайные числа от 1 до MaxInt в сет (чтобы были уникальные)
            objectNSet.add(ThreadLocalRandom.current().nextInt(1, 20)); // произвольный интервал задания значений
        }
        for (Integer s : objectNSet) { // добавляем в ArrayList новые объекты с нулевыми принадлежностями
            objectNList.add(new ObjectN(s, null));
        }
//        for (ObjectN o : objectNList) { // вывел список всех новых объектов для наглядности
//            System.out.println(o);
//        }
    }

}
