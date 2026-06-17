package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);

    private final int value;
    public static final b Companion = new Object(null) { // from class: kotlin.text.CharDirectionality.b
    };
    private static final kotlin.e<Map<Integer, CharDirectionality>> directionalityMap$delegate = kotlin.a.c(a.a);

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<Map<Integer, ? extends CharDirectionality>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Map<Integer, ? extends CharDirectionality> invoke() {
            CharDirectionality[] values = CharDirectionality.values();
            int H = kotlin.collections.g.H(20);
            if (H < 16) {
                H = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (int i = 0; i < 20; i++) {
                CharDirectionality charDirectionality = values[i];
                linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
            }
            return linkedHashMap;
        }
    }

    CharDirectionality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
