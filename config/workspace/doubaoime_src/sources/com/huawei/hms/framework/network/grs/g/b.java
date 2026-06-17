package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class b {
    private final Context a;
    private final GrsBaseInfo b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f7296c;

    public b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo) {
        this.a = context;
        this.b = grsBaseInfo;
        this.f7296c = aVar;
    }

    public String a(boolean z) {
        String str = com.huawei.hms.framework.network.grs.a.a(this.f7296c.a().a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
        Logger.i("GeoipCountry", "geoIpCountry is: " + str);
        String a = this.f7296c.a().a("geoipCountryCodetime", "0");
        long j = 0;
        if (!TextUtils.isEmpty(a) && a.matches("\\d+")) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e2) {
                Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e2);
            }
        }
        if (TextUtils.isEmpty(str) || com.huawei.hms.framework.network.grs.h.e.a(Long.valueOf(j))) {
            com.huawei.hms.framework.network.grs.g.j.c cVar = new com.huawei.hms.framework.network.grs.g.j.c(this.b, this.a);
            cVar.a("geoip.countrycode");
            com.huawei.hms.framework.network.grs.e.c c2 = this.f7296c.c();
            if (c2 != null) {
                String str2 = null;
                try {
                    str2 = h.a(c2.a("services", ""), cVar.c());
                } catch (JSONException e3) {
                    Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e3.getMessage()));
                }
                if (!TextUtils.isEmpty(str2)) {
                    c2.b("services", str2);
                }
            }
            if (z) {
                d a2 = this.f7296c.b().a(cVar, "geoip.countrycode", c2, -1);
                if (a2 != null) {
                    str = com.huawei.hms.framework.network.grs.a.a(a2.j(), "geoip.countrycode").get("ROOT");
                }
                Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + str);
            } else {
                Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                this.f7296c.b().a(cVar, null, "geoip.countrycode", c2, -1);
            }
        }
        return str;
    }
}
