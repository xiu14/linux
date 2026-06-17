package com.bytedance.speech.speechaudio;

import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.bytedance.speech.speechaudio.bridge.SpeechBridge;
import com.mammon.audiosdk.bridge.SAMICoreBridge;

/* loaded from: classes2.dex */
public class SpeechEngineLoader {

    /* renamed from: com.bytedance.speech.speechaudio.SpeechEngineLoader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State;

        static {
            SpeechAudioLoader.State.values();
            int[] iArr = new int[3];
            $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State = iArr;
            try {
                SpeechAudioLoader.State state = SpeechAudioLoader.State.UNKNOWN;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State;
                SpeechAudioLoader.State state2 = SpeechAudioLoader.State.PLUGIN_LOADED;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$bytedance$speech$speechaudio$SpeechAudioLoader$State;
                SpeechAudioLoader.State state3 = SpeechAudioLoader.State.PLUGIN_NOT_EXIST;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface PluginAdapter extends CommonPluginAdapter {
        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromHost(String str);

        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromPlugin(String str);
    }

    private static class SpeechEngineLoaderHolder {
        static SpeechEngineLoader INSTANCE = new SpeechEngineLoader();

        private SpeechEngineLoaderHolder() {
        }
    }

    public enum State {
        UNKNOWN,
        PLUGIN_NOT_EXIST,
        PLUGIN_LOADED
    }

    public SpeechEngineLoader() {
        SpeechAudioLoader.getInstance().getState();
    }

    private State ConvertState(SpeechAudioLoader.State state) {
        int ordinal = state.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? State.UNKNOWN : State.PLUGIN_LOADED : State.PLUGIN_NOT_EXIST : State.UNKNOWN;
    }

    public static SpeechEngineLoader getInstance() {
        return SpeechEngineLoaderHolder.INSTANCE;
    }

    public synchronized SpeechBridge createBridge() {
        return SpeechAudioLoader.getInstance().createBridge();
    }

    public synchronized SAMICoreBridge createSAMICoreBridge() {
        return SpeechAudioLoader.getInstance().createSAMICoreBridge();
    }

    public synchronized State getState() {
        return ConvertState(SpeechAudioLoader.getInstance().getState());
    }

    public synchronized State load() {
        return ConvertState(SpeechAudioLoader.getInstance().load());
    }

    public synchronized void setAdapter(PluginAdapter pluginAdapter) {
        SpeechAudioLoader.getInstance().setAdapter(pluginAdapter);
    }
}
