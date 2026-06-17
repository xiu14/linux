package com.bytedance.bdinstall.n0;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0643x;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.util.g;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressLint({"MissingPermission", "HardwareIds"})
/* loaded from: classes.dex */
public class c extends a {
    private Q a;

    @SuppressLint({"MissingPermission"})
    public List<SubscriptionInfo> a() {
        return SubscriptionManager.from(this.a.q()).getActiveSubscriptionInfoList();
    }

    public WifiInfo b() {
        return ((WifiManager) this.a.q().getApplicationContext().getSystemService("wifi")).getConnectionInfo();
    }

    public String c() {
        return this.a.C().getDeviceId();
    }

    @RequiresApi(api = 26)
    public String d(int i) {
        return this.a.C().getImei(i);
    }

    public String e() {
        if (TextUtils.isEmpty(g.d(this.a.q(), this.a).getString("device_id", ""))) {
            int i = C0640u.a;
            return "";
        }
        try {
            return (String) C0643x.l(new b(this)).get(100L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
            int i2 = C0640u.a;
            return "";
        }
    }

    @RequiresApi(api = 26)
    public String f(int i) {
        return this.a.C().getMeid(i);
    }

    public String g() {
        return this.a.C().getNetworkOperator();
    }

    public String h() {
        return this.a.C().getNetworkOperatorName();
    }

    @SuppressLint({"MissingPermission"})
    public String i() {
        return this.a.q().getApplicationInfo().targetSdkVersion >= 26 ? Build.getSerial() : "";
    }

    public String j() {
        return this.a.C().getSimCountryIso();
    }

    public void k(Q q) {
        this.a = q;
    }
}
