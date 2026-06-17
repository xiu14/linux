package com.heytap.msp.push.mode;

import com.heytap.mcssdk.constant.MessageConstant;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class EnhanceDataMessage extends BaseMode {
    private String mAppPackage;
    private String mContent;
    private String mMessageID;
    private int mMessageType;

    public EnhanceDataMessage(String str, String str2, String str3, int i) {
        this.mAppPackage = str;
        this.mMessageID = str2;
        this.mContent = str3;
        this.mMessageType = i;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getMessageID() {
        return this.mMessageID;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return MessageConstant.MessageType.MESSAGE_SPT_ENHANCED_DATA;
    }

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setMessageID(String str) {
        this.mMessageID = str;
    }

    public void setMessageType(int i) {
        this.mMessageType = i;
    }

    public String toString() {
        StringBuilder M = a.M("EnhanceDataMessage{mAppPackage='");
        a.G0(M, this.mAppPackage, '\'', ", mMessageID='");
        a.G0(M, this.mMessageID, '\'', ", mContent='");
        return a.H(M, this.mContent, '\'', '}');
    }
}
