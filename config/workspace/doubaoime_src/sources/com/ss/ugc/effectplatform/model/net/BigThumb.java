package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class BigThumb {
    public Double Duration;
    public String Fext;
    public Long ImgNum;
    public String ImgURI;
    public String ImgURL;
    public Long ImgXLen;
    public Long ImgXSize;
    public Long ImgYLen;
    public Long ImgYSize;
    public Double Interval;

    public BigThumb() {
        this(null, null, null, null, null, null, null, null, null, null, DownloadErrorCode.ERROR_IO, null);
    }

    public BigThumb(Long l, String str, String str2, Long l2, Long l3, Long l4, Long l5, Double d2, String str3, Double d3) {
        this.ImgNum = l;
        this.ImgURI = str;
        this.ImgURL = str2;
        this.ImgXSize = l2;
        this.ImgYSize = l3;
        this.ImgXLen = l4;
        this.ImgYLen = l5;
        this.Duration = d2;
        this.Fext = str3;
        this.Interval = d3;
    }

    public /* synthetic */ BigThumb(Long l, String str, String str2, Long l2, Long l3, Long l4, Long l5, Double d2, String str3, Double d3, int i, g gVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) != 0 ? null : l5, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : str3, (i & 512) == 0 ? d3 : null);
    }
}
