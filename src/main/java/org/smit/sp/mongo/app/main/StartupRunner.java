package org.smit.sp.mongo.app.main;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;


public class StartupRunner implements CommandLineRunner{
	private static final Logger logger=Logger.getLogger(StartupRunner.class.getName());
	
	/*@Autowired
	private DataSource ds;
	*/
	public StartupRunner() {
		// TODO Auto-generated constructor stub
		logger.info("***********************");
		System.out.println("initilizaing the Startuprunner class");
	}
	
	
	
	@Override
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("Run() method of the startup runner class is getting called "+ds.toString());
		System.out.println("***********executing this before the actual application starts up*********************");
		
	}
	
	

}
