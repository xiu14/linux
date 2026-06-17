package okhttp3.G;

import android.text.TextUtils;
import com.ss.ttuploader.TTUploadResolver;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static volatile a m;
    private static AtomicBoolean n = new AtomicBoolean(false);
    private final AtomicInteger a;
    private final CopyOnWriteArrayList<String> b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10577c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f10578d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f10579e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f10580f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10581g;
    private final CopyOnWriteArrayList<Integer> h;
    private final CopyOnWriteArrayList<String> i;
    private final C0486a j;
    private final List<String> k;
    private final AtomicBoolean l;

    /* renamed from: okhttp3.G.a$a, reason: collision with other inner class name */
    public static class C0486a {
        public final CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>();
        public final CopyOnWriteArrayList<String> b = new CopyOnWriteArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f10582c = new AtomicBoolean(false);

        /* renamed from: d, reason: collision with root package name */
        public final CopyOnWriteArrayList<String> f10583d = new CopyOnWriteArrayList<>();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f10584e = new AtomicBoolean(false);

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f10585f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f10586g = new AtomicBoolean(false);
        public final AtomicBoolean h = new AtomicBoolean(false);
        public final List<String> i = new ArrayList();
        public final List<String> j = new ArrayList();
    }

    public a() {
        new AtomicInteger(10000);
        this.a = new AtomicInteger(TTUploadResolver.HOST_MAX_CACHE_TIME);
        this.b = new CopyOnWriteArrayList<>();
        this.f10577c = new AtomicBoolean(true);
        this.f10578d = new AtomicBoolean(false);
        this.f10579e = new AtomicInteger(320);
        this.f10580f = new AtomicInteger(0);
        this.f10581g = new AtomicBoolean(false);
        this.h = new CopyOnWriteArrayList<>();
        this.i = new CopyOnWriteArrayList<>();
        this.j = new C0486a();
        this.k = new CopyOnWriteArrayList();
        this.l = new AtomicBoolean(false);
    }

    public static boolean h(String str) {
        return i(str, j().k);
    }

    public static boolean i(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static a j() {
        if (m == null) {
            synchronized (a.class) {
                if (m == null) {
                    m = new a();
                }
            }
        }
        return m;
    }

    public static boolean k() {
        return n.get();
    }

    public static void n(JSONObject jSONObject, String str, List<String> list) {
        JSONArray optJSONArray;
        if (TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static void o(boolean z) {
        n.set(z);
    }

    public boolean a() {
        return this.l.get();
    }

    public boolean b() {
        return this.f10577c.get();
    }

    public List<String> c() {
        return this.b;
    }

    public int d() {
        return this.a.get();
    }

    public int e() {
        return this.f10579e.get();
    }

    public C0486a f() {
        return this.j;
    }

    public int g() {
        return this.f10580f.get();
    }

    public boolean l() {
        return this.f10578d.get();
    }

    public void m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("rect_request_control");
        if (optJSONObject != null) {
            n(optJSONObject, "scy_headers", this.j.a);
            n(optJSONObject, "scy_rect_wl", this.j.b);
            int optInt = optJSONObject.optInt("rm_inscy_out_wl", -1);
            if (optInt >= 0) {
                this.j.f10582c.set(optInt == 1);
            }
            n(optJSONObject, "scy_rect_bl", this.j.f10583d);
            int optInt2 = optJSONObject.optInt("disable_report_inscy_rect", -1);
            if (optInt2 >= 0) {
                this.j.f10584e.set(optInt2 == 1);
            }
            int optInt3 = optJSONObject.optInt("only_control_webview", -1);
            if (optInt3 >= 0) {
                this.j.f10585f.set(optInt3 == 1);
            }
            int optInt4 = optJSONObject.optInt("enable_report_full_url", -1);
            if (optInt4 >= 0) {
                this.j.f10586g.set(optInt4 == 1);
            }
            int optInt5 = optJSONObject.optInt("v2_on", -1);
            if (optInt5 >= 0) {
                this.j.h.set(optInt5 == 1);
            }
            n(optJSONObject, "keep_headers_v2", this.j.i);
            n(optJSONObject, "rm_std_keep_headers_v2", this.j.j);
            String optString = jSONObject.optString("share_cookie_host_list");
            List<String> list = this.k;
            if (!TextUtils.isEmpty(optString) && list != null) {
                for (String str : optString.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    if (!TextUtils.isEmpty(str) && !i(str, list)) {
                        list.add(str.trim());
                    }
                }
            }
        }
        int optInt6 = jSONObject.optInt("ttok_enable_tls1.1", -1);
        if (optInt6 >= 0) {
            this.l.set(optInt6 == 1);
        }
    }

    public boolean p(IOException iOException, Request request, int i) {
        if (iOException == null || request == null || request.url() == null || !this.f10581g.get() || !this.h.contains(Integer.valueOf(i))) {
            return false;
        }
        String k = request.url().k();
        return !TextUtils.isEmpty(k) && this.i.contains(k);
    }
}
