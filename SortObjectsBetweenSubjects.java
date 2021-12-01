public class SortObjectsBetweenSubjects {

    SubjectList subjList;
    ObjectList objList;

    public SortObjectsBetweenSubjects(SubjectList subjList, ObjectList objList) {
        this.subjList = subjList;
        this.objList = objList;

    }

    public void printAll() {
//        System.out.println(subjList);
//        System.out.println(objList);

    }

    public void sort() {
        for (SubjectM s : subjList.getSubjectMList()) { // перебираем субъекты
            for (Integer i : s.getSetStorageExistingObj()) { // перебираем список доступных для добавления значений
                for (ObjectN o : objList.getObjectNList()) { // перебираем объекты
                    if (o.getValue() == i) { // если значение объекта равно пребираемому доступному значения субъекта
                        o.setRefer(s); // присваиваем принадлежность объекту // TODO: добавить проверку на равномерность
                    }
                }
            }
        }

        for (SubjectM s : subjList.getSubjectMList()) { // перебираем субъекты
            for (ObjectN o : objList.getObjectNList()) { // перебираем объекты
                if (s.equals(o.getRefer())) {
                    System.out.print(s + ", " + o.getValue() + "; ");
                }
            }
            System.out.println(""); // TODO: убрать пустые строки
        }
    }

}

