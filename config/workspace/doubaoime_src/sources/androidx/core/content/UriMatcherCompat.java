package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull final UriMatcher uriMatcher) {
        return new Predicate() { // from class: androidx.core.content.u
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return uriMatcher.match((Uri) obj) != -1;
            }
        };
    }
}
