.class public final Lm6/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ll6/n;


# static fields
.field public static final j:Lw5/r;


# instance fields
.field public final h:Lcom/google/gson/Gson;

.field public final i:Lcom/google/gson/TypeAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lw5/r;->d:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v0, "application/json; charset=UTF-8"

    .line 4
    .line 5
    invoke-static {v0}, Lu2/f;->r(Ljava/lang/String;)Lw5/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lm6/b;->j:Lw5/r;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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

.method public constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm6/b;->h:Lcom/google/gson/Gson;

    .line 5
    .line 6
    iput-object p2, p0, Lm6/b;->i:Lcom/google/gson/TypeAdapter;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lj6/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    invoke-interface {v0}, Lj6/j;->r0()Ljava/io/OutputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lcom/google/gson/stream/JsonWriter;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lcom/google/gson/stream/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lm6/b;->h:Lcom/google/gson/Gson;

    .line 23
    .line 24
    iget-object v3, v1, Lcom/google/gson/Gson;->h:Lcom/google/gson/FormattingStyle;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lcom/google/gson/stream/JsonWriter;->Q(Lcom/google/gson/FormattingStyle;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v1, v1, Lcom/google/gson/Gson;->g:Z

    .line 30
    .line 31
    iput-boolean v1, v2, Lcom/google/gson/stream/JsonWriter;->p:Z

    .line 32
    .line 33
    sget-object v1, Lcom/google/gson/Strictness;->i:Lcom/google/gson/Strictness;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iput-object v1, v2, Lcom/google/gson/stream/JsonWriter;->o:Lcom/google/gson/Strictness;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    iput-boolean v1, v2, Lcom/google/gson/stream/JsonWriter;->r:Z

    .line 42
    .line 43
    iget-object v1, p0, Lm6/b;->i:Lcom/google/gson/TypeAdapter;

    .line 44
    .line 45
    invoke-virtual {v1, v2, p1}, Lcom/google/gson/TypeAdapter;->c(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/google/gson/stream/JsonWriter;->close()V

    .line 49
    .line 50
    .line 51
    iget-wide v1, v0, Lj6/i;->i:J

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Lj6/i;->r(J)Lj6/l;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "content"

    .line 58
    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Ll6/o0;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    sget-object v2, Lm6/b;->j:Lw5/r;

    .line 66
    .line 67
    invoke-direct {v0, v2, p1, v1}, Ll6/o0;-><init>(Lw5/r;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    return-object v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
