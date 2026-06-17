package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreTokenType;

/* loaded from: classes2.dex */
public class SAMICoreAsrContextCreateParameter {
    public String appKey;
    public String asr_model_path;
    public int audio_cache_size;
    public int audio_src;
    public String business_info;
    public int channel;
    public int connect_timeout;
    public int enable_audio_cache;
    public boolean enable_multi_connection;
    public int enable_net_transport_compress;
    public int enable_punctuation;
    public int enable_remove_first_audio_data;
    public int enable_speaker_diarization;
    public boolean enable_speech_rejection;
    public int eos_silence_timeout;
    public String extra;
    public int finish_wait_timeout;
    public String format;
    public int frame_time_ms;
    public String header;
    public String language;
    public int max_buffer_count;
    public int max_retry_time_ms;
    public String model;
    public String query;
    public int retry_count;
    public int[] retry_interval_time_ms;
    public int retry_mode;
    public int sampleRate;
    public int sentence_max_time;
    public String sessionId;
    public int sos_silence_timeout;
    public String taskId;
    public long timestamp;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;
    public int work_mode;

    public int getTokenType() {
        SAMICoreTokenType sAMICoreTokenType = this.tokenType;
        return sAMICoreTokenType != null ? sAMICoreTokenType.getValue() : SAMICoreTokenType.TOKEN_TO_B.getValue();
    }

    public void setTokenType(int i) {
        this.tokenType = SAMICoreTokenType.fromInt(i);
    }
}
