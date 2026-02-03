
/* 
 * Class: Setting
 * Store: its local setting as a String (_temp)
 * Authors: Chase Beckley & Jiah Folvarko
 * Date: Feb 2 2026
 */

public enum Setting {
	OFF("---"),
	LOW("--+"),
	MEDIUM("-++"),
	HIGH("+++");
	
	private final String _temp;
	
	Setting(String temp) { // constructor 
		this._temp = temp;
	}
	
	@Override
	public String toString() { // returns the temp setting as a string
		return _temp;
	}
}
