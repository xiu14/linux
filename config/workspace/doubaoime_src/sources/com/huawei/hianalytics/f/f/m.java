package com.huawei.hianalytics.f.f;

import com.huawei.hianalytics.f.d.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: com.huawei.hianalytics.f.f.m$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            com.huawei.hianalytics.c.b.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                com.huawei.hianalytics.c.b bVar = com.huawei.hianalytics.c.b.SN;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                com.huawei.hianalytics.c.b bVar2 = com.huawei.hianalytics.c.b.IMEI;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                com.huawei.hianalytics.c.b bVar3 = com.huawei.hianalytics.c.b.UDID;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements a.InterfaceC0346a {
        private com.huawei.hianalytics.f.b.h a;

        public a(com.huawei.hianalytics.f.b.h hVar) {
            this.a = hVar;
        }

        @Override // com.huawei.hianalytics.f.d.a.InterfaceC0346a
        public void a(long j, byte[] bArr) {
            this.a.g(String.valueOf(j));
            this.a.f(com.huawei.hianalytics.f.g.e.a(bArr));
        }
    }

    static List<com.huawei.hianalytics.f.b.d> a(com.huawei.hianalytics.f.b.c[] cVarArr) {
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (com.huawei.hianalytics.f.b.c cVar : cVarArr) {
            arrayList.add(new com.huawei.hianalytics.f.b.f(cVar));
        }
        return arrayList;
    }
}
