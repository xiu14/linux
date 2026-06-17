package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class di {

    /* renamed from: com.xiaomi.push.di$1, reason: invalid class name */
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
                hu huVar9 = hu.MultiConnectionBroadcast;
                iArr9[10] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = a;
                hu huVar10 = hu.MultiConnectionResult;
                iArr10[11] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = a;
                hu huVar11 = hu.Notification;
                iArr11[8] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = a;
                hu huVar12 = hu.Command;
                iArr12[9] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static int a(jf jfVar, hu huVar) {
        int a;
        switch (AnonymousClass1.a[huVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return en.a(huVar.a());
            case 11:
                a = en.a(huVar.a());
                if (jfVar != null) {
                    try {
                        if (jfVar instanceof il) {
                            String str = ((il) jfVar).f696d;
                            if (!TextUtils.isEmpty(str) && en.a(en.m351a(str)) != -1) {
                                a = en.a(en.m351a(str));
                                break;
                            }
                        } else if (jfVar instanceof it) {
                            String str2 = ((it) jfVar).f755d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (en.a(en.m351a(str2)) != -1) {
                                    a = en.a(en.m351a(str2));
                                }
                                if (ie.UploadTinyData.equals(en.m351a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        com.xiaomi.channel.commonutils.logger.c.d("PERF_ERROR : parse Notification type error");
                        return a;
                    }
                }
                break;
            case 12:
                a = en.a(huVar.a());
                if (jfVar != null) {
                    try {
                        if (jfVar instanceof ip) {
                            String b = ((ip) jfVar).b();
                            if (!TextUtils.isEmpty(b) && fs.a(b) != -1) {
                                a = fs.a(b);
                                break;
                            }
                        } else if (jfVar instanceof io) {
                            String a2 = ((io) jfVar).a();
                            if (!TextUtils.isEmpty(a2) && fs.a(a2) != -1) {
                                return fs.a(a2);
                            }
                        }
                    } catch (Exception unused2) {
                        com.xiaomi.channel.commonutils.logger.c.d("PERF_ERROR : parse Command type error");
                        break;
                    }
                }
                break;
            default:
                return -1;
        }
        return a;
    }

    public static int a(Context context, int i) {
        int a = ho.a(context);
        if (-1 == a) {
            return -1;
        }
        return (i * (a == 0 ? 13 : 11)) / 10;
    }

    public static int a(hu huVar) {
        return en.a(huVar.a());
    }

    public static void a(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        iq iqVar = new iq();
        try {
            je.a(iqVar, bArr);
            a(str, context, iqVar, bArr.length);
        } catch (jj unused) {
            com.xiaomi.channel.commonutils.logger.c.m15a("fail to convert bytes to container");
        }
    }

    public static void a(String str, Context context, iq iqVar, int i) {
        hu a;
        if (context == null || iqVar == null || (a = iqVar.a()) == null) {
            return;
        }
        int a2 = a(a);
        if (i <= 0) {
            byte[] a3 = je.a(iqVar);
            i = a3 != null ? a3.length : 0;
        }
        a(str, context, a2, i);
    }

    public static void a(String str, Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int a = a(context, i2);
        if (i != en.a(ie.UploadTinyData)) {
            eo.a(context.getApplicationContext()).a(str, i, 1L, a);
        }
    }

    public static void a(String str, Context context, jf jfVar, hu huVar, int i) {
        a(str, context, a(jfVar, huVar), i);
    }
}
