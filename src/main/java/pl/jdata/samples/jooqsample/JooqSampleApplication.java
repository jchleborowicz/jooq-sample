package pl.jdata.samples.jooqsample;

import org.jooq.DSLContext;
import org.jooq.conf.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JooqSampleApplication {

    @Bean
    public Settings settings() {
        return new Settings()
                .withRenderFormatted(true);
    }

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(JooqSampleApplication.class, args);

        final DSLContext dslContext = applicationContext.getBean(DSLContext.class);

        testJooq(dslContext);
    }

    private static void testJooq(DSLContext dslContext) {
        dslContext.selectOne().fetch();
    }

}
