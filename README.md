# Smart Office Facility Management

## Overview
The **Smart Office Facility Management** project is a console-based application that simulates the management of a smart office. It allows users to:

- Book and cancel conference room bookings.
- Detect room occupancy and automatically control air conditioning and lights.
- Track room usage statistics.
- Handle dynamic user interactions such as adding/removing room occupants.

This project demonstrates the use of design patterns such as **Singleton**, **Observer**, **Command**, and **Factory**.

## Design Patterns Used
- **Singleton**: Ensures only one instance of `OfficeManager` manages all rooms.
- **Observer**: Controls real-time room updates (AC and lights) based on occupancy.
- **Command**: Encapsulates booking and cancellation operations as objects.
- **Factory**: Simplifies the creation of rooms dynamically.

## Features
- **Book a Room**: Book a conference room for a specified duration.
- **Cancel a Booking**: Cancel an existing room booking.
- **Room Occupancy Management**: Add or remove occupants in a room, triggering automatic control of AC and lights.
- **Usage Statistics**: View room usage statistics, such as how many times each room has been used.

## Getting Started

### Prerequisites
- **Java** (version 8 or higher) must be installed on your system.

### Running the Program
Once the application starts, you will be presented with a menu where you can interact with the system by entering different commands. For example:

```
Available commands:
1. book - Book a room
2. cancel - Cancel a booking
3. addOccupants - Add occupants to a room
4. removeOccupants - Remove occupants from a room
5. stats - Show room usage statistics
6. exit - Exit the system
```

You can follow the on-screen prompts to book rooms, manage occupancy, and view statistics.

## Example Usage

### Booking a Room
1. Choose the `book` command.
2. Enter the room number and booking duration in minutes.

### Adding Occupants
1. Choose the `addOccupants` command.
2. Enter the room number and the number of occupants to add. The system will automatically manage the room’s AC and lights based on occupancy.

### Viewing Room Statistics
1. Choose the `stats` command to see how many times each room has been used.

## Project Structure

```bash
/src
  ├── Main.java                   # Entry point for the application
  ├── OfficeManager.java           # Singleton class managing rooms
  ├── Room.java                    # Room class (Observable)
  ├── RoomObserver.java            # Observer interface
  ├── AirConditioning.java         # Concrete observer for AC
  ├── Lights.java                  # Concrete observer for Lights
  ├── Command.java                 # Command interface
  ├── BookRoomCommand.java         # Concrete command for booking
  ├── CancelBookingCommand.java    # Concrete command for canceling booking
  ├── RoomBookingSystem.java       # Invoker for executing commands
  ├── RoomFactory.java             # Factory for creating rooms
```

## Design Decisions
- The **Singleton pattern** was used to ensure only one instance of `OfficeManager` handles all room-related operations.
- The **Observer pattern** was used to notify air conditioning and lighting systems whenever room occupancy changes.
- The **Command pattern** allows flexible booking and cancellation of rooms, encapsulating these operations as separate objects for easy future extension.
- The **Factory pattern** was used for creating rooms, making it easier to extend or modify room creation logic in the future.

## Future Enhancements
- **User Authentication**: Add user roles for managing room bookings.
- **Notification System**: Notify users via email/SMS when their booking is canceled or auto-released.
- **Advanced Room Statistics**: Show detailed usage analytics such as the most booked room, average usage time, etc.
