package org.threeten.bp;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class k implements Serializable {
    public static final Map<String, String> a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        a = Collections.unmodifiableMap(hashMap);
    }

    k() {
        if (getClass() != l.class && getClass() != m.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static k f(org.threeten.bp.temporal.b bVar) {
        k kVar = (k) bVar.query(org.threeten.bp.temporal.f.f());
        if (kVar != null) {
            return kVar;
        }
        throw new b("Unable to obtain ZoneId from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return g().equals(((k) obj).g());
        }
        return false;
    }

    public abstract String g();

    public abstract org.threeten.bp.zone.e h();

    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return g();
    }
}
