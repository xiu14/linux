package com.ss.android.i.a.a.a;

import com.bytedance.android.input.basic.AppGlobalsImpl;
import com.bytedance.android.input.basic.applog.impl.AppLogImpl;
import com.bytedance.android.input.basic.data_storage.impl.ImeKvByKeVaImpl;
import com.bytedance.android.input.basic.recognition.accessibilityImpl.RecognizerImpl;
import com.bytedance.android.input.basic.settings.impl.InputSettingsManager;
import com.bytedance.android.input.common.SettingsConfigNextServiceImpl;
import com.bytedance.android.input.common.asr.sdkImp.SdkImpl;
import com.bytedance.android.input.environment.impl.EnvironmentImpl;
import com.bytedance.android.input.fragment.message.MessageCenterPushServiceImpl;
import com.bytedance.android.input.impl.PermissionConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class g {
    private Map<String, Object> a = new ConcurrentHashMap();
    final Map<String, Integer> b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Set<Object>> f8318c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, Integer> f8319d;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static final g a = new g();
    }

    public g() {
        Collections.synchronizedSet(new HashSet());
        this.b = new ConcurrentHashMap(50);
        this.f8318c = new ConcurrentHashMap();
        Collections.synchronizedSet(new HashSet());
        this.f8319d = new ConcurrentHashMap(50);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public <T> T a(Class<T> cls) {
        Object obj;
        Map<String, Object> map;
        String str;
        String name = cls.getName();
        T t = (T) this.a.get(name);
        if (t != null || this.b.containsKey(name)) {
            return t;
        }
        switch (cls.getName().hashCode()) {
            case -1598886431:
                if (cls.getName().equals("com.bytedance.android.input.api.ImePushService")) {
                    obj = new MessageCenterPushServiceImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.api.ImePushService";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case -1232018484:
                if (cls.getName().equals("com.bytedance.android.input.environment.api.IEnvironment")) {
                    obj = new EnvironmentImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.environment.api.IEnvironment";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case -1169185207:
                if (cls.getName().equals("com.bytedance.android.input.common.asr.api.IAsr")) {
                    obj = new SdkImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.common.asr.api.IAsr";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case -665460443:
                if (cls.getName().equals("com.bytedance.android.input.basic.IAppGlobals")) {
                    obj = new AppGlobalsImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.basic.IAppGlobals";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case -345093949:
                if (cls.getName().equals("com.bytedance.android.input.basic.data_storage.api.ImeKv")) {
                    obj = new ImeKvByKeVaImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.basic.data_storage.api.ImeKv";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case 122549888:
                if (cls.getName().equals("com.bytedance.android.input.basic.applog.api.IAppLog")) {
                    obj = new AppLogImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.basic.applog.api.IAppLog";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case 304789408:
                if (cls.getName().equals("com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService")) {
                    obj = new SettingsConfigNextServiceImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case 1519043311:
                if (cls.getName().equals("com.bytedance.android.input.basic.recognition.api.IRecognizer")) {
                    obj = new RecognizerImpl();
                    map = this.a;
                    str = "com.bytedance.android.input.basic.recognition.api.IRecognizer";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case 1798979696:
                if (cls.getName().equals("com.bytedance.android.input.basic.settings.api.IInputSettings")) {
                    obj = new InputSettingsManager();
                    map = this.a;
                    str = "com.bytedance.android.input.basic.settings.api.IInputSettings";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            case 1901914293:
                if (cls.getName().equals("com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig")) {
                    obj = new PermissionConfig();
                    map = this.a;
                    str = "com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig";
                    map.put(str, obj);
                    break;
                }
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
            default:
                this.b.put(cls.getName(), 1);
                obj = null;
                break;
        }
        return (T) obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public <T> Set<T> b(Class<T> cls) {
        HashSet hashSet;
        Map<String, Set<Object>> map;
        String str;
        String name = cls.getName();
        Set<T> set = (Set) this.f8318c.get(name);
        if (set != null || this.f8319d.containsKey(name)) {
            return set;
        }
        switch (cls.getName().hashCode()) {
            case -1598886431:
                if (cls.getName().equals("com.bytedance.android.input.api.ImePushService")) {
                    hashSet = new HashSet();
                    hashSet.add(new MessageCenterPushServiceImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.api.ImePushService";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case -1232018484:
                if (cls.getName().equals("com.bytedance.android.input.environment.api.IEnvironment")) {
                    hashSet = new HashSet();
                    hashSet.add(new EnvironmentImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.environment.api.IEnvironment";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case -1169185207:
                if (cls.getName().equals("com.bytedance.android.input.common.asr.api.IAsr")) {
                    hashSet = new HashSet();
                    hashSet.add(new SdkImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.common.asr.api.IAsr";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case -665460443:
                if (cls.getName().equals("com.bytedance.android.input.basic.IAppGlobals")) {
                    hashSet = new HashSet();
                    hashSet.add(new AppGlobalsImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.basic.IAppGlobals";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case -345093949:
                if (cls.getName().equals("com.bytedance.android.input.basic.data_storage.api.ImeKv")) {
                    hashSet = new HashSet();
                    hashSet.add(new ImeKvByKeVaImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.basic.data_storage.api.ImeKv";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case 122549888:
                if (cls.getName().equals("com.bytedance.android.input.basic.applog.api.IAppLog")) {
                    hashSet = new HashSet();
                    hashSet.add(new AppLogImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.basic.applog.api.IAppLog";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case 304789408:
                if (cls.getName().equals("com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService")) {
                    hashSet = new HashSet();
                    hashSet.add(new SettingsConfigNextServiceImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case 1519043311:
                if (cls.getName().equals("com.bytedance.android.input.basic.recognition.api.IRecognizer")) {
                    hashSet = new HashSet();
                    hashSet.add(new RecognizerImpl());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.basic.recognition.api.IRecognizer";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case 1798979696:
                if (cls.getName().equals("com.bytedance.android.input.basic.settings.api.IInputSettings")) {
                    hashSet = new HashSet();
                    hashSet.add(new InputSettingsManager());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.basic.settings.api.IInputSettings";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            case 1901914293:
                if (cls.getName().equals("com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig")) {
                    hashSet = new HashSet();
                    hashSet.add(new PermissionConfig());
                    map = this.f8318c;
                    str = "com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig";
                    map.put(str, hashSet);
                    break;
                }
                hashSet = null;
                break;
            default:
                hashSet = null;
                break;
        }
        if (hashSet != null) {
            return hashSet;
        }
        this.f8319d.put(cls.getName(), 1);
        return null;
    }
}
