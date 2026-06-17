.class public abstract Lx2/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "ConstraintTrkngWrkr"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "tagWithPrefix(\"ConstraintTrkngWrkr\")"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lx2/g;->a:Ljava/lang/String;

    .line 13
    .line 14
    return-void
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

.method public static final a(Lp3/j;Lu2/p;Lv4/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lx2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lx2/f;

    .line 7
    .line 8
    iget v1, v0, Lx2/f;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx2/f;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx2/f;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lv4/c;-><init>(Lt4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lx2/f;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Lx2/f;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lp3/j;->g(Lu2/p;)Lq5/g;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance p2, Lb3/f;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v4, 0x2

    .line 59
    invoke-direct {p2, p1, v2, v4}, Lb3/f;-><init>(Ljava/lang/Object;Lt4/c;I)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Landroidx/room/q;

    .line 63
    .line 64
    invoke-direct {p1, p0, p2}, Landroidx/room/q;-><init>(Lq5/g;Ld5/p;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Lq2/k;

    .line 68
    .line 69
    const/4 p2, 0x2

    .line 70
    invoke-direct {p0, p2, p1}, Lq2/k;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput v3, v0, Lx2/f;->i:I

    .line 74
    .line 75
    invoke-static {p0, v0}, Lq5/u;->e(Lq2/k;Lv4/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p2, v1, :cond_3

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_3
    :goto_1
    check-cast p2, Lq2/b;

    .line 83
    .line 84
    iget p0, p2, Lq2/b;->a:I

    .line 85
    .line 86
    new-instance p1, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 89
    .line 90
    .line 91
    return-object p1
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
