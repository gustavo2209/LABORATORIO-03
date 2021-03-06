package pe.edu.unmsm.fisi.upg.ads.cleancode.domain;

public class Session {
	private String title;
	private String description;
	private boolean isApproved;

	public Session(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean approved) {
		this.isApproved = approved;
	}

}
