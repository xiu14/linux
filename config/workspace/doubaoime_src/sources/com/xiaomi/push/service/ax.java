package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class ax {
    private static ax a;

    /* renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, HashMap<String, b>> f1051a = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private List<a> f1050a = new ArrayList();

    public interface a {
        void a();
    }

    public static class b {

        /* renamed from: a, reason: collision with other field name */
        public Context f1052a;

        /* renamed from: a, reason: collision with other field name */
        Messenger f1054a;

        /* renamed from: a, reason: collision with other field name */
        private XMPushService f1056a;

        /* renamed from: a, reason: collision with other field name */
        public i f1059a;

        /* renamed from: a, reason: collision with other field name */
        public String f1060a;

        /* renamed from: a, reason: collision with other field name */
        public boolean f1062a;

        /* renamed from: b, reason: collision with other field name */
        public String f1063b;

        /* renamed from: c, reason: collision with root package name */
        public String f9318c;

        /* renamed from: d, reason: collision with root package name */
        public String f9319d;

        /* renamed from: e, reason: collision with root package name */
        public String f9320e;

        /* renamed from: f, reason: collision with root package name */
        public String f9321f;

        /* renamed from: g, reason: collision with root package name */
        public String f9322g;
        public String h;
        public String i;

        /* renamed from: a, reason: collision with other field name */
        c f1058a = c.unbind;
        private int a = 0;

        /* renamed from: a, reason: collision with other field name */
        private final CopyOnWriteArrayList<a> f1061a = new CopyOnWriteArrayList<>();
        c b = null;

        /* renamed from: b, reason: collision with other field name */
        private boolean f1064b = false;

        /* renamed from: a, reason: collision with other field name */
        private XMPushService.c f1055a = new XMPushService.c(this);

        /* renamed from: a, reason: collision with other field name */
        IBinder.DeathRecipient f1053a = null;

        /* renamed from: a, reason: collision with other field name */
        final C0414b f1057a = new C0414b();

        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        class c implements IBinder.DeathRecipient {
            final Messenger a;

            /* renamed from: a, reason: collision with other field name */
            final b f1067a;

            c(b bVar, Messenger messenger) {
                this.f1067a = bVar;
                this.a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                StringBuilder M = e.a.a.a.a.M("peer died, chid = ");
                M.append(this.f1067a.f9322g);
                com.xiaomi.channel.commonutils.logger.c.b(M.toString());
                int i = 0;
                b.this.f1056a.a(new XMPushService.j(i) { // from class: com.xiaomi.push.service.ax.b.c.1
                    @Override // com.xiaomi.push.service.XMPushService.j
                    public String a() {
                        return "clear peer job";
                    }

                    @Override // com.xiaomi.push.service.XMPushService.j
                    /* renamed from: a */
                    public void mo403a() {
                        c cVar = c.this;
                        if (cVar.a == cVar.f1067a.f1054a) {
                            StringBuilder M2 = e.a.a.a.a.M("clean peer, chid = ");
                            M2.append(c.this.f1067a.f9322g);
                            com.xiaomi.channel.commonutils.logger.c.b(M2.toString());
                            c.this.f1067a.f1054a = null;
                        }
                    }
                }, 0L);
                if ("9".equals(this.f1067a.f9322g) && "com.xiaomi.xmsf".equals(b.this.f1056a.getPackageName())) {
                    b.this.f1056a.a(new XMPushService.j(i) { // from class: com.xiaomi.push.service.ax.b.c.2
                        @Override // com.xiaomi.push.service.XMPushService.j
                        public String a() {
                            return "check peer job";
                        }

                        @Override // com.xiaomi.push.service.XMPushService.j
                        /* renamed from: a */
                        public void mo403a() {
                            ax a = ax.a();
                            b bVar = c.this.f1067a;
                            if (a.a(bVar.f9322g, bVar.f1063b).f1054a == null) {
                                XMPushService xMPushService = b.this.f1056a;
                                b bVar2 = c.this.f1067a;
                                xMPushService.a(bVar2.f9322g, bVar2.f1063b, 2, null, null);
                            }
                        }
                    }, com.heytap.mcssdk.constant.a.f6886d);
                }
            }
        }

        public b() {
        }

        private boolean b(int i, int i2, String str) {
            if (i == 1) {
                return (this.f1058a == c.binded || !this.f1056a.m698c() || i2 == 21 || (i2 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i == 2) {
                return this.f1056a.m698c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        public String a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? "unknown" : "KICK" : "CLOSE" : "OPEN";
        }

        /* renamed from: com.xiaomi.push.service.ax$b$b, reason: collision with other inner class name */
        class C0414b extends XMPushService.j {
            int b;

            /* renamed from: b, reason: collision with other field name */
            String f1065b;

            /* renamed from: c, reason: collision with root package name */
            int f9323c;

            /* renamed from: c, reason: collision with other field name */
            String f1066c;

            public C0414b() {
                super(0);
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                if (b.this.a(this.b, this.f9323c, this.f1066c)) {
                    b.this.a(this.b, this.f9323c, this.f1065b, this.f1066c);
                    return;
                }
                StringBuilder M = e.a.a.a.a.M(" ignore notify client :");
                M.append(b.this.f9322g);
                com.xiaomi.channel.commonutils.logger.c.b(M.toString());
            }

            public XMPushService.j a(int i, int i2, String str, String str2) {
                this.b = i;
                this.f9323c = i2;
                this.f1066c = str2;
                this.f1065b = str;
                return this;
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        void m773a() {
            try {
                Messenger messenger = this.f1054a;
                if (messenger != null && this.f1053a != null) {
                    messenger.getBinder().unlinkToDeath(this.f1053a, 0);
                }
            } catch (Exception unused) {
            }
            this.b = null;
        }

        public void b(a aVar) {
            this.f1061a.remove(aVar);
        }

        void a(Messenger messenger) {
            m773a();
            try {
                if (messenger != null) {
                    this.f1054a = messenger;
                    this.f1064b = true;
                    this.f1053a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f1053a, 0);
                } else {
                    com.xiaomi.channel.commonutils.logger.c.b("peer linked with old sdk chid = " + this.f9322g);
                }
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("peer linkToDeath err: ");
                M.append(e2.getMessage());
                com.xiaomi.channel.commonutils.logger.c.b(M.toString());
                this.f1054a = null;
                this.f1064b = false;
            }
        }

        public b(XMPushService xMPushService) {
            this.f1056a = xMPushService;
            a(new a() { // from class: com.xiaomi.push.service.ax.b.1
                @Override // com.xiaomi.push.service.ax.b.a
                public void a(c cVar, c cVar2, int i) {
                    if (cVar2 == c.binding) {
                        b.this.f1056a.a(b.this.f1055a, com.heytap.mcssdk.constant.a.f6886d);
                    } else {
                        b.this.f1056a.b(b.this.f1055a);
                    }
                }
            });
        }

        public void a(c cVar, int i, int i2, String str, String str2) {
            boolean z;
            Iterator<a> it2 = this.f1061a.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                if (next != null) {
                    next.a(this.f1058a, cVar, i2);
                }
            }
            c cVar2 = this.f1058a;
            int i3 = 0;
            if (cVar2 != cVar) {
                com.xiaomi.channel.commonutils.logger.c.m15a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, a(i), ay.a(i2), str, str2, this.f9322g));
                this.f1058a = cVar;
            }
            if (this.f1059a == null) {
                com.xiaomi.channel.commonutils.logger.c.d("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar == c.binding) {
                return;
            }
            if (this.b != null && (z = this.f1064b)) {
                i3 = (this.f1054a == null || !z) ? 10100 : 1000;
            }
            this.f1056a.b(this.f1057a);
            if (b(i, i2, str2)) {
                a(i, i2, str, str2);
            } else {
                this.f1056a.a(this.f1057a.a(i, i2, str, str2), i3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2, String str, String str2) {
            c cVar = this.f1058a;
            this.b = cVar;
            if (i == 2) {
                this.f1059a.a(this.f1052a, this, i2);
                return;
            }
            if (i == 3) {
                this.f1059a.a(this.f1052a, this, str2, str);
                return;
            }
            if (i == 1) {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.a++;
                } else if (z) {
                    this.a = 0;
                    if (this.f1054a != null) {
                        try {
                            this.f1054a.send(Message.obtain(null, 16, this.f1056a.f954a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f1059a.a(this.f1056a, this, z, i2, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(int i, int i2, String str) {
            boolean z;
            c cVar = this.b;
            if (cVar == null || !(z = this.f1064b)) {
                return true;
            }
            if (cVar == this.f1058a) {
                StringBuilder M = e.a.a.a.a.M(" status recovered, don't notify client:");
                M.append(this.f9322g);
                com.xiaomi.channel.commonutils.logger.c.b(M.toString());
                return false;
            }
            if (this.f1054a != null && z) {
                StringBuilder M2 = e.a.a.a.a.M("Peer alive notify status to client:");
                M2.append(this.f9322g);
                com.xiaomi.channel.commonutils.logger.c.b(M2.toString());
                return true;
            }
            StringBuilder M3 = e.a.a.a.a.M("peer died, ignore notify ");
            M3.append(this.f9322g);
            com.xiaomi.channel.commonutils.logger.c.b(M3.toString());
            return false;
        }

        public void a(a aVar) {
            this.f1061a.add(aVar);
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((this.a + 1) * 15)) * 1000;
        }

        public static String a(String str) {
            int lastIndexOf;
            return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(lastIndexOf + 1);
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m774a() {
            return "5".equals(this.f9322g);
        }
    }

    public enum c {
        unbind,
        binding,
        binded
    }

    private ax() {
    }

    public static synchronized ax a() {
        ax axVar;
        synchronized (ax.class) {
            if (a == null) {
                a = new ax();
            }
            axVar = a;
        }
        return axVar;
    }

    public synchronized void b() {
        this.f1050a.clear();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m771a(String str) {
        b next;
        Collection<b> m766a = a().m766a(str);
        return (m766a == null || m766a.isEmpty() || (next = m766a.iterator().next()) == null || next.f1058a != c.binded) ? false : true;
    }

    public synchronized void a(b bVar) {
        HashMap<String, b> hashMap = this.f1051a.get(bVar.f9322g);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f1051a.put(bVar.f9322g, hashMap);
        }
        hashMap.put(a(bVar.f1063b), bVar);
        com.xiaomi.channel.commonutils.logger.c.m15a("add active client. " + bVar.f1060a);
        Iterator<a> it2 = this.f1050a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m770a(String str, String str2) {
        HashMap<String, b> hashMap = this.f1051a.get(str);
        if (hashMap != null) {
            b bVar = hashMap.get(a(str2));
            if (bVar != null) {
                bVar.m773a();
            }
            hashMap.remove(a(str2));
            if (hashMap.isEmpty()) {
                this.f1051a.remove(str);
            }
        }
        Iterator<a> it2 = this.f1050a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m769a(String str) {
        HashMap<String, b> hashMap = this.f1051a.get(str);
        if (hashMap != null) {
            Iterator<b> it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().m773a();
            }
            hashMap.clear();
            this.f1051a.remove(str);
        }
        Iterator<a> it3 = this.f1050a.iterator();
        while (it3.hasNext()) {
            it3.next().a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized List<String> m767a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it2 = this.f1051a.values().iterator();
        while (it2.hasNext()) {
            for (b bVar : it2.next().values()) {
                if (str.equals(bVar.f1060a)) {
                    arrayList.add(bVar.f9322g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<b> m765a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it2 = this.f1051a.values().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().values());
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Collection<b> m766a(String str) {
        if (!this.f1051a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f1051a.get(str).clone()).values();
    }

    public synchronized b a(String str, String str2) {
        HashMap<String, b> hashMap = this.f1051a.get(str);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(a(str2));
    }

    public synchronized void a(Context context, int i) {
        Iterator<HashMap<String, b>> it2 = this.f1051a.values().iterator();
        while (it2.hasNext()) {
            Iterator<b> it3 = it2.next().values().iterator();
            while (it3.hasNext()) {
                it3.next().a(c.unbind, 2, i, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized int m764a() {
        return this.f1051a.size();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m768a() {
        Iterator<b> it2 = m765a().iterator();
        while (it2.hasNext()) {
            it2.next().m773a();
        }
        this.f1051a.clear();
    }

    public synchronized void a(Context context) {
        Iterator<HashMap<String, b>> it2 = this.f1051a.values().iterator();
        while (it2.hasNext()) {
            Iterator<b> it3 = it2.next().values().iterator();
            while (it3.hasNext()) {
                it3.next().a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    public synchronized void a(a aVar) {
        this.f1050a.add(aVar);
    }
}
