package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class VideoInfo {
    public UrlStruct AiCover;
    public UrlStruct AnimatedCover;
    public List<BigThumb> BigThumbs;
    public List<BitrateStruct> BitrateInfos;
    public UrlStruct BlurCover;
    public UrlStruct CaptionDownloadAddr;
    public Long CdnUrlExpired;
    public String CodecType;
    public Integer ContentType;
    public VideoControlStruct ControlInfo;
    public UrlStruct Cover;
    public Double CoverTsp;
    public UrlStruct DownloadAddr;
    public UrlStruct DownloadSuffixLogoAddr;
    public Integer Duration;
    public UrlStruct DynamicCover;
    public FakeHorizontalStruct FakeHorizontalInfo;
    public Boolean HasWatermark;
    public Integer Height;
    public Integer HorizontalType;
    public String Id;
    public Boolean IsCallBack;
    public Integer IsLongVideo;
    public Map<String, UrlStruct> MiscDownloadAddrs;
    public String MiscDownloadAddrsStr;
    public Boolean NeedSetToken;
    public UrlStruct NewDownloadAddr;
    public UrlStruct OptimizedCover;
    public UrlStruct OriginCover;
    public UrlStruct PlayAddr;
    public UrlStruct PlayAddrByteVC1;
    public UrlStruct PlayAddrH264;
    public UrlStruct PlayAddrH265;
    public UrlStruct PlayAddrLowbr;
    public String Ratio;
    public UrlStruct ResetCover;
    public Double TrailerStartTime;
    public UrlStruct UIAlikeDownloadAddr;
    public Boolean UseStaticCover;
    public String VideoModel;
    public Integer Width;
    public String meta;

    public VideoInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, DownloadErrorCode.ERROR_IO, null);
    }

    public VideoInfo(String str, Integer num, Integer num2, Integer num3, String str2, Boolean bool, UrlStruct urlStruct, UrlStruct urlStruct2, List<BitrateStruct> list, UrlStruct urlStruct3, UrlStruct urlStruct4, UrlStruct urlStruct5, UrlStruct urlStruct6, UrlStruct urlStruct7, UrlStruct urlStruct8, UrlStruct urlStruct9, UrlStruct urlStruct10, String str3, UrlStruct urlStruct11, UrlStruct urlStruct12, Integer num4, VideoControlStruct videoControlStruct, Long l, Integer num5, String str4, UrlStruct urlStruct13, Boolean bool2, UrlStruct urlStruct14, Double d2, Map<String, UrlStruct> map, Boolean bool3, UrlStruct urlStruct15, List<BigThumb> list2, String str5, Boolean bool4, UrlStruct urlStruct16, Integer num6, FakeHorizontalStruct fakeHorizontalStruct, Double d3, String str6, UrlStruct urlStruct17, UrlStruct urlStruct18) {
        this.Id = str;
        this.Height = num;
        this.Width = num2;
        this.Duration = num3;
        this.Ratio = str2;
        this.HasWatermark = bool;
        this.Cover = urlStruct;
        this.OriginCover = urlStruct2;
        this.BitrateInfos = list;
        this.DynamicCover = urlStruct3;
        this.PlayAddrH264 = urlStruct4;
        this.PlayAddr = urlStruct5;
        this.DownloadAddr = urlStruct6;
        this.PlayAddrLowbr = urlStruct7;
        this.NewDownloadAddr = urlStruct8;
        this.DownloadSuffixLogoAddr = urlStruct9;
        this.PlayAddrH265 = urlStruct10;
        this.CodecType = str3;
        this.UIAlikeDownloadAddr = urlStruct11;
        this.CaptionDownloadAddr = urlStruct12;
        this.ContentType = num4;
        this.ControlInfo = videoControlStruct;
        this.CdnUrlExpired = l;
        this.IsLongVideo = num5;
        this.VideoModel = str4;
        this.AnimatedCover = urlStruct13;
        this.NeedSetToken = bool2;
        this.AiCover = urlStruct14;
        this.CoverTsp = d2;
        this.MiscDownloadAddrs = map;
        this.IsCallBack = bool3;
        this.PlayAddrByteVC1 = urlStruct15;
        this.BigThumbs = list2;
        this.meta = str5;
        this.UseStaticCover = bool4;
        this.OptimizedCover = urlStruct16;
        this.HorizontalType = num6;
        this.FakeHorizontalInfo = fakeHorizontalStruct;
        this.TrailerStartTime = d3;
        this.MiscDownloadAddrsStr = str6;
        this.BlurCover = urlStruct17;
        this.ResetCover = urlStruct18;
    }

    public /* synthetic */ VideoInfo(String str, Integer num, Integer num2, Integer num3, String str2, Boolean bool, UrlStruct urlStruct, UrlStruct urlStruct2, List list, UrlStruct urlStruct3, UrlStruct urlStruct4, UrlStruct urlStruct5, UrlStruct urlStruct6, UrlStruct urlStruct7, UrlStruct urlStruct8, UrlStruct urlStruct9, UrlStruct urlStruct10, String str3, UrlStruct urlStruct11, UrlStruct urlStruct12, Integer num4, VideoControlStruct videoControlStruct, Long l, Integer num5, String str4, UrlStruct urlStruct13, Boolean bool2, UrlStruct urlStruct14, Double d2, Map map, Boolean bool3, UrlStruct urlStruct15, List list2, String str5, Boolean bool4, UrlStruct urlStruct16, Integer num6, FakeHorizontalStruct fakeHorizontalStruct, Double d3, String str6, UrlStruct urlStruct17, UrlStruct urlStruct18, int i, int i2, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : urlStruct, (i & 128) != 0 ? null : urlStruct2, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : urlStruct3, (i & 1024) != 0 ? null : urlStruct4, (i & 2048) != 0 ? null : urlStruct5, (i & 4096) != 0 ? null : urlStruct6, (i & 8192) != 0 ? null : urlStruct7, (i & 16384) != 0 ? null : urlStruct8, (i & 32768) != 0 ? null : urlStruct9, (i & 65536) != 0 ? null : urlStruct10, (i & 131072) != 0 ? null : str3, (i & 262144) != 0 ? null : urlStruct11, (i & 524288) != 0 ? null : urlStruct12, (i & 1048576) != 0 ? null : num4, (i & 2097152) != 0 ? null : videoControlStruct, (i & 4194304) != 0 ? null : l, (i & 8388608) != 0 ? null : num5, (i & 16777216) != 0 ? null : str4, (i & 33554432) != 0 ? null : urlStruct13, (i & 67108864) != 0 ? null : bool2, (i & 134217728) != 0 ? null : urlStruct14, (i & 268435456) != 0 ? null : d2, (i & 536870912) != 0 ? null : map, (i & BasicMeasure.EXACTLY) != 0 ? null : bool3, (i & Integer.MIN_VALUE) != 0 ? null : urlStruct15, (i2 & 1) != 0 ? null : list2, (i2 & 2) != 0 ? null : str5, (i2 & 4) != 0 ? null : bool4, (i2 & 8) != 0 ? null : urlStruct16, (i2 & 16) != 0 ? null : num6, (i2 & 32) != 0 ? null : fakeHorizontalStruct, (i2 & 64) != 0 ? null : d3, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : urlStruct17, (i2 & 512) != 0 ? null : urlStruct18);
    }
}
