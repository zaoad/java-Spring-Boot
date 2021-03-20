package zaoad.project.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zaoad.project.jpademo.ApplicationProperties.MyProperties;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
    @Autowired
    MyProperties myProperties;
	public static void main(String[] args) {

	    SpringApplication.run(JpaDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
	    String[] orgs=myProperties.getZaoad().getOrgs();
        Integer[] sms=myProperties.getZaoad().getOrg().getSms();
        for(String org: orgs)
        {
            System.out.println(org);
        }
        for(Integer persms: sms)
        {
            System.out.println(persms);
        }
    }
}
