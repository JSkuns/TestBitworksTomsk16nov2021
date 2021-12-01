import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubjectList {

    List<SubjectM> subjectMList = new ArrayList<>();

    @Override
    public String toString() {
        return "SubjectList{" +
                "subjectMList=" + subjectMList +
                '}';
    }

    public List<SubjectM> getSubjectMList() {
        return subjectMList;
    }

    public void setSubjectMList(List<SubjectM> subjectMList) {
        this.subjectMList = subjectMList;
    }
// - создаётся один раз и менятеся от решения к решению за счёт добавления и удаления N-го числа субъектов
    // - субъекты предыдущего решения остаются неизменны (и их параметры) (если конечно их не удалили),
    //   может измениться только сортировка принадлежащих им объектов


    public void setSubjectMList(int quantity) {

        for (int i = 0; i < quantity; i++) {  // добавляем в ArrayList новые субъекты с рандомным кол-вом возможных владений
            subjectMList.add(new SubjectM(false, new HashSet<>()));
        }
//        for (SubjectM o : subjectMList) { // вывел список всех новых объектов для наглядности
//            System.out.println(o);
//        }
    }

    public boolean setPriority(int value, boolean isLowPriority) {
        // TODO: метод присваивания приоритета будет здесь
        //  проверить на null/0
        return false;
    }

}

