package com.mammon.samicorenui;

import com.heytap.mcssdk.liquid.DownloadRequest;
import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreNuiParameterType {
    DEVICE_TYPE(0),
    COMMON_LOG_LEVEL(10000),
    COMMON_DEBUG_PATH(DownloadRequest.ErrorCode.ERROR_CONTEXT),
    COMMON_URL(DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT),
    COMMON_APPKEY(DownloadRequest.ErrorCode.ERROR_CODE_FREQUENT),
    COMMON_TOKEN(DownloadRequest.ErrorCode.ERROR_MAX_LIMIT),
    AUDIO_MIC_ENABLE(10100),
    AUDIO_MIC_AUDIO_SOURCE(10101),
    AUDIO_MIC_SAMPLE_RATE(10102),
    AUDIO_MIC_CHANNEL(10103),
    AUDIO_MIC_BIT_DEPTH(10104),
    AUDIO_MIC_DEBUG(10105),
    AUDIO_PLAYER_ENABLE(10200),
    AUDIO_PLAYER_STREAM(10201),
    AUDIO_PLAYER_SAMPLE_RATE(10202),
    AUDIO_PLAYER_CHANNEL(10203),
    AUDIO_PLAYER_BIT_DEPTH(10204),
    AUDIO_PLAYER_DEBUG(10205),
    DENOISE_ENABLE(10300),
    DENOISE_DEBUG(10301),
    VAD_ENABLE(10400),
    VAD_DEBUG(10401),
    AEC_ENABLE(10500),
    AEC_MODEL(10501),
    AEC_SAMPLE_RATE(10502),
    AEC_CHANNEL(10503),
    AEC_BIT_DEPTH(10504),
    AEC_DEBUG(10505),
    KWS_ENABLE(10600),
    KWS_WAKEUP_MODE(10601),
    KWS_MODEL(10602),
    KWS_MODEL_TYPE(10603),
    KWS_KEY_WORDS(10604),
    KWS_SAMPLE_RATE(10605),
    KWS_CHANNEL(10606),
    KWS_BIT_DEPTH(10607),
    KWS_THRESHOLD(10608),
    KWS_DEBUG(10609),
    ASR_ONLINE_ENABLE(10700),
    ASR_ONLINE_SAMPLE_RATE(10701),
    ASR_ONLINE_CHANNEL(10702),
    ASR_ONLINE_BIT_DEPTH(10703),
    ASR_ONLINE_SOS_SILENCE_TIMEOUT(10704),
    ASR_ONLINE_EOS_SILENCE_TIMEOUT(10705),
    ASR_ONLINE_ENABLE_PUNCTUATION(10706),
    ASR_ONLINE_LANG(10707),
    ASR_ONLINE_DEBUG(10708),
    TTS_ONLINE_ENABLE(10800),
    TTS_ONLINE_SPEAKER(10801),
    TTS_ONLINE_SAMPLE_RATE(10802),
    TTS_ONLINE_FORMAT(10803),
    TTS_ONLINE_SPEECH_RATE(10804),
    TTS_ONLINE_PITCH_RATE(10805),
    TTS_ONLINE_DEBUG(10806),
    NLU_ENABLE(10900),
    NLU_DEBUG(10901);

    public static final HashMap<Integer, SAMICoreNuiParameterType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreNuiParameterType[] values = values();
        for (int i = 0; i < 56; i++) {
            SAMICoreNuiParameterType sAMICoreNuiParameterType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreNuiParameterType.getValue()), sAMICoreNuiParameterType);
        }
    }

    SAMICoreNuiParameterType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreNuiParameterType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
