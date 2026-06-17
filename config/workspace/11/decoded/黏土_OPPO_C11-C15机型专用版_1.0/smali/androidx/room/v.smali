.class public final Landroidx/room/v;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroidx/room/n;

.field public final c:Landroid/content/Context;

.field public final d:Ln5/v;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:I

.field public g:Landroidx/room/i;

.field public final h:Lq5/t;

.field public final i:Landroidx/room/t;

.field public final j:Landroidx/room/s;

.field public final k:Landroidx/room/u;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/n;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Landroidx/room/v;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p3, p0, Landroidx/room/v;->b:Landroidx/room/n;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Landroidx/room/v;->c:Landroid/content/Context;

    .line 23
    .line 24
    iget-object p1, p3, Landroidx/room/n;->a:Landroidx/room/r0;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/room/r0;->getCoroutineScope()Ln5/v;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Landroidx/room/v;->d:Ln5/v;

    .line 31
    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/room/v;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    sget-object p1, Lp5/a;->h:Lp5/a;

    .line 41
    .line 42
    new-instance p1, Lq5/t;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-direct {p1, p2}, Lq5/t;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Landroidx/room/v;->h:Lq5/t;

    .line 49
    .line 50
    iget-object p1, p3, Landroidx/room/n;->b:[Ljava/lang/String;

    .line 51
    .line 52
    new-instance p3, Landroidx/room/t;

    .line 53
    .line 54
    invoke-direct {p3, p0, p1}, Landroidx/room/t;-><init>(Landroidx/room/v;[Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object p3, p0, Landroidx/room/v;->i:Landroidx/room/t;

    .line 58
    .line 59
    new-instance p1, Landroidx/room/s;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Landroidx/room/s;-><init>(Landroidx/room/v;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Landroidx/room/v;->j:Landroidx/room/s;

    .line 65
    .line 66
    new-instance p1, Landroidx/room/u;

    .line 67
    .line 68
    invoke-direct {p1, p2, p0}, Landroidx/room/u;-><init>(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Landroidx/room/v;->k:Landroidx/room/u;

    .line 72
    .line 73
    return-void
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
