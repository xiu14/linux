package com.bytedance.bdinstall.m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.bdinstall.m0.m;
import com.bytedance.bdinstall.m0.u;
import com.bytedance.bdinstall.m0.w.g;

/* loaded from: classes.dex */
final class r implements m {
    private final m a;
    private com.bytedance.bdinstall.util.p<Boolean> b;

    class a extends com.bytedance.bdinstall.util.p<Boolean> {
        a(r rVar) {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            try {
                PackageInfo packageInfo = ((Context) objArr[0]).getPackageManager().getPackageInfo("com.heytap.openid", 0);
                if (packageInfo == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf((Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode) >= 1);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    class b implements u.b<com.bytedance.bdinstall.m0.w.g, String> {
        final /* synthetic */ Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.bdinstall.m0.u.b
        public com.bytedance.bdinstall.m0.w.g a(IBinder iBinder) {
            return g.a.d(iBinder);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:13:0x0032, B:15:0x003a, B:17:0x0046, B:19:0x005c), top: B:12:0x0032 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // com.bytedance.bdinstall.m0.u.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b(com.bytedance.bdinstall.m0.w.g r9) throws java.lang.Exception {
            /*
                r8 = this;
                com.bytedance.bdinstall.m0.w.g r9 = (com.bytedance.bdinstall.m0.w.g) r9
                r0 = 0
                if (r9 != 0) goto L7
                goto L78
            L7:
                com.bytedance.bdinstall.m0.r r1 = com.bytedance.bdinstall.m0.r.this
                android.content.Context r2 = r8.a
                java.util.Objects.requireNonNull(r1)
                android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Exception -> L21
                java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L21
                r3 = 64
                android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L21
                if (r1 == 0) goto L25
                android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Exception -> L21
                goto L26
            L21:
                r1 = move-exception
                r1.printStackTrace()
            L25:
                r1 = r0
            L26:
                if (r1 == 0) goto L65
                int r2 = r1.length
                if (r2 <= 0) goto L65
                r2 = 0
                r1 = r1[r2]
                byte[] r1 = r1.toByteArray()
                java.lang.String r3 = "SHA1"
                java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Exception -> L61
                if (r3 == 0) goto L65
                byte[] r1 = r3.digest(r1)     // Catch: java.lang.Exception -> L61
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61
                r3.<init>()     // Catch: java.lang.Exception -> L61
                int r4 = r1.length     // Catch: java.lang.Exception -> L61
            L44:
                if (r2 >= r4) goto L5c
                r5 = r1[r2]     // Catch: java.lang.Exception -> L61
                r5 = r5 & 255(0xff, float:3.57E-43)
                r5 = r5 | 256(0x100, float:3.59E-43)
                java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Exception -> L61
                r6 = 3
                r7 = 1
                java.lang.String r5 = r5.substring(r7, r6)     // Catch: java.lang.Exception -> L61
                r3.append(r5)     // Catch: java.lang.Exception -> L61
                int r2 = r2 + 1
                goto L44
            L5c:
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L61
                goto L66
            L61:
                r1 = move-exception
                r1.printStackTrace()
            L65:
                r1 = r0
            L66:
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L78
                android.content.Context r0 = r8.a
                java.lang.String r0 = r0.getPackageName()
                java.lang.String r2 = "OUID"
                java.lang.String r0 = r9.y(r0, r1, r2)
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.m0.r.b.b(java.lang.Object):java.lang.Object");
        }
    }

    r() {
        this.b = new a(this);
        this.a = null;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        if (this.a != null && !this.b.b(new Object[0]).booleanValue()) {
            return this.a.a(context);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        String str = (String) new u(context, intent, new b(context)).a();
        m.a aVar = new m.a();
        aVar.a = str;
        return aVar;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        Boolean b2 = this.b.b(context);
        return (this.a == null || b2.booleanValue()) ? b2.booleanValue() : this.a.b(context);
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return (this.a == null || this.b.b(new Object[0]).booleanValue()) ? "OnePlus/Oppo" : this.a.getName();
    }

    r(m mVar) {
        this.b = new a(this);
        this.a = mVar;
    }
}
