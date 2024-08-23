public class Event extends Task {
    private String from;
    private String to;

    public Event(String taskDesc, String from, String to) {
        super(taskDesc);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + from + " to: " + to + ")";
    }
}
