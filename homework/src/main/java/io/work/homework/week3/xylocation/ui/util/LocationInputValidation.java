package io.work.homework.week3.xylocation.ui.util;

import io.work.homework.week3.xylocation.ui.IllegalInputValidationException;

import static io.work.homework.week3.xylocation.ui.IOMessage.LOCATION_FORMAT_EXCEPTION;
import static io.work.homework.week3.xylocation.ui.IOMessage.NUMBER_FORMAT_EXCEPTION;

public class LocationInputValidation {
	public static void checkFormat(String location) throws IllegalInputValidationException {
		String[] splitLocations = LocationInputTrim.trimSpecialCharacters(location);

		if (splitLocations.length != 2) {
			throw new IllegalInputValidationException(LOCATION_FORMAT_EXCEPTION);
		}

		for (String splitLocation : splitLocations) {
			try {
				Integer.parseInt(splitLocation.trim());
			} catch (NumberFormatException e) {
				throw new IllegalInputValidationException(NUMBER_FORMAT_EXCEPTION);
			}
		}
	}


}
