package com.mammon.audiosdk.enums;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public enum SAMICoreIdentify {
    SAMICoreIdentify_EngineExecutor_KWS(TypedValues.PositionType.TYPE_PERCENT_Y),
    SAMICoreIdentify_EngineExecutor_AudioMetrics(TypedValues.PositionType.TYPE_CURVE_FIT),
    SAMICoreIdentify_EngineExecutor_Common(512),
    SAMICoreIdentify_EngineExecutor_MultiLevel_Wakeup(515),
    SAMICoreIdentify_Non_Streaming_Wakeup(517),
    SAMICoreIdentify_Non_Streaming_Wakeup_With_Uploader(518),
    SAMICoreIdentify_TTS_Online(601),
    SAMICoreIdentify_Streaming_ASR_Online(650),
    SAMICoreIdentify_Streaming_TTS_Online(651),
    SAMICoreIdentify_Streaming_Playing_TTS_Online(652),
    SAMICoreIdentify_Streaming_ASR_Async_Online(653),
    SAMICoreIdentify_Streaming_VC_Online(654),
    SAMICoreIdentify_Bidirectional_TTS_Online(655),
    SAMICoreIdentify_Voice_Assistant_Online(656),
    SAMICoreIdentify_Voice_Assistant_TimeStretcher(657),
    SAMICoreIdentify_Voice_Assistant_TimeStretcher_Finer(658),
    SAMICoreIdentify_Voice_Assistant_Online_V2(659),
    SAMICoreIdentify_RealtimeCall_Aec(660),
    SAMICoreIdentify_Streaming_ASR_V2(670),
    SAMICoreIdentify_Audio_Encode(800);

    private int value;

    SAMICoreIdentify(int i) {
        this.value = 0;
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
