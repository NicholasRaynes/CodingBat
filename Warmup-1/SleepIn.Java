public SleepIn
{
  /**
	 * Determines if you should sleep in, 
   * depending on the type of day.
	 *
	 * @param weekday Whether or not it is a weekday.
	 * @param vacation Whether or not it is a vacation day.
	 */
  public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      return true;
    }

    return false;
  }
}
