package com.bytedance.bdinstall.k0;

/* loaded from: classes.dex */
class v extends d {
    v() {
        super(true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (com.bytedance.bdinstall.util.n.k() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // com.bytedance.bdinstall.k0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(org.json.JSONObject r8) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
            boolean r1 = com.bytedance.bdinstall.util.n.n()
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.String r1 = "MIUI-"
            r0.append(r1)
            goto L99
        L15:
            boolean r1 = com.bytedance.bdinstall.util.n.i()
            if (r1 == 0) goto L22
            java.lang.String r1 = "FLYME-"
            r0.append(r1)
            goto L99
        L22:
            java.lang.String r1 = com.bytedance.bdinstall.util.n.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L31
            java.lang.String r3 = com.bytedance.bdinstall.util.n.a()
            goto L32
        L31:
            r3 = r1
        L32:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L51
            java.lang.String r4 = r3.toLowerCase()
            java.lang.String r5 = "emotionui"
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L83
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = "magicui"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L51
            goto L83
        L51:
            java.lang.String r3 = android.os.Build.BRAND
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "huawei"
            r6 = 0
            if (r4 != 0) goto L66
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r3.startsWith(r5)
            if (r3 != 0) goto L78
        L66:
            java.lang.String r3 = android.os.Build.MANUFACTURER
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L7a
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L7a
        L78:
            r3 = r2
            goto L7b
        L7a:
            r3 = r6
        L7b:
            if (r3 != 0) goto L83
            boolean r3 = com.bytedance.bdinstall.util.n.k()
            if (r3 == 0) goto L84
        L83:
            r6 = r2
        L84:
            if (r6 == 0) goto L99
            java.lang.String r3 = "EMUI-"
            r0.append(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L99
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
        L99:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "rom"
            r8.put(r1, r0)
            java.lang.String r0 = com.bytedance.bdinstall.util.n.c()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb6
            java.lang.String r1 = "rom_version"
            r8.put(r1, r0)
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.k0.v.a(org.json.JSONObject):boolean");
    }
}
