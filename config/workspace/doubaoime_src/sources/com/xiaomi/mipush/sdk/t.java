package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.bm;
import com.xiaomi.push.ca;
import com.xiaomi.push.di;
import com.xiaomi.push.en;
import com.xiaomi.push.eo;
import com.xiaomi.push.fs;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import com.xiaomi.push.ik;
import com.xiaomi.push.il;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.it;
import com.xiaomi.push.iv;
import com.xiaomi.push.ix;
import com.xiaomi.push.iz;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.je;
import com.xiaomi.push.jf;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.aa;
import com.xiaomi.push.service.ac;
import com.xiaomi.push.service.ao;
import com.xiaomi.push.service.aq;
import com.xiaomi.push.service.ar;
import com.xiaomi.push.service.ay;
import com.xiaomi.push.service.bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class t {
    private static t a;

    /* renamed from: a, reason: collision with other field name */
    private static Object f70a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static Queue<String> f71a;

    /* renamed from: a, reason: collision with other field name */
    private Context f72a;

    /* renamed from: com.xiaomi.mipush.sdk.t$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            hu.values();
            int[] iArr = new int[37];
            a = iArr;
            try {
                hu huVar = hu.SendMessage;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                hu huVar2 = hu.Registration;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                hu huVar3 = hu.UnRegistration;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                hu huVar4 = hu.Subscription;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = a;
                hu huVar5 = hu.UnSubscription;
                iArr5[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = a;
                hu huVar6 = hu.Command;
                iArr6[9] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = a;
                hu huVar7 = hu.Notification;
                iArr7[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private t(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f72a = applicationContext;
        if (applicationContext == null) {
            this.f72a = context;
        }
    }

    public static t a(Context context) {
        if (a == null) {
            a = new t(context);
        }
        return a;
    }

    private void b(il ilVar) {
        StringBuilder M = e.a.a.a.a.M("ASSEMBLE_PUSH : ");
        M.append(ilVar.toString());
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        String a2 = ilVar.a();
        Map<String, String> m539a = ilVar.m539a();
        if (m539a != null) {
            String str = m539a.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder M2 = e.a.a.a.a.M("brand:");
            M2.append(q.FCM.name());
            if (str.contains(M2.toString())) {
                com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : receive fcm token sync ack");
                Context context = this.f72a;
                d dVar = d.ASSEMBLE_PUSH_FCM;
                f.b(context, dVar, str);
                a(a2, ilVar.f689a, dVar);
                return;
            }
            StringBuilder M3 = e.a.a.a.a.M("brand:");
            q qVar = q.HUAWEI;
            M3.append(qVar.name());
            if (!str.contains(M3.toString())) {
                StringBuilder M4 = e.a.a.a.a.M("channel:");
                M4.append(qVar.name());
                if (!str.contains(M4.toString())) {
                    StringBuilder M5 = e.a.a.a.a.M("brand:");
                    q qVar2 = q.OPPO;
                    M5.append(qVar2.name());
                    if (!str.contains(M5.toString())) {
                        StringBuilder M6 = e.a.a.a.a.M("channel:");
                        M6.append(qVar2.name());
                        if (!str.contains(M6.toString())) {
                            StringBuilder M7 = e.a.a.a.a.M("brand:");
                            q qVar3 = q.VIVO;
                            M7.append(qVar3.name());
                            if (!str.contains(M7.toString())) {
                                StringBuilder M8 = e.a.a.a.a.M("channel:");
                                M8.append(qVar3.name());
                                if (!str.contains(M8.toString())) {
                                    return;
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                            Context context2 = this.f72a;
                            d dVar2 = d.ASSEMBLE_PUSH_FTOS;
                            f.b(context2, dVar2, str);
                            a(a2, ilVar.f689a, dVar2);
                            return;
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : receive COS token sync ack");
                    Context context3 = this.f72a;
                    d dVar3 = d.ASSEMBLE_PUSH_COS;
                    f.b(context3, dVar3, str);
                    a(a2, ilVar.f689a, dVar3);
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : receive hw token sync ack");
            Context context4 = this.f72a;
            d dVar4 = d.ASSEMBLE_PUSH_HUAWEI;
            f.b(context4, dVar4, str);
            a(a2, ilVar.f689a, dVar4);
        }
    }

    public PushMessageHandler.a a(Intent intent) {
        String action = intent.getAction();
        com.xiaomi.channel.commonutils.logger.c.m15a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                com.xiaomi.channel.commonutils.logger.c.d("receiving an empty message, drop");
                eo.a(this.f72a).a(this.f72a.getPackageName(), intent, "12");
                j.a(this.f72a, stringExtra2, intent, 15, booleanExtra, (Throwable) null);
                return null;
            }
            iq iqVar = new iq();
            try {
                je.a(iqVar, byteArrayExtra);
                b m41a = b.m41a(this.f72a);
                ih m558a = iqVar.m558a();
                hu a2 = iqVar.a();
                hu huVar = hu.SendMessage;
                if (a2 == huVar && m558a != null && !m41a.m52e() && !booleanExtra) {
                    m558a.a("mrt", stringExtra);
                    m558a.a("mat", Long.toString(System.currentTimeMillis()));
                    if (!m73a(iqVar)) {
                        b(iqVar);
                    } else {
                        com.xiaomi.channel.commonutils.logger.c.b("this is a mina's message, ack later");
                        m558a.a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(m558a.m522a()));
                        m558a.a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) je.a(this.f72a, iqVar)));
                    }
                }
                if (iqVar.a() == huVar && !iqVar.m566b()) {
                    if (ac.m725a(iqVar)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = iqVar.b();
                        objArr[1] = m558a != null ? m558a.m524a() : "";
                        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                        eo.a(this.f72a).a(this.f72a.getPackageName(), intent, String.format("13: %1$s", iqVar.b()));
                    } else {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = iqVar.b();
                        objArr2[1] = m558a != null ? m558a.m524a() : "";
                        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                        eo.a(this.f72a).a(this.f72a.getPackageName(), intent, String.format("14: %1$s", iqVar.b()));
                    }
                    j.a(this.f72a, iqVar, intent, booleanExtra);
                    return null;
                }
                if (iqVar.a() == huVar && iqVar.m566b() && ac.m725a(iqVar) && (!booleanExtra || m558a == null || m558a.m525a() == null || !m558a.m525a().containsKey("notify_effect"))) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = iqVar.b();
                    objArr3[1] = m558a != null ? m558a.m524a() : "";
                    com.xiaomi.channel.commonutils.logger.c.m15a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                    eo.a(this.f72a).a(this.f72a.getPackageName(), intent, String.format("25: %1$s", iqVar.b()));
                    j.b(this.f72a, iqVar, intent, booleanExtra);
                    return null;
                }
                if (!m41a.m50c() && iqVar.f731a != hu.Registration) {
                    if (ac.m725a(iqVar)) {
                        return a(iqVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    j.f(this.f72a, iqVar, intent, booleanExtra);
                    boolean m51d = m41a.m51d();
                    com.xiaomi.channel.commonutils.logger.c.d("receive message without registration. need re-register!registered?" + m51d);
                    eo.a(this.f72a).a(this.f72a.getPackageName(), intent, "15");
                    if (m51d) {
                        a();
                    }
                } else if (m41a.m50c() && m41a.m53f()) {
                    if (iqVar.f731a == hu.UnRegistration) {
                        if (iqVar.m566b()) {
                            m41a.m43a();
                            MiPushClient.clearExtras(this.f72a);
                            PushMessageHandler.a();
                        } else {
                            com.xiaomi.channel.commonutils.logger.c.d("receiving an un-encrypt unregistration message");
                        }
                    } else {
                        j.f(this.f72a, iqVar, intent, booleanExtra);
                        MiPushClient.unregisterPush(this.f72a);
                    }
                } else {
                    return a(iqVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                }
            } catch (jj e2) {
                j.a(this.f72a, stringExtra2, intent, 16, booleanExtra, e2);
                eo.a(this.f72a).a(this.f72a.getPackageName(), intent, "16");
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            } catch (Exception e3) {
                j.a(this.f72a, stringExtra2, intent, 17, booleanExtra, e3);
                eo.a(this.f72a).a(this.f72a.getPackageName(), intent, "17");
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                iq iqVar2 = new iq();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        je.a(iqVar2, byteArrayExtra2);
                    }
                } catch (jj unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(iqVar2.a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                com.xiaomi.channel.commonutils.logger.c.d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    com.xiaomi.channel.commonutils.logger.c.d("message arrived: receiving an empty message, drop");
                    return null;
                }
                iq iqVar3 = new iq();
                try {
                    je.a(iqVar3, byteArrayExtra3);
                    b m41a2 = b.m41a(this.f72a);
                    if (ac.m725a(iqVar3)) {
                        com.xiaomi.channel.commonutils.logger.c.d("message arrived: receive ignore reg message, ignore!");
                    } else if (!m41a2.m50c()) {
                        com.xiaomi.channel.commonutils.logger.c.d("message arrived: receive message without registration. need unregister or re-register!");
                    } else if (m41a2.m50c() && m41a2.m53f()) {
                        com.xiaomi.channel.commonutils.logger.c.d("message arrived: app info is invalidated");
                    } else {
                        return a(iqVar3, byteArrayExtra3);
                    }
                } catch (Exception e4) {
                    com.xiaomi.channel.commonutils.logger.c.d("fail to deal with arrived message. " + e4);
                }
            }
        }
        return null;
    }

    private void b(iq iqVar) {
        ih m558a = iqVar.m558a();
        if (m558a != null) {
            m558a = bf.a(m558a.m523a());
        }
        ik ikVar = new ik();
        ikVar.b(iqVar.m559a());
        ikVar.a(m558a.m524a());
        ikVar.a(m558a.m522a());
        if (!TextUtils.isEmpty(m558a.m529b())) {
            ikVar.c(m558a.m529b());
        }
        ikVar.a(je.a(this.f72a, iqVar));
        u.a(this.f72a).a((u) ikVar, hu.AckMessage, false, m558a);
    }

    private void b(it itVar) {
        Map<String, String> m574a = itVar.m574a();
        if (m574a == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("detect failed because null");
            return;
        }
        String str = (String) ao.a(m574a, "pkgList", (Object) null);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("detect failed because empty");
            return;
        }
        Map<String, String> m456a = com.xiaomi.push.h.m456a(this.f72a, str);
        if (m456a != null) {
            String str2 = m456a.get("alive");
            String str3 = m456a.get("notAlive");
            if (!TextUtils.isEmpty(str2)) {
                it itVar2 = new it();
                itVar2.a(itVar.m573a());
                itVar2.b(itVar.b());
                itVar2.d(itVar.d());
                itVar2.c(ie.DetectAppAliveResult.f611a);
                HashMap hashMap = new HashMap();
                itVar2.f750a = hashMap;
                hashMap.put("alive", str2);
                if (Boolean.parseBoolean((String) ao.a(m574a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
                    itVar2.f750a.put("notAlive", str3);
                }
                u.a(this.f72a).a((u) itVar2, hu.Notification, false, (ih) null);
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.b("detect failed because no alive process");
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("detect failed because get status illegal");
    }

    private PushMessageHandler.a a(iq iqVar, byte[] bArr) {
        String str = null;
        try {
            jf a2 = r.a(this.f72a, iqVar);
            if (a2 == null) {
                com.xiaomi.channel.commonutils.logger.c.d("message arrived: receiving an un-recognized message. " + iqVar.f731a);
                return null;
            }
            hu a3 = iqVar.a();
            com.xiaomi.channel.commonutils.logger.c.m15a("message arrived: processing an arrived message, action=" + a3);
            if (AnonymousClass1.a[a3.ordinal()] != 1) {
                return null;
            }
            if (!iqVar.m566b()) {
                com.xiaomi.channel.commonutils.logger.c.d("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            ix ixVar = (ix) a2;
            ig a4 = ixVar.a();
            if (a4 == null) {
                com.xiaomi.channel.commonutils.logger.c.d("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            ih ihVar = iqVar.f732a;
            if (ihVar != null && ihVar.m525a() != null) {
                str = iqVar.f732a.f646a.get("jobkey");
            }
            MiPushMessage generateMessage = PushMessageHelper.generateMessage(ixVar, iqVar.m558a(), false);
            generateMessage.setArrivedMessage(true);
            StringBuilder M = e.a.a.a.a.M("message arrived: receive a message, msgid=");
            M.append(a4.m516a());
            M.append(", jobkey=");
            M.append(str);
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            return generateMessage;
        } catch (l e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            com.xiaomi.channel.commonutils.logger.c.d("message arrived: receive a message but decrypt failed. report when click.");
            return null;
        } catch (jj e3) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
            com.xiaomi.channel.commonutils.logger.c.d("message arrived: receive a message which action string is not valid. is the reg expired?");
            return null;
        }
    }

    private PushMessageHandler.a a(iq iqVar, boolean z, byte[] bArr, String str, int i, Intent intent) {
        String str2;
        String str3;
        MiPushMessage miPushMessage;
        boolean z2;
        boolean z3;
        ih ihVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        try {
            jf a2 = r.a(this.f72a, iqVar);
            if (a2 == null) {
                com.xiaomi.channel.commonutils.logger.c.d("receiving an un-recognized message. " + iqVar.f731a);
                eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "18");
                j.c(this.f72a, iqVar, intent, z);
                return null;
            }
            hu a3 = iqVar.a();
            com.xiaomi.channel.commonutils.logger.c.m17a("processing a message, action=", a3, ", hasNotified=", Boolean.valueOf(z));
            switch (AnonymousClass1.a[a3.ordinal()]) {
                case 1:
                    if (!iqVar.m566b()) {
                        com.xiaomi.channel.commonutils.logger.c.d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (b.m41a(this.f72a).m52e() && !z) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("receive a message in pause state. drop it");
                        eo.a(this.f72a).a(this.f72a.getPackageName(), en.m352a(i), str, "12");
                        return null;
                    }
                    ix ixVar = (ix) a2;
                    ig a4 = ixVar.a();
                    if (a4 == null) {
                        com.xiaomi.channel.commonutils.logger.c.d("receive an empty message without push content, drop it");
                        eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "22");
                        j.d(this.f72a, iqVar, intent, z);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z) {
                        if (ac.m725a(iqVar)) {
                            MiPushClient.reportIgnoreRegMessageClicked(this.f72a, a4.m516a(), iqVar.m558a(), iqVar.f738b, a4.b());
                        } else {
                            if (iqVar.m558a() != null) {
                                ihVar = new ih(iqVar.m558a());
                            } else {
                                ihVar = new ih();
                            }
                            if (ihVar.m525a() == null) {
                                ihVar.a(new HashMap());
                            }
                            ihVar.m525a().put("notification_click_button", String.valueOf(intExtra));
                            MiPushClient.reportMessageClicked(this.f72a, a4.m516a(), ihVar, a4.b());
                        }
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(ixVar.d()) && MiPushClient.aliasSetTime(this.f72a, ixVar.d()) < 0) {
                            MiPushClient.addAlias(this.f72a, ixVar.d());
                        } else if (!TextUtils.isEmpty(ixVar.c()) && MiPushClient.topicSubscribedTime(this.f72a, ixVar.c()) < 0) {
                            MiPushClient.addTopic(this.f72a, ixVar.c());
                        }
                    }
                    ih ihVar2 = iqVar.f732a;
                    if (ihVar2 == null || ihVar2.m525a() == null) {
                        str2 = null;
                        str3 = null;
                    } else {
                        str2 = iqVar.f732a.f646a.get("jobkey");
                        str3 = str2;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = a4.m516a();
                    }
                    if (!z && m72a(this.f72a, str2)) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("drop a duplicate message, key=" + str2);
                        eo.a(this.f72a).c(this.f72a.getPackageName(), en.m352a(i), str, e.a.a.a.a.s("2:", str2));
                        miPushMessage = null;
                    } else {
                        MiPushMessage generateMessage = PushMessageHelper.generateMessage(ixVar, iqVar.m558a(), z);
                        if (generateMessage.getPassThrough() == 0 && !z && ac.m726a(generateMessage.getExtra())) {
                            ac.m718a(this.f72a, iqVar, bArr);
                            return null;
                        }
                        String a5 = ac.a(generateMessage.getExtra(), intExtra);
                        com.xiaomi.channel.commonutils.logger.c.m17a("receive a message, msgid=", a4.m516a(), ", jobkey=", str2, ", btn=", Integer.valueOf(intExtra), ", typeId=", a5, ", hasNotified=", Boolean.valueOf(z));
                        if (z && generateMessage.getExtra() != null && !TextUtils.isEmpty(a5)) {
                            Map<String, String> extra = generateMessage.getExtra();
                            if (intExtra != 0 && iqVar.m558a() != null) {
                                u.a(this.f72a).a(iqVar.m558a().c(), intExtra);
                            }
                            if (ac.m725a(iqVar)) {
                                Intent a6 = a(this.f72a, iqVar.f738b, extra, intExtra);
                                if (a6 == null) {
                                    j.e(this.f72a, iqVar, intent, true);
                                    com.xiaomi.channel.commonutils.logger.c.m15a("Getting Intent fail from ignore reg message. ");
                                    eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "23");
                                    return null;
                                }
                                a6.putExtra("eventMessageType", i);
                                a6.putExtra("messageId", str);
                                a6.putExtra("jobkey", str3);
                                Bundle extras = a6.getExtras();
                                if (a(extras, "pushTargetComponent")) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                    a6.putExtra("pushTargetComponent", true);
                                }
                                if (!a(extras, "mipush_notified")) {
                                    a6.putExtra("mipush_notified", z3);
                                }
                                String c2 = a4.c();
                                if (!TextUtils.isEmpty(c2)) {
                                    a6.putExtra(WsConstants.KEY_PAYLOAD, c2);
                                }
                                aa.a(this.f72a, a6, iqVar, intent, str, i, a5);
                            } else {
                                Context context = this.f72a;
                                Intent a7 = a(context, context.getPackageName(), extra, intExtra);
                                if (a7 != null) {
                                    if (!a5.equals(ay.f9326c)) {
                                        a7.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                        a7.putExtra("eventMessageType", i);
                                        a7.putExtra("messageId", str);
                                        a7.putExtra("jobkey", str3);
                                        Bundle extras2 = a7.getExtras();
                                        if (a(extras2, "pushTargetComponent")) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                            a7.putExtra("pushTargetComponent", true);
                                        }
                                        if (!a(extras2, "mipush_notified")) {
                                            a7.putExtra("mipush_notified", z2);
                                        }
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    this.f72a.startActivity(a7);
                                    j.a(this.f72a, iqVar, intent, currentTimeMillis);
                                    com.xiaomi.channel.commonutils.logger.c.m16a("PushMessageProcessor", "start activity succ");
                                    eo.a(this.f72a).a(this.f72a.getPackageName(), en.m352a(i), str, 1006, a5);
                                    if (a5.equals(ay.f9326c)) {
                                        eo.a(this.f72a).a(this.f72a.getPackageName(), en.m352a(i), str, "13");
                                    }
                                } else {
                                    j.e(this.f72a, iqVar, intent, true);
                                    StringBuilder M = e.a.a.a.a.M("missing target intent for message: ");
                                    M.append(a4.m516a());
                                    M.append(", typeId=");
                                    M.append(a5);
                                    com.xiaomi.channel.commonutils.logger.c.c("PushMessageProcessor", M.toString());
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.c.m16a("PushMessageProcessor", "pre-def msg process done.");
                            return null;
                        }
                        miPushMessage = generateMessage;
                    }
                    if (iqVar.m558a() == null && !z) {
                        a(ixVar, iqVar);
                    }
                    return miPushMessage;
                case 2:
                    iv ivVar = (iv) a2;
                    String str4 = b.m41a(this.f72a).f47a;
                    if (!TextUtils.isEmpty(str4) && TextUtils.equals(str4, ivVar.m588a())) {
                        long m82a = u.a(this.f72a).m82a();
                        if (m82a > 0 && SystemClock.elapsedRealtime() - m82a > com.heytap.mcssdk.constant.a.h) {
                            com.xiaomi.channel.commonutils.logger.c.m15a("The received registration result has expired.");
                            eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "26");
                            return null;
                        }
                        b.m41a(this.f72a).f47a = null;
                        if (ivVar.f796a == 0) {
                            b.m41a(this.f72a).b(ivVar.f808e, ivVar.f809f, ivVar.f815l);
                            FCMPushHelper.persistIfXmsfSupDecrypt(this.f72a);
                            eo.a(this.f72a).a(this.f72a.getPackageName(), en.m352a(i), str, AuthCode.StatusCode.PERMISSION_EXPIRED, PushClient.DEFAULT_REQUEST_ID);
                        } else {
                            eo.a(this.f72a).a(this.f72a.getPackageName(), en.m352a(i), str, AuthCode.StatusCode.PERMISSION_EXPIRED, ExifInterface.GPS_MEASUREMENT_2D);
                        }
                        if (TextUtils.isEmpty(ivVar.f808e)) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            arrayList.add(ivVar.f808e);
                        }
                        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fs.COMMAND_REGISTER.f436a, arrayList, ivVar.f796a, ivVar.f807d, null, ivVar.m589a());
                        u.a(this.f72a).m91d();
                        return generateCommandMessage;
                    }
                    com.xiaomi.channel.commonutils.logger.c.m15a("bad Registration result:");
                    eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "21");
                    return null;
                case 3:
                    if (!iqVar.m566b()) {
                        com.xiaomi.channel.commonutils.logger.c.d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((jb) a2).f876a == 0) {
                        b.m41a(this.f72a).m43a();
                        MiPushClient.clearExtras(this.f72a);
                    }
                    PushMessageHandler.a();
                    return null;
                case 4:
                    iz izVar = (iz) a2;
                    if (izVar.f849a == 0) {
                        MiPushClient.addTopic(this.f72a, izVar.b());
                    }
                    if (TextUtils.isEmpty(izVar.b())) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        arrayList2.add(izVar.b());
                    }
                    ArrayList arrayList4 = arrayList2;
                    StringBuilder M2 = e.a.a.a.a.M("resp-cmd:");
                    fs fsVar = fs.COMMAND_SUBSCRIBE_TOPIC;
                    M2.append(fsVar);
                    M2.append(", ");
                    M2.append(izVar.a());
                    com.xiaomi.channel.commonutils.logger.c.e(M2.toString());
                    return PushMessageHelper.generateCommandMessage(fsVar.f436a, arrayList4, izVar.f849a, izVar.f855d, izVar.c(), null);
                case 5:
                    jd jdVar = (jd) a2;
                    if (jdVar.f896a == 0) {
                        MiPushClient.removeTopic(this.f72a, jdVar.b());
                    }
                    if (TextUtils.isEmpty(jdVar.b())) {
                        arrayList3 = null;
                    } else {
                        arrayList3 = new ArrayList();
                        arrayList3.add(jdVar.b());
                    }
                    ArrayList arrayList5 = arrayList3;
                    StringBuilder M3 = e.a.a.a.a.M("resp-cmd:");
                    fs fsVar2 = fs.COMMAND_UNSUBSCRIBE_TOPIC;
                    M3.append(fsVar2);
                    M3.append(", ");
                    M3.append(jdVar.a());
                    com.xiaomi.channel.commonutils.logger.c.e(M3.toString());
                    return PushMessageHelper.generateCommandMessage(fsVar2.f436a, arrayList5, jdVar.f896a, jdVar.f902d, jdVar.c(), null);
                case 6:
                    di.a(this.f72a.getPackageName(), this.f72a, a2, hu.Command, bArr.length);
                    ip ipVar = (ip) a2;
                    String b = ipVar.b();
                    List<String> m552a = ipVar.m552a();
                    if (ipVar.f719a == 0) {
                        if (TextUtils.equals(b, fs.COMMAND_SET_ACCEPT_TIME.f436a) && m552a != null && m552a.size() > 1) {
                            MiPushClient.addAcceptTime(this.f72a, m552a.get(0), m552a.get(1));
                            if ("00:00".equals(m552a.get(0)) && "00:00".equals(m552a.get(1))) {
                                b.m41a(this.f72a).a(true);
                            } else {
                                b.m41a(this.f72a).a(false);
                            }
                            m552a = a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), m552a);
                        } else if (TextUtils.equals(b, fs.COMMAND_SET_ALIAS.f436a) && m552a != null && m552a.size() > 0) {
                            MiPushClient.addAlias(this.f72a, m552a.get(0));
                        } else if (TextUtils.equals(b, fs.COMMAND_UNSET_ALIAS.f436a) && m552a != null && m552a.size() > 0) {
                            MiPushClient.removeAlias(this.f72a, m552a.get(0));
                        } else if (TextUtils.equals(b, fs.COMMAND_SET_ACCOUNT.f436a) && m552a != null && m552a.size() > 0) {
                            MiPushClient.addAccount(this.f72a, m552a.get(0));
                        } else if (TextUtils.equals(b, fs.COMMAND_UNSET_ACCOUNT.f436a) && m552a != null && m552a.size() > 0) {
                            MiPushClient.removeAccount(this.f72a, m552a.get(0));
                        } else {
                            if (TextUtils.equals(b, fs.COMMAND_CHK_VDEVID.f436a)) {
                                return null;
                            }
                            if (TextUtils.equals(b, fs.COMMAND_SUBSCRIBE_LBS_PUSH.f436a)) {
                                MiPushClient.saveLBS(this.f72a);
                            } else if (TextUtils.equals(b, fs.COMMAND_UNSUBSCRIBE_LBS_PUSH.f436a)) {
                                MiPushClient.removeLBS(this.f72a);
                            }
                        }
                    }
                    List<String> list = m552a;
                    StringBuilder U = e.a.a.a.a.U("resp-cmd:", b, ", ");
                    U.append(ipVar.a());
                    com.xiaomi.channel.commonutils.logger.c.e(U.toString());
                    return PushMessageHelper.generateCommandMessage(b, list, ipVar.f719a, ipVar.f727d, ipVar.c(), null);
                case 7:
                    di.a(this.f72a.getPackageName(), this.f72a, a2, hu.Notification, bArr.length);
                    if (a2 instanceof il) {
                        il ilVar = (il) a2;
                        String a8 = ilVar.a();
                        StringBuilder M4 = e.a.a.a.a.M("resp-type:");
                        M4.append(ilVar.b());
                        M4.append(", code:");
                        M4.append(ilVar.f689a);
                        M4.append(", ");
                        M4.append(a8);
                        com.xiaomi.channel.commonutils.logger.c.e(M4.toString());
                        if (ie.DisablePushMessage.f611a.equalsIgnoreCase(ilVar.f696d)) {
                            if (ilVar.f689a == 0) {
                                synchronized (p.class) {
                                    if (p.a(this.f72a).m71a(a8)) {
                                        p.a(this.f72a).c(a8);
                                        p a9 = p.a(this.f72a);
                                        v vVar = v.DISABLE_PUSH;
                                        if ("syncing".equals(a9.a(vVar))) {
                                            p.a(this.f72a).a(vVar, "synced");
                                            MiPushClient.clearNotification(this.f72a);
                                            MiPushClient.clearLocalNotificationType(this.f72a);
                                            PushMessageHandler.a();
                                            u.a(this.f72a).m88b();
                                        }
                                    }
                                }
                                return null;
                            }
                            if ("syncing".equals(p.a(this.f72a).a(v.DISABLE_PUSH))) {
                                synchronized (p.class) {
                                    if (p.a(this.f72a).m71a(a8)) {
                                        if (p.a(this.f72a).a(a8) < 10) {
                                            p.a(this.f72a).b(a8);
                                            u.a(this.f72a).a(true, a8);
                                        } else {
                                            p.a(this.f72a).c(a8);
                                        }
                                    }
                                }
                                return null;
                            }
                            p.a(this.f72a).c(a8);
                            return null;
                        }
                        if (!ie.EnablePushMessage.f611a.equalsIgnoreCase(ilVar.f696d)) {
                            if (ie.ThirdPartyRegUpdate.f611a.equalsIgnoreCase(ilVar.f696d)) {
                                b(ilVar);
                                return null;
                            }
                            if (!ie.UploadTinyData.f611a.equalsIgnoreCase(ilVar.f696d)) {
                                return null;
                            }
                            a(ilVar);
                            return null;
                        }
                        if (ilVar.f689a == 0) {
                            synchronized (p.class) {
                                if (p.a(this.f72a).m71a(a8)) {
                                    p.a(this.f72a).c(a8);
                                    p a10 = p.a(this.f72a);
                                    v vVar2 = v.ENABLE_PUSH;
                                    if ("syncing".equals(a10.a(vVar2))) {
                                        p.a(this.f72a).a(vVar2, "synced");
                                    }
                                }
                            }
                            return null;
                        }
                        if ("syncing".equals(p.a(this.f72a).a(v.ENABLE_PUSH))) {
                            synchronized (p.class) {
                                if (p.a(this.f72a).m71a(a8)) {
                                    if (p.a(this.f72a).a(a8) < 10) {
                                        p.a(this.f72a).b(a8);
                                        u.a(this.f72a).a(false, a8);
                                    } else {
                                        p.a(this.f72a).c(a8);
                                    }
                                }
                            }
                            return null;
                        }
                        p.a(this.f72a).c(a8);
                        return null;
                    }
                    if (!(a2 instanceof it)) {
                        return null;
                    }
                    it itVar = (it) a2;
                    if ("registration id expired".equalsIgnoreCase(itVar.f755d)) {
                        List<String> allAlias = MiPushClient.getAllAlias(this.f72a);
                        List<String> allTopic = MiPushClient.getAllTopic(this.f72a);
                        List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f72a);
                        String acceptTime = MiPushClient.getAcceptTime(this.f72a);
                        StringBuilder M5 = e.a.a.a.a.M("resp-type:");
                        M5.append(itVar.f755d);
                        M5.append(", ");
                        M5.append(itVar.m573a());
                        com.xiaomi.channel.commonutils.logger.c.e(M5.toString());
                        MiPushClient.reInitialize(this.f72a, ii.RegIdExpired);
                        for (String str5 : allAlias) {
                            MiPushClient.removeAlias(this.f72a, str5);
                            MiPushClient.setAlias(this.f72a, str5, null);
                        }
                        for (String str6 : allTopic) {
                            MiPushClient.removeTopic(this.f72a, str6);
                            MiPushClient.subscribe(this.f72a, str6, null);
                        }
                        for (String str7 : allUserAccount) {
                            MiPushClient.removeAccount(this.f72a, str7);
                            MiPushClient.setUserAccount(this.f72a, str7, null);
                        }
                        String[] split = acceptTime.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        if (split.length != 2) {
                            return null;
                        }
                        MiPushClient.removeAcceptTime(this.f72a);
                        MiPushClient.addAcceptTime(this.f72a, split[0], split[1]);
                        return null;
                    }
                    if (ie.ClientInfoUpdateOk.f611a.equalsIgnoreCase(itVar.f755d)) {
                        if (itVar.m574a() == null || !itVar.m574a().containsKey("app_version")) {
                            return null;
                        }
                        b.m41a(this.f72a).m44a(itVar.m574a().get("app_version"));
                        return null;
                    }
                    try {
                        if (ie.NormalClientConfigUpdate.f611a.equalsIgnoreCase(itVar.f755d)) {
                            is isVar = new is();
                            je.a(isVar, itVar.m579a());
                            ar.a(aq.a(this.f72a), isVar);
                        } else if (ie.CustomClientConfigUpdate.f611a.equalsIgnoreCase(itVar.f755d)) {
                            ir irVar = new ir();
                            je.a(irVar, itVar.m579a());
                            ar.a(aq.a(this.f72a), irVar);
                        } else {
                            if (ie.SyncInfoResult.f611a.equalsIgnoreCase(itVar.f755d)) {
                                w.a(this.f72a, itVar);
                                return null;
                            }
                            if (ie.ForceSync.f611a.equalsIgnoreCase(itVar.f755d)) {
                                com.xiaomi.channel.commonutils.logger.c.m15a("receive force sync notification");
                                w.a(this.f72a, false);
                                return null;
                            }
                            if (ie.CancelPushMessage.f611a.equals(itVar.f755d)) {
                                StringBuilder M6 = e.a.a.a.a.M("resp-type:");
                                M6.append(itVar.f755d);
                                M6.append(", ");
                                M6.append(itVar.m573a());
                                com.xiaomi.channel.commonutils.logger.c.e(M6.toString());
                                if (itVar.m574a() != null) {
                                    int i2 = -2;
                                    if (itVar.m574a().containsKey(RemoteMessageConst.Notification.NOTIFY_ID)) {
                                        String str8 = itVar.m574a().get(RemoteMessageConst.Notification.NOTIFY_ID);
                                        if (!TextUtils.isEmpty(str8)) {
                                            try {
                                                i2 = Integer.parseInt(str8);
                                            } catch (NumberFormatException e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    }
                                    if (i2 >= -1) {
                                        MiPushClient.clearNotification(this.f72a, i2);
                                    } else {
                                        MiPushClient.clearNotification(this.f72a, itVar.m574a().containsKey("title") ? itVar.m574a().get("title") : "", itVar.m574a().containsKey(com.heytap.mcssdk.constant.b.i) ? itVar.m574a().get(com.heytap.mcssdk.constant.b.i) : "");
                                    }
                                }
                                a(itVar);
                                return null;
                            }
                            if (ie.HybridRegisterResult.f611a.equals(itVar.f755d)) {
                                try {
                                    iv ivVar2 = new iv();
                                    je.a(ivVar2, itVar.m579a());
                                    MiPushClient4Hybrid.onReceiveRegisterResult(this.f72a, ivVar2);
                                    return null;
                                } catch (jj e3) {
                                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e3);
                                    return null;
                                }
                            }
                            if (ie.HybridUnregisterResult.f611a.equals(itVar.f755d)) {
                                try {
                                    jb jbVar = new jb();
                                    je.a(jbVar, itVar.m579a());
                                    MiPushClient4Hybrid.onReceiveUnregisterResult(this.f72a, jbVar);
                                    return null;
                                } catch (jj e4) {
                                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e4);
                                    return null;
                                }
                            }
                            if (ie.PushLogUpload.f611a.equals(itVar.f755d)) {
                                return null;
                            }
                            if (ie.DetectAppAlive.f611a.equals(itVar.f755d)) {
                                com.xiaomi.channel.commonutils.logger.c.b("receive detect msg");
                                b(itVar);
                                return null;
                            }
                            if (!com.xiaomi.push.service.h.m794a(itVar)) {
                                return null;
                            }
                            com.xiaomi.channel.commonutils.logger.c.b("receive notification handle by cpra");
                            return null;
                        }
                        return null;
                    } catch (jj unused) {
                        return null;
                    }
                default:
                    return null;
            }
        } catch (l e5) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e5);
            a(iqVar);
            eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "19");
            j.c(this.f72a, iqVar, intent, z);
            return null;
        } catch (jj e6) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e6);
            com.xiaomi.channel.commonutils.logger.c.d("receive a message which action string is not valid. is the reg expired?");
            eo.a(this.f72a).b(this.f72a.getPackageName(), en.m352a(i), str, "20");
            j.c(this.f72a, iqVar, intent, z);
            return null;
        }
    }

    private boolean a(Bundle bundle, String str) {
        if (bundle == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return bundle.containsKey(str);
    }

    private void a(String str, long j, d dVar) {
        v m67a = g.m67a(dVar);
        if (m67a == null) {
            return;
        }
        if (j == 0) {
            synchronized (p.class) {
                if (p.a(this.f72a).m71a(str)) {
                    p.a(this.f72a).c(str);
                    if ("syncing".equals(p.a(this.f72a).a(m67a))) {
                        p.a(this.f72a).a(m67a, "synced");
                    }
                }
            }
            return;
        }
        if ("syncing".equals(p.a(this.f72a).a(m67a))) {
            synchronized (p.class) {
                if (p.a(this.f72a).m71a(str)) {
                    if (p.a(this.f72a).a(str) < 10) {
                        p.a(this.f72a).b(str);
                        u.a(this.f72a).a(str, m67a, dVar, "retry");
                    } else {
                        p.a(this.f72a).c(str);
                    }
                }
            }
            return;
        }
        p.a(this.f72a).c(str);
    }

    private void a(il ilVar) {
        String a2 = ilVar.a();
        com.xiaomi.channel.commonutils.logger.c.b("receive ack " + a2);
        Map<String, String> m539a = ilVar.m539a();
        if (m539a != null) {
            String str = m539a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.b("receive ack : messageId = " + a2 + "  realSource = " + str);
            ca.a(this.f72a).a(a2, str, Boolean.valueOf(ilVar.f689a == 0));
        }
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long parseLong = ((((Long.parseLong(list.get(0).split(Constants.COLON_SEPARATOR)[0]) * 60) + Long.parseLong(list.get(0).split(Constants.COLON_SEPARATOR)[1])) - rawOffset) + 1440) % 1440;
        long parseLong2 = ((((Long.parseLong(list.get(1).split(Constants.COLON_SEPARATOR)[0]) * 60) + Long.parseLong(list.get(1).split(Constants.COLON_SEPARATOR)[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong / 60), Long.valueOf(parseLong % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong2 / 60), Long.valueOf(parseLong2 % 60)));
        return arrayList;
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f72a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > 1800000) {
            MiPushClient.reInitialize(this.f72a, ii.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    private void a(iq iqVar) {
        com.xiaomi.channel.commonutils.logger.c.m15a("receive a message but decrypt failed. report now.");
        it itVar = new it(iqVar.m558a().f644a, false);
        itVar.c(ie.DecryptMessageFail.f611a);
        itVar.b(iqVar.m559a());
        itVar.d(iqVar.f738b);
        HashMap hashMap = new HashMap();
        itVar.f750a = hashMap;
        hashMap.put("regid", MiPushClient.getRegId(this.f72a));
        u.a(this.f72a).a((u) itVar, hu.Notification, false, (ih) null);
    }

    private void a(ix ixVar, iq iqVar) {
        ih m558a = iqVar.m558a();
        if (m558a != null) {
            m558a = bf.a(m558a.m523a());
        }
        ik ikVar = new ik();
        ikVar.b(ixVar.b());
        ikVar.a(ixVar.m597a());
        ikVar.a(ixVar.a().a());
        if (!TextUtils.isEmpty(ixVar.c())) {
            ikVar.c(ixVar.c());
        }
        if (!TextUtils.isEmpty(ixVar.d())) {
            ikVar.d(ixVar.d());
        }
        ikVar.a(je.a(this.f72a, iqVar));
        u.a(this.f72a).a((u) ikVar, hu.AckMessage, m558a);
    }

    private void a(it itVar) {
        il ilVar = new il();
        ilVar.c(ie.CancelPushMessageACK.f611a);
        ilVar.a(itVar.m573a());
        ilVar.a(itVar.a());
        ilVar.b(itVar.b());
        ilVar.e(itVar.d());
        ilVar.a(0L);
        ilVar.d("success clear push message.");
        u.a(this.f72a).a(ilVar, hu.Notification, false, true, null, false, this.f72a.getPackageName(), b.m41a(this.f72a).m42a(), false);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m72a(Context context, String str) {
        synchronized (f70a) {
            b.m41a(context);
            SharedPreferences a2 = b.a(context);
            if (f71a == null) {
                String[] split = a2.getString("pref_msg_ids", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                f71a = new LinkedList();
                for (String str2 : split) {
                    f71a.add(str2);
                }
            }
            if (f71a.contains(str)) {
                return true;
            }
            f71a.add(str);
            if (f71a.size() > 25) {
                f71a.poll();
            }
            String a3 = bm.a(f71a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            com.xiaomi.push.q.a(edit);
            return false;
        }
    }

    public static void a(Context context, String str) {
        synchronized (f70a) {
            f71a.remove(str);
            b.m41a(context);
            SharedPreferences a2 = b.a(context);
            String a3 = bm.a(f71a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            com.xiaomi.push.q.a(edit);
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        return ac.a(context, str, map, i);
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m73a(iq iqVar) {
        Map<String, String> m525a = iqVar.m558a() == null ? null : iqVar.m558a().m525a();
        if (m525a == null) {
            return false;
        }
        String str = m525a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }
}
