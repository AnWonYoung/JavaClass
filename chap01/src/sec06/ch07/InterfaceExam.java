package sec06.ch07;

public class InterfaceExam {
	public static void main(String[] args) {
		LGTv tv1 = new LGTv();
		RemoteControl rc1 = tv1;
		rc1.volumeUp();
		rc1.volumeDown();
		rc1
		.chkVolume();
		
		SamsungTv tv2 = new SamsungTv();
		RemoteControl rc2 = tv2;
		
		rc2.volumeUp();
		rc2.volumeDown();
		rc2.chkVolume();
	}

}
