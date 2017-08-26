/*
 * This file is generated by jOOQ.
*/
package pl.jdata.samples.jooqsample.jooqmodel;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import pl.jdata.samples.jooqsample.jooqmodel.tables.SystemUser;
import pl.jdata.samples.jooqsample.jooqmodel.tables.records.SystemUserRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SystemUserRecord> PK_USER = UniqueKeys0.PK_USER;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<SystemUserRecord> PK_USER = createUniqueKey(SystemUser.SYSTEM_USER, "pk_user", SystemUser.SYSTEM_USER.ID);
    }
}