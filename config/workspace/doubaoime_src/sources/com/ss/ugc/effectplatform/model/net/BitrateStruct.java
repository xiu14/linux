package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class BitrateStruct {
    public Integer Bitrate;
    public String CodecType;
    public Long FPS;
    public String GearName;
    public String HdrBit;
    public String HdrType;
    public UrlStruct PlayAddr;
    public UrlStruct PlayAddrByteVC1;
    public UrlStruct PlayAddrH265;
    public Integer QualityType;

    public BitrateStruct() {
        this(null, null, null, null, null, null, null, null, null, null, DownloadErrorCode.ERROR_IO, null);
    }

    public BitrateStruct(String str, Integer num, Integer num2, UrlStruct urlStruct, UrlStruct urlStruct2, String str2, UrlStruct urlStruct3, String str3, String str4, Long l) {
        this.GearName = str;
        this.Bitrate = num;
        this.QualityType = num2;
        this.PlayAddr = urlStruct;
        this.PlayAddrH265 = urlStruct2;
        this.CodecType = str2;
        this.PlayAddrByteVC1 = urlStruct3;
        this.HdrType = str3;
        this.HdrBit = str4;
        this.FPS = l;
    }

    public /* synthetic */ BitrateStruct(String str, Integer num, Integer num2, UrlStruct urlStruct, UrlStruct urlStruct2, String str2, UrlStruct urlStruct3, String str3, String str4, Long l, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : urlStruct, (i & 16) != 0 ? null : urlStruct2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : urlStruct3, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? l : null);
    }
}
