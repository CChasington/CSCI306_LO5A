
public enum Setting {
	OFF("---"),
	LOW("--+"),
	MEDIUM("-++"),
	HIGH("+++");
	
	private final String _temp;
	
	Setting(String temp) {
		this._temp = temp;
	}
}
