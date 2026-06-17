package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreAudioFormat;

/* loaded from: classes2.dex */
public class SAMICoreAudioEncodeContextParameter {
    public int bitRate;
    public int channel;
    public int complex;
    public SAMICoreAudioFormat inputFormat;
    public SAMICoreAudioFormat outputFormat;
    public String outputPath;
    public int sampleRate;

    public int getInputFormat() {
        return this.inputFormat.getValue();
    }

    public int getOutputFormat() {
        return this.outputFormat.getValue();
    }

    public void setInputFormat(int i) {
        this.inputFormat = SAMICoreAudioFormat.fromInt(i);
    }

    public void setOutputFormat(int i) {
        this.outputFormat = SAMICoreAudioFormat.fromInt(i);
    }
}
