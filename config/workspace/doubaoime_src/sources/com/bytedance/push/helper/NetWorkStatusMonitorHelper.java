package com.bytedance.push.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.push.g0.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class NetWorkStatusMonitorHelper extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    private static volatile NetWorkStatusMonitorHelper f5718c;
    private String a = "";
    private final Set<a> b = new HashSet();

    public interface a {
        void a(String str, String str2);
    }

    private NetWorkStatusMonitorHelper() {
    }

    public static NetWorkStatusMonitorHelper b() {
        if (f5718c == null) {
            synchronized (NetWorkStatusMonitorHelper.class) {
                if (f5718c == null) {
                    f5718c = new NetWorkStatusMonitorHelper();
                }
            }
        }
        return f5718c;
    }

    private void d() {
        f.g("NetWorkStatusMonitorHelper", "[register]");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.ss.android.message.a.a().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            this.a = activeNetworkInfo.getTypeName();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        com.ss.android.message.a.a().registerReceiver(this, intentFilter);
        f.g("NetWorkStatusMonitorHelper", "[register]finished register,mLastNetWorkStatus:" + this.a);
    }

    public void a(a aVar) {
        f.g("NetWorkStatusMonitorHelper", "[addNetworkStatusListener]listener:" + aVar);
        synchronized (this.b) {
            if (this.b.size() == 0) {
                f.g("NetWorkStatusMonitorHelper", "[addNetworkStatusListener]register BroadcastReceiver");
                d();
            }
            this.b.add(aVar);
        }
    }

    public String c() {
        return this.a;
    }

    public void e(a aVar) {
        try {
            synchronized (this.b) {
                this.b.remove(aVar);
                if (this.b.size() == 0) {
                    f.g("NetWorkStatusMonitorHelper", "[addNetworkStatusListener]unregister BroadcastReceiver");
                    f.g("NetWorkStatusMonitorHelper", "[unregister]");
                    try {
                        com.ss.android.message.a.a().unregisterReceiver(this);
                        this.a = "";
                    } catch (Exception e2) {
                        f.f("NetWorkStatusMonitorHelper", "[unregister]unregister failed", e2);
                    }
                }
            }
        } catch (Exception e3) {
            f.f("NetWorkStatusMonitorHelper", "[removeNetworkStatusListener]remove listener failed", e3);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        if (intent != null) {
            String action = intent.getAction();
            f.c("NetWorkStatusMonitorHelper", "[onReceive]action:" + action);
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action) || (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) == null) {
                return;
            }
            if (!networkInfo.isConnected()) {
                StringBuilder M = e.a.a.a.a.M("[onReceive]find network disconnect:");
                M.append(this.a);
                f.g("NetWorkStatusMonitorHelper", M.toString());
                this.a = "";
                return;
            }
            if (TextUtils.equals(networkInfo.getTypeName(), this.a)) {
                return;
            }
            StringBuilder M2 = e.a.a.a.a.M("[onReceive]network status chang to ");
            M2.append(networkInfo.getTypeName());
            f.g("NetWorkStatusMonitorHelper", M2.toString());
            synchronized (this.b) {
                Iterator<a> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.a, networkInfo.getTypeName());
                }
            }
            this.a = networkInfo.getTypeName();
        }
    }
}
