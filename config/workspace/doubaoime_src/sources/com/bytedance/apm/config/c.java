package com.bytedance.apm.config;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private List<String> a;
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f3391c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f3392d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm.x.b f3393e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3394f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3395g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private final JSONObject k;
    private final com.bytedance.apm.core.b l;
    private final IHttpService m;
    private final Set<com.bytedance.services.apm.api.h> n;
    private final com.bytedance.apm.x.a o;
    private final com.bytedance.services.apm.api.e p;

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        boolean f3396c;

        /* renamed from: e, reason: collision with root package name */
        boolean f3398e;
        com.bytedance.apm.core.b k;
        IHttpService l;
        com.bytedance.apm.x.a n;
        com.bytedance.apm.x.b o;
        boolean b = false;

        /* renamed from: f, reason: collision with root package name */
        List<String> f3399f = com.bytedance.apm.u.a.a;

        /* renamed from: g, reason: collision with root package name */
        List<String> f3400g = com.bytedance.apm.u.a.b;
        List<String> h = com.bytedance.apm.u.a.f3579d;
        List<String> i = com.bytedance.apm.u.a.f3578c;
        JSONObject j = new JSONObject();
        Set<com.bytedance.services.apm.api.h> m = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        long f3397d = 2500;
        com.bytedance.services.apm.api.e p = new a(this);
        boolean a = false;

        class a implements com.bytedance.services.apm.api.e {
            a(b bVar) {
            }

            @Override // com.bytedance.services.apm.api.e
            public byte[] a(byte[] bArr) {
                return EncryptorUtil.a(bArr, bArr.length);
            }
        }

        b() {
        }

        public b a(int i) {
            try {
                this.j.put(WsConstants.KEY_APP_ID, i);
            } catch (JSONException unused) {
            }
            return this;
        }

        public b b(com.bytedance.apm.x.a aVar) {
            this.n = aVar;
            return this;
        }

        public b c(String str) {
            try {
                this.j.put("app_version", str);
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(boolean z) {
            this.f3398e = z;
            return this;
        }

        public b e(boolean z) {
            this.a = z;
            return this;
        }

        public b f(boolean z) {
            this.b = z;
            return this;
        }

        public b g(long j) {
            this.f3397d = j;
            return this;
        }

        public c h() {
            if (TextUtils.isEmpty(this.j.optString(WsConstants.KEY_APP_ID))) {
                throw new IllegalArgumentException("aid must not be empty");
            }
            Objects.requireNonNull(this.k, "dynamicParams must not be null");
            com.bytedance.android.input.k.b.a.f(this.j.optString("app_version"), "app_version");
            com.bytedance.android.input.k.b.a.f(this.j.optString("update_version_code"), "update_version_code");
            com.bytedance.android.input.k.b.a.f(this.j.optString("device_id"), "device_id");
            com.bytedance.android.input.k.b.a.f(this.j.optString("release_build"), "release_build");
            return new c(this, null);
        }

        public b i(String str) {
            try {
                this.j.put("channel", str);
            } catch (JSONException unused) {
            }
            return this;
        }

        public b j(String str) {
            try {
                this.j.put("device_id", str);
            } catch (JSONException unused) {
            }
            return this;
        }

        public b k(com.bytedance.apm.core.b bVar) {
            this.k = bVar;
            return this;
        }

        public b l(com.bytedance.apm.x.b bVar) {
            this.o = bVar;
            return this;
        }

        public b m(String str) {
            try {
                this.j.put("release_build", str);
            } catch (JSONException unused) {
            }
            return this;
        }

        public b n(boolean z) {
            this.f3396c = z;
            return this;
        }

        public b o(String str) {
            try {
                this.j.put("update_version_code", str);
            } catch (JSONException unused) {
            }
            return this;
        }

        public b p(boolean z) {
            if (z) {
                this.l = new DefaultTTNetImpl();
            }
            return this;
        }

        public b q(com.bytedance.services.apm.api.h hVar) {
            if (!com.bytedance.apm.g.F() && hVar.isOnlyMainProcess()) {
                return this;
            }
            this.m.add(hVar);
            return this;
        }
    }

    c(b bVar, a aVar) {
        this.k = bVar.j;
        this.l = bVar.k;
        this.a = bVar.f3399f;
        this.m = bVar.l;
        this.f3394f = bVar.a;
        this.f3395g = bVar.b;
        this.h = bVar.f3396c;
        this.i = bVar.f3397d;
        this.j = bVar.f3398e;
        this.n = bVar.m;
        this.b = bVar.f3400g;
        this.f3391c = bVar.h;
        this.f3392d = bVar.i;
        this.o = bVar.n;
        this.f3393e = bVar.o;
        this.p = bVar.p;
        com.bytedance.apm.y.a.e(null);
        com.bytedance.apm.y.a.g(null);
    }

    public static b a() {
        return new b();
    }

    public com.bytedance.apm.x.a b() {
        return this.o;
    }

    public long c() {
        return this.i;
    }

    public List<String> d() {
        return this.b;
    }

    @NonNull
    public com.bytedance.apm.core.b e() {
        return this.l;
    }

    public com.bytedance.services.apm.api.e f() {
        return this.p;
    }

    public List<String> g() {
        return this.f3391c;
    }

    public JSONObject h() {
        return this.k;
    }

    public IHttpService i() {
        return this.m;
    }

    public com.bytedance.apm.x.b j() {
        return this.f3393e;
    }

    public List<String> k() {
        return this.a;
    }

    public List<String> l() {
        return this.f3392d;
    }

    public Set<com.bytedance.services.apm.api.h> m() {
        return this.n;
    }

    public boolean n() {
        return this.f3395g;
    }

    public boolean o() {
        return this.j;
    }

    public boolean p() {
        return this.f3394f;
    }

    public boolean q() {
        return this.h;
    }

    public void r(List<String> list) {
        this.b = null;
    }

    public void s(List<String> list) {
        this.f3391c = null;
    }

    public void t(List<String> list) {
        this.a = null;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ApmStartConfig{mSlardarConfigUrls=");
        M.append(this.a);
        M.append(", mDefaultLogReportUrls=");
        M.append(this.b);
        M.append(", mExceptionLogReportUrls=");
        M.append(this.f3391c);
        M.append(", mTraceReportUrls=");
        M.append(this.f3392d);
        M.append(", mMemoryReachTopListener=");
        M.append(this.f3393e);
        M.append(", mWithExceptionTrafficDetect=");
        M.append(false);
        M.append(", mEnableTrafficDetect=");
        M.append(true);
        M.append(", mWithWebViewTrafficDetect=");
        M.append(false);
        M.append(", mWithBlockDetect=");
        M.append(this.f3394f);
        M.append(", mEnableBlockOnlySampled=");
        M.append(this.f3395g);
        M.append(", mWithSeriousBlockDetect=");
        M.append(this.h);
        M.append(", mBlockThresholdMs=");
        M.append(this.i);
        M.append(", mWithTemperatureDetect=");
        M.append(false);
        M.append(", mWithBatteryDetect=");
        M.append(this.j);
        M.append(", mEnableBatteryLocalRecord=");
        M.append(false);
        M.append(", mEnableTemperatureLocalRecord=");
        M.append(false);
        M.append(", mForceUpdateSlardarSetting=");
        M.append(false);
        M.append(", mEnableMultiProcessRequestSetting=");
        M.append(false);
        M.append(", mNetMonitorWithDisconnected=");
        M.append(false);
        M.append(", mHeader=");
        M.append(this.k);
        M.append(", mDynamicParams=");
        M.append(this.l);
        M.append(", mQueryParams=");
        M.append((Object) null);
        M.append(", mHttpService=");
        M.append(this.m);
        M.append(", mWidgets=");
        M.append(this.n);
        M.append(", mDelayNetRequestSeconds=");
        M.append(0L);
        M.append(", mApmStartListener=");
        M.append((Object) null);
        M.append(", mApmLogListener=");
        M.append(this.o);
        M.append(", mStorageCheckListener=");
        M.append((Object) null);
        M.append(", mExecutor=");
        M.append((Object) null);
        M.append(", mEncryptor=");
        M.append(this.p);
        M.append(", mAlogFilesDir='");
        M.append((String) null);
        M.append('\'');
        M.append(", mCallback=");
        M.append((Object) null);
        M.append(", mNtpTimeService=");
        M.append((Object) null);
        M.append('}');
        return M.toString();
    }
}
