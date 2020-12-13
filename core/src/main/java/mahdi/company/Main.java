package mahdi.company;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        logger.info("Start logging ...");

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        NumberGenerator numberGenerator =
                context.getBean("numberGenerator", NumberGeneratorImpl.class);
        int number = numberGenerator.next();

        logger.info("here is number: {}", number);

    }
}
