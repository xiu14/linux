package com.ss.ugc.effectplatform.task;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StrategyCacheClearTask$RequestResourceInfo {
    public static final a Companion = new a(null);
    public static final String TYPE_EFFECT = "effect";
    private final String panel;
    private final ArrayList<StrategyCacheClearTask$CacheInfo> resources;
    private final String type;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }
    }

    public StrategyCacheClearTask$RequestResourceInfo(String str, String str2, ArrayList<StrategyCacheClearTask$CacheInfo> arrayList) {
        l.g(str, "type");
        l.g(str2, "panel");
        l.g(arrayList, "resources");
        this.type = str;
        this.panel = str2;
        this.resources = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrategyCacheClearTask$RequestResourceInfo copy$default(StrategyCacheClearTask$RequestResourceInfo strategyCacheClearTask$RequestResourceInfo, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyCacheClearTask$RequestResourceInfo.type;
        }
        if ((i & 2) != 0) {
            str2 = strategyCacheClearTask$RequestResourceInfo.panel;
        }
        if ((i & 4) != 0) {
            arrayList = strategyCacheClearTask$RequestResourceInfo.resources;
        }
        return strategyCacheClearTask$RequestResourceInfo.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.panel;
    }

    public final ArrayList<StrategyCacheClearTask$CacheInfo> component3() {
        return this.resources;
    }

    public final StrategyCacheClearTask$RequestResourceInfo copy(String str, String str2, ArrayList<StrategyCacheClearTask$CacheInfo> arrayList) {
        l.g(str, "type");
        l.g(str2, "panel");
        l.g(arrayList, "resources");
        return new StrategyCacheClearTask$RequestResourceInfo(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyCacheClearTask$RequestResourceInfo)) {
            return false;
        }
        StrategyCacheClearTask$RequestResourceInfo strategyCacheClearTask$RequestResourceInfo = (StrategyCacheClearTask$RequestResourceInfo) obj;
        return l.a(this.type, strategyCacheClearTask$RequestResourceInfo.type) && l.a(this.panel, strategyCacheClearTask$RequestResourceInfo.panel) && l.a(this.resources, strategyCacheClearTask$RequestResourceInfo.resources);
    }

    public final String getPanel() {
        return this.panel;
    }

    public final ArrayList<StrategyCacheClearTask$CacheInfo> getResources() {
        return this.resources;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.panel;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<StrategyCacheClearTask$CacheInfo> arrayList = this.resources;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RequestResourceInfo(type=");
        M.append(this.type);
        M.append(", panel=");
        M.append(this.panel);
        M.append(", resources=");
        M.append(this.resources);
        M.append(")");
        return M.toString();
    }
}
