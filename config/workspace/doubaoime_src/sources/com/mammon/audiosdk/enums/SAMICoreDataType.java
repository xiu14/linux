package com.mammon.audiosdk.enums;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreDataType {
    SAMICoreDataType_Float(0),
    SAMICoreDataType_Int(1),
    SAMICoreDataType_String(2),
    SAMICoreDataType_Null(5),
    SAMICoreDataType_AudioBuffer(50),
    SAMICoreDataType_Data_Uri_Parameter(52),
    SAMICoreDataType_ContextPrepareParameter(100),
    SAMICoreDataType_ResourceParameter(101),
    SAMICoreDataType_ParameterEvent(102),
    SAMICoreDataType_ProcessorParameter(150),
    SAMICoreDataType_FeatureSet(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
    SAMICoreDataType_ExtractorParameter(251),
    SAMICoreDataType_ModelBin(300),
    SAMICoreDataType_AecInput(350),
    SAMICoreDataType_TTSCallBack(400),
    SAMICoreDataType_EngineCreateParameter(TypedValues.CycleType.TYPE_CURVE_FIT),
    SAMICoreDataType_ExecutorCreateParameter(TypedValues.CycleType.TYPE_VISIBILITY),
    SAMICoreDataType_TimeAlign(450),
    SAMICoreDataType_LoudNorm(451),
    SAMICoreDataType_LoudNorm2(452),
    SAMICoreDataType_KWS(455),
    SAMICoreDataType_KWS_SA_REAULT(456),
    SAMICoreDataType_TTS_Result(500),
    SAMICoreDataType_ASR_Result(TypedValues.PositionType.TYPE_PERCENT_WIDTH),
    SAMICoreDataType_AudioBin(TypedValues.PositionType.TYPE_PERCENT_HEIGHT),
    SAMICoreDataType_BeatTracking_Result(TypedValues.PositionType.TYPE_SIZE_PERCENT),
    SAMICoreDataType_MusicSourceSeparate_Result(TypedValues.PositionType.TYPE_PERCENT_X),
    SAMICoreDataType_MusicTagging_Result(TypedValues.PositionType.TYPE_PERCENT_Y),
    SAMICoreDataType_Chorus_Result(TypedValues.PositionType.TYPE_CURVE_FIT),
    SAMICoreDataType_MusicRetarget_Result(509),
    SAMICoreDataType_Midi_Result(TypedValues.PositionType.TYPE_POSITION_TYPE),
    SAMICoreDataType_Token_Result(FrameMetricsAggregator.EVERY_DURATION),
    SAMICoreDataType_SpeechDisfluency_Result(512),
    SAMICoreDataType_VoiceFilterParam(InputDeviceCompat.SOURCE_DPAD),
    SAMICoreDataType_ServerHttpResponse(514),
    SAMICoreDataType_Http_Common_Response(517),
    SAMICoreDataType_WebSocket_Server_Event(600),
    SAMICoreDataType_WebSocket_Connection_Event(601),
    SAMICoreDataType_WebSocket_Asr(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE),
    SAMICoreDataType_WebSocket_Tts(TypedValues.MotionType.TYPE_EASING),
    SAMICoreDataType_WebSocket_Vc(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR),
    SAMICoreDataType_WebSocket_Vc_Speaker(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO),
    SAMICoreDataType_WebSocket_KeepAliveParam(TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO),
    SAMICoreDataType_WebSocket_Asr_Context_Param(650),
    SAMICoreDataType_WebSocket_Tts_Context_Param(651),
    SAMICoreDataType_Voice_Assistant_Property_Param(652),
    SAMICoreDataType_Voice_Assistant_Audio_data(653),
    SAMICoreDataType_Voice_Assistant_Aec_Context_Param(654),
    SAMICoreDataType_Voice_Assistant_Text_data(655),
    SAMICoreDataType_Voice_Assistant_Trace_Span_Param(656),
    SAMICoreDataType_Voice_Assistant_LoudnessStrategy_Param(657),
    SAMICoreDataType_PostProcess_LoudnessStrategy_Param(657),
    SAMICoreDataType_Voice_Assistant_Mem_Upload_Param(680),
    SAMICoreDataType_WebSocket_BidirectionalTTS_Param(681),
    SAMICoreDataType_Voice_Assistant_Info_Upload_Param(682),
    SAMICore_DataType_TimeStretcher_ScaleInfo(800);

    public static final HashMap<Integer, SAMICoreDataType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreDataType[] values = values();
        for (int i = 0; i < 56; i++) {
            SAMICoreDataType sAMICoreDataType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreDataType.getValue()), sAMICoreDataType);
        }
    }

    SAMICoreDataType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreDataType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
