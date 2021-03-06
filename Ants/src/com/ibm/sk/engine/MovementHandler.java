package com.ibm.sk.engine;

import static com.ibm.sk.WorldConstans.*;
import static com.ibm.sk.WorldConstans.X_BOUNDRY;

import java.awt.Point;

import com.ibm.sk.dto.Ant;
import com.ibm.sk.dto.Hill;
import com.ibm.sk.dto.enums.Direction;
import com.ibm.sk.engine.exceptions.MoveException;

public final class MovementHandler {

	public void makeMove(final Ant ant, final Direction direction) throws MoveException {
		double newXPos = ant.getPosition().getX() + direction.getPositionChange().getX();
		double newYPos = ant.getPosition().getY() + direction.getPositionChange().getY();
		if (newXPos < 0 || newXPos > X_BOUNDRY || newYPos < 0 || newYPos > Y_BOUNDRY) {
			throw new MoveException("Can't go to empty space! I am not an astronaut, I am just a little ant!");
		} else {
			Point position = new Point((int) newXPos, (int) newYPos);
			
			if (ant.getMyHill().getPosition().equals(position)) {
				moveHome(ant.getMyHill(), ant);
			}
			
			ant.setPosition(position);
		}
	}
	
	private void moveHome(final Hill hill, final Ant ant) {
		//TODO
	}
	
	private void moveToEnemyAndDie() {
		//TODO
	}
	
	private void moveToEnemyAndKill() {
		//TODO
	}
}
