public class ToDo extends Task {

    public ToDo(String taskDesc) {
        super(taskDesc);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
