package com.bytedance.push.notification;

import android.content.Context;
import com.bytedance.android.service.manager.push.client.intelligence.IClientFeatureService;
import com.bytedance.android.service.manager.push.client.intelligence.IFeatureCallBack;
import com.bytedance.push.C;
import com.bytedance.push.client.intelligence.FeatureCollectionHelper;
import com.heytap.msp.push.constant.EventConstant;
import java.util.List;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class PushMsgHandler$5 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f5759c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f5760d;

    PushMsgHandler$5(n nVar, long j, JSONObject jSONObject, Context context) {
        this.f5760d = nVar;
        this.a = j;
        this.b = jSONObject;
        this.f5759c = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        List list2;
        List list3;
        list = this.f5760d.f5779e;
        synchronized (list) {
            list2 = this.f5760d.f5779e;
            if (!list2.contains(Long.valueOf(this.a))) {
                list3 = this.f5760d.f5779e;
                list3.add(Long.valueOf(this.a));
                FeatureCollectionHelper.getInstance(this.f5759c).getFeatureForEventReport(new IFeatureCallBack() { // from class: com.bytedance.push.notification.PushMsgHandler$5.1

                    /* renamed from: com.bytedance.push.notification.PushMsgHandler$5$1$a */
                    class a implements Observer {
                        final /* synthetic */ boolean[] a;
                        final /* synthetic */ com.bytedance.push.settings.z.a.b b;

                        a(boolean[] zArr, com.bytedance.push.settings.z.a.b bVar) {
                            this.a = zArr;
                            this.b = bVar;
                        }

                        @Override // java.util.Observer
                        public void update(Observable observable, Object obj) {
                            boolean z = !((Boolean) obj).booleanValue();
                            if (z) {
                                synchronized (this.a) {
                                    if (!this.a[0]) {
                                        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                                        com.bytedance.push.g0.f.g("Click", "[trackClickPush]on app status changed,isInForeGround:" + z);
                                        this.a[0] = true;
                                        PushMsgHandler$5 pushMsgHandler$5 = PushMsgHandler$5.this;
                                        n.c(pushMsgHandler$5.f5760d, this.b.b, pushMsgHandler$5.b);
                                    }
                                }
                                com.bytedance.common.push.b.e().deleteObserver(this);
                            }
                        }
                    }

                    /* renamed from: com.bytedance.push.notification.PushMsgHandler$5$1$b */
                    class b implements Runnable {
                        final /* synthetic */ boolean[] a;

                        b(boolean[] zArr) {
                            this.a = zArr;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (this.a) {
                                if (!this.a[0]) {
                                    Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                                    com.bytedance.push.g0.f.g("Click", "[trackClickPush]backup report click after maxDelayTimeInMill");
                                    this.a[0] = true;
                                    PushMsgHandler$5 pushMsgHandler$5 = PushMsgHandler$5.this;
                                    n.c(pushMsgHandler$5.f5760d, 0L, pushMsgHandler$5.b);
                                }
                            }
                        }
                    }

                    @Override // com.bytedance.android.service.manager.push.client.intelligence.IFeatureCallBack
                    public void onFeatureCallBack(JSONObject jSONObject) {
                        com.bytedance.push.interfaze.e eVar;
                        if (jSONObject != null) {
                            try {
                                PushMsgHandler$5.this.b.put("client_feature", jSONObject);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                        com.bytedance.push.Q.b x = C.x();
                        StringBuilder M = e.a.a.a.a.M("push_click:");
                        M.append(PushMsgHandler$5.this.b);
                        String sb = M.toString();
                        Objects.requireNonNull((com.bytedance.push.Q.c) x);
                        com.bytedance.push.g0.f.g("Click", sb);
                        com.bytedance.push.settings.z.a.b M2 = com.ss.android.pushmanager.setting.c.c().g().M();
                        if (M2 != null) {
                            com.bytedance.push.Q.b x2 = C.x();
                            StringBuilder M3 = e.a.a.a.a.M("[trackClickPush]optPushClickSessionId:");
                            M3.append(M2.a);
                            String sb2 = M3.toString();
                            Objects.requireNonNull((com.bytedance.push.Q.c) x2);
                            com.bytedance.push.g0.f.g("Click", sb2);
                            if (M2.a) {
                                boolean z = !com.bytedance.common.push.b.e().j();
                                com.bytedance.push.Q.b x3 = C.x();
                                StringBuilder X = e.a.a.a.a.X("[trackClickPush]isInForeground:", z, " minDelayTimeInMill:");
                                X.append(M2.b);
                                String sb3 = X.toString();
                                Objects.requireNonNull((com.bytedance.push.Q.c) x3);
                                com.bytedance.push.g0.f.g("Click", sb3);
                                if (z) {
                                    long f2 = com.bytedance.common.push.b.e().f();
                                    long currentTimeMillis = System.currentTimeMillis() - f2;
                                    long j = M2.b;
                                    if (f2 > 0 && currentTimeMillis >= j) {
                                        j = 0;
                                    }
                                    PushMsgHandler$5 pushMsgHandler$5 = PushMsgHandler$5.this;
                                    n.c(pushMsgHandler$5.f5760d, j, pushMsgHandler$5.b);
                                } else {
                                    Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                                    com.bytedance.push.g0.f.g("Click", "[trackClickPush]delay report push_click until app to foreground");
                                    boolean[] zArr = {false};
                                    com.bytedance.common.push.b.e().addObserver(new a(zArr, M2));
                                    if (!com.bytedance.common.push.b.e().j()) {
                                        synchronized (zArr) {
                                            if (!zArr[0]) {
                                                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                                                com.bytedance.push.g0.f.g("Click", "[trackClickPush]report click event because app to foreground after add Observer");
                                                zArr[0] = true;
                                                PushMsgHandler$5 pushMsgHandler$52 = PushMsgHandler$5.this;
                                                n.c(pushMsgHandler$52.f5760d, M2.b, pushMsgHandler$52.b);
                                            }
                                        }
                                    }
                                    com.ss.android.message.e.e().f(new b(zArr), M2.f5872c);
                                }
                            }
                        }
                        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                        com.bytedance.push.g0.f.g("Click", "default report push_click");
                        eVar = PushMsgHandler$5.this.f5760d.b;
                        eVar.onEventV3(EventConstant.EventId.EVENT_ID_PUSH_CLICK, PushMsgHandler$5.this.b);
                        if (PushMsgHandler$5.this.a <= 0) {
                            com.bytedance.push.Q.b x4 = C.x();
                            StringBuilder M4 = e.a.a.a.a.M("error ruleId:");
                            M4.append(PushMsgHandler$5.this.a);
                            String sb4 = M4.toString();
                            Objects.requireNonNull((com.bytedance.push.Q.c) x4);
                            com.bytedance.push.g0.f.e("Click", sb4);
                        }
                    }
                }, IClientFeatureService.INVOKE_SCENE_EVENT_PUSH_CLICK);
                return;
            }
            com.bytedance.push.Q.b x = C.x();
            String str = "duplication click:" + this.b;
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            com.bytedance.push.g0.f.e("Click", str);
        }
    }
}
