package com.arpit.general;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.validator.routines.InetAddressValidator;

class FindIPCount {

	public static void findSuccessIpCount(String record) {

		// To valid if its a valid IPv4 or IPv6 address
		InetAddressValidator validator = InetAddressValidator.getInstance();

		//Base conditions to check record is not null or length < 0
		if (record == null || record.length() == 0) {
			System.out.println("Please use a valid record for parsing");
		}
		// Creating a regular expression for the records 
		final String regex = "^(\\S+) (\\S+) (\\S+) " + "\\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(\\S+)"
				+ " (\\S+)\\s*(\\S+)?\\s*\" (\\d{3}) (\\S+)";

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(record);

		// Creating a Hashmap containing string as the key and integer as the value. 
		Map<String, Integer> countIP = new LinkedHashMap<String, Integer>();
		while (matcher.find()) {
			String iPAddress = matcher.group(1);
			String responseGroup = matcher.group(8);
			int responseCode = 0;
			// Base Conditions to check responseGroup is not null and empty
			if (responseGroup != null || responseGroup.length() != 0) {
				responseCode = Integer.parseInt(responseGroup);
			} else {
				System.out.println("Response Group is in-correct");
			}

			// Checking conditions to make sure IP address doesn't exist/in-correct
			if (iPAddress != null && iPAddress.length() != 0 && validator.isValid(iPAddress)) {

				// Inserting the IP addresses in the HashMap and maintaining the frequency for each HTTP 200 code. 
				if (responseCode == 200) {
					if (countIP.containsKey(iPAddress)) {
						countIP.put(iPAddress, countIP.get(iPAddress) + 1);
					} else {
						countIP.put(iPAddress, 1);
					}
				}
			} else {
				System.out.println(iPAddress + "  " + "IP Address is In-valid/Doesn't exist");
			}

		}

		// Printing the HashMap 
		for (Map.Entry entry : countIP.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}

public class ParseLogFileAppleAssignment {

	public static void main(String[] args) {

		final String log = "192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /abc HTTP/1.1\" 404 201\n"
				+ "192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /favicon.ico HTTP/1.1\" 200 1406\n"
				+ "192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /wp/ HTTP/1.1\" 200 5235\n"
				+ "192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /wp/wp-content/themes/twentytwelve/style.css?ver=3.5.1 HTTP/1.1\" 200 35292\n"
				+ "192.168.1.3 - - [17/Sep/2013:22:18:19 -0700] \"GET /wp/wp-content/themes/twentytwelve/js/navigation.js?ver=1.0 HTTP/1.1\" 200 863\n";

		FindIPCount.findSuccessIpCount(log);

	}

}
