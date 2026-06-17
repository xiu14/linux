.class public final synthetic Lcom/google/android/material/color/utilities/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/color/utilities/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V
    .locals 0

    .line 2
    const/16 p1, 0x1b

    iput p1, p0, Lcom/google/android/material/color/utilities/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/android/material/color/utilities/a;->a:I

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    throw p1

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :goto_0
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :pswitch_1
    new-instance v0, Lcom/google/android/material/color/utilities/DynamicColor;

    .line 16
    .line 17
    new-instance v2, Lcom/google/android/material/color/utilities/a;

    .line 18
    .line 19
    const/16 p1, 0x14

    .line 20
    .line 21
    invoke-direct {v2, p1}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lcom/google/android/material/color/utilities/a;

    .line 25
    .line 26
    const/16 p1, 0x15

    .line 27
    .line 28
    invoke-direct {v3, p1}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const-string v1, "background"

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-direct/range {v0 .. v7}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_2
    const/4 p1, 0x0

    .line 42
    throw p1

    .line 43
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_4
    const/4 p1, 0x0

    .line 48
    throw p1

    .line 49
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_7
    const/4 p1, 0x0

    .line 58
    throw p1

    .line 59
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    throw p1

    .line 68
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_b
    const/4 p1, 0x0

    .line 73
    throw p1

    .line 74
    :pswitch_c
    const/4 p1, 0x0

    .line 75
    throw p1

    .line 76
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_e
    const/4 p1, 0x0

    .line 81
    throw p1

    .line 82
    :pswitch_f
    const/4 p1, 0x0

    .line 83
    throw p1

    .line 84
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :pswitch_11
    const/4 p1, 0x0

    .line 89
    throw p1

    .line 90
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_13
    const/4 p1, 0x0

    .line 95
    throw p1

    .line 96
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_15
    const/4 p1, 0x0

    .line 101
    throw p1

    .line 102
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_17
    const/4 p1, 0x0

    .line 107
    throw p1

    .line 108
    :pswitch_18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    throw p1

    .line 117
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    throw p1

    .line 126
    :pswitch_1c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
