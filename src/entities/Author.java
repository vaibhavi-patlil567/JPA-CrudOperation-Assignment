package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="author")
public class Author implements Serializable
{
private static final long serialVersionUID = 1L;
	
	@Id
	private int author_Id;
	private String First_name;
	private String Middle_name;
	private String Last_name;
	private long Phone_no;
	public int getAuthor_Id() {
		return author_Id;
	}
	public void setAuthor_Id(int author_Id) {
		this.author_Id = author_Id;
	}

	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getMiddle_name() {
		return Middle_name;
	}
	public void setMiddle_name(String middle_name) {
		Middle_name = middle_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public long getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(long phone_no) {
		Phone_no = phone_no;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	

}