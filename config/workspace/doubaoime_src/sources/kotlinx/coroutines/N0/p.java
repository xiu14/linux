package kotlinx.coroutines.N0;

import java.util.List;
import kotlinx.coroutines.v0;

/* loaded from: classes2.dex */
public interface p {
    v0 createDispatcher(List<? extends p> list);

    int getLoadPriority();

    String hintOnError();
}
