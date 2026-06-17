package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.s;
import com.google.gson.internal.x;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    private final b<T> a;
    private final List<DateFormat> b;

    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);
        private final Class<T> a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            protected Date b(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.a = cls;
        }

        public final t a(int i, int i2) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i, i2, null);
            Class<T> cls = this.a;
            TypeAdapter<Class> typeAdapter = TypeAdapters.a;
            return new TypeAdapters.AnonymousClass31(cls, defaultDateTypeAdapter);
        }

        protected abstract T b(Date date);
    }

    DefaultDateTypeAdapter(b bVar, int i, int i2, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (s.a()) {
            arrayList.add(x.c(i, i2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(com.google.gson.stream.a aVar) throws IOException {
        Date b2;
        if (aVar.c0() == JsonToken.NULL) {
            aVar.S();
            return null;
        }
        String Y = aVar.Y();
        synchronized (this.b) {
            Iterator<DateFormat> it2 = this.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    try {
                        b2 = com.google.gson.internal.bind.d.a.b(Y, new ParsePosition(0));
                        break;
                    } catch (ParseException e2) {
                        throw new r(e.a.a.a.a.g(aVar, e.a.a.a.a.U("Failed parsing '", Y, "' as Date; at path ")), e2);
                    }
                }
                try {
                    b2 = it2.next().parse(Y);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        return this.a.b(b2);
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.D();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        bVar.e0(format);
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder M = e.a.a.a.a.M("DefaultDateTypeAdapter(");
            M.append(((SimpleDateFormat) dateFormat).toPattern());
            M.append(')');
            return M.toString();
        }
        StringBuilder M2 = e.a.a.a.a.M("DefaultDateTypeAdapter(");
        M2.append(dateFormat.getClass().getSimpleName());
        M2.append(')');
        return M2.toString();
    }
}
