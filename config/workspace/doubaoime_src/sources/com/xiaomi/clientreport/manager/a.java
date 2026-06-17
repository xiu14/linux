package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.ah;
import com.xiaomi.push.bm;
import com.xiaomi.push.bt;
import com.xiaomi.push.bu;
import com.xiaomi.push.bv;
import com.xiaomi.push.bw;
import com.xiaomi.push.bx;
import com.xiaomi.push.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class a {
    private static final int a;

    /* renamed from: a, reason: collision with other field name */
    private static volatile a f8a;

    /* renamed from: a, reason: collision with other field name */
    private Context f9a;

    /* renamed from: a, reason: collision with other field name */
    private Config f10a;

    /* renamed from: a, reason: collision with other field name */
    private IEventProcessor f11a;

    /* renamed from: a, reason: collision with other field name */
    private IPerfProcessor f12a;

    /* renamed from: a, reason: collision with other field name */
    private String f13a;

    /* renamed from: a, reason: collision with other field name */
    private ExecutorService f15a = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f14a = new HashMap<>();
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> b = new HashMap<>();

    static {
        a = k.m654a() ? 30 : 10;
    }

    private a(Context context) {
        this.f9a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f11a.b();
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("we: ");
            M.append(e2.getMessage());
            c.d(M.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f12a.b();
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("wp: ");
            M.append(e2.getMessage());
            c.d(M.toString());
        }
    }

    private void f() {
        if (a(this.f9a).m26a().isEventUploadSwitchOpen()) {
            final bt btVar = new bt(this.f9a);
            int eventUploadFrequency = (int) a(this.f9a).m26a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bx.a(this.f9a).a("sp_client_report_status", "event_last_upload_time", 0L) > eventUploadFrequency * 1000) {
                ah.a(this.f9a).a(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        btVar.run();
                    }
                }, 10);
            }
            synchronized (a.class) {
                if (!ah.a(this.f9a).a((ah.a) btVar, eventUploadFrequency)) {
                    ah.a(this.f9a).m96a("100886");
                    ah.a(this.f9a).a((ah.a) btVar, eventUploadFrequency);
                }
            }
        }
    }

    private void g() {
        if (a(this.f9a).m26a().isPerfUploadSwitchOpen()) {
            final bu buVar = new bu(this.f9a);
            int perfUploadFrequency = (int) a(this.f9a).m26a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - bx.a(this.f9a).a("sp_client_report_status", "perf_last_upload_time", 0L) > perfUploadFrequency * 1000) {
                ah.a(this.f9a).a(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.6
                    @Override // java.lang.Runnable
                    public void run() {
                        buVar.run();
                    }
                }, 15);
            }
            synchronized (a.class) {
                if (!ah.a(this.f9a).a((ah.a) buVar, perfUploadFrequency)) {
                    ah.a(this.f9a).m96a("100887");
                    ah.a(this.f9a).a((ah.a) buVar, perfUploadFrequency);
                }
            }
        }
    }

    public void c() {
        if (m26a().isPerfUploadSwitchOpen()) {
            bv bvVar = new bv();
            bvVar.a(this.f12a);
            bvVar.a(this.f9a);
            this.f15a.execute(bvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f11a;
        if (iEventProcessor != null) {
            iEventProcessor.mo29a(eventClientReport);
            if (a() >= 10) {
                d();
                ah.a(this.f9a).m96a("100888");
            } else {
                a(new ah.a() { // from class: com.xiaomi.clientreport.manager.a.3
                    @Override // com.xiaomi.push.ah.a
                    /* renamed from: a */
                    public String mo139a() {
                        return "100888";
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.a() > 0) {
                            a.this.f15a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.d();
                                }
                            });
                        }
                    }
                }, a);
            }
        }
    }

    public static a a(Context context) {
        if (f8a == null) {
            synchronized (a.class) {
                if (f8a == null) {
                    f8a = new a(context);
                }
            }
        }
        return f8a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f12a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo29a(perfClientReport);
            if (b() >= 10) {
                e();
                ah.a(this.f9a).m96a("100889");
            } else {
                a(new ah.a() { // from class: com.xiaomi.clientreport.manager.a.4
                    @Override // com.xiaomi.push.ah.a
                    /* renamed from: a */
                    public String mo139a() {
                        return "100889";
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.b() > 0) {
                            a.this.f15a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.e();
                                }
                            });
                        }
                    }
                }, a);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Config m26a() {
        if (this.f10a == null) {
            this.f10a = Config.defaultConfig(this.f9a);
        }
        return this.f10a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f14a;
        int i = 0;
        if (hashMap != null) {
            Iterator<String> it2 = hashMap.keySet().iterator();
            while (it2.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f14a.get(it2.next());
                if (hashMap2 != null) {
                    Iterator<String> it3 = hashMap2.keySet().iterator();
                    while (it3.hasNext()) {
                        com.xiaomi.clientreport.data.a aVar = hashMap2.get(it3.next());
                        if (aVar instanceof PerfClientReport) {
                            i = (int) (i + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m27a() {
        a(this.f9a).f();
        a(this.f9a).g();
    }

    public void a(String str) {
        this.f13a = str;
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f10a = config;
        this.f11a = iEventProcessor;
        this.f12a = iPerfProcessor;
        iEventProcessor.setEventMap(this.b);
        this.f12a.setPerfMap(this.f14a);
    }

    public void a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f10a;
        if (config != null) {
            if (z == config.isEventUploadSwitchOpen() && z2 == this.f10a.isPerfUploadSwitchOpen() && j == this.f10a.getEventUploadFrequency() && j2 == this.f10a.getPerfUploadFrequency()) {
                return;
            }
            long eventUploadFrequency = this.f10a.getEventUploadFrequency();
            long perfUploadFrequency = this.f10a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(bw.a(this.f9a)).setEventEncrypted(this.f10a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f9a);
            this.f10a = build;
            if (!build.isEventUploadSwitchOpen()) {
                ah.a(this.f9a).m96a("100886");
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                c.c(this.f9a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                f();
            }
            if (!this.f10a.isPerfUploadSwitchOpen()) {
                ah.a(this.f9a).m96a("100887");
                return;
            }
            if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                c.c(this.f9a.getPackageName() + " reset perf job " + build.getPerfUploadFrequency());
                g();
            }
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m28b() {
        if (m26a().isEventUploadSwitchOpen()) {
            bv bvVar = new bv();
            bvVar.a(this.f9a);
            bvVar.a(this.f11a);
            this.f15a.execute(bvVar);
        }
    }

    private void a(ah.a aVar, int i) {
        ah.a(this.f9a).b(aVar, i);
    }

    public void a(final EventClientReport eventClientReport) {
        if (m26a().isEventUploadSwitchOpen()) {
            this.f15a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b(eventClientReport);
                }
            });
        }
    }

    public void a(final PerfClientReport perfClientReport) {
        if (m26a().isPerfUploadSwitchOpen()) {
            this.f15a.execute(new Runnable() { // from class: com.xiaomi.clientreport.manager.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.b(perfClientReport);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.b;
        if (hashMap == null) {
            return 0;
        }
        Iterator<String> it2 = hashMap.keySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.b.get(it2.next());
            i += arrayList != null ? arrayList.size() : 0;
        }
        return i;
    }

    public EventClientReport a(int i, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i;
        eventClientReport.eventId = bm.a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f9a.getPackageName());
        eventClientReport.setSdkVersion(this.f13a);
        return eventClientReport;
    }
}
