package com.mammon.audiosdk;

import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.enums.SAMICoreVopAudioCheckerResult;
import com.mammon.audiosdk.structures.SAMICoreVopAudioCheckerAudioMetricParameter;
import com.mammon.audiosdk.structures.SAMICoreVopAudioCheckerConfig;
import com.mammon.audiosdk.structures.SAMICoreVopAudioCheckerOnlineAsrParameter;

/* loaded from: classes2.dex */
public final class SAMICoreVopAudioChecker {
    private static SAMICoreBridge bridge;
    private volatile long engine = bridge.AudioChecker_native_createEngine();

    static {
        SpeechAudioLoader.getInstance().load();
        bridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
    }

    public int checkAudioQuality(byte[] bArr, int i, String str, SAMICoreVopAudioCheckerResult[] sAMICoreVopAudioCheckerResultArr) {
        int[] iArr = new int[1];
        int AudioChecker_native_checkAudioQuality = bridge.AudioChecker_native_checkAudioQuality(this.engine, bArr, i, str, iArr);
        sAMICoreVopAudioCheckerResultArr[0] = SAMICoreVopAudioCheckerResult.values()[iArr[0]];
        return AudioChecker_native_checkAudioQuality;
    }

    public void destroyEngine() {
        bridge.AudioChecker_native_destroyEngine(this.engine);
    }

    public int init(SAMICoreVopAudioCheckerConfig sAMICoreVopAudioCheckerConfig) {
        return bridge.AudioChecker_native_init(this.engine, sAMICoreVopAudioCheckerConfig);
    }

    public int setAudioMetricParameter(SAMICoreVopAudioCheckerAudioMetricParameter sAMICoreVopAudioCheckerAudioMetricParameter) {
        return bridge.AudioChecker_native_setAudioMetricParameter(this.engine, sAMICoreVopAudioCheckerAudioMetricParameter);
    }

    public int setOnlineAsrParameter(SAMICoreVopAudioCheckerOnlineAsrParameter sAMICoreVopAudioCheckerOnlineAsrParameter) {
        return bridge.AudioChecker_native_setOnlineAsrParameter(this.engine, sAMICoreVopAudioCheckerOnlineAsrParameter);
    }
}
