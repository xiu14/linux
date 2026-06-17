package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.s;
import com.google.gson.internal.x;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final t b = new t() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (s.a()) {
            arrayList.add(x.c(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Date b(com.google.gson.stream.a aVar) throws IOException {
        Date b2;
        if (aVar.c0() == JsonToken.NULL) {
            aVar.S();
            return null;
        }
        String Y = aVar.Y();
        synchronized (this.a) {
            Iterator<DateFormat> it2 = this.a.iterator();
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
        return b2;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, Date date) throws IOException {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.D();
            return;
        }
        DateFormat dateFormat = this.a.get(0);
        synchronized (this.a) {
            format = dateFormat.format(date2);
        }
        bVar.e0(format);
    }
}
