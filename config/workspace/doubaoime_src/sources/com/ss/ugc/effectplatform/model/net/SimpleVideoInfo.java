package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class SimpleVideoInfo {
    public List<String> cover_url_list;
    public String id;
    public List<String> playaddr_url_list;

    public SimpleVideoInfo() {
        this(null, null, null, 7, null);
    }

    public SimpleVideoInfo(List<String> list, List<String> list2, String str) {
        this.cover_url_list = list;
        this.playaddr_url_list = list2;
        this.id = str;
    }

    public /* synthetic */ SimpleVideoInfo(List list, List list2, String str, int i, g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
