package kotlin.text;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IGNORE_CASE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes2.dex */
public final class RegexOption {
    private static final /* synthetic */ RegexOption[] $VALUES = $values();
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 0;
        int i3 = 2;
        kotlin.s.c.g gVar = null;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i2, i3, gVar);
        int i4 = 0;
        int i5 = 2;
        kotlin.s.c.g gVar2 = null;
        LITERAL = new RegexOption("LITERAL", i, 16, i4, i5, gVar2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i2, i3, gVar);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i4, i5, gVar2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i2, i3, gVar);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i4, i5, gVar2);
    }

    private RegexOption(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    /* synthetic */ RegexOption(String str, int i, int i2, int i3, int i4, kotlin.s.c.g gVar) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
