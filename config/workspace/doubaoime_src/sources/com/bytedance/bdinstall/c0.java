package com.bytedance.bdinstall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.message.log.PushLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class c0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f3972c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, List<c>> f3973d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final com.bytedance.bdinstall.util.p<c0> f3974e = new a();
    private final Context a;
    private AtomicBoolean b = new AtomicBoolean(false);

    static class a extends com.bytedance.bdinstall.util.p<c0> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected c0 a(Object[] objArr) {
            return new c0((Context) objArr[0], null);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Uri a;
        final /* synthetic */ int[] b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3975c;

        b(Uri uri, int[] iArr, String str) {
            this.a = uri;
            this.b = iArr;
            this.f3975c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c0.this.a.getContentResolver().notifyChange(this.a, null);
            } catch (Exception unused) {
                int[] iArr = this.b;
                iArr[0] = iArr[0] + 1;
                if (iArr[0] <= 4) {
                    String str = this + "retry " + this.b[0] + " times after 1 second";
                    int i = C0640u.a;
                    C0643x.d(this.f3975c).postDelayed(this, 1000L);
                }
            }
        }
    }

    public interface c {
        void b(String str, String str2);
    }

    c0(Context context, a aVar) {
        this.a = context;
    }

    static void b(c0 c0Var, Uri uri) {
        synchronized (c0Var) {
            String queryParameter = uri.getQueryParameter("key");
            String queryParameter2 = uri.getQueryParameter(PushLog.KEY_VALUE);
            String queryParameter3 = uri.getQueryParameter(WsConstants.KEY_APP_ID);
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                f3972c.put(queryParameter, queryParameter2);
                int i = C0640u.a;
                List<c> list = f3973d.get(queryParameter);
                if (list != null) {
                    for (c cVar : list) {
                        if (cVar != null) {
                            cVar.b(queryParameter2, queryParameter3);
                        }
                    }
                }
                return;
            }
            int i2 = C0640u.a;
        }
    }

    static c0 c(Context context) {
        return f3974e.b(context);
    }

    void d(String str, String str2, c cVar) {
        Uri a2;
        if (this.b.compareAndSet(false, true) && (a2 = BDInstallProvider.a(this.a, "install_info_change")) != null) {
            this.a.getContentResolver().registerContentObserver(a2, true, new d0(this, C0643x.b()));
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this) {
            Map<String, List<c>> map = f3973d;
            List<c> list = map.get(str2);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str2, list);
            }
            list.add(cVar);
            Map<String, String> map2 = f3972c;
            if (map2.containsKey(str2)) {
                cVar.b(map2.get(str2), str);
                return;
            }
            String string = this.a.getSharedPreferences("ug_install_op_pref", 0).getString(str2 + BundleUtil.UNDERLINE_TAG + str, null);
            if (!TextUtils.isEmpty(string)) {
                cVar.b(string, str);
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    void e(String str, String str2, String str3) {
        try {
            this.a.getSharedPreferences("ug_install_op_pref", 0).edit().putString(str2 + BundleUtil.UNDERLINE_TAG + str, str3).apply();
            Uri a2 = BDInstallProvider.a(this.a, "install_info_change");
            if (a2 == null) {
                return;
            }
            new b(a2.buildUpon().appendQueryParameter("key", str2).appendQueryParameter(WsConstants.KEY_APP_ID, str).appendQueryParameter(PushLog.KEY_VALUE, str3).build(), new int[1], str).run();
        } catch (Exception e2) {
            e2.printStackTrace();
            int i = C0640u.a;
        }
    }
}
