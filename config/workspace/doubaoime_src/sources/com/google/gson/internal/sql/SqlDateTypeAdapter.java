package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    static final t b = new t() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a;

    @Override // com.google.gson.TypeAdapter
    public Date b(com.google.gson.stream.a aVar) throws IOException {
        java.util.Date parse;
        if (aVar.c0() == JsonToken.NULL) {
            aVar.S();
            return null;
        }
        String Y = aVar.Y();
        try {
            synchronized (this) {
                parse = this.a.parse(Y);
            }
            return new Date(parse.getTime());
        } catch (ParseException e2) {
            throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as SQL Date; at path ")), e2);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void c(b bVar, Date date) throws IOException {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.D();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date2);
        }
        bVar.e0(format);
    }

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
