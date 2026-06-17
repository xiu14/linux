package com.bytedance.applog.x;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.B.e;
import com.bytedance.applog.l;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.util.k;
import com.bytedance.applog.w.j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static final List<String> v = Collections.singletonList("ConfigManager");
    private final Context a;
    private final l b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f3911c;

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f3912d;

    /* renamed from: e, reason: collision with root package name */
    private final SharedPreferences f3913e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f3914f;

    /* renamed from: g, reason: collision with root package name */
    private volatile JSONObject f3915g;
    private volatile HashSet<String> j;
    private volatile com.bytedance.applog.y.a l;
    private final com.bytedance.applog.E.a m;
    private final com.bytedance.applog.c n;
    private volatile com.bytedance.applog.t.a o;
    private com.bytedance.applog.q.c p;
    private volatile String q;
    private volatile String r;
    private long k = 0;
    private volatile boolean s = true;
    private final Map<String, List<String>> t = new ConcurrentHashMap();
    private List<String> u = null;
    private final HashSet<String> h = new HashSet<>();
    private final HashSet<String> i = new HashSet<>();

    public b(com.bytedance.applog.c cVar, Context context, l lVar) {
        com.bytedance.applog.t.a aVar = null;
        this.n = cVar;
        this.a = context;
        this.b = lVar;
        this.f3913e = context.getSharedPreferences(lVar.j(), 0);
        this.f3911c = context.getSharedPreferences(com.bytedance.applog.b.b(cVar, "header_custom"), 0);
        this.f3912d = context.getSharedPreferences(com.bytedance.applog.b.b(cVar, "last_sp_session"), 0);
        this.m = new com.bytedance.applog.E.a(cVar, this, n());
        if (cVar.c0()) {
            Q(com.bytedance.applog.y.c.a(cVar, this));
        }
        if (cVar.d0()) {
            com.bytedance.applog.t.a aVar2 = new com.bytedance.applog.t.a();
            SharedPreferences sharedPreferences = cVar.o().getSharedPreferences(com.bytedance.applog.b.b(cVar, "applog_forward"), 0);
            int i = sharedPreferences.getInt("version", -1);
            if (i != -1) {
                aVar2.p(i);
                aVar2.m(sharedPreferences.getLong("interval", com.heytap.mcssdk.constant.a.f6886d));
                aVar2.a(sharedPreferences.getStringSet("events", new HashSet()));
                aVar2.o(sharedPreferences.getString("forward_report_path", ""));
                aVar2.l(sharedPreferences.getString("forward_report_host", ""));
                aVar2.n(sharedPreferences.getInt("forward_open", 0));
                aVar = aVar2;
            }
            P(aVar);
        }
    }

    private HashSet<String> L(JSONArray jSONArray) {
        HashSet<String> hashSet = new HashSet<>();
        if (jSONArray == null) {
            try {
                jSONArray = new JSONArray(this.f3913e.getString("real_time_events", "[]"));
            } catch (Throwable unused) {
            }
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        return hashSet;
    }

    private void X(@Nullable SharedPreferences.Editor editor, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            this.u = null;
            if (editor != null) {
                editor.remove("header_custom_allow");
                return;
            }
            return;
        }
        this.u = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                this.u.add(optString);
            }
        }
        com.bytedance.applog.q.c cVar = this.p;
        if (cVar != null) {
            cVar.n().a();
        }
        if (editor != null) {
            editor.putString("header_custom_allow", jSONArray.toString());
        }
    }

    private void Y(@Nullable SharedPreferences.Editor editor, JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (!this.t.isEmpty()) {
            this.t.clear();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null && optJSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            hashSet.add(optString);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this.t.put(next, new ArrayList(hashSet));
                    }
                }
            }
        }
        if (editor != null) {
            if (this.t.isEmpty()) {
                editor.remove("params_block");
            } else {
                editor.putString("params_block", jSONObject.toString());
            }
        }
    }

    String A() {
        if (this.r == null) {
            this.r = this.f3911c.getString("user_unique_id", "");
        }
        return this.r;
    }

    public String B() {
        return this.b.m();
    }

    public boolean C(String str) {
        List<String> list;
        return !this.n.Y() || (list = this.u) == null || list.isEmpty() || this.u.contains(str);
    }

    public boolean D(String str, String str2) {
        List<String> list;
        if (this.n.e0() && this.t.containsKey(str) && (list = this.t.get(str)) != null && !list.isEmpty()) {
            return !list.contains(str2);
        }
        return true;
    }

    public boolean E(String str) {
        if (this.n.e0()) {
            return this.t.containsKey(str);
        }
        return true;
    }

    public boolean F() {
        return this.s;
    }

    public boolean G() {
        if (this.b.i() == 0) {
            this.b.x(!k.e(this.a).contains(Constants.COLON_SEPARATOR));
        }
        return this.b.i() == 1;
    }

    public boolean H() {
        Objects.requireNonNull(this.b);
        return false;
    }

    public void I() {
        if (this.n.Y()) {
            String string = this.f3913e.getString("header_custom_allow", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    X(null, new JSONArray(string));
                } catch (Throwable th) {
                    this.n.K().q("parse custom header control config failed", th);
                }
            }
        }
        if (this.n.e0()) {
            String string2 = this.f3913e.getString("params_block", null);
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            try {
                Y(null, new JSONObject(string2));
            } catch (Throwable th2) {
                this.n.K().q("parse event params control config failed", th2);
            }
        }
    }

    public void J(@NonNull JSONObject jSONObject) {
        this.m.b(jSONObject, n(), null);
        com.bytedance.applog.y.c.d(jSONObject, this.l);
    }

    public void K(@NonNull JSONObject jSONObject) {
        this.k = jSONObject.optLong("batch_event_interval", 0L) * 1000;
        this.n.I().n(v, "parseCommonConfigFromResp mEventIntervalFromLogResp: {}", Long.valueOf(this.k));
    }

    void M(String str) {
        this.q = str;
        this.f3911c.edit().putString("ab_sdk_version", str).apply();
    }

    public void N(JSONObject jSONObject) {
        this.n.I().n(v, "setConfig: {}", jSONObject);
        this.f3915g = jSONObject;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f3913e.edit();
        long optInt = jSONObject.optInt("session_interval", 0);
        if (optInt <= 0 || optInt > 604800) {
            edit.remove("session_interval");
        } else {
            edit.putLong("session_interval", optInt * 1000);
        }
        long optInt2 = jSONObject.optInt("batch_event_interval", 60) * 1000;
        if (optInt2 >= com.heytap.mcssdk.constant.a.q && optInt2 <= 300000) {
            edit.putLong("batch_event_interval", optInt2);
        } else {
            edit.remove("batch_event_interval");
        }
        int optInt3 = jSONObject.optInt("send_launch_timely", 0);
        if (optInt3 <= 0 || optInt3 > 604800) {
            edit.remove("send_launch_timely");
        } else {
            edit.putInt("send_launch_timely", optInt3);
        }
        long optInt4 = jSONObject.optInt("abtest_fetch_interval", 0);
        if (optInt4 <= 20 || optInt4 > 604800) {
            edit.remove("abtest_fetch_interval");
        } else {
            edit.putLong("abtest_fetch_interval", optInt4 * 1000);
        }
        if (jSONObject.optBoolean("bav_ab_config", false)) {
            edit.putBoolean("bav_ab_config", true);
        } else {
            edit.remove("bav_ab_config");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("real_time_events");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            this.j = new HashSet<>();
            edit.remove("real_time_events");
        } else {
            this.j = L(optJSONArray);
            edit.putString("real_time_events", optJSONArray.toString());
        }
        int optInt5 = jSONObject.optInt("http_monitor_port", 0);
        if (optInt5 > 0) {
            edit.putInt("http_monitor_port", optInt5);
        }
        edit.putLong("app_log_last_config_time", currentTimeMillis);
        int optInt6 = jSONObject.optInt("forbid_report_phone_detail_info", -1);
        if (optInt6 >= 0) {
            edit.putBoolean("forbid_report_phone_detail_info", optInt6 > 0);
        }
        long optLong = jSONObject.optLong("fetch_interval", 21600L) * 1000;
        if (optLong < 1800000 || optLong > 172800000) {
            optLong = 21600000;
        }
        edit.putLong("fetch_interval", optLong);
        edit.putInt("content_encode_method", jSONObject.optInt("content_encode_method", 0));
        edit.putLong("max_pack_size", jSONObject.optLong("max_pack_size", 0L));
        JSONObject optJSONObject = jSONObject.optJSONObject("log_back");
        if (optJSONObject != null) {
            Z(edit, optJSONObject);
        }
        edit.putBoolean("ignore_event_priority", jSONObject.optInt("ignore_event_priority", 0) == 1);
        if (this.n.e0()) {
            Y(edit, jSONObject.optJSONObject("params_block"));
        }
        if (this.n.Y()) {
            X(edit, jSONObject.optJSONArray("header_custom_allow"));
        }
        edit.apply();
        if (jSONObject.has("monitor_config")) {
            this.n.K().h().n(jSONObject.optJSONObject("monitor_config"));
        }
        int i = j.a;
    }

    public void O(com.bytedance.applog.q.c cVar) {
        this.p = cVar;
    }

    public void P(com.bytedance.applog.t.a aVar) {
        com.bytedance.applog.q.c cVar;
        if (aVar == null || !aVar.equals(this.o)) {
            this.o = aVar;
            if (this.o != null && (cVar = this.p) != null) {
                cVar.A();
            }
            if (this.o != null) {
                int i = j.a;
            }
        }
    }

    public void Q(com.bytedance.applog.y.a aVar) {
        com.bytedance.applog.q.c cVar;
        if (this.f3913e.getBoolean("ignore_event_priority", false)) {
            return;
        }
        boolean z = aVar == null || aVar.e(this.l);
        this.l = aVar;
        if (z && (cVar = this.p) != null) {
            cVar.A();
        }
        int i = j.a;
    }

    void R(String str) {
        this.n.I().n(v, "setExternalAbVersion: {}", str);
        this.f3911c.edit().putString("external_ab_version", str).apply();
        this.f3914f = null;
    }

    public void S(boolean z) {
        this.s = z;
    }

    public void T(String str, int i) {
        this.f3912d.edit().putString("session_last_day", str).putInt("session_order", i).apply();
    }

    public void U(long j) {
        this.f3912d.edit().putLong("latest_forground_session_time", j).apply();
    }

    public void V(HashSet<String> hashSet, HashSet<String> hashSet2) {
        this.h.addAll(hashSet);
        this.i.addAll(hashSet2);
    }

    public void W(com.bytedance.applog.y.b bVar, int i) {
        com.bytedance.applog.q.c cVar = this.p;
        if (cVar != null) {
            cVar.z(bVar, i);
        }
    }

    public void Z(SharedPreferences.Editor editor, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject v2 = v();
        if (v2 != null) {
            com.bytedance.android.input.k.b.a.o0(jSONObject, v2);
            jSONObject = v2;
        }
        if (editor != null) {
            editor.putString("log_back", jSONObject.toString());
        } else {
            this.f3913e.edit().putString("log_back", jSONObject.toString()).apply();
        }
    }

    public boolean a() {
        return this.b.a();
    }

    public boolean b(ArrayList<com.bytedance.applog.B.a> arrayList) {
        if (arrayList.size() == 0 || (this.h.size() == 0 && this.i.size() == 0)) {
            return true;
        }
        Iterator<com.bytedance.applog.B.a> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.bytedance.applog.B.a next = it2.next();
            if (next instanceof com.bytedance.applog.B.c) {
                com.bytedance.applog.B.c cVar = (com.bytedance.applog.B.c) next;
                StringBuilder sb = new StringBuilder();
                sb.append(cVar.x);
                sb.append(!TextUtils.isEmpty(cVar.y) ? cVar.y : "");
                if (this.h.contains(sb.toString())) {
                    it2.remove();
                    com.bytedance.android.input.k.b.a.H0(this.n.K(), EventStage.FILTER_SERVER_BLOCKED, next);
                    this.n.K().i(StatsCountKeys.APPLOG_BLOCK_EVENT_COUNT, 1);
                    this.n.K().i(StatsCountKeys.FILTER_DROP_EVENT_COUNT, 1);
                }
            } else if ((next instanceof e) && this.i.contains(((e) next).C())) {
                com.bytedance.android.input.k.b.a.H0(this.n.K(), EventStage.FILTER_SERVER_BLOCKED, next);
                it2.remove();
                this.n.K().i(StatsCountKeys.APPLOG_BLOCK_EVENT_COUNT, 1);
                this.n.K().i(StatsCountKeys.FILTER_DROP_EVENT_COUNT, 1);
            }
        }
        return true;
    }

    public ArrayList<com.bytedance.applog.B.a> c(List<com.bytedance.applog.B.a> list) {
        Iterator<com.bytedance.applog.B.a> it2 = list.iterator();
        ArrayList<com.bytedance.applog.B.a> arrayList = null;
        while (it2.hasNext()) {
            com.bytedance.applog.B.a next = it2.next();
            if (next instanceof e) {
                e eVar = (e) next;
                if (eVar.m() != 0) {
                    if (this.j == null) {
                        this.j = L(null);
                    }
                    if (this.j.contains(eVar.C())) {
                    }
                }
                it2.remove();
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    String d() {
        if (this.q == null) {
            this.q = this.f3911c.getString("ab_sdk_version", "");
        }
        return this.q;
    }

    public String e() {
        return this.b.c();
    }

    public String f() {
        String f2 = this.b.f();
        if (TextUtils.isEmpty(f2)) {
            Objects.requireNonNull(this.b);
            f2 = null;
        }
        if (!TextUtils.isEmpty(f2)) {
            return f2;
        }
        try {
            return !TextUtils.isEmpty("UMENG_CHANNEL") ? this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData.getString("UMENG_CHANNEL") : f2;
        } catch (Throwable th) {
            this.n.I().t(v, "getChannel failed", th, new Object[0]);
            return f2;
        }
    }

    public JSONObject g() {
        return this.f3915g;
    }

    public long h() {
        return this.f3913e.getLong("fetch_interval", 21600000L);
    }

    public long i() {
        return this.f3913e.getLong("app_log_last_config_time", 0L);
    }

    public Context j() {
        return this.a;
    }

    public com.bytedance.applog.E.a k() {
        return this.m;
    }

    public int l() {
        return this.f3913e.getInt("content_encode_method", 0);
    }

    public com.bytedance.applog.t.a m() {
        return this.o;
    }

    public long n() {
        long j = this.k;
        return (j > com.heytap.mcssdk.constant.a.q ? 1 : (j == com.heytap.mcssdk.constant.a.q ? 0 : -1)) >= 0 && (j > 300000L ? 1 : (j == 300000L ? 0 : -1)) <= 0 ? j : this.f3913e.getLong("batch_event_interval", com.heytap.mcssdk.constant.a.f6886d);
    }

    public com.bytedance.applog.y.a o() {
        return this.l;
    }

    public com.bytedance.applog.y.b p(int i) {
        com.bytedance.applog.y.a aVar = this.l;
        if (aVar != null) {
            return aVar.a(i);
        }
        return null;
    }

    String q() {
        String str = this.f3914f;
        if (TextUtils.isEmpty(str)) {
            synchronized (this) {
                str = this.f3911c.getString("external_ab_version", "");
                this.f3914f = str;
            }
        }
        return str;
    }

    public l r() {
        return this.b;
    }

    public String s() {
        return this.f3913e.getString("channel", "");
    }

    public String t() {
        return this.f3912d.getString("session_last_day", "");
    }

    public long u() {
        return this.f3912d.getLong("latest_forground_session_time", 0L);
    }

    public JSONObject v() {
        String string = this.f3913e.getString("log_back", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (Throwable th) {
            this.n.I().i("json parse to logback failed", th, new Object[0]);
            return null;
        }
    }

    public long w() {
        return this.f3913e.getLong("max_pack_size", 0L);
    }

    public long x() {
        return this.f3913e.getLong("session_interval", 30000L);
    }

    public int y() {
        return this.f3912d.getInt("session_order", 0);
    }

    public SharedPreferences z() {
        return this.f3913e;
    }
}
