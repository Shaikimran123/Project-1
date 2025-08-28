package com.gatedcommunity.modal;

public class Complain {
	
	private int complainID;
	private String category;
	private String description;
	private String urgency;
	private String raisedBy;
	private String status;
	private String comments;
	private String Assidnedto;
	
	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public Complain() {
	}
	
	

	public Complain(int complainID, String assidnedto) {
		super();
		this.complainID = complainID;
		Assidnedto = assidnedto;
	}

	public Complain(String category, String description, String urgency) {
		this.category = category;
		this.description = description;
		this.urgency = urgency;
	}

	public Complain(int complainID, String category, String description, String urgency) {
		this.complainID = complainID;
		this.category = category;
		this.description = description;
		this.urgency = urgency;
	}


	
	public Complain(int complainID, String status, String comments) {
		super();
		this.complainID = complainID;
		this.status = status;
		this.comments = comments;
	}

	public Complain(int complainID, String category, String description, String urgency, String status) {
		super();
		this.complainID = complainID;
		this.category = category;
		this.description = description;
		this.urgency = urgency;
		this.status = status;
	}
	
	

	public Complain(int complainID, String category, String description, String urgency, String status, String comments,
			String assidnedto) {
		super();
		this.complainID = complainID;
		this.category = category;
		this.description = description;
		this.urgency = urgency;
		this.status = status;
		this.comments = comments;
		Assidnedto = assidnedto;
	}

	public Complain(int complainID, String category, String description, String urgency, String raisedBy, String status,
			String comments, String Assidnedto) {
		super();
		this.complainID = complainID;
		this.category = category;
		this.description = description;
		this.urgency = urgency;
		this.raisedBy = raisedBy;
		this.status = status;
		this.comments = comments;
		this.Assidnedto = Assidnedto;
	}

	public int getComplainID() {
		return complainID;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setComplainID(int complainID) {
		this.complainID = complainID;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	
	
	
	

	public String getStatus() {
		return status;
	}

	public String getComments() {
		return comments;
	}

	public String getAssidnedto() {
		return Assidnedto;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setAssidnedto(String Assidnedto) {
		this.Assidnedto = Assidnedto;
	}

	@Override
	public String toString() {
		return "Complain [complainID=" + complainID + ", category=" + category + ", description=" + description
				+ ", urgency=" + urgency + ", raisedBy=" + raisedBy + ", status=" + status + ", comments=" + comments
				+ ", Assidnedto=" + Assidnedto + "]";
	}
	

	
	
	
	
	

}
