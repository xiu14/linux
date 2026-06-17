package com.bytedance.praisedialoglib.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.praisedialoglib.manager.a;
import com.bytedance.praisedialoglib.manager.e;
import com.bytedance.praisedialoglib.ui.PraiseDialogActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {
    private static d i;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f5529c;

    /* renamed from: d, reason: collision with root package name */
    private int f5530d;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<String> f5532f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f5533g;
    private ArrayList<String> h;

    /* renamed from: e, reason: collision with root package name */
    private String f5531e = "";
    private Handler a = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.b(d.this, this.a, this.b);
        }
    }

    class b implements e.b.k.b.c {
        final /* synthetic */ String a;

        b(d dVar, String str) {
            this.a = str;
        }

        @Override // e.b.k.b.c
        public void a() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_bad", this.a);
            d.h().j();
        }

        @Override // e.b.k.b.c
        public void b() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_show", this.a);
        }

        @Override // e.b.k.b.c
        public void c() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_good", this.a);
            d.h().k();
        }

        @Override // e.b.k.b.c
        public void d() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_close", this.a);
        }
    }

    class c implements e.b.k.b.c {
        final /* synthetic */ String a;

        c(d dVar, String str) {
            this.a = str;
        }

        @Override // e.b.k.b.c
        public void a() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_bad", this.a);
            d.h().j();
        }

        @Override // e.b.k.b.c
        public void b() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_show", this.a);
        }

        @Override // e.b.k.b.c
        public void c() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_good", this.a);
            d.h().k();
        }

        @Override // e.b.k.b.c
        public void d() {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_close", this.a);
        }
    }

    private d() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f5532f = arrayList;
        arrayList.add("com.oppo.market");
        this.f5532f.add("com.meizu.mstore");
        this.f5532f.add("com.tencent.android.qqdownloader");
        this.f5532f.add("com.qihoo.appstore");
        this.f5532f.add("com.baidu.appsearch");
        this.f5532f.add("com.sogou.androidtool");
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f5533g = arrayList2;
        arrayList2.add("com.huawei.appmarket");
        ArrayList<String> arrayList3 = new ArrayList<>();
        this.h = arrayList3;
        arrayList3.add("com.wandoujia.phoenix2");
    }

    static void b(d dVar, Context context, String str) {
        Objects.requireNonNull(dVar);
        if (context == null) {
            Log.e("PraiseDialogManager", "context is null");
            return;
        }
        try {
            if ((context instanceof Activity) && (((Activity) context).isFinishing() || ((Activity) context).isDestroyed())) {
                Log.i("PraiseDialogManager", "context is finishing or destroyed, replaced by application context");
                context = e.b.a.a().getBaseContext();
            }
            Intent intent = new Intent(context, (Class<?>) PraiseDialogActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("from", str);
            dVar.m(intent);
            context.startActivity(intent);
        } catch (Throwable th) {
            Log.e("PraiseDialogManager", "startActivity meet err, " + th);
        }
    }

    private boolean f(Intent intent, Context context) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                return queryIntentActivities.size() > 0;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private Uri g() {
        StringBuilder M = e.a.a.a.a.M("market://details?id=");
        M.append(a.b.a.r());
        return Uri.parse(M.toString());
    }

    public static d h() {
        d dVar = i;
        if (dVar != null) {
            return dVar;
        }
        synchronized (d.class) {
            if (i == null) {
                i = new d();
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long i(android.app.Activity r1, java.lang.String r2) {
        /*
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r1 == 0) goto L32
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r0 = 28
            if (r2 < r0) goto L17
            long r1 = r1.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            goto L34
        L17:
            int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            long r1 = (long) r1
            goto L34
        L1b:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "getVersionCode meet exception, "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "PraiseDialogManager"
            android.util.Log.e(r2, r1)
        L32:
            r1 = -1
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.praisedialoglib.manager.d.i(android.app.Activity, java.lang.String):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:25|(6:27|28|29|(1:31)|33|(7:37|(1:39)|40|41|42|43|(2:45|46)(4:47|(5:51|52|53|54|(2:56|57)(5:(3:59|(1:66)(1:63)|(1:65))|67|(6:73|(5:75|(1:77)(2:149|(1:151))|(1:79)(3:143|144|145)|80|(2:82|83)(3:84|(1:142)(3:92|(1:94)(1:141)|95)|(2:97|98)(3:99|(4:105|106|107|108)|(4:113|(1:117)|118|119)(4:120|(1:122)|123|(5:(2:130|(2:132|133))|134|(1:138)|139|140)(2:127|128)))))|152|(0)(0)|80|(0)(0))|153|(0)(0)))|157|(0)(0))))|162|(0)|40|41|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0126, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0127, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(boolean r17) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.praisedialoglib.manager.d.l(boolean):void");
    }

    private void m(Intent intent) {
        if (a.b.a.d() != -1 && a.b.a.d() != 0) {
            intent.putExtra("back_ground_res", a.b.a.d());
        }
        int l = a.b.a.l();
        if (this.f5530d == 2) {
            Activity C = a.b.a.C();
            boolean z = false;
            if ((!"com.heytap.market".equals(this.f5529c) || i(C, "com.heytap.market") <= 84000) && (!"com.oppo.market".equals(this.f5529c) || i(C, "com.oppo.market") <= 84000)) {
                z = true;
            }
            if (z) {
                l = a.b.a.m();
            }
        }
        if (l != -1 && l != 0) {
            intent.putExtra("middle_image_res", l);
        }
        if (!TextUtils.isEmpty(a.b.a.z())) {
            intent.putExtra("main_title_text", a.b.a.z());
        }
        if (!TextUtils.isEmpty(a.b.a.A())) {
            intent.putExtra("main_title_text_color", a.b.a.A());
        }
        if (a.b.a.B() != -1 && a.b.a.B() != 0) {
            intent.putExtra("main_title_text_size", a.b.a.B());
        }
        if (!TextUtils.isEmpty(a.b.a.w())) {
            intent.putExtra("second_title_text", a.b.a.w());
        }
        if (!TextUtils.isEmpty(a.b.a.x())) {
            intent.putExtra("second_title_text_color", a.b.a.x());
        }
        if (a.b.a.y() != -1 && a.b.a.y() != 0) {
            intent.putExtra("second_tile_text_size", a.b.a.y());
        }
        if (!TextUtils.isEmpty(a.b.a.q())) {
            intent.putExtra("negative_btn_text", a.b.a.q());
        }
        if (!TextUtils.isEmpty(a.b.a.n())) {
            intent.putExtra("negative_btn_text_color", a.b.a.n());
        }
        if (a.b.a.p() != -1 && a.b.a.p() != 0) {
            intent.putExtra("negative_btn_text_size", a.b.a.p());
        }
        if (a.b.a.o() != -1 && a.b.a.o() != 0) {
            intent.putExtra("negative_btn_text_bg", a.b.a.o());
        }
        if (!TextUtils.isEmpty(a.b.a.v())) {
            intent.putExtra("positive_btn_text", a.b.a.v());
        }
        if (!TextUtils.isEmpty(a.b.a.s())) {
            intent.putExtra("positive_btn_text_color", a.b.a.s());
        }
        if (a.b.a.u() != -1 && a.b.a.u() != 0) {
            intent.putExtra("positive_btn_text_size", a.b.a.u());
        }
        if (a.b.a.t() == -1 || a.b.a.t() == 0) {
            return;
        }
        intent.putExtra("positive_btn_text_bg", a.b.a.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(g());
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        a.b.a.K(activity, intent);
        com.bytedance.feedbackerlib.a.r0("com.android.vending");
    }

    private static boolean o(Activity activity, Uri uri, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(str);
            intent.setData(uri);
            a.b.a.L(activity, intent);
            Log.d("PraiseDialogManager", "showOppoPraiseDialog is called, return true, uri is " + uri);
            return true;
        } catch (Throwable th) {
            Log.e("PraiseDialogManager", "showOppoPraiseDialog meet err, " + th);
            return false;
        }
    }

    public void j() {
        a.b.a.D(e.b.a.a());
    }

    public void k() {
        l(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(Context context, String str) {
        this.f5529c = "";
        String k = a.b.a.k();
        this.b = k;
        if (TextUtils.isEmpty(k)) {
            Log.d("PraiseDialogManager", "initMarketOrder is called, but mMarketOrder is empty");
        } else {
            String[] split = this.b.split("\\|");
            int length = split.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str2 = split[i2];
                if (com.bytedance.feedbackerlib.a.Z(context, str2)) {
                    this.f5529c = str2;
                    break;
                }
                i2++;
            }
            this.f5530d = 0;
            if (a.b.a.f() != null && a.b.a.f().contains(this.f5529c)) {
                this.f5530d = 2;
            } else if (a.b.a.e() != null && a.b.a.e().contains(this.f5529c)) {
                this.f5530d = 1;
                if (this.f5532f.contains(this.f5529c)) {
                    this.f5531e = "点击进入「评论」页后发表好评";
                } else if (this.f5533g.contains(this.f5529c)) {
                    this.f5531e = "点击页面右下角按钮发表好评";
                } else if (this.h.contains(this.f5529c)) {
                    this.f5531e = "点击进入「评价」页后发表好评";
                }
            }
        }
        if (a.b.a.G()) {
            Log.d("PraiseDialogManager", "need  show default dialog");
            this.a.post(new a(context, str));
            return;
        }
        Log.d("PraiseDialogManager", "don't need default dialog");
        if (context instanceof e.b.k.b.a) {
            ((e.b.k.b.a) context).a(new b(this, str));
        } else if (a.b.a.i() != null) {
            a.b.a.i().a(new c(this, str));
        }
    }
}
