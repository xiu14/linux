package com.bytedance.lego.init.model;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.mammon.audiosdk.SAMICoreCode;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import com.ss.ttuploader.TTUploadResolver;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum DelayTime implements Serializable {
    SECOND_5(DownloadSettingValues.SYNC_INTERVAL_MS_FG),
    SECOND_8(JosStatusCodes.RTN_CODE_COMMON_ERROR),
    SECOND_15(15000),
    SECOND_30(30000),
    SECOND_60(TTUploadResolver.HOST_MAX_CACHE_TIME),
    MINUTE_2(SAMICoreCode.SAMI_EXTRACTOR_BASE),
    MINUTE_5(300000),
    MINUTE_10(600000),
    MINUTE_15(Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST);

    private int value;

    DelayTime(int i) {
        this.value = i;
    }

    public static DelayTime from(int i) {
        switch (i) {
            case DownloadSettingValues.SYNC_INTERVAL_MS_FG /* 5000 */:
                return SECOND_5;
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return SECOND_8;
            case 15000:
                return SECOND_15;
            case 30000:
                return SECOND_30;
            case TTUploadResolver.HOST_MAX_CACHE_TIME /* 60000 */:
                return SECOND_60;
            case SAMICoreCode.SAMI_EXTRACTOR_BASE /* 120000 */:
                return MINUTE_2;
            case 300000:
                return MINUTE_5;
            case 600000:
                return MINUTE_10;
            case Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST /* 900000 */:
                return MINUTE_15;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
