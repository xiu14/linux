package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreDataType;

/* loaded from: classes2.dex */
public class SAMICoreBlock {
    public Object[] audioData;
    public SAMICoreDataType dataType;
    public String extra;
    public int numberAudioData = 1;
    public Object userContext;

    public int getDataType() {
        return this.dataType.getValue();
    }

    public void setDataType(int i) {
        this.dataType = SAMICoreDataType.fromInt(i);
    }
}
