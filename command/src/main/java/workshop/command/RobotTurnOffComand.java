package workshop.command;

import workshop.Robot;

public class RobotTurnOffComand implements Command {

    private Robot robot;

    public RobotTurnOffComand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }


}
