package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.k;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.m;
import com.alibaba.fastjson.serializer.x;
import com.alibaba.fastjson.serializer.y;
import java.io.IOException;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class a implements f, c {
    public static TimeZone a = TimeZone.getDefault();
    public static Locale b = Locale.getDefault();

    /* renamed from: c, reason: collision with root package name */
    public static int f1464c = ((Feature.UseBigDecimal.mask | 0) | Feature.SortFeidFastMatch.mask) | Feature.IgnoreNotMatch.mask;

    /* renamed from: d, reason: collision with root package name */
    public static String f1465d = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: e, reason: collision with root package name */
    public static int f1466e = (((SerializerFeature.QuoteFieldNames.mask | 0) | SerializerFeature.SkipTransientField.mask) | SerializerFeature.WriteEnumUsingToString.mask) | SerializerFeature.SortField.mask;

    public static final <T> T c(String str, Class<T> cls) {
        com.alibaba.fastjson.parser.b bVar = new com.alibaba.fastjson.parser.b(str, k.f1505c, f1464c);
        T t = (T) bVar.A(cls, null);
        bVar.r();
        bVar.close();
        return t;
    }

    public static final String d(Object obj) {
        x xVar = x.b;
        y yVar = new y(null, f1466e, new SerializerFeature[0]);
        try {
            new m(yVar, xVar).f(obj);
            return yVar.toString();
        } finally {
            yVar.close();
        }
    }

    @Override // com.alibaba.fastjson.f
    public void a(Appendable appendable) {
        y yVar = new y(null, f1466e, SerializerFeature.EMPTY);
        try {
            try {
                new m(yVar, x.b).f(this);
                ((y) appendable).a(yVar.toString());
            } catch (IOException e2) {
                throw new d(e2.getMessage(), e2);
            }
        } finally {
            yVar.close();
        }
    }

    @Override // com.alibaba.fastjson.c
    public String b() {
        y yVar = new y(null, f1466e, SerializerFeature.EMPTY);
        try {
            new m(yVar, x.b).f(this);
            return yVar.toString();
        } finally {
            yVar.close();
        }
    }

    public String toString() {
        return b();
    }
}
