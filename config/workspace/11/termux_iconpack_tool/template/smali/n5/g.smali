.class public final synthetic Ln5/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/q;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ln5/g;->h:I

    iput-object p2, p0, Ln5/g;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv5/c;Lv5/b;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, Ln5/g;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/g;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ln5/g;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln5/g;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv5/h;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    check-cast p2, Lp4/k;

    .line 13
    .line 14
    check-cast p3, Lt4/h;

    .line 15
    .line 16
    invoke-virtual {v0}, Lv5/h;->e()V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    iget-object v0, p0, Ln5/g;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lv5/c;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/Throwable;

    .line 27
    .line 28
    check-cast p2, Lp4/k;

    .line 29
    .line 30
    check-cast p3, Lt4/h;

    .line 31
    .line 32
    sget-object p1, Lv5/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2}, Lv5/c;->a(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_1
    iget-object p2, p0, Ln5/g;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Landroidx/room/a;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/Throwable;

    .line 47
    .line 48
    check-cast p3, Lt4/h;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Landroidx/room/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
