package tv.telecom;

public abstract class Telecom {
	public void connection(){
		System.out.println("통신망을 연결합니다");
	}
	public void charge(){
		System.out.println("과금합니다");
	}
	public abstract void channel();
}
