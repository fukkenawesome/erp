package de.kuebler.erp.crm.mvc.model;

//Don't Know Where to implement this
public class CustomerModel {
	
	private int Id;
	private int sbh_Id;
	private String company;
	private String surname;
	private String name_2;
	private String firstname;
	private String street;
	private String houseNumber;
	private String zip;
	private String city;
	private String country;
	private String phoneNumber;
	private String faxNumber;
	private String cellNumber;
	private String email;
	private boolean warning;
	private String note;
	private boolean type;

	public CustomerModel(){
		
	}
	
	public CustomerModel(int Id, 
					int sbh_Id, 
					String company, 
					String surname, 
					String name_2, 
					String firstname,
					String street,
					String houseNummber,
					String zip,
					String city,
					String country,
					String phoneNumber,
					String faxNumber,
					String cellNumber,
					String email,
					boolean warning,
					String note,
					boolean type){
		this.Id = Id;
		this.sbh_Id = sbh_Id;
		this.company = company;
		this.surname = surname;
		this.name_2 = name_2;
		this.firstname = firstname;
		this.street = street;
		this.houseNumber = houseNummber;
		this.zip = zip;
		this.city = city;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.cellNumber = cellNumber;
		this.email = email;
		this.warning = warning;
		this.note = note;
		this.type = type;
		
	}
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getSbh_Id() {
		return sbh_Id;
	}

	public void setSbh_Id(int sbh_Id) {
		this.sbh_Id = sbh_Id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName_2() {
		return name_2;
	}

	public void setName_2(String name_2) {
		this.name_2 = name_2;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	
	
}
