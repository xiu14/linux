package com.bytedance.android.input.speech;

import android.util.Log;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {
    public static final y a = null;
    private static String b = "space";

    /* renamed from: c, reason: collision with root package name */
    private static long f3200c;

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentLinkedQueue<a> f3201d = new ConcurrentLinkedQueue<>();

    public static final class a {
        private final String a;
        private final long b;

        public a(String str, long j) {
            kotlin.s.c.l.f(str, RemoteMessageConst.MessageBody.PARAM);
            this.a = str;
            this.b = j;
        }

        public final String a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("TrackEvent(param=");
            M.append(this.a);
            M.append(", timestamp=");
            return e.a.a.a.a.E(M, this.b, ')');
        }
    }

    public static void a() {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = f3201d;
        if (!concurrentLinkedQueue.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", b);
            for (a aVar : concurrentLinkedQueue) {
                jSONObject.put(aVar.a(), aVar.b());
            }
            StringBuilder M = e.a.a.a.a.M("reportEvent: ");
            ConcurrentLinkedQueue<a> concurrentLinkedQueue2 = f3201d;
            M.append(concurrentLinkedQueue2.size());
            M.append(' ');
            M.append(jSONObject);
            com.bytedance.android.input.r.j.i("AsrPathTrack", M.toString());
            IAppLog.a.t("input_voiceinput_start_time", jSONObject);
            concurrentLinkedQueue2.clear();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final void b(String str) {
        kotlin.s.c.l.f(str, "msg");
        int i = com.bytedance.android.input.basic.d.b.b;
        long currentTimeMillis = System.currentTimeMillis();
        switch (str.hashCode()) {
            case -1738647223:
                if (str.equals("[Android][asr][recorder] valid voice data")) {
                    f3201d.offer(new a("have_data", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case -1125716324:
                if (str.equals("[c++][asr] long press")) {
                    f3201d.offer(new a("long_press", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 156519613:
                if (str.equals("[Android][asr][recorder] audioRecord create end")) {
                    f3201d.offer(new a("create_record", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 488227037:
                if (str.equals("[c++][asr] click down space")) {
                    com.bytedance.android.input.basic.d.a.a(RunnableC0616k.a);
                    b = "space";
                    f3200c = currentTimeMillis;
                    break;
                }
                break;
            case 502733685:
                if (str.equals("[c++][asr] click down associate")) {
                    com.bytedance.android.input.basic.d.a.a(RunnableC0616k.a);
                    b = "associate";
                    f3200c = currentTimeMillis;
                    break;
                }
                break;
            case 1215278781:
                if (str.equals("[Android][asr][process] sdk callback create handle")) {
                    f3201d.offer(new a("create_handle", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 1556293543:
                if (str.equals("[Android][asr][process] first word back")) {
                    f3201d.offer(new a("first_word", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 1703353877:
                if (str.equals("[Android][asr][recorder] first voice data")) {
                    f3201d.offer(new a("first_data", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 1756645343:
                if (str.equals("[Android][asr][recorder] init start")) {
                    f3201d.offer(new a("recorder_init_start", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 1906819474:
                if (str.equals("[c++][asr] click down toolbar")) {
                    com.bytedance.android.input.basic.d.a.a(RunnableC0616k.a);
                    b = "toolbar";
                    f3200c = currentTimeMillis;
                    break;
                }
                break;
            case 1906819914:
                if (str.equals("[c++][asr] click down toolbox")) {
                    com.bytedance.android.input.basic.d.a.a(RunnableC0616k.a);
                    b = "toolbox";
                    f3200c = currentTimeMillis;
                    break;
                }
                break;
            case 2134148727:
                if (str.equals("[Android][asr][recorder] startRecording end")) {
                    f3201d.offer(new a("start_record", currentTimeMillis - f3200c));
                    break;
                }
                break;
            case 2144666010:
                if (str.equals("[Android][asr][ui] view visible")) {
                    f3201d.offer(new a("view_visible", currentTimeMillis - f3200c));
                    break;
                }
                break;
        }
        if (d.a.b.a.h(IAppGlobals.a)) {
            String str2 = "[time:" + currentTimeMillis + "]" + str;
            kotlin.s.c.l.e(str2, "StringBuilder().apply(builderAction).toString()");
            Log.d("AsrPathTrack", str2);
        }
    }
}
