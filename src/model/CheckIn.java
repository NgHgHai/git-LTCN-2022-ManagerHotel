package model;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CheckIn {
	PersonalData personalData;
	Payment payment;
	ARoom room;
	boolean pay = false;
	Date checkInDate;
	Date checkOutDate;

	public CheckIn(PersonalData personalData, Payment payment, ARoom room, boolean pay, Date checkInDate,
			Date checkOutDate) {
		super();
		this.personalData = personalData;
		this.payment = payment;
		this.room = room;
		this.pay = pay;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public void paid() {
		pay = true;
	}

	public int getDateBetweenTwoDate(Date date1, Date date2) {
		Long result = ChronoUnit.DAYS.between(date1.toInstant(), date2.toInstant());
		return Math.abs(Math.toIntExact(result));
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public Payment getPayment() {
		return payment;
	}

	public ARoom getRoom() {
		return room;
	}

	public boolean isPay() {
		return pay;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}


}
