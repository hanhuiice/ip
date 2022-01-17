public class Task {
    String description;
    boolean isDone;

    public Task(String description) {
        this.description = description;
        isDone = false;
    }

    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        char flag = isDone ? 'X' : ' ';
        return "[" + flag + "] " + this.description;
    }
}
