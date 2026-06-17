package com.ss.ugc.effectplatform.util;

import bytekn.foundation.encryption.e;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class d {
    public static final d b = new d();
    private static final kotlin.e a = kotlin.a.c(a.a);

    static final class a extends m implements kotlin.s.b.a<byte[]> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public byte[] invoke() {
            d dVar = d.b;
            d.a.c.b bVar = d.a.c.b.b;
            bVar.a("EffectPlatformAES", "initialize-->platformVersion=760.0.0.269-alpha.5");
            byte[] a2 = com.ss.ugc.effectplatform.g.a.a("760.0.0.269-alpha.5:android");
            kotlin.s.c.l.g(a2, "$this$md5");
            e.a aVar = bytekn.foundation.encryption.e.k;
            kotlin.s.c.l.g(a2, "$this$hash");
            kotlin.s.c.l.g(aVar, "algo");
            String substring = bytekn.foundation.encryption.a.a(aVar.a(a2)).substring(8, 24);
            kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bVar.a("EffectPlatformAES", "md5: 760.0.0.269-alpha.5:android -> " + substring);
            return com.ss.ugc.effectplatform.g.a.a(substring);
        }
    }

    private d() {
    }
}
