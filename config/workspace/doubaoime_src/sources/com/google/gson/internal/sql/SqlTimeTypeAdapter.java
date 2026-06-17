package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    static final t b = new t() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a;

    @Override // com.google.gson.TypeAdapter
    public Time b(com.google.gson.stream.a aVar) throws IOException {
        Time time;
        if (aVar.c0() == JsonToken.NULL) {
            aVar.S();
            return null;
        }
        String Y = aVar.Y();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(Y).getTime());
            }
            return time;
        } catch (ParseException e2) {
            throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as SQL Time; at path ")), e2);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void c(b bVar, Time time) throws IOException {
        String format;
        Time time2 = time;
        if (time2 == null) {
            bVar.D();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time2);
        }
        bVar.e0(format);
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
