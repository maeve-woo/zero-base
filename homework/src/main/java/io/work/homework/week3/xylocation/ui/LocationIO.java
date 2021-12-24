package io.work.homework.week3.xylocation.ui;

import io.work.homework.week3.xylocation.domain.Location;
import io.work.homework.week3.xylocation.domain.RandomLocations;
import io.work.homework.week3.xylocation.ui.util.LocationInputTrim;
import io.work.homework.week3.xylocation.ui.util.LocationInputValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static io.work.homework.week3.xylocation.ui.IOMessage.*;


public class LocationIO {
	private final Scanner scanner = new Scanner(System.in);

	public void run() {
		Location myLocation;
		RandomLocations randomLocations;

		while (true) {
			// 1. 나의 좌표 값을 (x, y) 형태로 입력 받습니다.
			System.out.println(ASK_INPUT_MY_LOCATION);
			String myLocationInput = scanner.nextLine().trim();

			if (!validInput(myLocationInput)) {
				continue;
			}

			myLocation = createLocation(myLocationInput);
			System.out.println(myLocation);

			// 2. 이후, 임의의 좌표 값 (x, y)형태의 값을 입력 받습니다.
			System.out.println(ASK_INPUT_RANDOM_LOCATION);
			randomLocations = inputRandomLocation();

			// 4. 입력 받은 값이 10개가 되는 경우, 입력 받은 좌표 값과 나의 자포 값의 거리 중 가장 가까운 좌표 값을 화면에 출력하는 프로그램을 작성해 보세요.
			printResult(randomLocations, myLocation);
			isCountinue();
		}
	}

	private Location createLocation(String input) {
		String[] stringLocations = LocationInputTrim.trimSpecialCharacters(input);
		List<Integer> locations = new ArrayList<>();

		for (String splitLocation : stringLocations) {
			locations.add(Integer.parseInt(splitLocation.trim()));
		}
		return new Location(locations);
	}

	private RandomLocations inputRandomLocation() {
		RandomLocations randomLocations = new RandomLocations();
		int round = RandomLocations.ROUND;

		while (round > 0) {
			String randomLocationInput = scanner.nextLine().trim();

			if (!validInput(randomLocationInput)) {
				continue;
			}
			Location location = createLocation(randomLocationInput);

			// 3. 입력된 좌표 값 중 동일한 좌표 값을 입력하는 경우는 저장하지 않고 다시 입력하도록 합니다.
			if (randomLocations.isDuplicate(location)) {
				System.out.println(DUPLICATE_RANDOM_LOCATION);
				continue;
			}

			randomLocations.add(location);
			round -= 1;
			System.out.print(ROUND_CONDITION_MESSAGE);
			System.out.println((RandomLocations.ROUND - round) + "/" + RandomLocations.ROUND);
		}

		return randomLocations;
	}

	private Boolean validInput(String locationInput) {
		try {
			LocationInputValidation.checkFormat(locationInput);
		} catch (IllegalInputValidationException e) {
			System.out.println(e.getMessage());
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	private void printResult(RandomLocations randomLocations, Location myLocation) {
		Integer mindistance = null;
		Location nearestLocation = null;

		for (Location randomLocation : randomLocations.getLocations()) {
			Integer xDistance = Math.abs(randomLocation.getX() - myLocation.getX());
			Integer yDistance = Math.abs(randomLocation.getY() - myLocation.getY());
			Integer distance = xDistance + yDistance;

			if (mindistance == null || distance < mindistance) {
				mindistance = distance;
				nearestLocation = randomLocation;
			}
			System.out.print(randomLocation);
		}
		System.out.print(NEAREST_LOCATION_MESSAGE);
		System.out.println(nearestLocation);
	}

	private void isCountinue() {
		System.out.println(ISCOUNTINUE_MESSAGE);
		String isCountinue = scanner.nextLine().trim();
		if(isCountinue.equals("exit")) {
			System.exit(0);
		}
	}
}
