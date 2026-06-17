package com.bytedance.android.doubaoime;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.data_storage.api.ImeKv;
import com.bytedance.android.input.basic.data_storage.api.KvRepoStrategy;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.network.anydoor.AnyDoorDepend;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.config.TaskConfig;
import com.bytedance.lego.init.model.InitPeriod;
import com.ss.ttuploader.TTUploadResolver;
import java.lang.reflect.Method;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ImeApplication extends Application {

    /* renamed from: e, reason: collision with root package name */
    public static Application f1883e;
    private boolean a = false;
    public int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f1884c;

    /* renamed from: d, reason: collision with root package name */
    private String f1885d;

    private final class b extends BroadcastReceiver {
        b(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String string;
            if (!"android.intent.action.INPUT_METHOD_CHANGED".equals(intent.getAction()) || (string = Settings.Secure.getString(ImeApplication.this.getContentResolver(), "default_input_method")) == null || ImeApplication.this.f1885d == null || string.equals(ImeApplication.this.f1885d)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_self", string.startsWith(context.getPackageName() + "/"));
                jSONObject.put("current_ime", string.substring(0, string.indexOf("/")));
                jSONObject.put("last_ime", ImeApplication.this.f1885d.isEmpty() ? "" : ImeApplication.this.f1885d.substring(0, ImeApplication.this.f1885d.indexOf("/")));
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                jSONObject.put("app_name", aVar.H());
                IAppLog.a aVar2 = IAppLog.a;
                Objects.requireNonNull(aVar2);
                aVar2.t("ime_change", jSONObject);
                ImeApplication.this.f1885d = string;
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public ImeApplication() {
        new Handler(Looper.getMainLooper());
        this.f1885d = "";
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f1883e = this;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.i();
        com.bytedance.android.doubaoime.u.c.a();
        ImeKv.b bVar = ImeKv.a;
        Objects.requireNonNull(bVar);
        bVar.init(this);
        boolean z = ((Integer) SettingsConfigNext.f(getString(C0838R.string.full_base_input_mode))).intValue() == 0;
        com.bytedance.android.input.k.a.a.b(!z);
        InitScheduler.config(new TaskConfig.Builder(context, getPackageName().equals(d.a.b.a.e()), d.a.b.a.e()).isDebug(false).agreePrivacyPopupWindow(z).setTimeOut(TTUploadResolver.HOST_MAX_CACHE_TIME).enableCatchException(false).setTimeOut(TTUploadResolver.HOST_MAX_CACHE_TIME).build());
        com.bytedance.common.utility.h.a.c().execute(new Runnable() { // from class: com.bytedance.android.doubaoime.k
            @Override // java.lang.Runnable
            public final void run() {
                InitScheduler.initTasks();
            }
        });
        InitPeriod initPeriod = InitPeriod.APP_ATTACHBASE2SUPER;
        InitScheduler.onPeriodStart(initPeriod);
        InitScheduler.onPeriodEnd(initPeriod);
        InitPeriod initPeriod2 = InitPeriod.APP_SUPER2ATTACHBASEEND;
        InitScheduler.onPeriodStart(initPeriod2);
        InitScheduler.onPeriodEnd(initPeriod2);
    }

    public void c() {
        Log.i("ImeApplication", "onCreate: start");
        InitPeriod initPeriod = InitPeriod.APP_ONCREATE2SUPER;
        InitScheduler.onPeriodStart(initPeriod);
        InitScheduler.onPeriodEnd(initPeriod);
        super.onCreate();
        String e2 = d.a.b.a.e();
        Log.i("ImeApplication", "initialize Start, processName = " + e2);
        if (this.a) {
            com.bytedance.android.input.r.j.m("ImeApplication", "application has initialized");
        } else {
            IEnvironment.a aVar = IEnvironment.a;
            Objects.requireNonNull(aVar);
            aVar.c();
            com.bytedance.android.input.s.j jVar = com.bytedance.android.input.s.j.a;
            com.bytedance.android.input.s.j.b();
            ImeKv.b bVar = ImeKv.a;
            KvRepoStrategy kvRepoStrategy = KvRepoStrategy.DEFAULT_MULTI_PROCESS;
            long longValue = ((Number) bVar.c(kvRepoStrategy, "first_install_time", -1L)).longValue();
            IAppGlobals.a aVar2 = IAppGlobals.a;
            aVar2.j("ImePackageService", "getFirstInstallTime() = " + longValue);
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder Q = e.a.a.a.a.Q("System.currentTimeMillis() = ", currentTimeMillis, "---firstInstallTime = ");
            Q.append(longValue);
            aVar2.j("ImePackageService", Q.toString());
            if (longValue == -1) {
                bVar.a(kvRepoStrategy, "first_install_time", Long.valueOf(currentTimeMillis));
                aVar2.j("ImePackageService", "recordFirstInstallTime() = " + currentTimeMillis);
            }
            Context applicationContext = getApplicationContext();
            Log.d("ConstValues", "CLOUD_DOMAIN = https://ime.doubao.com");
            boolean h = aVar2.h();
            Integer num = (Integer) SettingsConfigNext.f(getString(C0838R.string.full_base_input_mode));
            this.b = num.intValue();
            com.bytedance.android.input.r.j.m("ImeApplication", "InputMode = " + num + ", isExternalPackage = " + h);
            boolean F = aVar2.F();
            StringBuilder sb = new StringBuilder();
            sb.append("isObricSystem = ");
            sb.append(F);
            Log.i("ImeApplication", sb.toString());
            if (!F) {
                com.bytedance.android.input.r.j.m("ImeApplication", "start initTTNet");
                com.bytedance.android.input.ttnet.e.b(applicationContext, (ImeApplication) applicationContext.getApplicationContext(), 1);
                com.bytedance.android.input.r.j.m("ImeApplication", "end initTTNet");
            }
            if (num.intValue() == 0 || h) {
                com.bytedance.android.input.g.c(applicationContext);
            }
            if (num.intValue() == 0 && ((Number) bVar.c(kvRepoStrategy, "privacy_popup_first_show_time", -1L)).longValue() == -1) {
                bVar.a(kvRepoStrategy, "privacy_popup_first_show_time", Long.valueOf(System.currentTimeMillis()));
                aVar2.x("SPMonitorLog", "initSpMonitor KEY_PRIVACY_POPUP_FIRST_SHOW_TIME");
            }
            this.a = true;
            if (e2 != null) {
                try {
                    if (e2 != getPackageName()) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            WebView.setDataDirectorySuffix(e2);
                        } else {
                            try {
                                Method declaredMethod = WebView.class.getDeclaredMethod("setDataDirectorySuffix", Context.class, String.class);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(null, applicationContext, e2);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            com.bytedance.android.input.r.j.j("ImeApplication", "set webview data directory failed, sdk version not support");
                        }
                    }
                } catch (Exception e4) {
                    e.a.a.a.a.o0("set webview data directory failed, e: ", e4, "ImeApplication");
                }
            }
            com.bytedance.android.input.s.j jVar2 = com.bytedance.android.input.s.j.a;
            com.bytedance.android.input.s.j.a();
            Log.i("ImeApplication", "initialize End");
        }
        if (getPackageName().equals(d.a.b.a.e())) {
            b bVar2 = new b(null);
            this.f1884c = bVar2;
            registerReceiver(bVar2, new IntentFilter("android.intent.action.INPUT_METHOD_CHANGED"));
            this.f1885d = Settings.Secure.getString(getContentResolver(), "default_input_method");
        }
        IAppGlobals.a aVar3 = IAppGlobals.a;
        Objects.requireNonNull(aVar3);
        if (d.a.b.a.c(aVar3).equals("local_test")) {
            AnyDoorDepend anyDoorDepend = new AnyDoorDepend();
            kotlin.s.c.l.f(anyDoorDepend, "outDepend");
            Log.d("AnyDoorManager", "init:" + anyDoorDepend);
            com.ss.android.d.d.a a2 = com.ss.android.d.a.a.a();
            if (a2 == null) {
                Log.e("AnyDoorManager", "Init AnyDoor Failed, service is null");
            } else {
                Context context = anyDoorDepend.getContext();
                if (context instanceof Application) {
                    if (a2.e() != null) {
                        Application.ActivityLifecycleCallbacks e5 = a2.e();
                        kotlin.s.c.l.c(e5);
                        ((Application) context).registerActivityLifecycleCallbacks(e5);
                    }
                    new com.ss.android.d.e.a(context);
                    a2.b();
                    a2.a(context);
                    a2.c();
                    Log.d("AnyDoorManager", "init done");
                } else {
                    Log.e("AnyDoorManager", "Init AnyDoor Failed, context as Application failed");
                }
            }
        }
        Log.i("ImeApplication", "onCreate: end");
        InitPeriod initPeriod2 = InitPeriod.APP_SUPER2ONCREATEEND;
        InitScheduler.onPeriodStart(initPeriod2);
        InitScheduler.onPeriodEnd(initPeriod2);
        InitScheduler.startDispatchDelayTask();
    }

    @Override // android.app.Application
    public void onCreate() {
        boolean z;
        Log.d("PushStarter", "hook of Application.onCreate by Lancet");
        if (com.bytedance.push.b0.b.a) {
            z = com.bytedance.push.b0.b.b;
        } else {
            com.bytedance.push.b0.b.b = !com.ss.android.message.f.a.z(this);
            com.bytedance.push.b0.b.a = true;
            Log.d("PushStarter", "onHookApplicationOnCreate");
            com.bytedance.push.b0.d.a(this);
            if (!com.ss.android.message.f.a.t(this)) {
                if (com.ss.android.message.f.a.z(this) || com.bytedance.common.utility.f.a()) {
                    Log.d("PushStarter", "hasNotSetNetworkClient, set DefaultNetWorkClient as NetworkClient");
                    com.bytedance.common.utility.e.e(new com.bytedance.common.c.a());
                } else {
                    Log.d("PushStarter", "hasNotSetNetworkClient is false, need't set DefaultNetWorkClient as NetworkClient");
                }
            }
            z = com.bytedance.push.b0.b.b;
        }
        if (z) {
            c();
        }
    }
}
