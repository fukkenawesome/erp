package de.kuebler.erp.crm.mvc.model;

import java.sql.Date;
import java.sql.Timestamp;

//And The Same Here @Something
public class RequestModel {

	private int id;
	private int customer_Id;		//foreign key Customer
	private long comission_Id;		//foreign key Customer
	private Date date_created;
	private Timestamp last_changed;
	private int created_by;
	private int last_changed_by;	//foreign key User
	private int in_process_by;		//foreign key User
	private String product;
	private String status;
	private String deadline;
	private String type;
	private String note;
	private boolean active;
	
	public RequestModel(){
		
	}
	
	public RequestModel(int id, int customer_Id, long comission_Id, Date date_created, Timestamp last_changed, int created_by, int last_changed_by, int in_process_by, String product, String status, String deadline, String type, String note, boolean active){
		this.id = id;
		this.customer_Id = customer_Id;
		this.comission_Id = comission_Id;
		this.date_created = date_created;
		this.last_changed = last_changed;
		this.created_by = created_by;
		this.last_changed_by = last_changed_by;
		this.in_process_by = in_process_by;
		this.product = product;
		this.status = status;
		this.deadline = deadline;
		this.type = type;
		this.note = note;
		this.active = active;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public long getComission_Id() {
		return comission_Id;
	}

	public void setComission_Id(long comission_Id) {
		this.comission_Id = comission_Id;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Timestamp getLast_changed() {
		return last_changed;
	}

	public void setLast_changed(Timestamp last_changed) {
		this.last_changed = last_changed;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getLast_changed_by() {
		return last_changed_by;
	}

	public void setLast_changed_by(int last_changed_by) {
		this.last_changed_by = last_changed_by;
	}

	public int getIn_process_by() {
		return in_process_by;
	}

	public void setIn_process_by(int in_process_by) {
		this.in_process_by = in_process_by;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
