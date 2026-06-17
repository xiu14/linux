package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.w.k;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {
    private static final SimpleDateFormat u = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    private static final com.bytedance.applog.util.a<HashMap<String, a>> v = new C0144a();
    long a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f3731c;

    /* renamed from: d, reason: collision with root package name */
    public String f3732d;

    /* renamed from: e, reason: collision with root package name */
    public long f3733e;

    /* renamed from: f, reason: collision with root package name */
    public long f3734f;

    /* renamed from: g, reason: collision with root package name */
    public String f3735g;
    public String h;
    public int i;
    protected String m;
    String n;
    protected List<String> t;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    int o = -1;

    @Deprecated
    int p = 0;
    public long q = 0;
    public long r = 0;
    public int s = 0;

    /* renamed from: com.bytedance.applog.B.a$a, reason: collision with other inner class name */
    static class C0144a extends com.bytedance.applog.util.a<HashMap<String, a>> {
        C0144a() {
        }

        @Override // com.bytedance.applog.util.a
        protected HashMap<String, a> a(Object[] objArr) {
            return a.f();
        }
    }

    public a() {
        u(0L);
        o();
        this.t = Collections.singletonList(n());
    }

    public static String d(long j) {
        return u.format(new Date(j));
    }

    public static a e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = v.b(new Object[0]).get(jSONObject.optString("k_cls", ""));
            if (aVar != null) {
                return aVar.clone().q(jSONObject);
            }
            k.z().r(4, "from ipc class not recognized", new Object[0]);
            return null;
        } catch (Throwable th) {
            k.z().u(4, "from ipc failed", th, new Object[0]);
            return null;
        }
    }

    public static HashMap<String, a> f() {
        HashMap<String, a> hashMap = new HashMap<>();
        hashMap.put("page", new i());
        hashMap.put("launch", new g());
        hashMap.put("terminate", new j());
        hashMap.put("pack", new h());
        for (a aVar : g()) {
            r(hashMap, aVar);
        }
        return hashMap;
    }

    public static a[] g() {
        return new a[]{new c(), new e(null, null, false, null), new d(null, "", new JSONObject())};
    }

    private static void r(HashMap<String, a> hashMap, a aVar) {
        hashMap.put(aVar.n(), aVar);
    }

    protected void A(@NonNull JSONObject jSONObject) throws JSONException {
        jSONObject.put("local_time_ms", this.b);
        jSONObject.put("_app_id", this.m);
        jSONObject.put(RemoteMessageConst.Notification.PRIORITY, this.o);
        jSONObject.put("forward", this.p);
        jSONObject.put("_local_event_id", this.q);
        jSONObject.put("monitor_id", this.r);
    }

    protected abstract JSONObject B() throws JSONException;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            aVar.o();
            return aVar;
        } catch (Throwable th) {
            l().q(4, this.t, "Clone data failed", th, new Object[0]);
            return null;
        }
    }

    final String b() {
        List<String> i = i();
        if (i == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("create table if not exists ");
        sb.append(n());
        sb.append("(");
        for (int i2 = 0; i2 < i.size(); i2 += 2) {
            sb.append(i.get(i2));
            sb.append(" ");
            sb.append(i.get(i2 + 1));
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        return sb.toString();
    }

    protected final void c(@NonNull JSONObject jSONObject) throws JSONException {
        com.bytedance.applog.c a = com.bytedance.applog.b.a(this.m);
        boolean z = a != null && a.s();
        if (z || this.f3733e > 0) {
            jSONObject.put("user_id", this.f3733e);
        }
        if (z || this.f3734f > 0) {
            jSONObject.put("uid", this.f3734f);
        }
        if (z || this.j > 0) {
            jSONObject.put("user_type", this.j);
        }
        if (z || this.k > 0) {
            jSONObject.put("user_is_login", this.k);
        }
        if (z || this.l > 0) {
            jSONObject.put("user_is_auth", this.l);
        }
    }

    public String h() {
        return this.m;
    }

    protected List<String> i() {
        return Arrays.asList(DBDefinition.ID, "integer primary key autoincrement", "local_time_ms", TypedValues.Custom.S_INT, "tea_event_index", TypedValues.Custom.S_INT, "nt", TypedValues.Custom.S_INT, "user_id", TypedValues.Custom.S_INT, "uid", TypedValues.Custom.S_INT, "session_id", "varchar", "user_unique_id", "varchar", "ab_sdk_version", "varchar", "user_type", TypedValues.Custom.S_INT, "user_is_login", TypedValues.Custom.S_INT, "user_is_auth", TypedValues.Custom.S_INT, "_app_id", "varchar", RemoteMessageConst.Notification.PRIORITY, TypedValues.Custom.S_INT, "forward", TypedValues.Custom.S_INT, "_local_event_id", "varchar", "monitor_id", TypedValues.Custom.S_INT, "event_stained", TypedValues.Custom.S_INT);
    }

    protected String j() {
        return null;
    }

    protected String k() {
        StringBuilder M = e.a.a.a.a.M("sid:");
        M.append(this.f3732d);
        return M.toString();
    }

    protected com.bytedance.applog.w.e l() {
        com.bytedance.applog.w.e w = com.bytedance.applog.w.b.w(this.m);
        return w != null ? w : k.z();
    }

    public int m() {
        return this.o;
    }

    @NonNull
    abstract String n();

    public void o() {
        long c2 = com.bytedance.applog.monitor.v3.f.c();
        this.q = c2;
        this.r = c2;
    }

    public int p(@NonNull Cursor cursor) {
        this.a = cursor.getLong(0);
        this.b = cursor.getLong(1);
        this.f3731c = cursor.getLong(2);
        this.i = cursor.getInt(3);
        this.f3733e = cursor.getLong(4);
        this.f3734f = cursor.getLong(5);
        this.f3732d = cursor.getString(6);
        this.f3735g = cursor.getString(7);
        this.h = cursor.getString(8);
        this.j = cursor.getInt(9);
        this.k = cursor.getInt(10);
        this.l = cursor.getInt(11);
        this.m = cursor.getString(12);
        this.o = cursor.getInt(13);
        this.p = cursor.getInt(14);
        String string = cursor.getString(15);
        if (com.bytedance.applog.util.k.g(string)) {
            try {
                this.q = Long.parseLong(string);
            } catch (Throwable unused) {
            }
        }
        this.r = cursor.getLong(16);
        this.s = cursor.getInt(17);
        return 18;
    }

    protected a q(@NonNull JSONObject jSONObject) {
        this.b = jSONObject.optLong("local_time_ms", 0L);
        this.a = 0L;
        this.f3731c = 0L;
        this.i = 0;
        this.f3733e = 0L;
        this.f3734f = 0L;
        this.f3732d = null;
        this.f3735g = null;
        this.h = null;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = jSONObject.optString("_app_id");
        this.o = jSONObject.optInt(RemoteMessageConst.Notification.PRIORITY, -1);
        this.p = jSONObject.optInt("forward");
        this.q = jSONObject.optLong("_local_event_id", 0L);
        this.r = jSONObject.optLong("monitor_id", 0L);
        return this;
    }

    public void s(String str) {
        this.m = str;
    }

    public void t(int i) {
        this.o = i;
    }

    @NonNull
    public String toString() {
        String n = n();
        if (!getClass().getSimpleName().equalsIgnoreCase(n)) {
            StringBuilder S = e.a.a.a.a.S(n, ", ");
            S.append(getClass().getSimpleName());
            n = S.toString();
        }
        String str = this.f3732d;
        String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (str != null) {
            int indexOf = str.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            str2 = str;
        }
        StringBuilder U = e.a.a.a.a.U("{", n, ", ");
        e.a.a.a.a.M0(U, k(), ", ", str2, ", ");
        U.append(this.b);
        U.append(", id=");
        return e.a.a.a.a.F(U, this.q, "}");
    }

    public void u(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        this.b = j;
    }

    public long v() {
        long length = com.bytedance.applog.util.k.g(k()) ? 0 + r0.length() : 0L;
        return com.bytedance.applog.util.k.g(j()) ? length + r0.length() : length;
    }

    @NonNull
    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("k_cls", n());
            A(jSONObject);
        } catch (Throwable th) {
            l().q(4, this.t, "toIpcJson failed", th, new Object[0]);
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.n = d(this.b);
            return B();
        } catch (Throwable th) {
            com.bytedance.applog.c a = com.bytedance.applog.b.a(this.m);
            if (a != null) {
                a.K().i(StatsCountKeys.PACK_ERROR_COUNT, 1);
                if (th instanceof JSONException) {
                    a.K().i(StatsCountKeys.JSON_ERROR_COUNT, 1);
                }
                a.K().q(n() + " to pack json failed", th);
            }
            l().q(4, this.t, "toPackJson failed", th, new Object[0]);
            return jSONObject;
        }
    }

    final ContentValues y(@Nullable ContentValues contentValues) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        } else {
            contentValues.clear();
        }
        z(contentValues);
        return contentValues;
    }

    protected void z(@NonNull ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.b));
        contentValues.put("tea_event_index", Long.valueOf(this.f3731c));
        contentValues.put("nt", Integer.valueOf(this.i));
        contentValues.put("user_id", Long.valueOf(this.f3733e));
        contentValues.put("uid", Long.valueOf(this.f3734f));
        contentValues.put("session_id", this.f3732d);
        contentValues.put("user_unique_id", this.f3735g);
        contentValues.put("ab_sdk_version", this.h);
        contentValues.put("user_type", Integer.valueOf(this.j));
        contentValues.put("user_is_login", Integer.valueOf(this.k));
        contentValues.put("user_is_auth", Integer.valueOf(this.l));
        contentValues.put("_app_id", this.m);
        contentValues.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(this.o));
        contentValues.put("forward", Integer.valueOf(this.p));
        contentValues.put("_local_event_id", String.valueOf(this.q));
        contentValues.put("monitor_id", Long.valueOf(this.r));
        contentValues.put("event_stained", Integer.valueOf(this.s));
    }
}
