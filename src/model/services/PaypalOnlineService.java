package model.services;

public class PaypalOnlineService implements OnlinePaymentService{
	
	public Double paymentFee(double amount) {
		return amount * 0.02; 
	}
	public Double interest(double amount,Integer months) {
		return amount * (months/100.0);
	}
}
