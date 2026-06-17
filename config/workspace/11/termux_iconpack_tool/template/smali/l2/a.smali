.class public final Ll2/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Lu5/e;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Ll2/a0;

.field public final e:Ll2/j;

.field public final f:Ll2/a0;

.field public final g:La1/q;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:Ll2/a0;


# direct methods
.method public constructor <init>(Ll2/a0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lu2/f;->a(Z)Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Ll2/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    sget-object p1, Ln5/g0;->a:Lu5/e;

    .line 12
    .line 13
    iput-object p1, p0, Ll2/a;->b:Lu5/e;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-static {p1}, Lu2/f;->a(Z)Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Ll2/a;->c:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    new-instance v0, Ll2/a0;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ll2/a;->d:Ll2/a0;

    .line 28
    .line 29
    sget-object v0, Ll2/j;->a:Ll2/j;

    .line 30
    .line 31
    iput-object v0, p0, Ll2/a;->e:Ll2/j;

    .line 32
    .line 33
    sget-object v0, Ll2/a0;->a:Ll2/a0;

    .line 34
    .line 35
    iput-object v0, p0, Ll2/a;->f:Ll2/a0;

    .line 36
    .line 37
    new-instance v0, La1/q;

    .line 38
    .line 39
    const/16 v1, 0x14

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v0, v1, v2}, La1/q;-><init>(IB)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Ll2/a;->g:La1/q;

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    iput v0, p0, Ll2/a;->h:I

    .line 49
    .line 50
    const v0, 0x7fffffff

    .line 51
    .line 52
    .line 53
    iput v0, p0, Ll2/a;->i:I

    .line 54
    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 v1, 0x17

    .line 58
    .line 59
    if-ne v0, v1, :cond_0

    .line 60
    .line 61
    const/16 v0, 0xa

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/16 v0, 0x14

    .line 65
    .line 66
    :goto_0
    iput v0, p0, Ll2/a;->k:I

    .line 67
    .line 68
    const/16 v0, 0x8

    .line 69
    .line 70
    iput v0, p0, Ll2/a;->j:I

    .line 71
    .line 72
    iput-boolean p1, p0, Ll2/a;->l:Z

    .line 73
    .line 74
    new-instance p1, Ll2/a0;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Ll2/a;->m:Ll2/a0;

    .line 80
    .line 81
    return-void
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
