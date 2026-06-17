package com.bytedance.push.S.a;

import org.json.JSONObject;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ JSONObject b;

    b(c cVar, String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            com.bytedance.push.interfaze.u r0 = com.bytedance.push.C.a()
            com.bytedance.push.C r0 = (com.bytedance.push.C) r0
            java.util.Map r0 = r0.c()
            java.lang.String r1 = r8.a
            java.lang.String r2 = "click"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r2 = 0
            if (r1 == 0) goto L2e
            java.util.Set<java.lang.Integer> r1 = com.ss.android.g.d.a
            java.lang.String r1 = "/cloudpush/callback/client_click/"
            java.lang.String r1 = com.ss.android.g.a.a(r1)
            java.lang.String r0 = com.ss.android.message.f.a.c(r1, r0)
            org.json.JSONObject r1 = r8.b
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.toString()
            byte[] r2 = r1.getBytes()
            goto L5a
        L2e:
            java.lang.String r1 = r8.a
            java.lang.String r3 = "show"
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L5e
            java.util.Set<java.lang.Integer> r1 = com.ss.android.g.d.a
            java.lang.String r1 = "/cloudpush/callback/client_show/"
            java.lang.String r1 = com.ss.android.g.a.a(r1)
            java.lang.String r0 = com.ss.android.message.f.a.c(r1, r0)
            org.json.JSONObject r1 = r8.b
            if (r1 == 0) goto L5a
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r2 = r8.b
            r1.put(r2)
            java.lang.String r1 = r1.toString()
            byte[] r2 = r1.getBytes()
        L5a:
            r7 = r2
            r2 = r0
            r0 = r7
            goto L5f
        L5e:
            r0 = r2
        L5f:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = "MessageCallbackServiceImpl"
            if (r1 == 0) goto L7f
            java.lang.String r0 = "failed callback "
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            java.lang.String r1 = r8.a
            r0.append(r1)
            java.lang.String r1 = " because url is null"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.push.g0.f.e(r3, r0)
            return
        L7f:
            com.bytedance.common.utility.e$a r1 = new com.bytedance.common.utility.e$a
            r1.<init>()
            r4 = 0
            r1.a = r4
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le5
            r4.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/json"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Le5
            com.bytedance.common.g.b.c r5 = com.bytedance.common.g.b.c.f()     // Catch: java.lang.Throwable -> Le5
            java.util.Map r4 = com.ss.android.message.f.a.a(r4)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = r5.d(r2, r0, r4, r1)     // Catch: java.lang.Throwable -> Le5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = "code"
            int r0 = r1.optInt(r0)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "reason"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r4 = "err_msg"
            java.lang.String r1 = r1.optString(r4)     // Catch: java.lang.Throwable -> Le5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5
            r4.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = "finished callback "
            r4.append(r5)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = r8.a     // Catch: java.lang.Throwable -> Le5
            r4.append(r5)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = ",code:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Le5
            r4.append(r0)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = " reason:"
            r4.append(r0)     // Catch: java.lang.Throwable -> Le5
            r4.append(r2)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = " errMsg:"
            r4.append(r0)     // Catch: java.lang.Throwable -> Le5
            r4.append(r1)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Le5
            com.bytedance.push.g0.f.c(r3, r0)     // Catch: java.lang.Throwable -> Le5
            goto L104
        Le5:
            r0 = move-exception
            java.lang.String r1 = "error when callback "
            java.lang.StringBuilder r1 = e.a.a.a.a.M(r1)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " :"
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.push.g0.f.e(r3, r0)
        L104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.S.a.b.run():void");
    }
}
