.class final Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/firebase/encoders/ObjectEncoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ClientMetricsEncoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/encoders/ObjectEncoder<",
        "Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;

.field public static final b:Lcom/google/firebase/encoders/FieldDescriptor;

.field public static final c:Lcom/google/firebase/encoders/FieldDescriptor;

.field public static final d:Lcom/google/firebase/encoders/FieldDescriptor;

.field public static final e:Lcom/google/firebase/encoders/FieldDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->a:Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;

    .line 7
    .line 8
    new-instance v0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;

    .line 9
    .line 10
    const-string v1, "window"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/google/firebase/encoders/proto/AtProtobuf;

    .line 16
    .line 17
    invoke-direct {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    iput v2, v1, Lcom/google/firebase/encoders/proto/AtProtobuf;->a:I

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;->a()Lcom/google/firebase/encoders/proto/Protobuf;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b(Ljava/lang/annotation/Annotation;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->a()Lcom/google/firebase/encoders/FieldDescriptor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->b:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 35
    .line 36
    new-instance v0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;

    .line 37
    .line 38
    const-string v1, "logSourceMetrics"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lcom/google/firebase/encoders/proto/AtProtobuf;

    .line 44
    .line 45
    invoke-direct {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    iput v2, v1, Lcom/google/firebase/encoders/proto/AtProtobuf;->a:I

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;->a()Lcom/google/firebase/encoders/proto/Protobuf;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b(Ljava/lang/annotation/Annotation;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->a()Lcom/google/firebase/encoders/FieldDescriptor;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->c:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 63
    .line 64
    new-instance v0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;

    .line 65
    .line 66
    const-string v1, "globalMetrics"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lcom/google/firebase/encoders/proto/AtProtobuf;

    .line 72
    .line 73
    invoke-direct {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;-><init>()V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x3

    .line 77
    iput v2, v1, Lcom/google/firebase/encoders/proto/AtProtobuf;->a:I

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;->a()Lcom/google/firebase/encoders/proto/Protobuf;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b(Ljava/lang/annotation/Annotation;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->a()Lcom/google/firebase/encoders/FieldDescriptor;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->d:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 91
    .line 92
    new-instance v0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;

    .line 93
    .line 94
    const-string v1, "appNamespace"

    .line 95
    .line 96
    invoke-direct {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Lcom/google/firebase/encoders/proto/AtProtobuf;

    .line 100
    .line 101
    invoke-direct {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;-><init>()V

    .line 102
    .line 103
    .line 104
    const/4 v2, 0x4

    .line 105
    iput v2, v1, Lcom/google/firebase/encoders/proto/AtProtobuf;->a:I

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/google/firebase/encoders/proto/AtProtobuf;->a()Lcom/google/firebase/encoders/proto/Protobuf;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b(Ljava/lang/annotation/Annotation;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->a()Lcom/google/firebase/encoders/FieldDescriptor;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->e:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 119
    .line 120
    return-void
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;

    .line 2
    .line 3
    check-cast p2, Lcom/google/firebase/encoders/ObjectEncoderContext;

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->b:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 6
    .line 7
    iget-object v1, p1, Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;->a:Lcom/google/android/datatransport/runtime/firebase/transport/TimeWindow;

    .line 8
    .line 9
    invoke-interface {p2, v0, v1}, Lcom/google/firebase/encoders/ObjectEncoderContext;->d(Lcom/google/firebase/encoders/FieldDescriptor;Ljava/lang/Object;)Lcom/google/firebase/encoders/ObjectEncoderContext;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->c:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 13
    .line 14
    iget-object v1, p1, Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p2, v0, v1}, Lcom/google/firebase/encoders/ObjectEncoderContext;->d(Lcom/google/firebase/encoders/FieldDescriptor;Ljava/lang/Object;)Lcom/google/firebase/encoders/ObjectEncoderContext;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->d:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 20
    .line 21
    iget-object v1, p1, Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;->c:Lcom/google/android/datatransport/runtime/firebase/transport/GlobalMetrics;

    .line 22
    .line 23
    invoke-interface {p2, v0, v1}, Lcom/google/firebase/encoders/ObjectEncoderContext;->d(Lcom/google/firebase/encoders/FieldDescriptor;Ljava/lang/Object;)Lcom/google/firebase/encoders/ObjectEncoderContext;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/google/android/datatransport/runtime/AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder;->e:Lcom/google/firebase/encoders/FieldDescriptor;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/google/android/datatransport/runtime/firebase/transport/ClientMetrics;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p2, v0, p1}, Lcom/google/firebase/encoders/ObjectEncoderContext;->d(Lcom/google/firebase/encoders/FieldDescriptor;Ljava/lang/Object;)Lcom/google/firebase/encoders/ObjectEncoderContext;

    .line 31
    .line 32
    .line 33
    return-void
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
