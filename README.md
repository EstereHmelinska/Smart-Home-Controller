# Smart Home Controller

A Java console application that simulates a smart home controller managing multiple smart devices (lights, thermostats, and locks).

---

## Technologies Used

- Java 21
- Maven
- SLF4J
- Logback

---

## Completed Tasks

### Task 1 – Custom Exception Hierarchy

Implemented the required custom exceptions:

- `HomeAutomationException`
- `DeviceOfflineException`
- `InvalidCommandException`
- `InvalidValueException`
- `DeviceNotFoundException`

Additionally:

- Added the required constructor to `InvalidValueException`
- Added exception chaining support (`message` + `cause`) to `HomeAutomationException`

---

### Task 2 – Exception Handling

Implemented validation and exception handling for:

- SmartLight brightness validation (`0–100`)
- SmartThermostat temperature validation (`10.0–35.0`)
- SmartLock PIN validation
- HomeController command processing using `try-catch-finally`
- Exception wrapping with preserved causes
- Updated `Main` to handle checked exceptions

---

### Task 3 – Logging

Integrated **SLF4J + Logback**.

Implemented logging in `HomeController`:

- DEBUG – received commands
- INFO – successful command execution
- WARN – offline devices
- ERROR – command processing failures

Implemented security logging in `SmartLock` for failed unlock attempts.

Enabled file logging through `logback.xml`.

---

### Task 4 – Debugging & Bug Fixes

Fixed all planted bugs:

- Fixed `NullPointerException` in `SmartLock.validatePin()`
- Fixed temperature validation logic in `SmartThermostat`
- Fixed `ArrayIndexOutOfBoundsException` in `HomeController.findDevice()`
- Fixed `CommandParser.extractCommand()` so command values are preserved

---

## Bonus Improvements

Implemented the optional improvements:

- Used `DeviceOfflineException` instead of only printing offline device warnings.
- Used `DeviceNotFoundException` when a requested device cannot be found.
- Added structured exception chaining for easier debugging.
- Used parameterized SLF4J logging (`{}` placeholders) instead of string concatenation.

---

## Author

Completed by **Estere Hmeļinska**
