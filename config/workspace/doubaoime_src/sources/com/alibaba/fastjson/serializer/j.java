package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Member;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* loaded from: classes.dex */
public final class j implements Comparable<j> {
    public final com.alibaba.fastjson.h.a a;
    protected final boolean b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f1512c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f1513d;

    /* renamed from: e, reason: collision with root package name */
    protected char[] f1514e;

    /* renamed from: f, reason: collision with root package name */
    private a f1515f;

    static class a {
        t a;
        Class<?> b;

        public a(t tVar, Class<?> cls) {
            this.a = tVar;
            this.b = cls;
        }
    }

    public j(com.alibaba.fastjson.h.a aVar) {
        boolean z;
        this.a = aVar;
        com.alibaba.fastjson.g.b b = aVar.b();
        if (b != null) {
            z = false;
            for (SerializerFeature serializerFeature : b.serialzeFeatures()) {
                if (serializerFeature == SerializerFeature.WriteMapNullValue) {
                    z = true;
                }
            }
            String trim = b.format().trim();
            r1 = trim.length() != 0 ? trim : null;
            this.f1512c = SerializerFeature.of(b.serialzeFeatures());
        } else {
            this.f1512c = 0;
            z = false;
        }
        this.b = z;
        this.f1513d = r1;
        String str = aVar.a;
        int length = str.length();
        this.f1514e = new char[length + 3];
        str.getChars(0, str.length(), this.f1514e, 1);
        char[] cArr = this.f1514e;
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
    }

    public Object a(Object obj) throws Exception {
        try {
            com.alibaba.fastjson.h.a aVar = this.a;
            return aVar.f1471d ? aVar.f1470c.get(obj) : aVar.b.invoke(obj, new Object[0]);
        } catch (Exception e2) {
            com.alibaba.fastjson.h.a aVar2 = this.a;
            Member member = aVar2.b;
            if (member == null) {
                member = aVar2.f1470c;
            }
            throw new com.alibaba.fastjson.d(e.a.a.a.a.s("get property error。 ", member.getDeclaringClass().getName() + "." + member.getName()), e2);
        }
    }

    public void b(m mVar) throws IOException {
        y yVar = mVar.b;
        int i = yVar.f1531c;
        if ((SerializerFeature.QuoteFieldNames.mask & i) == 0) {
            yVar.o(this.a.a, true);
        } else if ((i & SerializerFeature.UseSingleQuotes.mask) != 0) {
            yVar.o(this.a.a, true);
        } else {
            char[] cArr = this.f1514e;
            yVar.write(cArr, 0, cArr.length);
        }
    }

    public void c(m mVar, Object obj) throws Exception {
        String str = this.f1513d;
        if (str != null) {
            if (!(obj instanceof Date)) {
                mVar.f(obj);
                return;
            }
            DateFormat b = mVar.b();
            if (b == null) {
                b = new SimpleDateFormat(str, mVar.o);
                b.setTimeZone(mVar.n);
            }
            mVar.b.w(b.format((Date) obj));
            return;
        }
        if (this.f1515f == null) {
            Class<?> cls = obj == null ? this.a.f1474g : obj.getClass();
            this.f1515f = new a(mVar.a.a(cls), cls);
        }
        a aVar = this.f1515f;
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            if (cls2 == aVar.b) {
                t tVar = aVar.a;
                com.alibaba.fastjson.h.a aVar2 = this.a;
                tVar.b(mVar, obj, aVar2.a, aVar2.h);
                return;
            } else {
                t a2 = mVar.a.a(cls2);
                com.alibaba.fastjson.h.a aVar3 = this.a;
                a2.b(mVar, obj, aVar3.a, aVar3.h);
                return;
            }
        }
        if ((this.f1512c & SerializerFeature.WriteNullNumberAsZero.mask) != 0 && Number.class.isAssignableFrom(aVar.b)) {
            mVar.b.write(48);
            return;
        }
        int i = this.f1512c;
        if ((SerializerFeature.WriteNullBooleanAsFalse.mask & i) != 0 && Boolean.class == aVar.b) {
            mVar.b.write("false");
        } else if ((i & SerializerFeature.WriteNullListAsEmpty.mask) == 0 || !Collection.class.isAssignableFrom(aVar.b)) {
            aVar.a.b(mVar, null, this.a.a, aVar.b);
        } else {
            mVar.b.write("[]");
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(j jVar) {
        return this.a.compareTo(jVar.a);
    }
}
