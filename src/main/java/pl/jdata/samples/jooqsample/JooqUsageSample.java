package pl.jdata.samples.jooqsample;

import org.jooq.DSLContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static pl.jdata.samples.jooqsample.jooqmodel.Tables.BOOK;

@Component
@DependsOn("liquibase")
public class JooqUsageSample {

    private final DSLContext dsl;

    public JooqUsageSample(DSLContext dsl) {
        this.dsl = dsl;
    }

    @PostConstruct
    public void performTesting() {
        this.dsl.selectOne()
                .fetch();

        this.dsl.select()
                .from(BOOK)
                .fetch();
    }

}
