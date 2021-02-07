package guru.springframework.sfgjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgJmsApplication {

	public static void main(String[] args) throws Exception {


		/*ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
				.setPersistenceEnabled(false)
				.setJournalDirectory("target/data/journal")
				.setSecurityEnabled(false)
				.addAcceptorConfiguration("invm", "vm://0"));*/

		/*Configuration config = new ConfigurationImpl();
		config.setPersistenceEnabled(false);
		config.setSecurityEnabled(false);
		config.setJournalDirectory("target/data/journal");
		config.getAcceptorConfigurations().add(new TransportConfiguration(NettyAcceptorFactory.class.getName()));
		ActiveMQServer server = new ActiveMQServerImpl(config);*/

		// ActiveMQServers.newActiveMQServer(config);

		SpringApplication.run(SfgJmsApplication.class, args);

	}

}
