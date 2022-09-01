package quiz06;

public class Tank extends GameUnit{

	public Tank(String name) {
		super(name, 100, 10);
	}
	
	@Override
	public void attack(GameUnit unit) {
		
		// 10%확률로 KO시킬 수 있다.
		if(Math.random() < 0.1) {
			unit.setEnergy(0);
			unit.setAlive(false);
			System.out.println(unit.getName() + "을 한 방에 죽였다.");
		} else {
			int unitEnergy = unit.getEnergy() - unit.getPower() < 0 ? 0 : unit.getEnergy() - unit.getPower();
			unit.setEnergy(unit.getEnergy() - unit.getPower());
			unit.setAlive(unitEnergy > 0);
			System.out.println(unit.getName() + "의 남은 에너지 " + unit.getEnergy());
		}
	}
	
	
}
