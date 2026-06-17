.class public final enum Lcom/google/errorprone/annotations/Modifier;
.super Ljava/lang/Enum;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/errorprone/annotations/Modifier;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic h:[Lcom/google/errorprone/annotations/Modifier;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    new-instance v0, Lcom/google/errorprone/annotations/Modifier;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/google/errorprone/annotations/Modifier;

    .line 10
    .line 11
    const-string v3, "PROTECTED"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lcom/google/errorprone/annotations/Modifier;

    .line 18
    .line 19
    const-string v5, "PRIVATE"

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lcom/google/errorprone/annotations/Modifier;

    .line 26
    .line 27
    const-string v7, "ABSTRACT"

    .line 28
    .line 29
    const/4 v8, 0x3

    .line 30
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lcom/google/errorprone/annotations/Modifier;

    .line 34
    .line 35
    const-string v9, "DEFAULT"

    .line 36
    .line 37
    const/4 v10, 0x4

    .line 38
    invoke-direct {v7, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    new-instance v9, Lcom/google/errorprone/annotations/Modifier;

    .line 42
    .line 43
    const-string v11, "STATIC"

    .line 44
    .line 45
    const/4 v12, 0x5

    .line 46
    invoke-direct {v9, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v11, Lcom/google/errorprone/annotations/Modifier;

    .line 50
    .line 51
    const-string v13, "FINAL"

    .line 52
    .line 53
    const/4 v14, 0x6

    .line 54
    invoke-direct {v11, v13, v14}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    new-instance v13, Lcom/google/errorprone/annotations/Modifier;

    .line 58
    .line 59
    const-string v15, "TRANSIENT"

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/4 v2, 0x7

    .line 64
    invoke-direct {v13, v15, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    new-instance v15, Lcom/google/errorprone/annotations/Modifier;

    .line 68
    .line 69
    const/16 v17, 0x7

    .line 70
    .line 71
    const-string v2, "VOLATILE"

    .line 72
    .line 73
    const/16 v18, 0x1

    .line 74
    .line 75
    const/16 v4, 0x8

    .line 76
    .line 77
    invoke-direct {v15, v2, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Lcom/google/errorprone/annotations/Modifier;

    .line 81
    .line 82
    const/16 v19, 0x8

    .line 83
    .line 84
    const-string v4, "SYNCHRONIZED"

    .line 85
    .line 86
    const/16 v20, 0x2

    .line 87
    .line 88
    const/16 v6, 0x9

    .line 89
    .line 90
    invoke-direct {v2, v4, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Lcom/google/errorprone/annotations/Modifier;

    .line 94
    .line 95
    const/16 v21, 0x9

    .line 96
    .line 97
    const-string v6, "NATIVE"

    .line 98
    .line 99
    const/16 v22, 0x3

    .line 100
    .line 101
    const/16 v8, 0xa

    .line 102
    .line 103
    invoke-direct {v4, v6, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    new-instance v6, Lcom/google/errorprone/annotations/Modifier;

    .line 107
    .line 108
    const/16 v23, 0xa

    .line 109
    .line 110
    const-string v8, "STRICTFP"

    .line 111
    .line 112
    const/16 v24, 0x4

    .line 113
    .line 114
    const/16 v10, 0xb

    .line 115
    .line 116
    invoke-direct {v6, v8, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    const/16 v8, 0xc

    .line 120
    .line 121
    new-array v8, v8, [Lcom/google/errorprone/annotations/Modifier;

    .line 122
    .line 123
    aput-object v0, v8, v16

    .line 124
    .line 125
    aput-object v1, v8, v18

    .line 126
    .line 127
    aput-object v3, v8, v20

    .line 128
    .line 129
    aput-object v5, v8, v22

    .line 130
    .line 131
    aput-object v7, v8, v24

    .line 132
    .line 133
    aput-object v9, v8, v12

    .line 134
    .line 135
    aput-object v11, v8, v14

    .line 136
    .line 137
    aput-object v13, v8, v17

    .line 138
    .line 139
    aput-object v15, v8, v19

    .line 140
    .line 141
    aput-object v2, v8, v21

    .line 142
    .line 143
    aput-object v4, v8, v23

    .line 144
    .line 145
    aput-object v6, v8, v10

    .line 146
    .line 147
    sput-object v8, Lcom/google/errorprone/annotations/Modifier;->h:[Lcom/google/errorprone/annotations/Modifier;

    .line 148
    .line 149
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lcom/google/errorprone/annotations/Modifier;
    .locals 1

    .line 1
    const-class v0, Lcom/google/errorprone/annotations/Modifier;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/errorprone/annotations/Modifier;

    .line 8
    .line 9
    return-object p0
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
.end method

.method public static values()[Lcom/google/errorprone/annotations/Modifier;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/errorprone/annotations/Modifier;->h:[Lcom/google/errorprone/annotations/Modifier;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/errorprone/annotations/Modifier;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/errorprone/annotations/Modifier;

    .line 8
    .line 9
    return-object v0
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
