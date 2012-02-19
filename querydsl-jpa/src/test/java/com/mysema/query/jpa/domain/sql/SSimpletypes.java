package com.mysema.query.jpa.domain.sql;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * SSimpletypes is a Querydsl query type for SSimpletypes
 */
@Generated("com.mysema.query.sql.MetaDataSerializer")
public class SSimpletypes extends com.mysema.query.sql.RelationalPathBase<SSimpletypes> {

    private static final long serialVersionUID = -1199604618;

    public static final SSimpletypes simpletypes = new SSimpletypes("SIMPLETYPES_");

    public final NumberPath<Short> bbyte = createNumber("BBYTE", Short.class);

    public final NumberPath<Short> bbyte2 = createNumber("BBYTE2", Short.class);

    public final NumberPath<java.math.BigDecimal> bigdecimal = createNumber("BIGDECIMAL", java.math.BigDecimal.class);

    public final StringPath cchar = createString("CCHAR");

    public final StringPath cchar2 = createString("CCHAR2");

    public final DatePath<java.sql.Date> date = createDate("DATE", java.sql.Date.class);

    public final NumberPath<Double> ddouble = createNumber("DDOUBLE", Double.class);

    public final NumberPath<Double> ddouble2 = createNumber("DDOUBLE2", Double.class);

    public final NumberPath<Double> ffloat = createNumber("FFLOAT", Double.class);

    public final NumberPath<Double> ffloat2 = createNumber("FFLOAT2", Double.class);

    public final NumberPath<Long> id = createNumber("ID", Long.class);

    public final NumberPath<Integer> iint = createNumber("IINT", Integer.class);

    public final NumberPath<Integer> iint2 = createNumber("IINT2", Integer.class);

    public final StringPath llocale = createString("LLOCALE");

    public final NumberPath<Long> llong = createNumber("LLONG", Long.class);

    public final NumberPath<Long> llong2 = createNumber("LLONG2", Long.class);

    public final StringPath sstring = createString("SSTRING");

    public final TimePath<java.sql.Time> time = createTime("TIME", java.sql.Time.class);

    public final DateTimePath<java.sql.Timestamp> timestamp = createDateTime("TIMESTAMP", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<SSimpletypes> sql120219232329350 = createPrimaryKey(id);

    public SSimpletypes(String variable) {
        super(SSimpletypes.class, forVariable(variable), "APP", "SIMPLETYPES_");
    }

    public SSimpletypes(Path<? extends SSimpletypes> entity) {
        super(entity.getType(), entity.getMetadata(), "APP", "SIMPLETYPES_");
    }

    public SSimpletypes(PathMetadata<?> metadata) {
        super(SSimpletypes.class, metadata, "APP", "SIMPLETYPES_");
    }

}

