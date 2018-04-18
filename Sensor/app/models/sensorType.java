package models;

import java.util.*;
import javax.persistence.*;
import play.data.validation.*;
import play.db.ebean.*;
import play.db.ebean.Model.*;
@SuppressWarnings("serial")
@Entity

public class sensorType {
	@Id
	private Long id;
	
	@Basic
	public int value; 
	
	@Basic
	public int jumlah; 
	
	@Basic
	public int input; 
	
	@Basic
	public int output;
	
	@Basic
	public String node; 
	
	@Basic
	public String type;
	
	private int a;
	
	public sensorType(int a) {
		super();
		this.a = 100;
	}
	public int addnode() {
		int jumlah = 1;
		if(jumlah == 1) {
			System.out.println("node berhasil anda tambahkan");	
		}
		return jumlah;
	}

	public void addsensor(String nodal) {
		node = nodal;
	}
	
	public void setvalue() {
		input = 10;
		output = 20;
	}
	
	public int getvalue() {
		return value;
	}
	
	public sensorType() {
		
	}
	
	public String toString() {
		String result = "ID : " + id +"\n";
		result += "Value : " + value + "\n";
		result += "Jumlah : " + jumlah + "\n";
		result += "Input : " + input + "\n";
		result += "Output : " + output + "\n";
		result += "Node : " + node + "\n";
		result += "Tipe : " + type + "\n";
		return result;
	}


	public static Finder<Long, sensorType> find = new Finder<Long, sensorType>(Long.class, sensorType.class);
	public static sensorType findById( Long _id) {
		return find.where()
		.eq("id", _id)
		.findUnique();
	}
	
	public static List<sensorType> findAll(){
		return find.all();
	}

}
