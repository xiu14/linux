package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.flow.z;

@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandle {
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, t<Object>> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    l.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new SavedStateHandle(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                l.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                l.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        l.f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.f
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
        linkedHashMap.putAll(map);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData = new SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle savedStateHandle) {
        l.f(savedStateHandle, "this$0");
        for (Map.Entry entry : kotlin.collections.g.i0(savedStateHandle.savedStateProviders).entrySet()) {
            savedStateHandle.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = savedStateHandle.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(savedStateHandle.regular.get(str));
        }
        return BundleKt.bundleOf(new kotlin.g(KEYS, arrayList), new kotlin.g(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(String str) {
        l.f(str, "key");
        this.savedStateProviders.remove(str);
    }

    @MainThread
    public final boolean contains(String str) {
        l.f(str, "key");
        return this.regular.containsKey(str);
    }

    @MainThread
    public final <T> T get(String str) {
        l.f(str, "key");
        try {
            return (T) this.regular.get(str);
        } catch (ClassCastException unused) {
            remove(str);
            return null;
        }
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String str) {
        l.f(str, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(str, false, null);
        l.d(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    public final <T> x<T> getStateFlow(String str, T t) {
        l.f(str, "key");
        Map<String, t<Object>> map = this.flows;
        t<Object> tVar = map.get(str);
        if (tVar == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, t);
            }
            tVar = z.a(this.regular.get(str));
            this.flows.put(str, tVar);
            map.put(str, tVar);
        }
        x<T> c2 = h.c(tVar);
        l.d(c2, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return c2;
    }

    @MainThread
    public final Set<String> keys() {
        return kotlin.collections.g.N(kotlin.collections.g.N(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @MainThread
    public final <T> T remove(String str) {
        l.f(str, "key");
        T t = (T) this.regular.remove(str);
        SavingStateLiveData<?> remove = this.liveDatas.remove(str);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(str);
        return t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(String str, T t) {
        l.f(str, "key");
        if (!Companion.validateValue(t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            l.c(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t);
        } else {
            this.regular.put(str, t);
        }
        t<Object> tVar = this.flows.get(str);
        if (tVar == null) {
            return;
        }
        tVar.setValue(t);
    }

    @MainThread
    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        l.f(str, "key");
        l.f(savedStateProvider, "provider");
        this.savedStateProviders.put(str, savedStateProvider);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        l.f(str, "key");
        return getLiveDataInternal(str, true, t);
    }

    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            l.f(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                t tVar = (t) savedStateHandle.flows.get(this.key);
                if (tVar != null) {
                    tVar.setValue(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            l.f(str, "key");
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.f
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
    }
}
