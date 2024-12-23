package generaticutility;

import java.time.LocalDateTime;

public class JavaUtility {

	/**
	 * This capture current date and time and replace : with -
	 * @return
	 */
	public String getSystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}
}
