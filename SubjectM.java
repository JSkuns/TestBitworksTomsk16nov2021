import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class SubjectM {

    private final boolean isLowPriority; // изначально приоритет высокий, т.е. низкий приоритет выключен
    Set<Integer> setStorageExistingObj;

    public boolean isLowPriority() {
        return isLowPriority;
    }

    public Set<Integer> getSetStorageExistingObj() {
        return setStorageExistingObj;
    }

    public void setSetStorageExistingObj(Set<Integer> setStorageExistingObj) {
        this.setStorageExistingObj = setStorageExistingObj;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("S{")
                .append(isLowPriority)
                .append(",(")
                .append(print1())
                .append(")")
                .append("}")
                .toString();
    }

    public SubjectM(boolean isLowPriority, Set<Integer> setStorageExistingObj) {
        // Set<Integer> setStorageExistingObj - список, принадлежащих конкретному субъекту, int значений, так как сравниваются по int-value
        // он будет определяться в алгоритме распределения

        this.isLowPriority = isLowPriority;
        this.setStorageExistingObj = setStorageExistingObj;

        // TODO: 4 и 20 заменить на set_из_Main количество принадлежащих субъекту объектов (
        for (int i = 0; i < 4; i++) { // создаём случайные числа от 1 до 4 в сет (чтобы были уникальные)
            setStorageExistingObj.add(ThreadLocalRandom.current().nextInt(1, 20)); // произвольный интервал задания значений
        }
    }

    public StringBuilder print1() {
        return printSetStorageExistingObj(setStorageExistingObj);
    }

    public StringBuilder printSetStorageExistingObj(Set<Integer> setStorageExistingObj) {
        StringBuilder sb = new StringBuilder();
        for (Integer s : setStorageExistingObj) {
            sb.append(s).append(" ");
        }
        return sb;
    }

    // TODO: должна быть проверка на присвоенный приоритет по значению Object.value

}
