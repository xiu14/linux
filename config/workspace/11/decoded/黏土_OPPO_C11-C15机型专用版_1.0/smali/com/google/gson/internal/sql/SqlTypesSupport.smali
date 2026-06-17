.class public final Lcom/google/gson/internal/sql/SqlTypesSupport;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:Z

.field public static final b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

.field public static final c:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

.field public static final d:Lcom/google/gson/TypeAdapterFactory;

.field public static final e:Lcom/google/gson/TypeAdapterFactory;

.field public static final f:Lcom/google/gson/TypeAdapterFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "java.sql.Date"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    sput-boolean v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->a:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/google/gson/internal/sql/SqlTypesSupport$1;

    .line 14
    .line 15
    const-class v1, Ljava/sql/Date;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;-><init>(Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 21
    .line 22
    new-instance v0, Lcom/google/gson/internal/sql/SqlTypesSupport$2;

    .line 23
    .line 24
    const-class v1, Ljava/sql/Timestamp;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;-><init>(Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->c:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 30
    .line 31
    sget-object v0, Lcom/google/gson/internal/sql/SqlDateTypeAdapter;->b:Lcom/google/gson/TypeAdapterFactory;

    .line 32
    .line 33
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->d:Lcom/google/gson/TypeAdapterFactory;

    .line 34
    .line 35
    sget-object v0, Lcom/google/gson/internal/sql/SqlTimeTypeAdapter;->b:Lcom/google/gson/TypeAdapterFactory;

    .line 36
    .line 37
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->e:Lcom/google/gson/TypeAdapterFactory;

    .line 38
    .line 39
    sget-object v0, Lcom/google/gson/internal/sql/SqlTimestampTypeAdapter;->b:Lcom/google/gson/TypeAdapterFactory;

    .line 40
    .line 41
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->f:Lcom/google/gson/TypeAdapterFactory;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 46
    .line 47
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->c:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 48
    .line 49
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->d:Lcom/google/gson/TypeAdapterFactory;

    .line 50
    .line 51
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->e:Lcom/google/gson/TypeAdapterFactory;

    .line 52
    .line 53
    sput-object v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->f:Lcom/google/gson/TypeAdapterFactory;

    .line 54
    .line 55
    :goto_1
    return-void
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
