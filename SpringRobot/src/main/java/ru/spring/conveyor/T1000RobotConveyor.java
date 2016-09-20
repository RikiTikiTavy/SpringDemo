package ru.spring.conveyor;

import ru.spring.interfaces.Robot;
import ru.spring.interfaces.RobotConveyor;

public abstract class T1000RobotConveyor implements RobotConveyor {

	@Override
	public abstract Robot createRobot();
}
