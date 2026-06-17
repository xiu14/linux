package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hu;
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

/* loaded from: classes2.dex */
public class bo {

    /* renamed from: com.xiaomi.push.service.bo$1, reason: invalid class name */
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

    public static jf a(Context context, iq iqVar) {
        if (iqVar.m566b()) {
            return null;
        }
        byte[] m564a = iqVar.m564a();
        jf a = a(iqVar.a(), iqVar.f739b);
        if (a != null) {
            je.a(a, m564a);
        }
        return a;
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
