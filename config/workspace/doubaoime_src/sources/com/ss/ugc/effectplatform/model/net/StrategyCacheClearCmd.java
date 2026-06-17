package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StrategyCacheClearCmd {
    private final List<String> allow_keys;
    private final List<String> delete_keys;
    private final String panel;
    private final String strategy;
    private final String time_threshold;
    private final String type;

    public StrategyCacheClearCmd() {
        this(null, null, null, null, null, null, 63, null);
    }

    public StrategyCacheClearCmd(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.type = str;
        this.panel = str2;
        this.delete_keys = list;
        this.allow_keys = list2;
        this.strategy = str3;
        this.time_threshold = str4;
    }

    public static /* synthetic */ StrategyCacheClearCmd copy$default(StrategyCacheClearCmd strategyCacheClearCmd, String str, String str2, List list, List list2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyCacheClearCmd.type;
        }
        if ((i & 2) != 0) {
            str2 = strategyCacheClearCmd.panel;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = strategyCacheClearCmd.delete_keys;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = strategyCacheClearCmd.allow_keys;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str3 = strategyCacheClearCmd.strategy;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = strategyCacheClearCmd.time_threshold;
        }
        return strategyCacheClearCmd.copy(str, str5, list3, list4, str6, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.panel;
    }

    public final List<String> component3() {
        return this.delete_keys;
    }

    public final List<String> component4() {
        return this.allow_keys;
    }

    public final String component5() {
        return this.strategy;
    }

    public final String component6() {
        return this.time_threshold;
    }

    public final StrategyCacheClearCmd copy(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        return new StrategyCacheClearCmd(str, str2, list, list2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyCacheClearCmd)) {
            return false;
        }
        StrategyCacheClearCmd strategyCacheClearCmd = (StrategyCacheClearCmd) obj;
        return l.a(this.type, strategyCacheClearCmd.type) && l.a(this.panel, strategyCacheClearCmd.panel) && l.a(this.delete_keys, strategyCacheClearCmd.delete_keys) && l.a(this.allow_keys, strategyCacheClearCmd.allow_keys) && l.a(this.strategy, strategyCacheClearCmd.strategy) && l.a(this.time_threshold, strategyCacheClearCmd.time_threshold);
    }

    public final List<String> getAllow_keys() {
        return this.allow_keys;
    }

    public final List<String> getDelete_keys() {
        return this.delete_keys;
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public final String getTime_threshold() {
        return this.time_threshold;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.panel;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.delete_keys;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.allow_keys;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.strategy;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.time_threshold;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = a.M("StrategyCacheClearCmd(type=");
        M.append(this.type);
        M.append(", panel=");
        M.append(this.panel);
        M.append(", delete_keys=");
        M.append(this.delete_keys);
        M.append(", allow_keys=");
        M.append(this.allow_keys);
        M.append(", strategy=");
        M.append(this.strategy);
        M.append(", time_threshold=");
        return a.J(M, this.time_threshold, ")");
    }

    public /* synthetic */ StrategyCacheClearCmd(String str, String str2, List list, List list2, String str3, String str4, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
