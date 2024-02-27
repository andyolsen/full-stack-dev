package demo.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

@Service("bankService")
public class BankServiceImpl implements BankService {

	// Can use property DI:
	@Autowired
	private BankRepository repository;

	// Or can use constructor DI:
    /*
    private BankRepository repository;

    @Autowired
    public BankServiceImpl(BankRepository repository) {
        this.repository = repository;
    }
	*/

	
    @Override
	public void depositIntoAccount(int accountId, double amount) {
		System.out.printf("In BankServiceImpl.depositIntoAccount(%d, %.2f)\n", accountId, amount);
		repository.updateBalance(accountId, amount);
	}

	@Override
	public void withdrawFromAccount(int accountId, double amount) {
		System.out.printf("In BankServiceImpl.withdrawFromAccount(%d, %.2f)\n", accountId, amount);
		repository.updateBalance(accountId, -amount);
	}

	@Override
	public void transferFunds(int fromAccountId, int toAccountId, double amount) {
		System.out.printf("In BankServiceImpl.transferFunds(%d, %d, %.2f)\n", fromAccountId, toAccountId, amount);
		repository.updateBalance(fromAccountId, -amount);
		repository.updateBalance(toAccountId, +amount);
	}

	@Autowired
	private Collection<BankRepository> repositories;

	@Autowired
	private Map<String, BankRepository> repositoriesMap;
}
