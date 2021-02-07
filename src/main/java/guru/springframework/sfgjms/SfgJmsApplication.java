package guru.springframework.sfgjms;

import org.apache.activemq.artemis.api.core.TransportConfiguration;
import org.apache.activemq.artemis.core.config.Configuration;
import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.remoting.impl.netty.NettyAcceptorFactory;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl;
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

		Configuration config = new ConfigurationImpl();
		config.setPersistenceEnabled(false);
		config.setSecurityEnabled(false);
		config.setJournalDirectory("target/data/journal");
		config.getAcceptorConfigurations().add(new TransportConfiguration(NettyAcceptorFactory.class.getName()));
		ActiveMQServer server = new ActiveMQServerImpl(config);

		SpringApplication.run(SfgJmsApplication.class, args);

	}

}
