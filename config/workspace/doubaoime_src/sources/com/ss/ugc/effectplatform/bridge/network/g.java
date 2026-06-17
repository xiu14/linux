package com.ss.ugc.effectplatform.bridge.network;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class g extends m implements kotlin.s.b.a<String> {
    final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar) {
        super(0);
        this.a = hVar;
    }

    @Override // kotlin.s.b.a
    public String invoke() {
        Set<String> keySet;
        Map<String, String> e2;
        Map<String, String> e3 = this.a.e();
        if (e3 == null || (keySet = e3.keySet()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (str == null) {
                throw new l("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            kotlin.s.c.l.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (kotlin.s.c.l.a(lowerCase, "x-tt-logid")) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        Map<String, String> e4 = this.a.e();
        String str2 = e4 != null ? e4.get(arrayList.get(0)) : null;
        if (str2 != null && !kotlin.text.a.s(str2)) {
            z = false;
        }
        if (z || (e2 = this.a.e()) == null) {
            return null;
        }
        return e2.get(arrayList.get(0));
    }
}
