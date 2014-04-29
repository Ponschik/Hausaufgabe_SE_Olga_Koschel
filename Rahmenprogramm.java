import java.util.Date;


public class Rahmenprogramm {
	private String bezeichnung;
	private String clock;
	private Date date;
	private String location;
	
	public Rahmenprogramm(String bezeichnung, Date date, String clock, String location){
		this.bezeichnung = bezeichnung;
		this.date = date;
		this.clock = clock;
		this.location = location;
	}
}
