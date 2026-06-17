package com.bytedance.push.event.sync;

import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.service.manager.push.PushExternalService;
import com.bytedance.android.service.manager.push.settings.ISettingsUpdateListener;
import com.bytedance.common.utility.e;
import com.bytedance.push.event.sync.g.i;
import com.bytedance.push.event.sync.g.j;
import com.bytedance.push.event.sync.g.k;
import com.bytedance.push.event.sync.g.l;
import com.bytedance.push.interfaze.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SignalReportServiceImpl implements t, ISettingsUpdateListener {
    private ConcurrentHashMap<String, WeakReference<com.bytedance.push.event.sync.b>> mBusinessExtraInfoProviderMap;
    private WeakReference<e> mIUserExitsValidityCheckerWeakReference;
    private volatile d mSignalReporter;
    private final String TAG = "SignalReportServiceImpl";
    private final AtomicBoolean mStarted = new AtomicBoolean(false);
    final Set<String> runningReporter = new HashSet();
    private Map<String, com.bytedance.push.event.sync.g.a> mStringISignalReporterMap = new HashMap();
    private Set<c> mINotificationDeleteListenerSet = new HashSet();

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.equals(this.a, PushExternalService.SIGNAL_SCENE_APP_LAUNCH)) {
                if (com.ss.android.message.f.a.t(com.ss.android.message.a.a())) {
                    SignalReportServiceImpl.this.startSignalReportInternal(this.a);
                    return;
                } else {
                    com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[triggerSignalReport]invalid process for SIGNAL_SCENE_APP_LAUNCH,do nothing");
                    return;
                }
            }
            if (!TextUtils.equals(this.a, PushExternalService.SIGNAL_SCENE_DEPTHS)) {
                com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[triggerSignalReport]invalid triggerScene,do nothing");
            } else if (com.ss.android.message.f.a.z(com.ss.android.message.a.a())) {
                SignalReportServiceImpl.this.startSignalReportInternal(this.a);
            } else {
                com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[triggerSignalReport]invalid process for SIGNAL_SCENE_DEPTHS,do nothing");
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SignalReportServiceImpl.this.runningReporter) {
                if (SignalReportServiceImpl.this.runningReporter.isEmpty()) {
                    return;
                }
                com.bytedance.push.settings.A.a.f V = com.ss.android.pushmanager.setting.c.c().g().V();
                HashSet hashSet = new HashSet(SignalReportServiceImpl.this.runningReporter);
                com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[onSettingsChange]signalSyncSettingsModel:" + com.bytedance.push.g0.d.b(V) + " needUnregisterReporter:" + hashSet.size());
                if (V != null) {
                    List<com.bytedance.push.settings.A.a.b> a = V.a();
                    if (a != null) {
                        Object[] array = a.toArray();
                        com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[onSettingsChange]signalConfig size:" + array.length);
                        for (Object obj : array) {
                            com.bytedance.push.settings.A.a.b bVar = (com.bytedance.push.settings.A.a.b) obj;
                            if (((com.bytedance.push.event.sync.g.a) SignalReportServiceImpl.this.mStringISignalReporterMap.get(bVar.a)) != null) {
                                hashSet.remove(bVar.a);
                            } else {
                                com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[onSettingsChange]report signal failed because not available ISignalReporter");
                            }
                        }
                    } else {
                        com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[onSettingsChange]signalReportSettings is null");
                    }
                }
                if (!hashSet.isEmpty()) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[onSettingsChange]unregister " + str);
                        com.bytedance.push.event.sync.g.a aVar = (com.bytedance.push.event.sync.g.a) SignalReportServiceImpl.this.mStringISignalReporterMap.get(str);
                        if (aVar != null) {
                            aVar.q();
                            SignalReportServiceImpl.this.runningReporter.remove(str);
                        }
                    }
                }
            }
        }
    }

    public SignalReportServiceImpl() {
        this.mStringISignalReporterMap.put("user_exits", new l());
        this.mStringISignalReporterMap.put("ringtones_info", new k());
        this.mStringISignalReporterMap.put("pull_down_notification_bar", new j());
        this.mStringISignalReporterMap.put("clear_notification", new i());
        this.mStringISignalReporterMap.put("app_position", new com.bytedance.push.event.sync.g.c());
        this.mStringISignalReporterMap.put("hw_screen_status", new com.bytedance.push.event.sync.g.f());
        this.mStringISignalReporterMap.put("headset_status", new com.bytedance.push.event.sync.g.e());
        this.mStringISignalReporterMap.put("user_display_info", new com.bytedance.push.event.sync.g.d());
        this.mStringISignalReporterMap.put("android_screen_status", new com.bytedance.push.event.sync.g.b());
        this.mBusinessExtraInfoProviderMap = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSignalReportInternal(String str) {
        if (this.mStarted.compareAndSet(false, true)) {
            com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[startSignalReportInternal]triggerScene:" + str);
            HashSet hashSet = new HashSet(this.mStringISignalReporterMap.keySet());
            com.bytedance.push.settings.A.a.f V = com.ss.android.pushmanager.setting.c.c().g().V();
            if (V != null) {
                List<com.bytedance.push.settings.A.a.b> a2 = V.a();
                if (a2 != null) {
                    Object[] array = a2.toArray();
                    StringBuilder M = e.a.a.a.a.M("[startSignalReportInternal]signalConfig size:");
                    M.append(array.length);
                    com.bytedance.push.g0.f.c("SignalReportServiceImpl", M.toString());
                    synchronized (this.runningReporter) {
                        for (Object obj : array) {
                            com.bytedance.push.settings.A.a.b bVar = (com.bytedance.push.settings.A.a.b) obj;
                            com.bytedance.push.event.sync.g.a aVar = this.mStringISignalReporterMap.get(bVar.a);
                            if (aVar != null) {
                                hashSet.remove(bVar.a);
                                if (bVar.f5797d.contains(str)) {
                                    aVar.p(str, bVar);
                                    this.runningReporter.add(bVar.a);
                                }
                            } else {
                                com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[startSignalReportInternal]report signal failed because not available ISignalReporter");
                            }
                        }
                    }
                } else {
                    com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[startSignalReportInternal]signalReportSettings is null");
                }
            } else {
                com.bytedance.push.g0.f.m("SignalReportServiceImpl", "[startSignalReportInternal]signalSyncSettingsModel is null");
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                com.bytedance.push.event.sync.g.a aVar2 = this.mStringISignalReporterMap.get((String) it2.next());
                if (aVar2 != null) {
                    aVar2.q();
                }
            }
            if (this.runningReporter.isEmpty()) {
                return;
            }
            StringBuilder M2 = e.a.a.a.a.M("[startSignalReportInternal]register settings change listener because runningReporter is not empty,cur signalSyncSettingsModel:");
            M2.append(com.bytedance.push.g0.d.b(V));
            com.bytedance.push.g0.f.c("SignalReportServiceImpl", M2.toString());
            com.ss.android.pushmanager.setting.c.c().j(this);
        }
    }

    private boolean syncEventToPushServerInternal(List<String> list, Map<String, String> map) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.bytedance.push.g0.f.e("SignalReportServiceImpl", "[syncEventToPushServerInternal]don't invoke cur method in main thread! ");
            return false;
        }
        if (list == null || list.isEmpty()) {
            com.bytedance.push.g0.f.e("SignalReportServiceImpl", "[syncEventToPushServerInternal]events is empty,not request! ");
            return false;
        }
        Map<String, String> a2 = ((com.bytedance.common.g.b.a) com.bytedance.common.g.a.c().d()).a(null);
        Set<Integer> set = com.ss.android.g.d.a;
        String a3 = com.ss.android.g.a.a("/cloudpush/event_sync/");
        e.a aVar = new e.a();
        aVar.a = false;
        String c2 = com.ss.android.message.f.a.c(a3, a2);
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair(NotificationCompat.CATEGORY_EVENT, jSONArray.toString()));
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                }
            }
            String c3 = com.bytedance.common.g.b.c.f().c(c2, arrayList, com.ss.android.message.f.a.a(null), aVar);
            if (TextUtils.isEmpty(c3)) {
                com.bytedance.push.g0.f.e("SignalReportServiceImpl", "[syncEventToPushServerInternal]request failed because server return empty");
                return false;
            }
            if (TextUtils.equals("success", new JSONObject(c3).optString("message"))) {
                com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[syncEventToPushServerInternal]request success");
                return true;
            }
            com.bytedance.push.g0.f.e("SignalReportServiceImpl", "[syncEventToPushServerInternal]request failed because server response is not success");
            return false;
        } catch (Throwable th) {
            com.bytedance.push.g0.f.e("SignalReportServiceImpl", String.format("[syncEventToPushServerInternal]request failed,errorCode: %s errorMsg: %s", Integer.valueOf(th instanceof com.bytedance.common.utility.a ? th.a() : -100), th.getMessage()));
            return false;
        }
    }

    @Override // com.bytedance.push.interfaze.t
    public ConcurrentHashMap<String, WeakReference<com.bytedance.push.event.sync.b>> getBusinessExtraInfoProviderMap() {
        return this.mBusinessExtraInfoProviderMap;
    }

    @Override // com.bytedance.push.interfaze.t
    public d getISignalReporter() {
        if (this.mSignalReporter == null) {
            synchronized (this) {
                if (this.mSignalReporter == null) {
                    this.mSignalReporter = new f();
                }
            }
        }
        return this.mSignalReporter;
    }

    @Override // com.bytedance.push.interfaze.t
    public e getIUserExitsValidityChecker() {
        WeakReference<e> weakReference = this.mIUserExitsValidityCheckerWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.bytedance.push.interfaze.t
    public void onHwScreenConfigDisable() {
        synchronized (this.runningReporter) {
            com.bytedance.push.event.sync.g.a aVar = this.mStringISignalReporterMap.get("hw_screen_status");
            if (aVar != null) {
                aVar.q();
                if (this.runningReporter.contains(aVar)) {
                    this.runningReporter.remove(aVar);
                }
            }
        }
    }

    @Override // com.bytedance.push.interfaze.t
    public void onNotificationDelete(long j) {
        com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[onNotificationDelete]:" + j);
        for (Object obj : this.mINotificationDeleteListenerSet.toArray()) {
            ((c) obj).onNotificationDelete(j);
        }
    }

    @Override // com.bytedance.push.interfaze.t
    public void onReceiveSignal(Intent intent) {
        if (intent == null) {
            return;
        }
        if (TextUtils.equals(intent.getAction(), "android.intent.action.HEADSET_PLUG") || TextUtils.equals(intent.getAction(), "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
            com.bytedance.push.event.sync.g.a aVar = this.mStringISignalReporterMap.get("headset_status");
            if (aVar != null) {
                aVar.o(intent);
                return;
            }
            return;
        }
        if (TextUtils.equals(intent.getAction(), "android.intent.action.SCREEN_OFF") || TextUtils.equals(intent.getAction(), "android.intent.action.SCREEN_ON") || TextUtils.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            com.bytedance.push.event.sync.g.a aVar2 = this.mStringISignalReporterMap.get("android_screen_status");
            if (aVar2 != null) {
                aVar2.o(intent);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("signal_name");
        if (TextUtils.isEmpty(stringExtra)) {
            com.bytedance.push.g0.f.c("SignalReceiver", "do nothing because cur signalName is empty");
            return;
        }
        com.bytedance.push.event.sync.g.a aVar3 = this.mStringISignalReporterMap.get(stringExtra);
        if (aVar3 == null) {
            return;
        }
        aVar3.o(intent);
    }

    @Override // com.bytedance.android.service.manager.push.settings.ISettingsUpdateListener
    public void onSettingsUpdate() {
        com.ss.android.message.e.e().f(new b(), 0L);
    }

    @Override // com.bytedance.push.interfaze.t
    public void registerNotificationDeleteListener(c cVar) {
        this.mINotificationDeleteListenerSet.add(cVar);
    }

    public void setBusinessExtraInfoProvider(String str, com.bytedance.push.event.sync.b bVar) {
        com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[setBusinessExtraInfoProvider]businessName:" + str);
        this.mBusinessExtraInfoProviderMap.put(str, new WeakReference<>(bVar));
    }

    public void setUserExitsSignalInfoProvider(e eVar) {
        com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[setUserExitsSignalValidityChecker]");
        this.mIUserExitsValidityCheckerWeakReference = new WeakReference<>(eVar);
    }

    public boolean syncEventToPushServer(List<String> list, Map<String, String> map) {
        return syncEventToPushServerInternal(list, map);
    }

    @Override // com.bytedance.push.interfaze.t
    public void triggerSignalReport(String str) {
        com.bytedance.push.g0.f.c("SignalReportServiceImpl", "[triggerSignalReport]triggerScene:" + str);
        com.ss.android.message.e.e().f(new a(str), 0L);
    }
}
