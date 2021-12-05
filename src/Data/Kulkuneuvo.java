package Data;

public class Kulkuneuvo {
	private float hinta;
	private String vari;
	private int maksimiNopeus;
	private int nopeus;
	

	public Kulkuneuvo() {
		
	}
	
	public Kulkuneuvo(float hinta, String vari, int maksimiNopeus, int nopeus) {
		this.hinta=hinta;
		this.vari=vari;
		this.maksimiNopeus=maksimiNopeus;
		this.nopeus=nopeus;
	}
	

	public float getHinta() {
		return hinta;
	}

	public void setHinta(float hinta) {
		this.hinta = hinta;
	}

	public String getVari() {
		return vari;
	}

	public void setVari(String vari) {
		this.vari = vari;
	}

	public int getMaksimiNopeus() {
		return maksimiNopeus;
	}

	public void setMaksimiNopeus(int maksimiNopeus) {
		this.maksimiNopeus = maksimiNopeus;
	}
	
	public int getNopeus() {
		return nopeus;
	}

	public void setNopeus(int nopeus) {

			this.nopeus = nopeus;	
	}
	

	public boolean kiihdyta(int kiihdytys) {
		if (kiihdytys >= 0) {
			this.nopeus = nopeus+kiihdytys;
			return true;
		} else {
			System.out.print("Kiihdytys pitää olla yli 0");
		}
		return false;
	}
	
	public boolean hidasta(int hidastus) {
		if (nopeus >= hidastus) {
			this.nopeus = nopeus-hidastus;
			return true;
		} else {
			System.out.println("Nopeus ei voi olla alle 0");
		}
		return false;
		}
}
