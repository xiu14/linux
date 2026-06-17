package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class StickerUrlStruct {
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public Integer height;
    public String player_access_key;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public Integer width;

    public StickerUrlStruct() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public StickerUrlStruct(String str, List<String> list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5) {
        this.uri = str;
        this.url_list = list;
        this.data_size = l;
        this.width = num;
        this.height = num2;
        this.url_key = str2;
        this.file_hash = str3;
        this.file_cs = str4;
        this.player_access_key = str5;
    }

    public /* synthetic */ StickerUrlStruct(String str, List list, Long l, Integer num, Integer num2, String str2, String str3, String str4, String str5, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
