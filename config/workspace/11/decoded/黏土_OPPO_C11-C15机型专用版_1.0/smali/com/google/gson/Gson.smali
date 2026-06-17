.class public final Lcom/google/gson/Gson;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/Gson$FutureTypeAdapter;
    }
.end annotation


# static fields
.field public static final n:Lcom/google/gson/FormattingStyle;

.field public static final o:Lcom/google/gson/FieldNamingStrategy;

.field public static final p:Lcom/google/gson/ToNumberStrategy;

.field public static final q:Lcom/google/gson/ToNumberStrategy;


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Lcom/google/gson/internal/ConstructorConstructor;

.field public final d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field public final e:Ljava/util/List;

.field public final f:Lcom/google/gson/FieldNamingStrategy;

.field public final g:Z

.field public final h:Lcom/google/gson/FormattingStyle;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Lcom/google/gson/ToNumberStrategy;

.field public final l:Lcom/google/gson/ToNumberStrategy;

.field public final m:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/gson/FormattingStyle;->d:Lcom/google/gson/FormattingStyle;

    .line 2
    .line 3
    sput-object v0, Lcom/google/gson/Gson;->n:Lcom/google/gson/FormattingStyle;

    .line 4
    .line 5
    sget-object v0, Lcom/google/gson/FieldNamingPolicy;->h:Lcom/google/gson/FieldNamingPolicy;

    .line 6
    .line 7
    sput-object v0, Lcom/google/gson/Gson;->o:Lcom/google/gson/FieldNamingStrategy;

    .line 8
    .line 9
    sget-object v0, Lcom/google/gson/ToNumberPolicy;->h:Lcom/google/gson/ToNumberPolicy;

    .line 10
    .line 11
    sput-object v0, Lcom/google/gson/Gson;->p:Lcom/google/gson/ToNumberStrategy;

    .line 12
    .line 13
    sget-object v0, Lcom/google/gson/ToNumberPolicy;->i:Lcom/google/gson/ToNumberPolicy;

    .line 14
    .line 15
    sput-object v0, Lcom/google/gson/Gson;->q:Lcom/google/gson/ToNumberStrategy;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    sget-object v1, Lcom/google/gson/internal/Excluder;->j:Lcom/google/gson/internal/Excluder;

    .line 2
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 3
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    sget-object v11, Lcom/google/gson/Gson;->p:Lcom/google/gson/ToNumberStrategy;

    sget-object v12, Lcom/google/gson/Gson;->q:Lcom/google/gson/ToNumberStrategy;

    .line 5
    sget-object v2, Lcom/google/gson/Gson;->o:Lcom/google/gson/FieldNamingStrategy;

    const/4 v4, 0x1

    sget-object v5, Lcom/google/gson/Gson;->n:Lcom/google/gson/FormattingStyle;

    const/4 v6, 0x1

    sget-object v7, Lcom/google/gson/LongSerializationPolicy;->h:Lcom/google/gson/LongSerializationPolicy;

    move-object v9, v8

    move-object v10, v8

    move-object v13, v8

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/google/gson/Gson;-><init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/FieldNamingStrategy;Ljava/util/Map;ZLcom/google/gson/FormattingStyle;ZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/ToNumberStrategy;Lcom/google/gson/ToNumberStrategy;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/FieldNamingStrategy;Ljava/util/Map;ZLcom/google/gson/FormattingStyle;ZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/ToNumberStrategy;Lcom/google/gson/ToNumberStrategy;Ljava/util/List;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lcom/google/gson/Gson;->a:Ljava/lang/ThreadLocal;

    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/Gson;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    iput-object p2, p0, Lcom/google/gson/Gson;->f:Lcom/google/gson/FieldNamingStrategy;

    move-object v0, p3

    move-object p3, p2

    .line 10
    new-instance p2, Lcom/google/gson/internal/ConstructorConstructor;

    invoke-direct {p2, v0, p6, p13}, Lcom/google/gson/internal/ConstructorConstructor;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    iput-object p2, p0, Lcom/google/gson/Gson;->c:Lcom/google/gson/internal/ConstructorConstructor;

    .line 11
    iput-boolean p4, p0, Lcom/google/gson/Gson;->g:Z

    .line 12
    iput-object p5, p0, Lcom/google/gson/Gson;->h:Lcom/google/gson/FormattingStyle;

    .line 13
    iput-object p8, p0, Lcom/google/gson/Gson;->i:Ljava/util/List;

    .line 14
    iput-object p9, p0, Lcom/google/gson/Gson;->j:Ljava/util/List;

    .line 15
    iput-object p11, p0, Lcom/google/gson/Gson;->k:Lcom/google/gson/ToNumberStrategy;

    .line 16
    iput-object p12, p0, Lcom/google/gson/Gson;->l:Lcom/google/gson/ToNumberStrategy;

    .line 17
    iput-object p13, p0, Lcom/google/gson/Gson;->m:Ljava/util/List;

    .line 18
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    .line 19
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->A:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-static {p11}, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->d(Lcom/google/gson/ToNumberStrategy;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p4

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-virtual {p8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {p8, p10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 23
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->p:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->g:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->d:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->e:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->f:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    sget-object p4, Lcom/google/gson/LongSerializationPolicy;->h:Lcom/google/gson/LongSerializationPolicy;

    if-ne p7, p4, :cond_0

    .line 29
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->k:Lcom/google/gson/TypeAdapter;

    goto :goto_0

    .line 30
    :cond_0
    new-instance p4, Lcom/google/gson/Gson$3;

    invoke-direct {p4}, Lcom/google/gson/Gson$3;-><init>()V

    .line 31
    :goto_0
    sget-object p5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Long;

    invoke-static {p5, p6, p4}, Lcom/google/gson/internal/bind/TypeAdapters;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p5

    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance p5, Lcom/google/gson/Gson$1;

    .line 33
    invoke-direct {p5}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 34
    sget-object p6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class p7, Ljava/lang/Double;

    invoke-static {p6, p7, p5}, Lcom/google/gson/internal/bind/TypeAdapters;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p5

    .line 35
    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance p5, Lcom/google/gson/Gson$2;

    .line 37
    invoke-direct {p5}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 38
    sget-object p6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class p7, Ljava/lang/Float;

    invoke-static {p6, p7, p5}, Lcom/google/gson/internal/bind/TypeAdapters;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p5

    .line 39
    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object p5, Lcom/google/gson/ToNumberPolicy;->i:Lcom/google/gson/ToNumberPolicy;

    if-ne p12, p5, :cond_1

    .line 41
    sget-object p5, Lcom/google/gson/internal/bind/NumberTypeAdapter;->b:Lcom/google/gson/TypeAdapterFactory;

    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p12}, Lcom/google/gson/internal/bind/NumberTypeAdapter;->d(Lcom/google/gson/ToNumberStrategy;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p5

    .line 43
    :goto_1
    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    sget-object p5, Lcom/google/gson/internal/bind/TypeAdapters;->h:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    sget-object p5, Lcom/google/gson/internal/bind/TypeAdapters;->i:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    new-instance p5, Lcom/google/gson/Gson$4;

    invoke-direct {p5, p4}, Lcom/google/gson/Gson$4;-><init>(Lcom/google/gson/TypeAdapter;)V

    .line 47
    invoke-virtual {p5}, Lcom/google/gson/TypeAdapter;->a()Lcom/google/gson/TypeAdapter;

    move-result-object p5

    .line 48
    const-class p6, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {p6, p5}, Lcom/google/gson/internal/bind/TypeAdapters;->a(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p5

    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance p5, Lcom/google/gson/Gson$5;

    invoke-direct {p5, p4}, Lcom/google/gson/Gson$5;-><init>(Lcom/google/gson/TypeAdapter;)V

    .line 50
    invoke-virtual {p5}, Lcom/google/gson/TypeAdapter;->a()Lcom/google/gson/TypeAdapter;

    move-result-object p4

    .line 51
    const-class p5, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {p5, p4}, Lcom/google/gson/internal/bind/TypeAdapters;->a(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p4

    .line 52
    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->j:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->l:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->q:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->r:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    const-class p4, Ljava/math/BigDecimal;

    sget-object p5, Lcom/google/gson/internal/bind/TypeAdapters;->m:Lcom/google/gson/TypeAdapter;

    invoke-static {p4, p5}, Lcom/google/gson/internal/bind/TypeAdapters;->a(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p4

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    const-class p4, Ljava/math/BigInteger;

    sget-object p5, Lcom/google/gson/internal/bind/TypeAdapters;->n:Lcom/google/gson/TypeAdapter;

    invoke-static {p4, p5}, Lcom/google/gson/internal/bind/TypeAdapters;->a(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p4

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    const-class p4, Lcom/google/gson/internal/LazilyParsedNumber;

    sget-object p5, Lcom/google/gson/internal/bind/TypeAdapters;->o:Lcom/google/gson/TypeAdapter;

    .line 60
    invoke-static {p4, p5}, Lcom/google/gson/internal/bind/TypeAdapters;->a(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p4

    .line 61
    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->s:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->t:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->v:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->w:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->y:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->u:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->b:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object p4, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter;->c:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->x:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    sget-boolean p4, Lcom/google/gson/internal/sql/SqlTypesSupport;->a:Z

    if-eqz p4, :cond_2

    .line 72
    sget-object p4, Lcom/google/gson/internal/sql/SqlTypesSupport;->e:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    sget-object p4, Lcom/google/gson/internal/sql/SqlTypesSupport;->d:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    sget-object p4, Lcom/google/gson/internal/sql/SqlTypesSupport;->f:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_2
    sget-object p4, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->c:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->a:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    new-instance p4, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;

    invoke-direct {p4, p2}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    new-instance p4, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;

    invoke-direct {p4, p2}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance p5, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    invoke-direct {p5, p2}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V

    iput-object p5, p0, Lcom/google/gson/Gson;->d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 80
    invoke-virtual {p8, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    sget-object p4, Lcom/google/gson/internal/bind/TypeAdapters;->B:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {p8, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p4, p1

    .line 82
    new-instance p1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;

    move-object p6, p13

    invoke-direct/range {p1 .. p6}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/FieldNamingStrategy;Lcom/google/gson/internal/Excluder;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V

    invoke-virtual {p8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-static {p8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/Gson;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
    .line 37
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcom/google/gson/stream/JsonReader;

    .line 11
    .line 12
    invoke-direct {p1, v1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/google/gson/Strictness;->i:Lcom/google/gson/Strictness;

    .line 16
    .line 17
    iput-object v1, p1, Lcom/google/gson/stream/JsonReader;->i:Lcom/google/gson/Strictness;

    .line 18
    .line 19
    const-string v2, "AssertionError (GSON 2.13.1): "

    .line 20
    .line 21
    const-string v3, "Type adapter \'"

    .line 22
    .line 23
    sget-object v4, Lcom/google/gson/Strictness;->h:Lcom/google/gson/Strictness;

    .line 24
    .line 25
    iput-object v4, p1, Lcom/google/gson/stream/JsonReader;->i:Lcom/google/gson/Strictness;

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->F0()Lcom/google/gson/stream/JsonToken;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    :try_start_1
    invoke-virtual {p0, p2}, Lcom/google/gson/Gson;->c(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5, p1}, Lcom/google/gson/TypeAdapter;->b(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-static {v7}, Lcom/google/gson/internal/Primitives;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v7, Ljava/lang/ClassCastException;

    .line 57
    .line 58
    new-instance v8, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v3, "\' returned wrong type; requested "

    .line 67
    .line 68
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p2, " but got instance of "

    .line 79
    .line 80
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p2, "\nVerify that the adapter was registered for the correct type."

    .line 91
    .line 92
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-direct {v7, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v7
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    :catchall_0
    move-exception p2

    .line 104
    goto :goto_9

    .line 105
    :catch_0
    move-exception p2

    .line 106
    goto :goto_1

    .line 107
    :catch_1
    move-exception p2

    .line 108
    goto :goto_2

    .line 109
    :catch_2
    move-exception p2

    .line 110
    goto :goto_3

    .line 111
    :catch_3
    move-exception p2

    .line 112
    goto :goto_4

    .line 113
    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    iput-object v1, p1, Lcom/google/gson/stream/JsonReader;->i:Lcom/google/gson/Strictness;

    .line 117
    .line 118
    move-object v0, v6

    .line 119
    goto :goto_5

    .line 120
    :goto_1
    :try_start_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-direct {v0, v2, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :goto_2
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 143
    .line 144
    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :goto_3
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 149
    .line 150
    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    :catch_4
    move-exception p2

    .line 155
    const/4 v4, 0x1

    .line 156
    :goto_4
    if-eqz v4, :cond_5

    .line 157
    .line 158
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    iput-object v1, p1, Lcom/google/gson/stream/JsonReader;->i:Lcom/google/gson/Strictness;

    .line 162
    .line 163
    :goto_5
    if-eqz v0, :cond_4

    .line 164
    .line 165
    :try_start_3
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->F0()Lcom/google/gson/stream/JsonToken;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    sget-object p2, Lcom/google/gson/stream/JsonToken;->q:Lcom/google/gson/stream/JsonToken;

    .line 170
    .line 171
    if-ne p1, p2, :cond_3

    .line 172
    .line 173
    goto :goto_8

    .line 174
    :cond_3
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 175
    .line 176
    const-string p2, "JSON document was not fully consumed."

    .line 177
    .line 178
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1
    :try_end_3
    .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 182
    :catch_5
    move-exception p1

    .line 183
    goto :goto_6

    .line 184
    :catch_6
    move-exception p1

    .line 185
    goto :goto_7

    .line 186
    :goto_6
    new-instance p2, Lcom/google/gson/JsonIOException;

    .line 187
    .line 188
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p2

    .line 192
    :goto_7
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 193
    .line 194
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    throw p2

    .line 198
    :cond_4
    :goto_8
    return-object v0

    .line 199
    :cond_5
    :try_start_4
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 200
    .line 201
    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 205
    :goto_9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    iput-object v1, p1, Lcom/google/gson/stream/JsonReader;->i:Lcom/google/gson/Strictness;

    .line 209
    .line 210
    throw p2
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final c(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 8

    .line 1
    const-string v0, "type must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/gson/Gson;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/google/gson/TypeAdapter;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/google/gson/Gson;->a:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/util/Map;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/google/gson/TypeAdapter;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_2
    const/4 v3, 0x0

    .line 47
    :goto_0
    :try_start_0
    new-instance v4, Lcom/google/gson/Gson$FutureTypeAdapter;

    .line 48
    .line 49
    invoke-direct {v4}, Lcom/google/gson/Gson$FutureTypeAdapter;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v5, p0, Lcom/google/gson/Gson;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const/4 v6, 0x0

    .line 62
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Lcom/google/gson/TypeAdapterFactory;

    .line 73
    .line 74
    invoke-interface {v6, p0, p1}, Lcom/google/gson/TypeAdapterFactory;->a(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    iget-object v5, v4, Lcom/google/gson/Gson$FutureTypeAdapter;->a:Lcom/google/gson/TypeAdapter;

    .line 81
    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    iput-object v6, v4, Lcom/google/gson/Gson$FutureTypeAdapter;->a:Lcom/google/gson/TypeAdapter;

    .line 85
    .line 86
    invoke-interface {v2, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 93
    .line 94
    const-string v0, "Delegate is already set"

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 103
    .line 104
    .line 105
    :cond_6
    if-eqz v6, :cond_8

    .line 106
    .line 107
    if-eqz v3, :cond_7

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 110
    .line 111
    .line 112
    :cond_7
    return-object v6

    .line 113
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v2, "GSON (2.13.1) cannot handle "

    .line 118
    .line 119
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :goto_2
    if-eqz v3, :cond_9

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 136
    .line 137
    .line 138
    :cond_9
    throw p1
    .line 139
    .line 140
.end method

.method public final d(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 6

    .line 1
    const-string v0, "skipPast must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "type must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/gson/Gson;->d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    sget-object v2, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->j:Lcom/google/gson/TypeAdapterFactory;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne p1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lcom/google/gson/TypeAdapterFactory;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    if-ne v4, p1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-class v4, Lcom/google/gson/annotations/JsonAdapter;

    .line 40
    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lcom/google/gson/annotations/JsonAdapter;

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-interface {v4}, Lcom/google/gson/annotations/JsonAdapter;->value()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-class v5, Lcom/google/gson/TypeAdapterFactory;

    .line 55
    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    iget-object v5, v0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->h:Lcom/google/gson/internal/ConstructorConstructor;

    .line 64
    .line 65
    invoke-static {v4}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v5, v4, v3}, Lcom/google/gson/internal/ConstructorConstructor;->b(Lcom/google/gson/reflect/TypeToken;Z)Lcom/google/gson/internal/ObjectConstructor;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v4}, Lcom/google/gson/internal/ObjectConstructor;->g()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lcom/google/gson/TypeAdapterFactory;

    .line 78
    .line 79
    invoke-virtual {v1, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lcom/google/gson/TypeAdapterFactory;

    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    move-object v4, v1

    .line 88
    :cond_4
    if-ne v4, p1, :cond_5

    .line 89
    .line 90
    :goto_0
    move-object p1, v0

    .line 91
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/google/gson/Gson;->e:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/4 v1, 0x0

    .line 98
    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_8

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lcom/google/gson/TypeAdapterFactory;

    .line 109
    .line 110
    if-nez v1, :cond_7

    .line 111
    .line 112
    if-ne v2, p1, :cond_6

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    invoke-interface {v2, p0, p2}, Lcom/google/gson/TypeAdapterFactory;->a(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-eqz v2, :cond_6

    .line 121
    .line 122
    return-object v2

    .line 123
    :cond_8
    if-nez v1, :cond_9

    .line 124
    .line 125
    invoke-virtual {p0, p2}, Lcom/google/gson/Gson;->c(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "GSON cannot serialize or deserialize "

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{serializeNulls:false,factories:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/gson/Gson;->e:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",instanceCreators:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/gson/Gson;->c:Lcom/google/gson/internal/ConstructorConstructor;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "}"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
    .line 33
.end method
