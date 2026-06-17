package com.bytedance.memory;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.apm.h;
import com.bytedance.memory.b.c;
import com.bytedance.services.apm.api.k;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MemoryWidget extends h {
    public static final String KEY_CLIENT_ANALYZE = "client_analyze";
    public static final String KEY_ENABLE_WIDGET_MEMORY = "enable_widget_memory";
    public static final String KEY_MAX_CAPACITY_ANALYSE = "max_capacity_analyse";
    public static final String KEY_MEMORY_RATE = "rate_memory_occupied";
    public static final String KEY_RUN_STRATEGY = "memory_strategy";
    private Context mAppContext;
    private volatile boolean mCheckedFolder;
    private boolean mClientAnalyze = false;
    private boolean mEnable;
    private volatile boolean mInitEd;
    private boolean mIsDebug;
    private com.bytedance.memory.e.a mMemoryWidgetConfig;
    private volatile boolean mNeedStop;
    private com.bytedance.memory.g.b mResultListener;
    private JSONObject memory;

    class a implements Runnable {
        a(MemoryWidget memoryWidget) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.memory.a.a.j().o();
        }
    }

    class b implements Runnable {
        b(MemoryWidget memoryWidget) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.memory.c.a.c().a();
        }
    }

    public MemoryWidget(@NonNull com.bytedance.memory.e.a aVar) {
        this.mMemoryWidgetConfig = aVar;
    }

    private boolean ableToInit() {
        return this.mEnable || this.mIsDebug;
    }

    private List<String> convertHost(List<String> list, String str) {
        try {
            if (!com.bytedance.android.input.k.b.a.a0(list)) {
                ArrayList arrayList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL(list.get(i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        arrayList.add("https://" + host + str);
                    }
                }
                return arrayList;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return Collections.emptyList();
    }

    private boolean inited() {
        return this.mInitEd && ableToInit();
    }

    private void parseConfig(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("memory");
            this.memory = optJSONObject2;
            if (optJSONObject2 != null) {
                this.mEnable = optJSONObject2.optInt(KEY_ENABLE_WIDGET_MEMORY, 0) == 1;
            }
        }
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.h
    public void init(Context context) {
        super.init(context);
        this.mAppContext = context;
        registerConfigService();
        com.bytedance.memory.a.a.j().m(this.mAppContext);
        com.bytedance.memory.a.a j = com.bytedance.memory.a.a.j();
        com.bytedance.memory.e.a aVar = this.mMemoryWidgetConfig;
        j.n(aVar != null ? aVar.k() : "");
        try {
            com.bytedance.memory.c.b.c();
        } catch (Exception unused) {
            this.mNeedStop = true;
        }
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.h
    public boolean isOnlyMainProcess() {
        return false;
    }

    @Override // com.bytedance.services.apm.api.h
    public void notifyParams(k kVar) {
        List<String> a2;
        if (kVar == null || (a2 = kVar.a()) == null || a2.size() <= 0) {
            return;
        }
        List<String> convertHost = convertHost(a2, "/monitor/collect/c/memory_upload_check?aid=%d&os=android");
        if (convertHost != null && convertHost.size() > 0) {
            com.bytedance.memory.f.a.a = convertHost;
        }
        List<String> convertHost2 = convertHost(a2, "/monitor/collect/c/mom_dump_collect");
        if (convertHost2 != null && convertHost2.size() > 0) {
            com.bytedance.memory.f.a.b = convertHost2;
        }
        List<String> convertHost3 = convertHost(a2, "/monitor/collect/c/exception");
        if (convertHost3 == null || convertHost3.size() <= 0) {
            return;
        }
        com.bytedance.memory.f.a.f5378c = convertHost3;
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        if (inited() && this.mMemoryWidgetConfig.n() == 2) {
            com.bytedance.memory.g.a.f().i();
        }
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
        if (inited() && this.mMemoryWidgetConfig.n() == 2) {
            c.b("onFront", new Object[0]);
            com.bytedance.memory.a.a.j().o();
        }
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        super.onRefresh(jSONObject, z);
        if (this.mNeedStop) {
            return;
        }
        this.mIsDebug = this.mMemoryWidgetConfig.p();
        parseConfig(jSONObject);
        if (ableToInit()) {
            if (!this.mInitEd) {
                registerAppLifeCycle();
                int l = this.mMemoryWidgetConfig.l();
                JSONObject jSONObject2 = this.memory;
                if (jSONObject2 != null) {
                    this.mMemoryWidgetConfig.t(jSONObject2.optInt(KEY_RUN_STRATEGY, this.mMemoryWidgetConfig.n()));
                    l = this.memory.optInt(KEY_MEMORY_RATE, this.mMemoryWidgetConfig.l());
                    boolean z2 = this.memory.optInt(KEY_CLIENT_ANALYZE, 0) == 1;
                    this.mClientAnalyze = z2;
                    this.mMemoryWidgetConfig.q(z2);
                }
                if (this.mMemoryWidgetConfig.n() == 2) {
                    c.b("reach top mode", new Object[0]);
                    this.mMemoryWidgetConfig.r(l);
                    com.bytedance.memory.e.a aVar = this.mMemoryWidgetConfig;
                    aVar.s(getConfigInt(KEY_MAX_CAPACITY_ANALYSE, aVar.m()));
                }
                com.bytedance.memory.a.a.j().l(this.mAppContext, this.mMemoryWidgetConfig, this.mResultListener);
                c.b("memorywidget is inited", new Object[0]);
                c.b(this.mMemoryWidgetConfig.toString(), new Object[0]);
                this.mInitEd = true;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), com.bytedance.memory.a.a.j().g() ? 0L : 20000L);
        }
        c.b("onRefresh run", new Object[0]);
        if (!com.bytedance.feedbackerlib.a.G("npth_hprof_close")) {
            com.bytedance.memory.d.b.b().c();
        }
        if (this.mCheckedFolder) {
            return;
        }
        this.mCheckedFolder = true;
        new Handler(Looper.getMainLooper()).postDelayed(new b(this), com.heytap.mcssdk.constant.a.q);
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.h
    public void start() {
        super.start();
    }

    public MemoryWidget(@NonNull com.bytedance.memory.e.a aVar, @Nullable com.bytedance.memory.g.b bVar) {
        this.mMemoryWidgetConfig = aVar;
        this.mResultListener = bVar;
    }
}
