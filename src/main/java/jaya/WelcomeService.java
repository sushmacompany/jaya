package jaya;

import org.eiichiro.gig.Service;
import org.eiichiro.jaguar.inject.Inject;
import org.eiichiro.jaguar.inject.Name;

@Name("jaya.WelcomeService")
@Service
public class WelcomeService {

	@Inject private WelcomeRepository repository;
	
	public Welcome get() {
		return repository.get();
	}
	
}
