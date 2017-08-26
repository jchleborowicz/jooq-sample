/*
 * This file is generated by jOOQ.
*/
package pl.jdata.samples.jooqsample.jooqmodel.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import pl.jdata.samples.jooqsample.jooqmodel.Keys;
import pl.jdata.samples.jooqsample.jooqmodel.Public;
import pl.jdata.samples.jooqsample.jooqmodel.tables.records.LanguageRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Language extends TableImpl<LanguageRecord> {

    private static final long serialVersionUID = -321636768;

    /**
     * The reference instance of <code>public.language</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguageRecord> getRecordType() {
        return LanguageRecord.class;
    }

    /**
     * The column <code>public.language.id</code>.
     */
    public final TableField<LanguageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.language.cd</code>.
     */
    public final TableField<LanguageRecord, String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this, "");

    /**
     * The column <code>public.language.description</code>.
     */
    public final TableField<LanguageRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>public.language</code> table reference
     */
    public Language() {
        this("language", null);
    }

    /**
     * Create an aliased <code>public.language</code> table reference
     */
    public Language(String alias) {
        this(alias, LANGUAGE);
    }

    private Language(String alias, Table<LanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Language(String alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LanguageRecord> getPrimaryKey() {
        return Keys.LANGUAGE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LanguageRecord>> getKeys() {
        return Arrays.<UniqueKey<LanguageRecord>>asList(Keys.LANGUAGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language as(String alias) {
        return new Language(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(String name) {
        return new Language(name, null);
    }
}
