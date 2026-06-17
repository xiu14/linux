.class public final Li3/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Lw5/n;


# direct methods
.method public constructor <init>(Lj6/c0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lp4/d;->h:[Lp4/d;

    new-instance v0, Li3/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li3/a;-><init>(Li3/b;I)V

    invoke-static {v0}, Le6/d;->z(Ld5/a;)Lp4/c;

    move-result-object v0

    iput-object v0, p0, Li3/b;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Li3/a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Li3/a;-><init>(Li3/b;I)V

    invoke-static {v0}, Le6/d;->z(Ld5/a;)Lp4/c;

    move-result-object v0

    iput-object v0, p0, Li3/b;->b:Ljava/lang/Object;

    const-wide v3, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {p1, v3, v4}, Lj6/c0;->W(J)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    iput-wide v5, p0, Li3/b;->c:J

    .line 6
    invoke-virtual {p1, v3, v4}, Lj6/c0;->W(J)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    iput-wide v5, p0, Li3/b;->d:J

    .line 8
    invoke-virtual {p1, v3, v4}, Lj6/c0;->W(J)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Li3/b;->e:Z

    .line 10
    invoke-virtual {p1, v3, v4}, Lj6/c0;->W(J)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 12
    new-instance v2, Lp3/j;

    invoke-direct {v2}, Lp3/j;-><init>()V

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v0, :cond_2

    .line 13
    invoke-virtual {p1, v3, v4}, Lj6/c0;->W(J)Ljava/lang/String;

    move-result-object v6

    .line 14
    sget-object v7, Lo3/e;->a:[Landroid/graphics/Bitmap$Config;

    const/16 v7, 0x3a

    const/4 v8, 0x6

    .line 15
    invoke-static {v6, v7, v1, v8}, Ll5/e;->q0(Ljava/lang/CharSequence;CII)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    .line 16
    invoke-virtual {v6, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v9, "substring(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v8, v6}, Lp3/j;->c(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 17
    :cond_1
    const-string p1, "Unexpected header: "

    invoke-virtual {p1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_2
    invoke-virtual {v2}, Lp3/j;->e()Lw5/n;

    move-result-object p1

    iput-object p1, p0, Li3/b;->f:Lw5/n;

    return-void
.end method

.method public constructor <init>(Lw5/z;)V
    .locals 5

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Lp4/d;->h:[Lp4/d;

    new-instance v0, Li3/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li3/a;-><init>(Li3/b;I)V

    invoke-static {v0}, Le6/d;->z(Ld5/a;)Lp4/c;

    move-result-object v0

    iput-object v0, p0, Li3/b;->a:Ljava/lang/Object;

    .line 21
    new-instance v0, Li3/a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Li3/a;-><init>(Li3/b;I)V

    invoke-static {v0}, Le6/d;->z(Ld5/a;)Lp4/c;

    move-result-object v0

    iput-object v0, p0, Li3/b;->b:Ljava/lang/Object;

    .line 22
    iget-wide v3, p1, Lw5/z;->r:J

    .line 23
    iput-wide v3, p0, Li3/b;->c:J

    .line 24
    iget-wide v3, p1, Lw5/z;->s:J

    .line 25
    iput-wide v3, p0, Li3/b;->d:J

    .line 26
    iget-object v0, p1, Lw5/z;->l:Lw5/m;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 27
    :cond_0
    iput-boolean v1, p0, Li3/b;->e:Z

    .line 28
    iget-object p1, p1, Lw5/z;->m:Lw5/n;

    .line 29
    iput-object p1, p0, Li3/b;->f:Lw5/n;

    return-void
.end method


# virtual methods
.method public final a(Lj6/b0;)V
    .locals 5

    .line 1
    iget-wide v0, p0, Li3/b;->c:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lj6/b0;->n0(J)Lj6/j;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lj6/b0;->writeByte(I)Lj6/j;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Li3/b;->d:J

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Lj6/b0;->n0(J)Lj6/j;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lj6/b0;->writeByte(I)Lj6/j;

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, Li3/b;->e:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-wide/16 v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, v1, v2}, Lj6/b0;->n0(J)Lj6/j;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lj6/b0;->writeByte(I)Lj6/j;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Li3/b;->f:Lw5/n;

    .line 35
    .line 36
    invoke-virtual {v1}, Lw5/n;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    int-to-long v2, v2

    .line 41
    invoke-virtual {p1, v2, v3}, Lj6/b0;->n0(J)Lj6/j;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lj6/b0;->writeByte(I)Lj6/j;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Lw5/n;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    :goto_1
    if-ge v3, v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Lw5/n;->g(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {p1, v4}, Lj6/b0;->k0(Ljava/lang/String;)Lj6/j;

    .line 59
    .line 60
    .line 61
    const-string v4, ": "

    .line 62
    .line 63
    invoke-virtual {p1, v4}, Lj6/b0;->k0(Ljava/lang/String;)Lj6/j;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3}, Lw5/n;->i(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {p1, v4}, Lj6/j;->k0(Ljava/lang/String;)Lj6/j;

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0}, Lj6/j;->writeByte(I)Lj6/j;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    return-void
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
