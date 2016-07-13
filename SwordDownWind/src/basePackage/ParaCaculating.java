//此类用来计算人物信息
package basePackage;


public class ParaCaculating {
	private int level;
	public ParaCaculating(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int exCaculate(int nowEx){             //每级的经验计算
		int UP_ex;
		UP_ex = nowEx + (int )(level * 0.1 * nowEx);
		return UP_ex;
	}
	public int HPCaculate(int nowHP){
		int UP_HP;
		UP_HP = nowHP + (int )(level * 0.2 * nowHP);
		return UP_HP;
	}
	public int MPCaculate(int nowMP){
		int UP_MP;
		UP_MP = nowMP + (int )(level * 0.08 * nowMP);
		return UP_MP;
	}
	public int AttackCaculate(int nowAttack) {
		int UP_Attack;
		UP_Attack = nowAttack + (int )(level * 0.1 + nowAttack);
		return UP_Attack;
	}
	public int priority(int nowPriority){
		nowPriority++;
		return nowPriority;
	}
}
