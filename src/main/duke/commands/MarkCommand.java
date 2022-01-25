package duke.commands;

import duke.storage.Storage;
import duke.tasks.TaskList;
import duke.ui.Ui;

public class MarkCommand extends Command{
    protected int index;
    private static final String MESSAGE = "Nice! I've marked this task as done:";

    public MarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.markTask(index);
        storage.saveTaskList(tasks);
        ui.showMessage(MESSAGE + "\n  " + tasks.getTaskString(index));
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
