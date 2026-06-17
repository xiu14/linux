package com.mammon.audiosdk;

import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.structures.SAMICoreBlock;

/* loaded from: classes2.dex */
public interface SAMICoreCallBackListener {
    void onMessageReceived(SAMICoreCallBackEventType sAMICoreCallBackEventType, SAMICoreBlock sAMICoreBlock);
}
