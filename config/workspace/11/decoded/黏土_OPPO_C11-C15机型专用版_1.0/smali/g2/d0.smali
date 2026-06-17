.class public final Lg2/d0;
.super Lg2/z;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:I

.field public b:Lg2/y;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg2/d0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lg2/y;I)V
    .locals 0

    .line 2
    iput p2, p0, Lg2/d0;->a:I

    iput-object p1, p0, Lg2/d0;->b:Lg2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg2/y;)V
    .locals 1

    .line 1
    iget p1, p0, Lg2/d0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Lg2/d0;->b:Lg2/y;

    .line 8
    .line 9
    check-cast p1, Lg2/e0;

    .line 10
    .line 11
    iget-boolean v0, p1, Lg2/e0;->O:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lg2/y;->N()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p1, Lg2/e0;->O:Z

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public b(Lg2/y;)V
    .locals 2

    .line 1
    iget v0, p0, Lg2/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lg2/d0;->b:Lg2/y;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg2/y;->F()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lg2/y;->C(Lg2/w;)Lg2/y;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    iget-object v0, p0, Lg2/d0;->b:Lg2/y;

    .line 17
    .line 18
    check-cast v0, Lg2/e0;

    .line 19
    .line 20
    iget v1, v0, Lg2/e0;->N:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    iput v1, v0, Lg2/e0;->N:I

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, v0, Lg2/e0;->O:Z

    .line 30
    .line 31
    invoke-virtual {v0}, Lg2/y;->o()V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, p0}, Lg2/y;->C(Lg2/w;)Lg2/y;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public e(Lg2/y;)V
    .locals 2

    .line 1
    iget v0, p0, Lg2/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lg2/d0;->b:Lg2/y;

    .line 8
    .line 9
    check-cast v0, Lg2/e0;

    .line 10
    .line 11
    iget-object v1, v0, Lg2/e0;->L:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lg2/e0;->u()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    sget-object p1, Lg2/x;->c:Lcom/google/android/datatransport/runtime/a;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v0, p1, v1}, Lg2/y;->z(Lg2/y;Lg2/x;Z)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, v0, Lg2/y;->y:Z

    .line 30
    .line 31
    sget-object p1, Lg2/x;->b:Lcom/google/android/datatransport/runtime/a;

    .line 32
    .line 33
    invoke-virtual {v0, v0, p1, v1}, Lg2/y;->z(Lg2/y;Lg2/x;Z)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
