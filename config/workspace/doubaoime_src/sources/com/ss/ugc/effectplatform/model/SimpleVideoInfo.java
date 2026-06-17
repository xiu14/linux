package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class SimpleVideoInfo {
    public List<String> cover_url_list;
    public String group_id;
    public String id;

    public SimpleVideoInfo() {
        this(null, null, null, 7, null);
    }

    public SimpleVideoInfo(List<String> list, String str, String str2) {
        this.cover_url_list = list;
        this.id = str;
        this.group_id = str2;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SimpleVideoInfo(cover_url_list=");
        M.append(this.cover_url_list);
        M.append(", id=");
        M.append(this.id);
        M.append(", group_id=");
        return e.a.a.a.a.G(M, this.group_id, ')');
    }

    public /* synthetic */ SimpleVideoInfo(List list, String str, String str2, int i, g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
