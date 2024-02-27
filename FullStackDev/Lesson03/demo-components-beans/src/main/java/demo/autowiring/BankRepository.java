package demo.autowiring;

public interface BankRepository {
	int createAccount(String name);
	double getBalance(int accountId);
	void updateBalance(int accountId, double amount);
	void deleteAccount(int accountId);
}
