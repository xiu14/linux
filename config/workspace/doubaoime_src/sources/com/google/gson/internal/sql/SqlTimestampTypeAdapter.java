package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.b;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    static final t b = new t() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(gson);
            return new SqlTimestampTypeAdapter(gson.e(com.google.gson.u.a.a(Date.class)), null);
        }
    };
    private final TypeAdapter<Date> a;

    SqlTimestampTypeAdapter(TypeAdapter typeAdapter, AnonymousClass1 anonymousClass1) {
        this.a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Timestamp b(com.google.gson.stream.a aVar) throws IOException {
        Date b2 = this.a.b(aVar);
        if (b2 != null) {
            return new Timestamp(b2.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(b bVar, Timestamp timestamp) throws IOException {
        this.a.c(bVar, timestamp);
    }
}
