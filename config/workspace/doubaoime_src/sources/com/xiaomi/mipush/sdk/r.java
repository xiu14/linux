package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bj;
import com.xiaomi.push.hu;
import com.xiaomi.push.ij;
import com.xiaomi.push.ik;
import com.xiaomi.push.il;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.iv;
import com.xiaomi.push.iw;
import com.xiaomi.push.ix;
import com.xiaomi.push.iz;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.je;
import com.xiaomi.push.jf;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: com.xiaomi.mipush.sdk.r$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            hu.values();
            int[] iArr = new int[37];
            a = iArr;
            try {
                hu huVar = hu.Registration;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                hu huVar2 = hu.UnRegistration;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                hu huVar3 = hu.Subscription;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                hu huVar4 = hu.UnSubscription;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = a;
                hu huVar5 = hu.SendMessage;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = a;
                hu huVar6 = hu.AckMessage;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = a;
                hu huVar7 = hu.SetConfig;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = a;
                hu huVar8 = hu.ReportFeedback;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = a;
                hu huVar9 = hu.Notification;
                iArr9[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = a;
                hu huVar10 = hu.Command;
                iArr10[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    protected static <T extends jf<T, ?>> iq a(Context context, T t, hu huVar) {
        return a(context, t, huVar, !huVar.equals(hu.Registration), context.getPackageName(), b.m41a(context).m42a());
    }

    protected static <T extends jf<T, ?>> iq b(Context context, T t, hu huVar, boolean z, String str, String str2) {
        return a(context, t, huVar, z, str, str2, false);
    }

    protected static <T extends jf<T, ?>> iq a(Context context, T t, hu huVar, boolean z, String str, String str2) {
        return a(context, t, huVar, z, str, str2, true);
    }

    protected static <T extends jf<T, ?>> iq a(Context context, T t, hu huVar, boolean z, String str, String str2, boolean z2) {
        byte[] a = je.a(t);
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        iq iqVar = new iq();
        if (z) {
            String d2 = b.m41a(context).d();
            if (TextUtils.isEmpty(d2)) {
                com.xiaomi.channel.commonutils.logger.c.m15a("regSecret is empty, return null");
                return null;
            }
            try {
                a = com.xiaomi.push.i.b(bj.m131a(d2), a);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.d("encryption error. ");
            }
        }
        ij ijVar = new ij();
        ijVar.f659a = 5L;
        ijVar.f660a = "fakeid";
        iqVar.a(ijVar);
        iqVar.a(ByteBuffer.wrap(a));
        iqVar.a(huVar);
        iqVar.b(z2);
        iqVar.b(str);
        iqVar.a(z);
        iqVar.a(str2);
        return iqVar;
    }

    public static jf a(Context context, iq iqVar) {
        return a(context, iqVar, b.m41a(context).d());
    }

    public static jf a(Context context, iq iqVar, String str) {
        byte[] m564a;
        if (iqVar.m566b()) {
            byte[] a = f.a(context, iqVar, d.ASSEMBLE_PUSH_FCM);
            if (a == null) {
                a = bj.m131a(str);
            }
            try {
                m564a = com.xiaomi.push.i.a(a, iqVar.m564a());
            } catch (Exception e2) {
                throw new l("the aes decrypt failed.", e2);
            }
        } else {
            m564a = iqVar.m564a();
        }
        jf a2 = a(iqVar.a(), iqVar.f739b);
        if (a2 != null) {
            je.a(a2, m564a);
        }
        return a2;
    }

    private static jf a(hu huVar, boolean z) {
        switch (AnonymousClass1.a[huVar.ordinal()]) {
            case 1:
                return new iv();
            case 2:
                return new jb();
            case 3:
                return new iz();
            case 4:
                return new jd();
            case 5:
                return new ix();
            case 6:
                return new ik();
            case 7:
                return new ip();
            case 8:
                return new iw();
            case 9:
                if (z) {
                    return new it();
                }
                il ilVar = new il();
                ilVar.a(true);
                return ilVar;
            case 10:
                return new ip();
            default:
                return null;
        }
    }
}
