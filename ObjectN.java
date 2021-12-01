public class ObjectN {

    private final int value;
    private SubjectM refer;

    public int getValue() {
        return value;
    }

    public SubjectM getRefer() {
        return refer;
    }

    public void setRefer(SubjectM refer) {
        this.refer = refer;
    }

    public ObjectN(int value, SubjectM refer) {
        // value - значение по которому будет происходить сортировка (оно должно быть уникальным и рандомным)
        // refer - принадлежность данного объекта (одному) конкретному субъекту SubjectM

        this.value = value;
        this.refer = refer;
    }

    @Override
    public String toString() {
        return "O{" + value + ", " + refer + "}";
    }
}
