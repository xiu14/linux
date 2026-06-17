package com.bytedance.bdinstall.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {
    private static final p<String> a = new a();
    private static final p<String[]> b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final p<JSONArray> f4112c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final p<String> f4113d = new d();

    /* renamed from: e, reason: collision with root package name */
    private static final p<String> f4114e = new e();

    /* renamed from: f, reason: collision with root package name */
    private static final p<JSONArray> f4115f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final p<String> f4116g = new g();
    public static final /* synthetic */ int h = 0;

    static class a extends p<String> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected String a(Object[] objArr) {
            Context context = (Context) objArr[0];
            Q q = (Q) objArr[1];
            if (context == null) {
                return null;
            }
            if (q == null && !com.bytedance.bdinstall.util.e.b(context)) {
                return null;
            }
            return b0.b(String.valueOf(q.h())).b(context, q);
        }
    }

    static class b extends p<String[]> {
        b() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected String[] a(Object[] objArr) {
            String[] d2;
            Context context = (Context) objArr[0];
            Q q = (Q) objArr[1];
            return (context == null || n.g() || (q == null && !com.bytedance.bdinstall.util.e.b(context)) || (d2 = b0.b(String.valueOf(q.h())).d(context, q)) == null) ? new String[0] : d2;
        }
    }

    static class c extends p<JSONArray> {
        c() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected JSONArray a(Object[] objArr) {
            return o.f((Context) objArr[0], (Q) objArr[1]);
        }
    }

    static class d extends p<String> {
        d() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected String a(Object[] objArr) {
            Context context = (Context) objArr[0];
            Q q = (Q) objArr[1];
            if (context == null) {
                return null;
            }
            if (context.getApplicationInfo().targetSdkVersion < 26 || q != null || com.bytedance.bdinstall.util.e.b(context)) {
                return b0.b(String.valueOf(q.h())).c(context, q);
            }
            return null;
        }
    }

    static class e extends p<String> {
        e() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected String a(Object[] objArr) {
            int i = n.b;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 || (i2 == 28 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                if (((Context) objArr[0]).getApplicationInfo().targetSdkVersion >= 29) {
                    return "";
                }
            }
            return b0.b((String) objArr[1]).a((Context) objArr[0], (Q) objArr[2]);
        }
    }

    static class f extends p<JSONArray> {
        f() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected JSONArray a(Object[] objArr) {
            return b0.b((String) objArr[1]).e((Context) objArr[0]);
        }
    }

    static class g extends p<String> {
        g() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected String a(Object[] objArr) {
            Q q = (Q) objArr[0];
            return q != null ? q.z().e() : "";
        }
    }

    private static JSONObject a(String str, int i, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("id", str);
            jSONObject.put("slot_index", i);
            jSONObject.put("type", str2);
        }
        return jSONObject;
    }

    public static String b(Context context, Q q) {
        return a.b(context, q);
    }

    public static JSONArray c(Context context, Q q) {
        return f4115f.b(context, String.valueOf(q.h()), q);
    }

    @SuppressLint({"HardwareIds"})
    public static String d(Context context, Q q) {
        return f4114e.b(context, String.valueOf(q.h()), q);
    }

    public static JSONArray e(Context context, Q q) {
        return f4112c.b(context, q);
    }

    @NonNull
    public static JSONArray f(Context context, Q q) {
        JSONArray jSONArray = new JSONArray();
        if (q == null && !com.bytedance.bdinstall.util.e.b(context)) {
            return new JSONArray();
        }
        try {
            try {
                jSONArray.put(a(b0.b(String.valueOf(q.h())).g(context, 0, q), 0, "meid"));
            } catch (Exception e2) {
                if (e2 instanceof SecurityException) {
                    int i = C0640u.a;
                } else {
                    e2.printStackTrace();
                }
            }
            try {
                jSONArray.put(a(b0.b(String.valueOf(q.h())).g(context, 1, q), 1, "meid"));
            } catch (Exception e3) {
                if (e3 instanceof SecurityException) {
                    int i2 = C0640u.a;
                } else {
                    e3.printStackTrace();
                }
            }
            try {
                jSONArray.put(a(b0.b(String.valueOf(q.h())).f(context, 0, q), 0, "imei"));
            } catch (Exception e4) {
                if (e4 instanceof SecurityException) {
                    int i3 = C0640u.a;
                } else {
                    e4.printStackTrace();
                }
            }
            try {
                jSONArray.put(a(b0.b(String.valueOf(q.h())).f(context, 1, q), 1, "imei"));
            } catch (Exception e5) {
                if (e5 instanceof SecurityException) {
                    int i4 = C0640u.a;
                } else {
                    e5.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (th instanceof SecurityException) {
                int i5 = C0640u.a;
            } else {
                th.printStackTrace();
            }
        }
        return jSONArray;
    }

    public static String g(Context context, Q q) {
        if (q.O()) {
            return f4113d.b(context, q);
        }
        return null;
    }

    public static String[] h(Context context, Q q) {
        return b.b(context, q);
    }
}
