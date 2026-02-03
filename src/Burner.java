//Author Jiah and Chase

public class Burner {
	
	private enum Temperature {
		BLAZING,
		HOT,
		WARM,
		COLD
	}
	
	private Temperature _myTemperature;
	private Setting _mySetting;
	private int _timer;
	public final static int TIME_DURATION = 2;
	
	public Temperature getTemperature() {
		return _myTemperature;
	}
	
	Burner() {
		this._myTemperature = Temperature.COLD;
		this._mySetting = Setting.OFF;
	}
}
