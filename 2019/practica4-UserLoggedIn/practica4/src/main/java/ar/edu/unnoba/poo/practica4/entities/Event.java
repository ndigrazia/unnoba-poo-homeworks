package ar.edu.unnoba.poo.practica4.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(fetch=FetchType.LAZY)
	private User owner;
	@Temporal(TemporalType.DATE)
	private Date eventDate;
	@Temporal(TemporalType.DATE)
	private Date startRegistrations;
	@Temporal(TemporalType.DATE)
	private Date endRegistrations;
	private int capacity;
	private float cost;
	private boolean privateEvent;
	
	@Version
	protected int version;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public Date getStartRegistrations() {
		return startRegistrations;
	}
	public void setStartRegistrations(Date startRegistrations) {
		this.startRegistrations = startRegistrations;
	}
	public Date getEndRegistrations() {
		return endRegistrations;
	}
	public void setEndRegistrations(Date endRegistrations) {
		this.endRegistrations = endRegistrations;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public boolean isPrivateEvent() {
		return privateEvent;
	}
	public void setPrivateEvent(boolean privateEvent) {
		this.privateEvent = privateEvent;
	}
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", owner=" + owner + ", eventDate=" + eventDate + ", startRegistrations="
				+ startRegistrations + ", endRegistrations=" + endRegistrations + ", capacity=" + capacity + ", cost="
				+ cost + ", privateEvent=" + privateEvent + ", version=" + version + "]";
	}
	
}
