package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class VideoControlStruct {
    public Boolean AllowDownload;
    public Boolean AllowDuet;
    public Boolean AllowDynamicWallpaper;
    public Boolean AllowReact;
    public Boolean AllowStitch;
    public Boolean AllowUseMusic;
    public Integer DownloadSetting;
    public Integer DraftProgressBar;
    public Boolean HideDouplus;
    public Boolean HideDownload;
    public Integer PreventDownloadType;
    public Integer ShareType;
    public Integer ShowProgressBar;
    public Integer TimerStatus;

    public VideoControlStruct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public VideoControlStruct(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool4, Integer num5, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num6) {
        this.AllowDownload = bool;
        this.AllowDuet = bool2;
        this.AllowReact = bool3;
        this.DraftProgressBar = num;
        this.ShareType = num2;
        this.ShowProgressBar = num3;
        this.PreventDownloadType = num4;
        this.AllowDynamicWallpaper = bool4;
        this.TimerStatus = num5;
        this.AllowUseMusic = bool5;
        this.HideDownload = bool6;
        this.HideDouplus = bool7;
        this.AllowStitch = bool8;
        this.DownloadSetting = num6;
    }

    public /* synthetic */ VideoControlStruct(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool4, Integer num5, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num6, int i, g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : bool5, (i & 1024) != 0 ? null : bool6, (i & 2048) != 0 ? null : bool7, (i & 4096) != 0 ? null : bool8, (i & 8192) == 0 ? num6 : null);
    }
}
