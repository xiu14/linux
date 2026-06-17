package com.xiaomi.mipush.sdk;

import com.xiaomi.push.hz;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class g {
    private static HashMap<d, a> a = new HashMap<>();

    /* renamed from: com.xiaomi.mipush.sdk.g$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            d.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                d dVar = d.ASSEMBLE_PUSH_HUAWEI;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                d dVar2 = d.ASSEMBLE_PUSH_FCM;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                d dVar3 = d.ASSEMBLE_PUSH_COS;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                d dVar4 = d.ASSEMBLE_PUSH_FTOS;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    static {
        a(d.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(d.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(d.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(d.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    private static void a(d dVar, a aVar) {
        if (aVar != null) {
            a.put(dVar, aVar);
        }
    }

    public static a a(d dVar) {
        return a.get(dVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static hz m68a(d dVar) {
        return hz.AggregatePushSwitch;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static v m67a(d dVar) {
        int i = AnonymousClass1.a[dVar.ordinal()];
        if (i == 1) {
            return v.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return v.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return v.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return v.UPLOAD_FTOS_TOKEN;
    }
}
