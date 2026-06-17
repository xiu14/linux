package com.bytedance.news.common.settings.f;

import android.content.SharedPreferences;
import com.bytedance.news.common.settings.e.g;
import com.bytedance.services.apm.api.IEnsure;

/* loaded from: classes.dex */
class b implements g {
    private SharedPreferences a;
    private SharedPreferences.Editor b;

    /* renamed from: c, reason: collision with root package name */
    private IEnsure f5514c;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Class<com.bytedance.news.common.settings.SettingsConfigProvider> r0 = com.bytedance.news.common.settings.SettingsConfigProvider.class
            java.lang.Object r0 = com.bytedance.news.common.service.manager.c.a(r0)
            com.bytedance.news.common.settings.SettingsConfigProvider r0 = (com.bytedance.news.common.settings.SettingsConfigProvider) r0
            r1 = 0
            java.lang.String r2 = ".sp"
            if (r0 == 0) goto L29
            com.bytedance.news.common.settings.a r3 = r0.getConfig()
            if (r3 == 0) goto L29
            com.bytedance.news.common.settings.a r3 = r0.getConfig()
            java.lang.String r4 = e.a.a.a.a.s(r7, r2)
            if (r9 == 0) goto L22
            r9 = 4
            goto L23
        L22:
            r9 = r1
        L23:
            r3.l(r6, r4, r9, r8)
            r8 = 0
            r5.a = r8
        L29:
            android.content.SharedPreferences r8 = r5.a     // Catch: java.lang.IllegalStateException -> L43
            if (r8 != 0) goto La2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L43
            r8.<init>()     // Catch: java.lang.IllegalStateException -> L43
            r8.append(r7)     // Catch: java.lang.IllegalStateException -> L43
            r8.append(r2)     // Catch: java.lang.IllegalStateException -> L43
            java.lang.String r8 = r8.toString()     // Catch: java.lang.IllegalStateException -> L43
            android.content.SharedPreferences r8 = r6.getSharedPreferences(r8, r1)     // Catch: java.lang.IllegalStateException -> L43
            r5.a = r8     // Catch: java.lang.IllegalStateException -> L43
            goto La2
        L43:
            r8 = move-exception
            java.lang.String r9 = "device_policy"
            java.lang.Object r9 = r6.getSystemService(r9)
            android.app.admin.DevicePolicyManager r9 = (android.app.admin.DevicePolicyManager) r9
            if (r9 == 0) goto L5e
            int r9 = r9.getStorageEncryptionStatus()     // Catch: java.lang.IllegalStateException -> L5a
            r3 = 5
            if (r9 == r3) goto L58
            r3 = 3
            if (r9 != r3) goto L5e
        L58:
            r9 = 1
            goto L5f
        L5a:
            r9 = move-exception
            r9.printStackTrace()
        L5e:
            r9 = r1
        L5f:
            if (r9 == 0) goto Lb5
            android.content.Context r8 = r6.createDeviceProtectedStorageContext()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            boolean r6 = r8.moveSharedPreferencesFrom(r6, r9)
            if (r6 != 0) goto L89
            if (r0 == 0) goto L89
            com.bytedance.news.common.settings.a r6 = r0.getConfig()
            if (r6 == 0) goto L89
            com.bytedance.news.common.settings.a r6 = r0.getConfig()
            r6.j()
        L89:
            android.content.SharedPreferences r6 = r5.a
            if (r6 != 0) goto La2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            android.content.SharedPreferences r6 = r8.getSharedPreferences(r6, r1)
            r5.a = r6
        La2:
            android.content.SharedPreferences r6 = r5.a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r5.b = r6
            java.lang.Class<com.bytedance.services.apm.api.IEnsure> r6 = com.bytedance.services.apm.api.IEnsure.class
            java.lang.Object r6 = com.bytedance.news.common.service.manager.c.a(r6)
            com.bytedance.services.apm.api.IEnsure r6 = (com.bytedance.services.apm.api.IEnsure) r6
            r5.f5514c = r6
            return
        Lb5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.news.common.settings.f.b.<init>(android.content.Context, java.lang.String, boolean, boolean):void");
    }

    @Override // com.bytedance.news.common.settings.e.g
    public String a(String str) {
        try {
            return this.a.getString(str, "");
        } catch (Exception e2) {
            IEnsure iEnsure = this.f5514c;
            if (iEnsure == null) {
                return "";
            }
            iEnsure.reportLogException(e2);
            return "";
        }
    }

    @Override // com.bytedance.news.common.settings.e.g
    public void apply() {
        this.b.apply();
    }

    @Override // com.bytedance.news.common.settings.e.g
    public boolean contains(String str) {
        return this.a.contains(str);
    }

    @Override // com.bytedance.news.common.settings.e.g
    public void putString(String str, String str2) {
        this.b.putString(str, str2);
    }
}
