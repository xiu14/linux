package com.bytedance.android.input.fragment.message;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.input.api.ImePushService;
import com.bytedance.android.input.basic.IAppGlobals;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import java.util.Set;
import kotlin.s.c.l;

@ServiceImpl
/* loaded from: classes.dex */
public final class MessageCenterPushServiceImpl implements ImePushService {
    private static final Set<String> b = kotlin.collections.g.V("http", "https");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    private final String c(String str) {
        ?? J2;
        String str2 = null;
        if (str == null || kotlin.text.a.s(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            l.e(parse, "parse(this)");
            J2 = parse.getQueryParameter("id");
            if (J2 == 0 || kotlin.text.a.s(J2)) {
                IAppGlobals.a.L("MessageCenter-PushServiceImpl", "parseMessageId messageId is blank");
                J2 = 0;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 == null) {
            str2 = J2;
        } else {
            e.a.a.a.a.O0(b2, e.a.a.a.a.M("parseMessageId exception "), IAppGlobals.a, "MessageCenter-PushServiceImpl");
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String d(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MessageCenter-PushServiceImpl"
            r1 = 0
            r2 = 1
            if (r8 == 0) goto Lf
            boolean r3 = kotlin.text.a.s(r8)
            if (r3 == 0) goto Ld
            goto Lf
        Ld:
            r3 = r1
            goto L10
        Lf:
            r3 = r2
        L10:
            r4 = 0
            if (r3 == 0) goto L14
            return r4
        L14:
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = "parse(this)"
            kotlin.s.c.l.e(r3, r5)     // Catch: java.lang.Throwable -> L96
            java.util.Set<java.lang.String> r5 = com.bytedance.android.input.fragment.message.MessageCenterPushServiceImpl.b     // Catch: java.lang.Throwable -> L96
            java.lang.String r6 = r3.getScheme()     // Catch: java.lang.Throwable -> L96
            boolean r5 = kotlin.collections.g.f(r5, r6)     // Catch: java.lang.Throwable -> L96
            if (r5 == 0) goto L3c
            java.lang.String r5 = r3.getHost()     // Catch: java.lang.Throwable -> L96
            if (r5 == 0) goto L38
            boolean r5 = kotlin.text.a.s(r5)     // Catch: java.lang.Throwable -> L96
            if (r5 == 0) goto L36
            goto L38
        L36:
            r5 = r1
            goto L39
        L38:
            r5 = r2
        L39:
            if (r5 != 0) goto L3c
            goto L9b
        L3c:
            java.lang.String r8 = r3.getScheme()     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = "snssdk401734"
            boolean r8 = kotlin.s.c.l.a(r8, r5)     // Catch: java.lang.Throwable -> L96
            if (r8 == 0) goto L6e
            java.lang.String r8 = r3.getHost()     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = "message"
            boolean r8 = kotlin.s.c.l.a(r8, r5)     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L55
            goto L6e
        L55:
            java.lang.String r8 = "url"
            java.lang.String r8 = r3.getQueryParameter(r8)     // Catch: java.lang.Throwable -> L96
            if (r8 == 0) goto L63
            boolean r3 = kotlin.text.a.s(r8)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L64
        L63:
            r1 = r2
        L64:
            if (r1 == 0) goto L9b
            com.bytedance.android.input.basic.IAppGlobals$a r8 = com.bytedance.android.input.basic.IAppGlobals.a     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "parseTargetUrl targetUrl is blank"
            r8.L(r0, r1)     // Catch: java.lang.Throwable -> L96
            goto L94
        L6e:
            com.bytedance.android.input.basic.IAppGlobals$a r8 = com.bytedance.android.input.basic.IAppGlobals.a     // Catch: java.lang.Throwable -> L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r1.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "parseTargetUrl invalid schema host, scheme="
            r1.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r3.getScheme()     // Catch: java.lang.Throwable -> L96
            r1.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = ", host="
            r1.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r3.getHost()     // Catch: java.lang.Throwable -> L96
            r1.append(r2)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L96
            r8.L(r0, r1)     // Catch: java.lang.Throwable -> L96
        L94:
            r8 = r4
            goto L9b
        L96:
            r8 = move-exception
            java.lang.Object r8 = com.prolificinteractive.materialcalendarview.r.J(r8)
        L9b:
            java.lang.Throwable r1 = kotlin.h.b(r8)
            if (r1 != 0) goto La3
            r4 = r8
            goto Lae
        La3:
            com.bytedance.android.input.basic.IAppGlobals$a r8 = com.bytedance.android.input.basic.IAppGlobals.a
            java.lang.String r2 = "parseTargetUrl exception "
            java.lang.StringBuilder r2 = e.a.a.a.a.M(r2)
            e.a.a.a.a.O0(r1, r2, r8, r0)
        Lae:
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.message.MessageCenterPushServiceImpl.d(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:37:0x0034, B:4:0x003d, B:6:0x0043, B:7:0x0047, B:9:0x004e, B:14:0x005a, B:16:0x0060, B:20:0x0077, B:21:0x00cd, B:33:0x006b, B:34:0x00c8), top: B:36:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:37:0x0034, B:4:0x003d, B:6:0x0043, B:7:0x0047, B:9:0x004e, B:14:0x005a, B:16:0x0060, B:20:0x0077, B:21:0x00cd, B:33:0x006b, B:34:0x00c8), top: B:36:0x0034 }] */
    @Override // com.bytedance.android.input.api.ImePushService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r6, int r7, com.bytedance.android.input.api.a r8, java.lang.String r9) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.s.c.l.f(r6, r0)
            java.lang.String r0 = "body"
            kotlin.s.c.l.f(r8, r0)
            com.bytedance.android.input.basic.IAppGlobals$a r0 = com.bytedance.android.input.basic.IAppGlobals.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onClickPush: from = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ", body = "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = "---openUrl = "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "MessageCenter-PushServiceImpl"
            r0.j(r1, r7)
            if (r9 != 0) goto L3c
            java.lang.String r7 = r8.a()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r6 = move-exception
            goto Ld0
        L3c:
            r7 = r9
        L3d:
            java.lang.String r7 = r5.d(r7)     // Catch: java.lang.Throwable -> L39
            if (r9 != 0) goto L47
            java.lang.String r9 = r8.a()     // Catch: java.lang.Throwable -> L39
        L47:
            java.lang.String r9 = r5.c(r9)     // Catch: java.lang.Throwable -> L39
            r2 = 1
            if (r7 == 0) goto L57
            boolean r3 = kotlin.text.a.s(r7)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L55
            goto L57
        L55:
            r3 = 0
            goto L58
        L57:
            r3 = r2
        L58:
            if (r3 != 0) goto Lc8
            java.lang.String r8 = r8.b()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L6b
            boolean r3 = kotlin.text.a.s(r8)     // Catch: java.lang.Throwable -> L39
            r2 = r2 ^ r3
            if (r2 == 0) goto L68
            goto L69
        L68:
            r8 = 0
        L69:
            if (r8 != 0) goto L77
        L6b:
            r8 = 2131821178(0x7f11027a, float:1.9275092E38)
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "context.getString(R.string.message_center_title)"
            kotlin.s.c.l.e(r8, r2)     // Catch: java.lang.Throwable -> L39
        L77:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L39
            java.lang.Class<com.bytedance.android.doubaoime.activity.SettingsActivityNext> r3 = com.bytedance.android.doubaoime.activity.SettingsActivityNext.class
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "EXTRA_FRAGMENT_TYPE"
            java.lang.String r4 = "MESSAGE_CENTER"
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "EXTRA_WEB_URL"
            r2.putExtra(r3, r7)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "extra_title"
            r2.putExtra(r3, r8)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "EXTRA_MESSAGE_ID"
            r2.putExtra(r3, r9)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "EXTRA_SETTINGS_SOURCE"
            java.lang.String r4 = "message"
            r2.putExtra(r3, r4)     // Catch: java.lang.Throwable -> L39
            r3 = 872415232(0x34000000, float:1.1920929E-7)
            r2.addFlags(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r3.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "prepare open webpage: messageId = "
            r3.append(r4)     // Catch: java.lang.Throwable -> L39
            r3.append(r9)     // Catch: java.lang.Throwable -> L39
            java.lang.String r9 = "---title = "
            r3.append(r9)     // Catch: java.lang.Throwable -> L39
            r3.append(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = "---url = "
            r3.append(r8)     // Catch: java.lang.Throwable -> L39
            r3.append(r7)     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L39
            r0.j(r1, r7)     // Catch: java.lang.Throwable -> L39
            r6.startActivity(r2)     // Catch: java.lang.Throwable -> L39
            goto Lcd
        Lc8:
            java.lang.String r6 = "finalUrl is null"
            r0.L(r1, r6)     // Catch: java.lang.Throwable -> L39
        Lcd:
            kotlin.o r6 = kotlin.o.a     // Catch: java.lang.Throwable -> L39
            goto Ld4
        Ld0:
            java.lang.Object r6 = com.prolificinteractive.materialcalendarview.r.J(r6)
        Ld4:
            java.lang.Throwable r6 = kotlin.h.b(r6)
            if (r6 == 0) goto Le5
            com.bytedance.android.input.basic.IAppGlobals$a r7 = com.bytedance.android.input.basic.IAppGlobals.a
            java.lang.String r8 = "onClickPush exception "
            java.lang.StringBuilder r8 = e.a.a.a.a.M(r8)
            e.a.a.a.a.O0(r6, r8, r7, r1)
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.message.MessageCenterPushServiceImpl.a(android.content.Context, int, com.bytedance.android.input.api.a, java.lang.String):void");
    }

    @Override // com.bytedance.android.input.api.ImePushService
    public void b(Context context, int i, com.bytedance.android.input.api.a aVar) {
        l.f(aVar, "body");
        if (context == null) {
            return;
        }
        IAppGlobals.a.j("MessageCenter-PushServiceImpl", "onMessageShow: pushType = " + i + ", body = " + aVar);
    }
}
