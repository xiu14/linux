package com.bytedance.common.f;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.AppDidChange;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.mobsec.metasec.ml.c;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.bytedance.common.f.a$a, reason: collision with other inner class name */
    public static final class C0172a implements com.bytedance.android.input.basic.applog.api.a {
        C0172a() {
        }

        @Override // com.bytedance.android.input.basic.applog.api.a
        public void a(String str, String str2, Boolean bool) {
            if (str == null || str2 == null) {
                return;
            }
            l.f(str, "did");
            l.f(str2, WsConstants.KEY_INSTALL_ID);
            Objects.requireNonNull(IAppGlobals.a);
            c a = com.bytedance.mobsec.metasec.ml.a.a("401734");
            a.e(str);
            a.c(str2);
            a.a("did-iid-update", "");
            a.d(810);
            AppDidChange.INSTANCE.unregisterDidChangeListener(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a() {
        /*
            com.bytedance.android.input.basic.IAppGlobals$a r0 = com.bytedance.android.input.basic.IAppGlobals.a
            java.lang.String r1 = "ImeSecureManager"
            java.lang.String r2 = "startInit"
            r0.j(r1, r2)
            com.bytedance.mobsec.metasec.ml.b$a r1 = new com.bytedance.mobsec.metasec.ml.b$a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "401734"
            java.lang.String r3 = "GDyPX4LLaKJTRmD9W+6eU1QrKm85nmVmqQrETSupHBQrn9NpbH07UMxB5juvDkpKbF289/U8s329DkJ7CRk/T97CH3vcmDhX69dmSMkkUPTCj6Nj9PKUWagws2/Csk8J63d/LK0BEg+DpjPx/BICW39qTlpmi5EmRNboG718YcNfQta58loB0mEqEkfOiwz+suwVaNahpRzc0Td5tp3tTJO7j5liE1ca6pKKKpcHfl/05NOryeDiGgB5+VxZTr//Xk5X1P0LafDMq03D30Tj2Py5pkiZdDNs03CCFwyT0MW6jbY8MH9FyNxnLmEQsdjFXQHxZg=="
            r1.<init>(r2, r3)
            r3 = 0
            r1.e(r3)
            java.lang.String r4 = d.a.b.a.c(r0)
            r1.d(r4)
            android.content.Context r0 = r0.getContext()
            com.bytedance.mobsec.metasec.ml.b r1 = r1.f()
            com.bytedance.mobsec.metasec.ml.a.b(r0, r1)
            java.lang.String r0 = com.bytedance.applog.a.c()
            java.lang.String r1 = com.bytedance.applog.a.d()
            r4 = 1
            if (r0 == 0) goto L43
            int r5 = r0.length()
            if (r5 <= 0) goto L3e
            r5 = r4
            goto L3f
        L3e:
            r5 = r3
        L3f:
            if (r5 != r4) goto L43
            r5 = r4
            goto L44
        L43:
            r5 = r3
        L44:
            java.lang.String r6 = "0"
            if (r5 == 0) goto L50
            boolean r5 = kotlin.s.c.l.a(r0, r6)
            if (r5 != 0) goto L50
            r5 = r4
            goto L51
        L50:
            r5 = r3
        L51:
            if (r1 == 0) goto L60
            int r7 = r1.length()
            if (r7 <= 0) goto L5b
            r7 = r4
            goto L5c
        L5b:
            r7 = r3
        L5c:
            if (r7 != r4) goto L60
            r7 = r4
            goto L61
        L60:
            r7 = r3
        L61:
            if (r7 == 0) goto L6a
            boolean r6 = kotlin.s.c.l.a(r1, r6)
            if (r6 != 0) goto L6a
            r3 = r4
        L6a:
            if (r5 == 0) goto L9a
            if (r3 != 0) goto L6f
            goto L9a
        L6f:
            if (r0 == 0) goto La4
            if (r1 != 0) goto L74
            goto La4
        L74:
            java.lang.String r3 = "did"
            kotlin.s.c.l.f(r0, r3)
            java.lang.String r3 = "iid"
            kotlin.s.c.l.f(r1, r3)
            com.bytedance.android.input.basic.IAppGlobals$a r3 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r3)
            com.bytedance.mobsec.metasec.ml.c r2 = com.bytedance.mobsec.metasec.ml.a.a(r2)
            r2.e(r0)
            r2.c(r1)
            java.lang.String r0 = "did-iid-update"
            java.lang.String r1 = ""
            r2.a(r0, r1)
            r0 = 810(0x32a, float:1.135E-42)
            r2.d(r0)
            goto La4
        L9a:
            com.bytedance.android.input.basic.applog.api.AppDidChange r0 = com.bytedance.android.input.basic.applog.api.AppDidChange.INSTANCE
            com.bytedance.common.f.a$a r1 = new com.bytedance.common.f.a$a
            r1.<init>()
            r0.registerDidChangeListener(r1)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.f.a.a():void");
    }
}
