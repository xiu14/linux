package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class UrlStruct {
    public Long DataSize;
    public String FileCs;
    public String FileHash;
    public Integer Height;
    public String PlayerAccessKey;
    public String Uri;
    public String UrlKey;
    public List<String> UrlList;
    public Integer Width;

    public UrlStruct() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public UrlStruct(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.Uri = str;
        this.UrlList = list;
        this.DataSize = l;
        this.Width = num;
        this.Height = num2;
        this.UrlKey = str2;
        this.FileHash = str3;
        this.FileCs = str4;
        this.PlayerAccessKey = str5;
    }

    public /* synthetic */ UrlStruct(String str, List list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
