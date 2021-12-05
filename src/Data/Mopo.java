package Data;

public class Mopo extends Kulkuneuvo {
	private String moottorimerkki;
	private String tyyppi;
	
	public Mopo() {
		
	}
	
	public Mopo(int hinta, String vari, int maksimiNopeus, int nopeus, String moottorimerkki, String tyyppi) {
		super(hinta, vari, maksimiNopeus, nopeus);
		this.moottorimerkki = moottorimerkki;
		this.tyyppi = tyyppi;
		
	}
	public String getMoottorimerkki() {
		return moottorimerkki;
	}
	public void setMoottorimerkki(String moottorimerkki) {
		this.moottorimerkki = moottorimerkki;
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
}
