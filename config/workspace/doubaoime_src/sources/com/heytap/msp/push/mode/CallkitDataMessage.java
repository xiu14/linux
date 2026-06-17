package com.heytap.msp.push.mode;

import android.content.Intent;
import com.heytap.mcssdk.constant.b;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public final class CallkitDataMessage extends BaseMode {
    private final String mAppId;
    private final String mContent;
    private final String mDescription;
    private final String mMessageId;
    private final String mMessagePathType;
    private final int mType;

    public CallkitDataMessage(Intent intent, int i) {
        this.mAppId = safeDecrypt(intent.getStringExtra(b.u));
        this.mMessageId = safeDecrypt(intent.getStringExtra(b.f6895c));
        this.mContent = safeDecrypt(intent.getStringExtra("content"));
        this.mDescription = safeDecrypt(intent.getStringExtra(b.i));
        this.mMessagePathType = safeDecrypt(intent.getStringExtra(b.F));
        this.mType = i;
    }

    private static String safeDecrypt(String str) {
        try {
            return com.heytap.mcssdk.utils.b.d(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAppID() {
        return this.mAppId;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getMessageID() {
        return this.mMessageId;
    }

    public String getMessagePathType() {
        return this.mMessagePathType;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return this.mType;
    }

    public String toString() {
        StringBuilder M = a.M("CallkitDataMessage{messageId='");
        a.G0(M, this.mMessageId, '\'', ", appId='");
        a.G0(M, this.mAppId, '\'', ", content='");
        a.G0(M, this.mContent, '\'', ", description='");
        return a.H(M, this.mDescription, '\'', '}');
    }
}
