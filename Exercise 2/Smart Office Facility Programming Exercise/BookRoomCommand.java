import java.util.ArrayList;
import java.util.List;

// Command Interface
interface Command {
    void execute();
}

// Booking Command
class BookRoomCommand implements Command {
    private Room room;
    private int duration; // in minutes

    public BookRoomCommand(Room room, int duration) {
        this.room = room;
        this.duration = duration;
    }

    public void execute() {
        if (room != null) {
            System.out.println("Booking Room " + room.getRoomId() + " for " + duration + " minutes.");
            // Simulate the booking action (could involve setting timers, etc.)
            // Adding to the usage count when room is booked
        }
    }
}

// Cancellation Command
class CancelBookingCommand implements Command {
    private Room room;

    public CancelBookingCommand(Room room) {
        this.room = room;
    }

    public void execute() {
        if (room != null) {
            System.out.println("Cancelling booking for Room " + room.getRoomId());
            // Simulate the cancellation action
        }
    }
}

// Invoker class to execute commands
class RoomBookingSystem {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void showCommandHistory() {
        System.out.println("Command history: " + commandHistory.size() + " commands executed.");
    }
}
