
public class cup {
	String name, color;
	int serialNumber;
	boolean handle, broken;
	double maxFluid, currentFluid;

	public cup() {

	}

	public double fillCup(double amount) {
		if (amount > this.maxFluid || this.currentFluid + amount > this.maxFluid)
			this.currentFluid += 0.0;
		else
			this.maxFluid += amount;
		return currentFluid;
	}

	public double emptyCup(double amount) {
		this.currentFluid -= amount;
		if (this.currentFluid <= 0) {
			this.currentFluid = 0;
		}
		return currentFluid;
	}

	public boolean dropCup() {

		return broken;
	}

	public boolean breakCup() {

		return broken;
	}
}
