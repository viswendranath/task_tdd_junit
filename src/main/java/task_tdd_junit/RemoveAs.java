package task_tdd_junit;

public class RemoveAs {
	public String remove(String string) {
		int stringLength = string.length();
		String result = string;
		
		if(stringLength  == 1) {
			if(string.charAt(0) == 'A') {
				result = "";
			}
		}else if (stringLength > 1) {
			if (string.charAt(0) == 'A' && string.charAt(1) == 'A') {
				result = string.substring(2,stringLength);
			} else if (string.charAt(0) != 'A' && string.charAt(1) == 'A') {
				result = string.charAt(0) +  string.substring(2,stringLength);
			} else if (string.charAt(0) == 'A' && string.charAt(1) != 'A') {
				result = string.substring(1,stringLength);
			}
		}

		return result;
	}
}
