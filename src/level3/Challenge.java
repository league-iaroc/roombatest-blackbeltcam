package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(400, 400);
		sleep(3100);
		driveDirect(0, 0);
		
		
		
		
		
		
	}

	public void loop() {
	
	}
}
