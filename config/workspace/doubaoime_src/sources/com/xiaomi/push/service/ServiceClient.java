package com.xiaomi.push.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.fi;
import com.xiaomi.push.ha;
import com.xiaomi.push.hb;
import com.xiaomi.push.hc;
import com.xiaomi.push.hf;
import com.xiaomi.push.hm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class ServiceClient {
    private static ServiceClient a;

    /* renamed from: a, reason: collision with other field name */
    private static String f936a;
    private static String b = hm.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: a, reason: collision with other field name */
    private Context f938a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f942a;

    /* renamed from: b, reason: collision with other field name */
    private Messenger f943b;

    /* renamed from: a, reason: collision with other field name */
    private Messenger f939a = null;

    /* renamed from: a, reason: collision with other field name */
    private final BroadcastReceiver f937a = new BroadcastReceiver() { // from class: com.xiaomi.push.service.ServiceClient.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.push.ax.m115a();
        }
    };

    /* renamed from: a, reason: collision with other field name */
    private AtomicInteger f941a = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    private List<Message> f940a = new ArrayList();

    /* renamed from: b, reason: collision with other field name */
    private boolean f944b = false;

    private ServiceClient(Context context) {
        this.f942a = false;
        Context applicationContext = context.getApplicationContext();
        this.f938a = applicationContext;
        com.xiaomi.push.t.a(applicationContext);
        a(this.f938a);
        if (m673a()) {
            com.xiaomi.channel.commonutils.logger.c.c("use miui push service");
            this.f942a = true;
        }
    }

    private void b() {
        this.f938a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f938a, (Class<?>) XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (a == null) {
            a = new ServiceClient(context);
        }
        return a;
    }

    public static String getSession() {
        return f936a;
    }

    public static void setSession(String str) {
        f936a = str;
    }

    public boolean batchSendMessage(hc[] hcVarArr, boolean z) {
        if (!com.xiaomi.push.ax.m117a(this.f938a)) {
            return false;
        }
        Intent a2 = a();
        int length = hcVarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < hcVarArr.length; i++) {
            String a3 = fi.a();
            if (!TextUtils.isEmpty(a3)) {
                ha haVar = new ha("pf", null, null, null);
                ha haVar2 = new ha("sent", null, null, null);
                haVar2.m467a(a3);
                haVar.a(haVar2);
                hcVarArr[i].a(haVar);
            }
            StringBuilder M = e.a.a.a.a.M("SEND:");
            M.append(hcVarArr[i].mo469a());
            com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            bundleArr[i] = hcVarArr[i].a();
        }
        if (length <= 0) {
            return false;
        }
        a2.setAction(ay.f9330g);
        a2.putExtra(ay.M, f936a);
        a2.putExtra("ext_packets", bundleArr);
        a2.putExtra("ext_encrypt", z);
        return startServiceSafely(a2);
    }

    public void checkAlive() {
        Intent a2 = a();
        a2.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(a2);
    }

    public boolean closeChannel() {
        Intent a2 = a();
        a2.setAction(ay.i);
        return startServiceSafely(a2);
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, List<g.a.b.b> list, List<g.a.b.b> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z, a(list), a(list2));
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f942a;
    }

    public boolean notifyMessage(Bundle bundle, String str, String str2) {
        if (bundle == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("Failed to notify message: bundle|userId|chid may be empty");
            return false;
        }
        Intent a2 = a();
        a2.setAction(ay.o);
        a2.putExtras(bundle);
        com.xiaomi.channel.commonutils.logger.c.e("notify: chid=" + str2 + " bundle:" + bundle);
        return startServiceSafely(a2);
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z, List<g.a.b.b> list, List<g.a.b.b> list2) {
        return openChannel(str, str2, str3, str4, str5, a(list), a(list2), z);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, List<g.a.b.b> list, List<g.a.b.b> list2) {
        resetConnection(str, str2, str3, str4, str5, z, a(list), a(list2));
    }

    public boolean sendIQ(hb hbVar) {
        if (!com.xiaomi.push.ax.m117a(this.f938a)) {
            return false;
        }
        Intent a2 = a();
        Bundle a3 = hbVar.a();
        if (a3 == null) {
            return false;
        }
        StringBuilder M = e.a.a.a.a.M("SEND:");
        M.append(hbVar.mo469a());
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        a2.setAction(ay.f9329f);
        a2.putExtra(ay.M, f936a);
        a2.putExtra("ext_packet", a3);
        return startServiceSafely(a2);
    }

    public boolean sendMessage(hc hcVar, boolean z) {
        if (!com.xiaomi.push.ax.m117a(this.f938a)) {
            return false;
        }
        Intent a2 = a();
        String a3 = fi.a();
        if (!TextUtils.isEmpty(a3)) {
            ha haVar = new ha("pf", null, null, null);
            ha haVar2 = new ha("sent", null, null, null);
            haVar2.m467a(a3);
            haVar.a(haVar2);
            hcVar.a(haVar);
        }
        Bundle a4 = hcVar.a();
        if (a4 == null) {
            return false;
        }
        StringBuilder M = e.a.a.a.a.M("SEND:");
        M.append(hcVar.mo469a());
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        a2.setAction(ay.f9328e);
        a2.putExtra(ay.M, f936a);
        a2.putExtra("ext_packet", a4);
        a2.putExtra("ext_encrypt", z);
        return startServiceSafely(a2);
    }

    public boolean sendPresence(hf hfVar) {
        if (!com.xiaomi.push.ax.m117a(this.f938a)) {
            return false;
        }
        Intent a2 = a();
        Bundle a3 = hfVar.a();
        if (a3 == null) {
            return false;
        }
        StringBuilder M = e.a.a.a.a.M("SEND:");
        M.append(hfVar.mo469a());
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        a2.setAction(ay.h);
        a2.putExtra(ay.M, f936a);
        a2.putExtra("ext_packet", a3);
        return startServiceSafely(a2);
    }

    public void setMessenger(Messenger messenger) {
        this.f939a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (com.xiaomi.push.k.m654a()) {
                this.f938a.startService(intent);
                return true;
            }
            m672a(intent);
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return false;
        }
    }

    @Deprecated
    public void updateChannelInfo(String str, List<g.a.b.b> list, List<g.a.b.b> list2) {
        updateChannelInfo(str, a(list), a(list2));
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent a2 = a();
        a2.setAction(ay.j);
        a(a2, str, str2, str3, str4, str5, z, map, map2);
        return startServiceSafely(a2);
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z) {
        Intent a2 = a();
        a2.setAction(ay.f9327d);
        a(a2, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(a2);
        return 0;
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent a2 = a();
        a2.setAction(ay.k);
        a(a2, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(a2);
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent a2 = a();
        a2.setAction(ay.l);
        if (map != null) {
            String a3 = a(map);
            if (!TextUtils.isEmpty(a3)) {
                a2.putExtra(ay.G, a3);
            }
        }
        if (map2 != null) {
            String a4 = a(map2);
            if (!TextUtils.isEmpty(a4)) {
                a2.putExtra(ay.H, a4);
            }
        }
        a2.putExtra(ay.y, str);
        startServiceSafely(a2);
    }

    public boolean closeChannel(String str) {
        Intent a2 = a();
        a2.setAction(ay.i);
        a2.putExtra(ay.y, str);
        return startServiceSafely(a2);
    }

    private void a(Context context) {
        try {
            com.xiaomi.push.ax.m111a(context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("add network status listener failed:" + th);
        }
    }

    private Map<String, String> a(List<g.a.b.b> list) {
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (g.a.b.b bVar : list) {
                if (bVar != null) {
                    hashMap.put(bVar.getName(), bVar.getValue());
                }
            }
        }
        return hashMap;
    }

    public boolean closeChannel(String str, String str2) {
        Intent a2 = a();
        a2.setAction(ay.i);
        a2.putExtra(ay.y, str);
        a2.putExtra(ay.v, str2);
        return startServiceSafely(a2);
    }

    private void a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(ay.v, str);
        intent.putExtra(ay.y, str2);
        intent.putExtra(ay.C, str3);
        intent.putExtra(ay.E, str5);
        intent.putExtra(ay.D, str4);
        intent.putExtra(ay.F, z);
        intent.putExtra(ay.M, f936a);
        intent.putExtra(ay.Q, this.f939a);
        if (map != null && map.size() > 0) {
            String a2 = a(map);
            if (!TextUtils.isEmpty(a2)) {
                intent.putExtra(ay.G, a2);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String a3 = a(map2);
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        intent.putExtra(ay.H, a3);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        return sendMessage(bArr, str, str2, "");
    }

    public boolean sendMessage(byte[] bArr, String str, String str2, String str3) {
        String str4;
        if (com.xiaomi.push.ax.m117a(this.f938a) && bArr != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent a2 = a();
            a2.setAction(ay.f9328e);
            a2.putExtra(ay.M, f936a);
            a2.putExtra("ext_raw_packet", bArr);
            int indexOf = str.indexOf("@");
            String str5 = null;
            String substring = indexOf != -1 ? str.substring(0, indexOf) : null;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                str5 = str.substring(indexOf + 1, lastIndexOf);
                str4 = str.substring(lastIndexOf + 1);
            } else {
                str4 = null;
            }
            a2.putExtra(ay.v, substring);
            a2.putExtra(ay.w, str5);
            a2.putExtra(ay.x, str4);
            if (TextUtils.isEmpty(str3)) {
                str3 = b + this.f941a.incrementAndGet();
            }
            a2.putExtra("ext_pkt_id", str3);
            a2.putExtra("ext_chid", str2);
            com.xiaomi.channel.commonutils.logger.c.e("SEND: chid=" + str2 + ", packetId=" + str3);
            return startServiceSafely(a2);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
        return false;
    }

    private String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(entry.getValue());
            if (i < map.size()) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m673a() {
        if (com.xiaomi.push.z.f1182a) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f938a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private String m669a() {
        try {
            return this.f938a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private Intent a() {
        if (isMiuiPushServiceEnabled()) {
            Intent intent = new Intent();
            intent.setPackage("com.xiaomi.xmsf");
            intent.setClassName("com.xiaomi.xmsf", m669a());
            intent.putExtra(ay.I, this.f938a.getPackageName());
            m671a();
            return intent;
        }
        Intent intent2 = new Intent(this.f938a, (Class<?>) XMPushService.class);
        intent2.putExtra(ay.I, this.f938a.getPackageName());
        b();
        return intent2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m671a() {
        this.f938a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f938a, (Class<?>) XMPushService.class), 2, 1);
    }

    /* renamed from: a, reason: collision with other method in class */
    private synchronized void m672a(Intent intent) {
        if (this.f944b) {
            Message a2 = a(intent);
            if (this.f940a.size() >= 50) {
                this.f940a.remove(0);
            }
            this.f940a.add(a2);
            return;
        }
        if (this.f943b == null) {
            this.f938a.bindService(intent, new ServiceConnection() { // from class: com.xiaomi.push.service.ServiceClient.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    synchronized (ServiceClient.this) {
                        ServiceClient.this.f943b = new Messenger(iBinder);
                        ServiceClient.this.f944b = false;
                        Iterator it2 = ServiceClient.this.f940a.iterator();
                        while (it2.hasNext()) {
                            try {
                                ServiceClient.this.f943b.send((Message) it2.next());
                            } catch (RemoteException e2) {
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                            }
                        }
                        ServiceClient.this.f940a.clear();
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    ServiceClient.this.f943b = null;
                    ServiceClient.this.f944b = false;
                }
            }, 1);
            this.f944b = true;
            this.f940a.clear();
            this.f940a.add(a(intent));
        } else {
            try {
                this.f943b.send(a(intent));
            } catch (RemoteException unused) {
                this.f943b = null;
                this.f944b = false;
            }
        }
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }
}
