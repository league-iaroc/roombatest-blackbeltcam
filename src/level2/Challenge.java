package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(400, 400);
		sleep(4500);
		driveDirect(0, 0);
		driveDirect(0, 300);
		sleep(1100);
		driveDirect(0, 0);
		driveDirect(400, 400);
		sleep(6600);
		driveDirect(0, 0);
		driveDirect(300, 0);
		sleep(1100);
		driveDirect(0, 0);
		driveDirect(400, 400);
		sleep(4500);
		driveDirect(0, 0);
	}

	public void loop() {
	
	}
}
