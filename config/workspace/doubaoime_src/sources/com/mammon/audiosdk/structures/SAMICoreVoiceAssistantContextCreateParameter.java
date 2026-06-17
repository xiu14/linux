package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreTokenType;

/* loaded from: classes2.dex */
public class SAMICoreVoiceAssistantContextCreateParameter {
    public String appKey;
    public String businessInfo;
    public String connectPoolBusiness;
    public int connectTimeout;
    public String dumpDir;
    public boolean enableConnectPool;
    public boolean enableFrontier;
    public boolean enableTransferRetry;
    public String header;
    public int pingPongInterval;
    public String protoVersion;
    public int retryPingPongTimeout;
    public int[] retryTimeArray;
    public String taskId;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;

    public int getTokenType() {
        SAMICoreTokenType sAMICoreTokenType = this.tokenType;
        return sAMICoreTokenType != null ? sAMICoreTokenType.getValue() : SAMICoreTokenType.TOKEN_TO_B.getValue();
    }

    public void setTokenType(int i) {
        this.tokenType = SAMICoreTokenType.fromInt(i);
    }
}
