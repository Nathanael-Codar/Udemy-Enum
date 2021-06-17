package entities;

import java.util.Date;

import entities.enums.entities_e;

public class entidades_princip {
	private Integer id;
	private Date moment;
	private entities_e status;
	
	public entidades_princip() {
	}

	public entidades_princip(Integer id, Date moment, entities_e status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public entities_e getStatus() {
		return status;
	}

	public void setStatus(entities_e status) {
		this.status = status;
	}
	
	
	
}
