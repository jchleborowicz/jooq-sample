package pl.jch.tests.jooq.jooqtest;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JooqTestApplication {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(JooqTestApplication.class, args);

        final DSLContext dslContext = applicationContext.getBean(DSLContext.class);

        doSth(dslContext);
    }

    private static void doSth(DSLContext dslContext) {
        final Result<Record1<Integer>> fetch = dslContext.selectOne().fetch();
        System.out.println("***");
        System.out.println(fetch);
    }
}
