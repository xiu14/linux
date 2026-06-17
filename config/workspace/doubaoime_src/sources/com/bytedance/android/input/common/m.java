package com.bytedance.android.input.common;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.Objects;

/* loaded from: classes.dex */
public class m {
    private static final String[] a = {DBDefinition.ID, "address", "body", "date"};
    private static a b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2201c = false;

    public static class a {
        String a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        long f2202c;
    }

    public static boolean a() {
        return f2201c;
    }

    public static void b(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_SMS") != 0) {
            com.bytedance.android.input.r.j.j("SmsListener", "onObserverChange READ_SMS not granted, skip onObserverChange");
            return;
        }
        Cursor query = context.getContentResolver().query(Uri.parse(String.valueOf(Telephony.Sms.Inbox.CONTENT_URI)), a, "read=?", new String[]{"0"}, "date DESC");
        if (query == null) {
            return;
        }
        if (!query.moveToFirst()) {
            query.close();
            return;
        }
        String string = query.getString(query.getColumnIndex("address"));
        String string2 = query.getString(query.getColumnIndex("date"));
        String string3 = query.getString(query.getColumnIndex("body"));
        query.close();
        com.bytedance.android.input.r.j.i("SmsListener", "onObserverChange is = " + string3);
        d(Long.valueOf((Long.valueOf(string2).longValue() / 1000) * 1000).longValue(), string, new p().g(string3));
    }

    public static void c(Context context, Intent intent) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.RECEIVE_SMS") != 0) {
            com.bytedance.android.input.r.j.j("SmsListener", "onReceiver RECEIVE_SMS not granted, skip onReceiver");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (Object obj : (Object[]) extras.get("pdus")) {
                SmsMessage createFromPdu = SmsMessage.createFromPdu((byte[]) obj);
                String displayMessageBody = createFromPdu.getDisplayMessageBody();
                String originatingAddress = createFromPdu.getOriginatingAddress();
                long timestampMillis = createFromPdu.getTimestampMillis();
                com.bytedance.android.input.r.j.i("SmsListener", "onReceiver body is = " + displayMessageBody);
                d(timestampMillis, originatingAddress, new p().g(displayMessageBody));
            }
        }
    }

    private static void d(long j, String str, f fVar) {
        if (fVar == null || fVar.a == null) {
            com.bytedance.android.input.r.j.i("SmsListener", "verifyCode is null = ");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onSmsChange: timestamp = ");
        sb.append(j);
        sb.append(", address = ");
        sb.append(str);
        sb.append(", codeNumber = ");
        e.a.a.a.a.H0(sb, fVar.a, "SmsListener");
        a aVar = b;
        String str2 = fVar.a;
        long j2 = aVar.f2202c;
        boolean z = false;
        if (j > j2) {
            if (j - j2 < WsConstants.EXIT_DELAY_TIME && str.compareTo(aVar.a) == 0 && str2.compareTo(aVar.b) == 0) {
                com.bytedance.android.input.r.j.i("SmsListener", "same sms within 3s");
            } else {
                aVar.a = str;
                aVar.b = str2;
                aVar.f2202c = j;
                z = true;
            }
        }
        if (z) {
            com.bytedance.android.input.r.j.i("SmsListener", "notify ui change");
            KeyboardJni.getKeyboardJni().setQuickInputData(fVar.a, 1);
        }
    }

    public static void e(Context context) {
        if (!((Boolean) SettingsConfigNext.f(context.getString(C0838R.string.sms_verification_enabled))).booleanValue()) {
            com.bytedance.android.input.r.j.m("SmsListener", "sms verification is disabled, don't registerListener");
            return;
        }
        if (b == null) {
            a aVar = new a();
            b = aVar;
            aVar.f2202c = 0L;
            aVar.b = "";
            Objects.requireNonNull(aVar);
            a aVar2 = b;
            aVar2.a = "";
            if (aVar2 == null) {
                com.bytedance.android.input.r.j.j("SmsListener", "mCurrentSms is null");
                return;
            }
        }
        String[] strArr = {"android.permission.READ_SMS"};
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 1) {
                z = true;
                break;
            }
            String str = strArr[i];
            int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
            if (checkSelfPermission != -1) {
                if (checkSelfPermission != 0) {
                    e.a.a.a.a.r0(str, " = PERMISSION_NEVER_ASK", "SmsListener");
                    break;
                }
                com.bytedance.android.input.r.j.i("SmsListener", str + " = PERMISSION_GRANTED");
                i++;
            } else {
                e.a.a.a.a.r0(str, " = PERMISSION_DENIED", "SmsListener");
                break;
            }
        }
        if (z) {
            f2201c = true;
            n.a(context);
            SmsReceiver.a(context);
        }
    }

    public static void f() {
        n.b();
        SmsReceiver.b();
        f2201c = false;
    }
}
