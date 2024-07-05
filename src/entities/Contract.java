package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contract {

	private Integer number;
	private Date date;
	private Double totoalValue;
	
	List<Installment> Installments = new ArrayList<Installment>();
	
	public Contract() {}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totoalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotoalValue() {
		return totoalValue;
	}

	public void setTotoalValue(Double totoalValue) {
		this.totoalValue = totoalValue;
	}

	public List<Installment> getInstallments() {
		return Installments;
	}

	
	
	
	
	
	
}
