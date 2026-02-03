//Author Jiah and Chase

public class Burner {
	
	public enum Temperature {
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
		switch (_mySetting) {
		case OFF:
			_mySetting = Setting.LOW;
			_timer = TIME_DURATION;
			break;
		case LOW:
			_mySetting = Setting.MEDIUM;
			_timer = TIME_DURATION;
			break;
		case MEDIUM:
			_mySetting = Setting.HIGH;
			_timer = TIME_DURATION;
			break;
		default:
			break;
		}
	}
	
	void minusButton() {
		switch (_mySetting) {
		case HIGH:
			_mySetting = Setting.MEDIUM;
			_timer = TIME_DURATION;
			break;
		case MEDIUM:
			_mySetting = Setting.LOW;
			_timer = TIME_DURATION;
			break;
		case LOW:
			_mySetting = Setting.OFF;
			_timer = TIME_DURATION;
			break;
		default:
			break;
		}
	}
	
	void updateTemperature() {
		switch (_timer) {
		case 0:
			return;
		case 2:
			_timer--;
			return;
		case 1:
			_timer--;
			switch (_mySetting) {
			case OFF:
				if (_myTemperature == Temperature.WARM) lowerTemp();
				else if (_myTemperature == Temperature.HOT || _myTemperature == Temperature.BLAZING) {
					lowerTemp();
					_timer = TIME_DURATION;
				}
				break;
			case LOW:
				if (_myTemperature == Temperature.COLD) raiseTemp();
				else if (_myTemperature == Temperature.HOT) lowerTemp();
				else if (_myTemperature == Temperature.BLAZING) {
					lowerTemp();
					_timer = TIME_DURATION;
				}
				break;
			case MEDIUM:
				if (_myTemperature == Temperature.WARM) raiseTemp();
				else if (_myTemperature == Temperature.BLAZING) lowerTemp();
				else if (_myTemperature == Temperature.COLD) {
					raiseTemp();
					_timer = TIME_DURATION;
				}
				break;
			case HIGH:
				if (_myTemperature == Temperature.HOT) raiseTemp();
				else if (_myTemperature == Temperature.COLD || _myTemperature == Temperature.WARM) {
					raiseTemp();
					_timer = TIME_DURATION;
				}
				break;
			}
		}
	}
		
	
	void display() {
		System.out.print("[" + _mySetting.toString() + "]");
		System.out.print(".....");
		switch (_myTemperature) {
		case COLD:
			System.out.println("cooool");
			break;
		case WARM:
			System.out.println("warm");
			break;
		case HOT:
			System.out.println("CAREFUL");
			break;
		case BLAZING:
			System.out.println("VERY HOT! DON'T TOUCH");
			break;
		default:
			break;
		}
	}
	
	
	private void raiseTemp() {
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
	
	private void lowerTemp() {
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
