package pl.jdata.samples.jooqsample;

import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class JooqUsageSample {

    private final DSLContext dsl;

    public JooqUsageSample(DSLContext dsl) {
        this.dsl = dsl;
    }

    @PostConstruct
    public void performTesting() {
        this.dsl.selectOne()
                .fetch();
    }
}
