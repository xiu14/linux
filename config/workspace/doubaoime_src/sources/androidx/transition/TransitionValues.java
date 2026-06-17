package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder M = a.M("TransitionValues@");
        M.append(Integer.toHexString(hashCode()));
        M.append(":\n");
        StringBuilder S = a.S(M.toString(), "    view = ");
        S.append(this.view);
        S.append("\n");
        String s = a.s(S.toString(), "    values:");
        for (String str : this.values.keySet()) {
            s = s + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return s;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
