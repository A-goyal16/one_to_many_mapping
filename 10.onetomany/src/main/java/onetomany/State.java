package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State
{
	@Id
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCheifMinisterName() {
		return cheifMinisterName;
	}
	public void setCheifMinisterName(String cheifMinisterName) {
		this.cheifMinisterName = cheifMinisterName;
	}
	public List<MLA> getMla() {
		return mla;
	}
	public void setMla(List<MLA> mla) {
		this.mla = mla;
	}
	String cheifMinisterName;
	@OneToMany
	List<MLA> mla;
}
