package e.i.b.c.b;

import android.media.SoundPool;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class k implements SoundPool.OnLoadCompleteListener {
    public static final k a = new k();

    k() {
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        ConcurrentHashMap.KeySetView keySetView;
        if (i2 != 0) {
            e.i.b.f.e.b.b("OUISoundEffectHelper", "load failed, sampleId=" + i + ", status=" + i2);
            return;
        }
        l lVar = l.f10018e;
        concurrentHashMap = l.b;
        Set entrySet = concurrentHashMap.entrySet();
        kotlin.s.c.l.e(entrySet, "soundIdMap.entries");
        Iterator it2 = entrySet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Integer num = (Integer) ((Map.Entry) obj).getValue();
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        Integer num2 = entry != null ? (Integer) entry.getKey() : null;
        if (num2 != null) {
            l lVar2 = l.f10018e;
            keySetView = l.f10016c;
            keySetView.add(num2);
            e.i.b.f.e.b.a("OUISoundEffectHelper", "loaded: resId=" + num2);
        }
    }
}
