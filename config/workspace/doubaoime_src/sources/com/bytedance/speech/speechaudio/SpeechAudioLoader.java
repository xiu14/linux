package com.bytedance.speech.speechaudio;

import com.bytedance.speech.speechaudio.bridge.SpeechBridge;
import com.bytedance.speech.speechaudio.bridge.SpeechEngineBridge;
import com.mammon.audiosdk.BuildConfig;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.bridge.SAMICoreHostBridge;

/* loaded from: classes2.dex */
public class SpeechAudioLoader {
    private static final String[] COMMON_LIB_ARRAY = new String[0];
    private static final String[] SDK_LIB_ARRAY = {BuildConfig.LIBNAME};
    private static final String[] PLUGIN_LIB_ARRAY = {"audioeffectpg"};
    private State state = State.UNKNOWN;
    private CommonPluginAdapter adapter = new DefaultAdapter(this);

    private static class DefaultAdapter implements PluginAdapter {
        private SpeechAudioLoader loader;

        DefaultAdapter(SpeechAudioLoader speechAudioLoader) {
            this.loader = speechAudioLoader;
        }

        @Override // com.bytedance.speech.speechaudio.SpeechAudioLoader.PluginAdapter, com.bytedance.speech.speechaudio.CommonPluginAdapter
        public boolean loadFromHost(String str) {
            if (this.loader.state != State.UNKNOWN) {
                return true;
            }
            try {
                System.loadLibrary(str);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        @Override // com.bytedance.speech.speechaudio.SpeechAudioLoader.PluginAdapter, com.bytedance.speech.speechaudio.CommonPluginAdapter
        public boolean loadFromPlugin(String str) {
            return false;
        }
    }

    public interface PluginAdapter extends CommonPluginAdapter {
        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromHost(String str);

        @Override // com.bytedance.speech.speechaudio.CommonPluginAdapter
        boolean loadFromPlugin(String str);
    }

    private static class SpeechAudioLoaderHolder {
        static SpeechAudioLoader INSTANCE = new SpeechAudioLoader();

        private SpeechAudioLoaderHolder() {
        }
    }

    public enum State {
        UNKNOWN,
        PLUGIN_NOT_EXIST,
        PLUGIN_LOADED
    }

    public static SpeechAudioLoader getInstance() {
        return SpeechAudioLoaderHolder.INSTANCE;
    }

    public synchronized SpeechBridge createBridge() {
        load();
        if (this.state == State.PLUGIN_LOADED) {
            try {
                Class<?> loadClass = getClass().getClassLoader().loadClass("com.bytedance.speech.speechengine.bridge.SpeechPluginBridge");
                if (loadClass != null) {
                    return (SpeechBridge) loadClass.newInstance();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return new SpeechEngineBridge();
    }

    public synchronized SAMICoreBridge createSAMICoreBridge() {
        load();
        if (this.state == State.PLUGIN_LOADED) {
            try {
                Class<?> loadClass = getClass().getClassLoader().loadClass("com.mammon.audiosdk.bridge.SAMICorePluginBridge");
                if (loadClass != null) {
                    return (SAMICoreBridge) loadClass.newInstance();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return new SAMICoreHostBridge();
    }

    public synchronized State getState() {
        return this.state;
    }

    public synchronized State load() {
        boolean z;
        if (this.state == State.UNKNOWN) {
            for (String str : COMMON_LIB_ARRAY) {
                if (!this.adapter.loadFromHost(str)) {
                    throw new UnsatisfiedLinkError("SpeechEngine load host library: " + str + " failed!");
                }
            }
        }
        if (this.state != State.PLUGIN_LOADED) {
            String[] strArr = PLUGIN_LIB_ARRAY;
            if (strArr.length != 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    }
                    if (!this.adapter.loadFromPlugin(strArr[i])) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    this.state = State.PLUGIN_LOADED;
                }
            }
        }
        if (this.state == State.UNKNOWN) {
            for (String str2 : SDK_LIB_ARRAY) {
                if (!this.adapter.loadFromHost(str2)) {
                    throw new UnsatisfiedLinkError("SpeechEngine load host library: " + str2 + " failed!");
                }
            }
            this.state = State.PLUGIN_NOT_EXIST;
        }
        return this.state;
    }

    public synchronized void setAdapter(CommonPluginAdapter commonPluginAdapter) {
        if (commonPluginAdapter == null) {
            throw new NullPointerException("SpeechEngineLoader plugin adapter can't be null");
        }
        this.adapter = commonPluginAdapter;
    }
}
