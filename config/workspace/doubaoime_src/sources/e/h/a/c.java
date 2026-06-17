package e.h.a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.g;
import com.bytedance.apm.h;
import com.bytedance.services.apm.api.k;
import com.bytedance.services.slardar.config.IConfigManager;
import com.monitor.cloudmessage.broadcast_receiver.NetworkBroadcastReceiver;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import e.h.a.d.e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends h implements com.bytedance.services.slardar.config.b, e {
    private Context a;
    private NetworkBroadcastReceiver b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9944c = false;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f9945d = Arrays.asList("timer", "count", "disk", "memory", MonitorConstants.CPU, "fps", "traffic", "start", "page_load", "image_monitor", "api_all", "api_error", "common_log", "service_monitor", "performance_monitor", "ui_action");

    class a implements Runnable {
        a(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.h.a.a.g().c();
        }
    }

    class b implements Runnable {
        b(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.h.a.a.g().c();
        }
    }

    @Override // com.bytedance.services.slardar.config.b
    public void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("cloud_commands");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                e.h.a.a.g().i(optJSONArray.optString(i));
            }
        }
    }

    public String[] b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("upload_type");
        int i = 0;
        if (optJSONArray == null) {
            String[] strArr = new String[this.f9945d.size()];
            while (i < this.f9945d.size()) {
                strArr[i] = this.f9945d.get(i);
                i++;
            }
            return strArr;
        }
        String[] strArr2 = new String[optJSONArray.length()];
        while (i < optJSONArray.length()) {
            strArr2[i] = optJSONArray.optString(i);
            i++;
        }
        return strArr2;
    }

    @Override // com.bytedance.apm.h
    public void destroy() {
        super.destroy();
        try {
            NetworkBroadcastReceiver networkBroadcastReceiver = this.b;
            if (networkBroadcastReceiver != null) {
                this.a.unregisterReceiver(networkBroadcastReceiver);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.h
    public String getTag() {
        return c.class.getSimpleName();
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.h
    public void init(Context context) {
        super.init(context);
        this.a = context;
        e.h.a.a.j(context);
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerResponseConfigListener(this);
        e.h.a.a.n(this);
        ActivityLifeObserver.getInstance().register(this);
        registerConfigService();
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.h
    public boolean isOnlyMainProcess() {
        return true;
    }

    @Override // com.bytedance.services.apm.api.h
    public void notifyParams(k kVar) {
        if (kVar == null || com.bytedance.android.input.k.b.a.Z(kVar.a())) {
            return;
        }
        try {
            URL url = new URL(kVar.a().get(0));
            e.h.a.j.d.a.a = String.format("%s://%s/%s", url.getProtocol(), url.getHost(), "monitor/collect/c/cloudcontrol/file");
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        if (getServiceSwitch("close_cloud_request") || !g.F()) {
            return;
        }
        com.bytedance.apm.F.b.e().j(new b(this), 2000L);
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.slardar.config.a
    public void onReady() {
        super.onReady();
        if (this.f9944c) {
            return;
        }
        this.f9944c = true;
        if (getServiceSwitch("close_cloud_request") || !g.F()) {
            return;
        }
        this.b = new NetworkBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.a.registerReceiver(this.b, intentFilter);
        com.bytedance.apm.F.b.e().h(new a(this));
    }

    @Override // com.bytedance.apm.h, com.bytedance.services.apm.api.h
    public void start() {
        super.start();
    }

    @Override // com.bytedance.apm.h
    public void stop() {
        super.stop();
    }
}
