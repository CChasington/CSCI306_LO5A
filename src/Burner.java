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
	
	void plusButton() {
		switch (_myTemperature) {
		case COLD:
			_myTemperature = Temperature.WARM;
			break;
		case WARM:
			_myTemperature = Temperature.HOT;
			break;
		case HOT:
			_myTemperature = Temperature.BLAZING;
			break;
		default:
			break;
		}
	}
	
	void minusButton() {
		switch (_myTemperature) {
		case BLAZING:
			_myTemperature = Temperature.HOT;
			break;
		case HOT:
			_myTemperature = Temperature.WARM;
			break;
		case WARM:
			_myTemperature = Temperature.COLD;
			break;
		default:
			break;
		}
	}
}
