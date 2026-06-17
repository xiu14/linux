package com.bytedance.apm.doctor;

import com.bytedance.monitor.util.thread.AsyncTaskType;
import com.bytedance.monitor.util.thread.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DoctorManager {
    private List<ApmListener> a = new ArrayList();

    public interface ApmListener {
        void onDataEvent(int i, String str, JSONObject jSONObject);

        void onEvent(String str, String str2);
    }

    class a implements e {
        final /* synthetic */ List a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3426c;

        a(DoctorManager doctorManager, List list, String str, String str2) {
            this.a = list;
            this.b = str;
            this.f3426c = str2;
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.LIGHT_WEIGHT;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((ApmListener) it2.next()).onEvent(this.b, this.f3426c);
            }
        }
    }

    class b implements e {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f3427c;

        b(DoctorManager doctorManager, JSONObject jSONObject, String str, List list) {
            this.a = jSONObject;
            this.b = str;
            this.f3427c = list;
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.LIGHT_WEIGHT;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = this.a.getJSONObject("DATA_DOCTOR");
                jSONObject.put(this.b, System.currentTimeMillis());
                int optInt = jSONObject.optInt("DATA_ID");
                Iterator it2 = this.f3427c.iterator();
                while (it2.hasNext()) {
                    ((ApmListener) it2.next()).onDataEvent(optInt, this.b, this.a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {
        private static final DoctorManager a = new DoctorManager(null);
    }

    DoctorManager(a aVar) {
    }

    public static DoctorManager getInstance() {
        return c.a;
    }

    public void a(String str, JSONObject jSONObject) {
        if (com.bytedance.android.input.k.b.a.e0(this.a)) {
            return;
        }
        com.bytedance.monitor.util.thread.a.e().j(new b(this, jSONObject, str, new ArrayList(this.a)));
    }

    public void b(String str, String str2) {
        if (com.bytedance.android.input.k.b.a.e0(this.a)) {
            return;
        }
        com.bytedance.monitor.util.thread.a.e().j(new a(this, new ArrayList(this.a), str, str2));
    }

    public void registerApmListener(ApmListener apmListener) {
        this.a.add(apmListener);
    }
}
