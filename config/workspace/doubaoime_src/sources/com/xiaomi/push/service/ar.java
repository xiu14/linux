package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ia;
import com.xiaomi.push.ib;
import com.xiaomi.push.id;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ar {

    /* renamed from: com.xiaomi.push.service.ar$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            ib.values();
            int[] iArr = new int[4];
            b = iArr;
            try {
                ib ibVar = ib.INT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = b;
                ib ibVar2 = ib.LONG;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = b;
                ib ibVar3 = ib.STRING;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = b;
                ib ibVar4 = ib.BOOLEAN;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            ia.values();
            int[] iArr5 = new int[2];
            a = iArr5;
            try {
                ia iaVar = ia.MISC_CONFIG;
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = a;
                ia iaVar2 = ia.PLUGIN_CONFIG;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static void a(aq aqVar, is isVar) {
        com.xiaomi.channel.commonutils.logger.c.b("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", aqVar, ", configMessage=", isVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (id idVar : isVar.a()) {
            arrayList.add(new Pair(idVar.m505a(), Integer.valueOf(idVar.a())));
            List<Pair<Integer, Object>> a = a(idVar.f609a, false);
            if (!com.xiaomi.push.ab.a(a)) {
                arrayList2.addAll(a);
            }
        }
        aqVar.a(arrayList, arrayList2);
        aqVar.b();
    }

    public static void a(aq aqVar, ir irVar) {
        com.xiaomi.channel.commonutils.logger.c.b("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", aqVar, ", configMessage=", irVar);
        aqVar.m763a(a(irVar.a(), true));
        aqVar.b();
    }

    public static int a(aq aqVar, ia iaVar) {
        return aqVar.a(iaVar, AnonymousClass1.a[iaVar.ordinal()] != 1 ? 0 : 1);
    }

    private static List<Pair<Integer, Object>> a(List<Cif> list, boolean z) {
        Pair pair;
        if (com.xiaomi.push.ab.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Cif cif : list) {
            int a = cif.a();
            ib a2 = ib.a(cif.b());
            if (a2 != null) {
                if (z && cif.f617a) {
                    arrayList.add(new Pair(Integer.valueOf(a), null));
                } else {
                    int i = AnonymousClass1.b[a2.ordinal()];
                    if (i == 1) {
                        pair = new Pair(Integer.valueOf(a), Integer.valueOf(cif.c()));
                    } else if (i == 2) {
                        pair = new Pair(Integer.valueOf(a), Long.valueOf(cif.m509a()));
                    } else if (i != 3) {
                        pair = i != 4 ? null : new Pair(Integer.valueOf(a), Boolean.valueOf(cif.g()));
                    } else {
                        pair = new Pair(Integer.valueOf(a), cif.m510a());
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }
}
